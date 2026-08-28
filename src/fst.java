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

public class fst extends fiq<fst.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final akk m = new akk("world_list/error_highlighted");
   static final akk n = new akk("world_list/error");
   static final akk o = new akk("world_list/marked_join_highlighted");
   static final akk p = new akk("world_list/marked_join");
   static final akk q = new akk("world_list/warning_highlighted");
   static final akk r = new akk("world_list/warning");
   static final akk s = new akk("world_list/join_highlighted");
   static final akk u = new akk("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wu w = wu.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wu x = wu.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wu y = wu.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wu z = wu.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wu A = wu.c("selectWorld.locked").a(n.m);
   static final wu B = wu.c("selectWorld.conversion.tooltip").a(n.m);
   static final wu C = wu.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wu D = wu.c("selectWorld.experimental");
   private final fso E;
   private CompletableFuture<List<eql>> F;
   @Nullable
   private List<eql> G;
   private String H;
   private final fst.b I;

   public fst(fso $$0, ffw $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fst $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fst.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.M();
      }

      this.a(this.K());
   }

   @Override
   protected void k() {
      this.aG_().forEach(fst.a::close);
      super.k();
   }

   @Nullable
   private List<eql> K() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void L() {
      this.F = this.M();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (flv.a($$0)) {
         Optional<fst.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gsz.a(avh.Ar, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      List<eql> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eql> $$0) {
      if ($$0 == null) {
         this.N();
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

   private CompletableFuture<List<eql>> M() {
      eqk.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eqj var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fsi.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eql> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eql $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fst.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, eql $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void N() {
      this.k();
      this.b(this.I);
      this.O();
   }

   private void O() {
      this.o();
      this.E.d(true);
   }

   private void c(wu $$0) {
      this.c.a(new fmu(wu.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fst.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fst.c $$1 ? $$1.f : null);
   }

   public Optional<fst.c> c() {
      fst.a $$0 = this.h();
      return $$0 instanceof fst.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fso J() {
      return this.E;
   }

   @Override
   public void a(flq $$0) {
      if (this.aG_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fiq.a<fst.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fst.a {
      private static final wu a = wu.c("selectWorld.loading_list");
      private final ffw b;

      public b(ffw $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.m - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fna.a(ac.c());
         int $$13 = (this.b.y.m - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wu a() {
         return a;
      }
   }

   public final class c extends fst.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final ffw d;
      private final fso e;
      final eql f;
      private final fmv g;
      @Nullable
      private Path h;
      private long i;

      public c(final fst $$1, final eql $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fmv.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<evy> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     fst.v.warn("{}", evw.a(this.h, $$1));
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
               fst.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wu a() {
         wu $$0 = wu.a("narrator.select.world_info", this.f.b(), wu.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wt.a($$0, fst.A);
         }

         if (this.f.e()) {
            $$0 = wt.a($$0, fst.D);
         }

         return wu.a("narrator.select", $$0);
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fst.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gqw.a("selectWorld.world") + " " + ($$1 + 1);
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
            akk $$16 = $$15 ? fst.s : fst.u;
            akk $$17 = $$15 ? fst.q : fst.r;
            akk $$18 = $$15 ? fst.m : fst.n;
            akk $$19 = $$15 ? fst.o : fst.p;
            if (this.f instanceof eql.c || this.f instanceof eql.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fst.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fst.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fst.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fst.w.g(), fst.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fst.y.g(), fst.z.g()));
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
            fst.this.a((fst.a)this);
            if (!($$0 - (double)fst.this.s() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gsz.a(avh.Ar, 1.0F));
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
            if (this.f instanceof eql.c) {
               this.d.a(fnd.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fst.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fmj($$0 -> {
            if ($$0) {
               this.d.a(new fni(true));
               this.e();
            }

            this.d.a(this.e);
         }, wu.c("selectWorld.deleteQuestion"), wu.a("selectWorld.deleteWarning", this.f.b()), wu.c("selectWorld.deleteButton"), wt.e));
      }

      public void e() {
         eqk $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eqk.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fkc.b(this.d, $$1);
            fst.v.error("Failed to delete world {}", $$1, var8);
         }

         fst.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         eqk.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fkc.a(this.d, $$0);
            fst.v.error("Failed to access level {}", $$0, var6);
            fst.this.L();
            return;
         } catch (evw var7) {
            fst.v.warn("{}", var7.getMessage());
            this.d.a(fnd.a(() -> this.d.a(this.e)));
            return;
         }

         fsk $$5;
         try {
            $$5 = fsk.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fst.this.L();
               }

               this.d.a(this.e);
            });
         } catch (ui | uo | IOException var5) {
            $$1.c();
            fkc.a(this.d, $$0);
            fst.v.error("Failed to load world data {}", $$0, var5);
            fst.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (eqk.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dck, fsq> $$1 = this.d.x().a($$0);
            dck $$2 = (dck)$$1.getFirst();
            fsq $$3 = (fsq)$$1.getSecond();
            Path $$4 = fsi.a($$0.a(eqi.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new fmj(
                        $$3x -> this.d.a((fnl)($$3x ? fsi.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wu.c("selectWorld.recreate.customized.title"),
                        wu.c("selectWorld.recreate.customized.text"),
                        wt.i,
                        wt.e
                     )
                  );
            } else {
               this.d.a(fsi.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (evw var8) {
            fst.v.warn("{}", var8.getMessage());
            this.d.a(fnd.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fst.v.error("Unable to recreate world", var9);
            this.d.a(new fme(() -> this.d.a(this.e), wu.c("selectWorld.recreate.error.title"), wu.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fmw(wu.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ezp.a($$1));
            } catch (Throwable var7) {
               fst.v.error("Invalid icon for world {}", this.f.a(), var7);
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
