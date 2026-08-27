import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class fqe extends fga<fqe.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final akh m = new akh("world_list/error_highlighted");
   static final akh n = new akh("world_list/error");
   static final akh o = new akh("world_list/marked_join_highlighted");
   static final akh p = new akh("world_list/marked_join");
   static final akh q = new akh("world_list/warning_highlighted");
   static final akh r = new akh("world_list/warning");
   static final akh s = new akh("world_list/join_highlighted");
   static final akh u = new akh("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wu w = wu.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wu x = wu.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wu y = wu.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wu z = wu.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wu A = wu.c("selectWorld.locked").a(n.m);
   static final wu B = wu.c("selectWorld.conversion.tooltip").a(n.m);
   static final wu C = wu.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wu D = wu.c("selectWorld.experimental");
   private final fpz E;
   private CompletableFuture<List<eoc>> F;
   @Nullable
   private List<eoc> G;
   private String H;
   private final fqe.b I;

   public fqe(fpz $$0, fde $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fqe $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fqe.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.L();
      }

      this.a(this.J());
   }

   @Override
   protected void k() {
      this.aE_().forEach(fqe.a::close);
      super.k();
   }

   @Nullable
   private List<eoc> J() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void K() {
      this.F = this.L();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fjf.a($$0)) {
         Optional<fqe.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(gqh.a(avc.Ad, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      List<eoc> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eoc> $$0) {
      if ($$0 == null) {
         this.M();
      } else {
         this.a(this.H, $$0);
      }

      this.G = $$0;
   }

   public void a(String $$0) {
      if (this.G != null && !$$0.equals(this.H)) {
         this.a($$0, this.G);
      }

      this.H = $$0;
   }

   private CompletableFuture<List<eoc>> L() {
      eob.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eoa var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fpt.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eoc> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eoc $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fqe.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, eoc $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void M() {
      this.k();
      this.b(this.I);
      this.N();
   }

   private void N() {
      this.a(this.n());
      this.E.d(true);
   }

   private void c(wu $$0) {
      this.c.a(new fkg(wu.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fqe.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fqe.c $$1 ? $$1.f : null);
   }

   public Optional<fqe.c> d() {
      fqe.a $$0 = this.h();
      return $$0 instanceof fqe.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fpz I() {
      return this.E;
   }

   @Override
   public void a(fja $$0) {
      if (this.aE_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fga.a<fqe.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fqe.a {
      private static final wu a = wu.c("selectWorld.loading_list");
      private final fde b;

      public b(fde $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fko.a(ac.b());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wu a() {
         return a;
      }
   }

   public final class c extends fqe.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fde d;
      private final fpz e;
      final eoc f;
      private final fkh g;
      @Nullable
      private Path h;
      private long i;

      public c(fqe $$1, eoc $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fkh.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<etg> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     fqe.v.warn("{}", ete.a(this.h, $$1));
                     this.h = null;
                  } else {
                     $$0 = Files.readAttributes(this.h, BasicFileAttributes.class);
                  }
               }

               if (!$$0.isRegularFile()) {
                  this.h = null;
               }
            } catch (NoSuchFileException var3) {
               this.h = null;
            } catch (IOException var4) {
               fqe.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wu a() {
         wu $$0 = wu.a("narrator.select.world_info", this.f.b(), wu.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wt.a($$0, fqe.A);
         }

         if (this.f.e()) {
            $$0 = wt.a($$0, fqe.D);
         }

         return wu.a("narrator.select", $$0);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fqe.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = goe.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wu $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.Z().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            akh $$16 = $$15 ? fqe.s : fqe.u;
            akh $$17 = $$15 ? fqe.q : fqe.r;
            akh $$18 = $$15 ? fqe.m : fqe.n;
            akh $$19 = $$15 ? fqe.o : fqe.p;
            if (this.f instanceof eoc.c || this.f instanceof eoc.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fqe.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fqe.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fqe.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fqe.w.g(), fqe.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fqe.y.g(), fqe.z.g()));
                  }
               }
            } else {
               $$0.a($$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            fqe.this.a((fqe.a)this);
            if (!($$0 - (double)fqe.this.r() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(gqh.a(avc.Ad, 1.0F));
                  this.c();
               }

               return true;
            }
         }
      }

      public boolean b() {
         return this.f.u();
      }

      public void c() {
         if (this.f.u()) {
            if (this.f instanceof eoc.c) {
               this.d.a(fks.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fqe.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fjv($$0 -> {
            if ($$0) {
               this.d.a(new fla(true));
               this.e();
            }

            this.d.a(this.e);
         }, wu.c("selectWorld.deleteQuestion"), wu.a("selectWorld.deleteWarning", this.f.b()), wu.c("selectWorld.deleteButton"), wt.e));
      }

      public void e() {
         eob $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eob.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fhm.b(this.d, $$1);
            fqe.v.error("Failed to delete world {}", $$1, var8);
         }

         fqe.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         eob.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fhm.a(this.d, $$0);
            fqe.v.error("Failed to access level {}", $$0, var6);
            fqe.this.K();
            return;
         } catch (ete var7) {
            fqe.v.warn("{}", var7.getMessage());
            this.d.a(fks.a(() -> this.d.a(this.e)));
            return;
         }

         fpv $$5;
         try {
            $$5 = fpv.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fqe.this.K();
               }

               this.d.a(this.e);
            });
         } catch (ul | ur | IOException var5) {
            $$1.c();
            fhm.a(this.d, $$0);
            fqe.v.error("Failed to load world data {}", $$0, var5);
            fqe.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (eob.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dah, fqb> $$1 = this.d.x().a($$0);
            dah $$2 = (dah)$$1.getFirst();
            fqb $$3 = (fqb)$$1.getSecond();
            Path $$4 = fpt.a($$0.a(enz.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fjv(
                        $$3x -> this.d.a((fld)($$3x ? fpt.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wu.c("selectWorld.recreate.customized.title"),
                        wu.c("selectWorld.recreate.customized.text"),
                        wt.i,
                        wt.e
                     )
                  );
            } else {
               this.d.a(fpt.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (ete var8) {
            fqe.v.warn("{}", var8.getMessage());
            this.d.a(fks.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fqe.v.error("Unable to recreate world", var9);
            this.d.a(new fjp(() -> this.d.a(this.e), wu.c("selectWorld.recreate.error.title"), wu.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fkj(wu.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ewy.a($$1));
            } catch (Throwable var7) {
               fqe.v.error("Invalid icon for world {}", this.f.a(), var7);
               this.h = null;
            }
         } else {
            this.g.a();
         }
      }

      @Override
      public void close() {
         this.g.close();
      }

      public String i() {
         return this.f.b();
      }
   }
}
