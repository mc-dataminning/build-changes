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

public class fqz extends fgw<fqz.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final akn m = new akn("world_list/error_highlighted");
   static final akn n = new akn("world_list/error");
   static final akn o = new akn("world_list/marked_join_highlighted");
   static final akn p = new akn("world_list/marked_join");
   static final akn q = new akn("world_list/warning_highlighted");
   static final akn r = new akn("world_list/warning");
   static final akn s = new akn("world_list/join_highlighted");
   static final akn u = new akn("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wx w = wx.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wx x = wx.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wx y = wx.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wx z = wx.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wx A = wx.c("selectWorld.locked").a(n.m);
   static final wx B = wx.c("selectWorld.conversion.tooltip").a(n.m);
   static final wx C = wx.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wx D = wx.c("selectWorld.experimental");
   private final fqu E;
   private CompletableFuture<List<eoy>> F;
   @Nullable
   private List<eoy> G;
   private String H;
   private final fqz.b I;

   public fqz(fqu $$0, feb $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fqz $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fqz.b($$1);
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
      this.aF_().forEach(fqz.a::close);
      super.k();
   }

   @Nullable
   private List<eoy> J() {
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
      if (fkb.a($$0)) {
         Optional<fqz.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gre.a(avi.Ao, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      List<eoy> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eoy> $$0) {
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

   private CompletableFuture<List<eoy>> L() {
      eox.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eow var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fqo.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eoy> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eoy $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fqz.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, eoy $$1) {
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

   private void c(wx $$0) {
      this.c.a(new flc(wx.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fqz.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fqz.c $$1 ? $$1.f : null);
   }

   public Optional<fqz.c> d() {
      fqz.a $$0 = this.h();
      return $$0 instanceof fqz.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fqu I() {
      return this.E;
   }

   @Override
   public void a(fjw $$0) {
      if (this.aF_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fgw.a<fqz.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fqz.a {
      private static final wx a = wx.c("selectWorld.loading_list");
      private final feb b;

      public b(feb $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = flk.a(ac.c());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wx a() {
         return a;
      }
   }

   public final class c extends fqz.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final feb d;
      private final fqu e;
      final eoy f;
      private final fld g;
      @Nullable
      private Path h;
      private long i;

      public c(fqz $$1, eoy $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fld.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eud> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fqz.v.warn("{}", eub.a(this.h, $$1));
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
               fqz.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wx a() {
         wx $$0 = wx.a("narrator.select.world_info", this.f.b(), wx.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = ww.a($$0, fqz.A);
         }

         if (this.f.e()) {
            $$0 = ww.a($$0, fqz.D);
         }

         return wx.a("narrator.select", $$0);
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fqz.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gpb.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wx $$13 = this.f.s();
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
            akn $$16 = $$15 ? fqz.s : fqz.u;
            akn $$17 = $$15 ? fqz.q : fqz.r;
            akn $$18 = $$15 ? fqz.m : fqz.n;
            akn $$19 = $$15 ? fqz.o : fqz.p;
            if (this.f instanceof eoy.c || this.f instanceof eoy.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fqz.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fqz.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fqz.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fqz.w.g(), fqz.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fqz.y.g(), fqz.z.g()));
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
            fqz.this.a((fqz.a)this);
            if (!($$0 - (double)fqz.this.r() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gre.a(avi.Ao, 1.0F));
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
            if (this.f instanceof eoy.c) {
               this.d.a(flo.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fqz.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fkr($$0 -> {
            if ($$0) {
               this.d.a(new flw(true));
               this.e();
            }

            this.d.a(this.e);
         }, wx.c("selectWorld.deleteQuestion"), wx.a("selectWorld.deleteWarning", this.f.b()), wx.c("selectWorld.deleteButton"), ww.e));
      }

      public void e() {
         eox $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eox.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fii.b(this.d, $$1);
            fqz.v.error("Failed to delete world {}", $$1, var8);
         }

         fqz.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         eox.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fii.a(this.d, $$0);
            fqz.v.error("Failed to access level {}", $$0, var6);
            fqz.this.K();
            return;
         } catch (eub var7) {
            fqz.v.warn("{}", var7.getMessage());
            this.d.a(flo.a(() -> this.d.a(this.e)));
            return;
         }

         fqq $$5;
         try {
            $$5 = fqq.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fqz.this.K();
               }

               this.d.a(this.e);
            });
         } catch (uo | uu | IOException var5) {
            $$1.c();
            fii.a(this.d, $$0);
            fqz.v.error("Failed to load world data {}", $$0, var5);
            fqz.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (eox.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dbd, fqw> $$1 = this.d.x().a($$0);
            dbd $$2 = (dbd)$$1.getFirst();
            fqw $$3 = (fqw)$$1.getSecond();
            Path $$4 = fqo.a($$0.a(eov.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fkr(
                        $$3x -> this.d.a((flz)($$3x ? fqo.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wx.c("selectWorld.recreate.customized.title"),
                        wx.c("selectWorld.recreate.customized.text"),
                        ww.i,
                        ww.e
                     )
                  );
            } else {
               this.d.a(fqo.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eub var8) {
            fqz.v.warn("{}", var8.getMessage());
            this.d.a(flo.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fqz.v.error("Unable to recreate world", var9);
            this.d.a(new fkl(() -> this.d.a(this.e), wx.c("selectWorld.recreate.error.title"), wx.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new flf(wx.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(exv.a($$1));
            } catch (Throwable var7) {
               fqz.v.error("Invalid icon for world {}", this.f.a(), var7);
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
