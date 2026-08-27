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

public class fmg extends fcc<fmg.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ajh m = new ajh("world_list/error_highlighted");
   static final ajh n = new ajh("world_list/error");
   static final ajh o = new ajh("world_list/marked_join_highlighted");
   static final ajh p = new ajh("world_list/marked_join");
   static final ajh q = new ajh("world_list/warning_highlighted");
   static final ajh r = new ajh("world_list/warning");
   static final ajh t = new ajh("world_list/join_highlighted");
   static final ajh u = new ajh("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final vu w = vu.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final vu x = vu.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final vu y = vu.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final vu z = vu.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final vu A = vu.c("selectWorld.locked").a(n.m);
   static final vu B = vu.c("selectWorld.conversion.tooltip").a(n.m);
   static final vu C = vu.c("selectWorld.incompatible.tooltip").a(n.m);
   static final vu D = vu.c("selectWorld.experimental");
   private final fmb E;
   private CompletableFuture<List<ekl>> F;
   @Nullable
   private List<ekl> G;
   private String H;
   private final fmg.b I;

   public fmg(fmb $$0, ezg $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fmg $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fmg.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.J();
      }

      this.a(this.H());
   }

   @Override
   protected void m() {
      this.l().forEach(fmg.a::close);
      super.m();
   }

   @Nullable
   private List<ekl> H() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void I() {
      this.F = this.J();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ffh.a($$0)) {
         Optional<fmg.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(gmh.a(aty.zN, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      List<ekl> $$4 = this.H();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ekl> $$0) {
      if ($$0 == null) {
         this.K();
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

   private CompletableFuture<List<ekl>> J() {
      ekk.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (ekj var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         flv.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ekl> $$1) {
      this.m();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ekl $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fmg.c(this, $$2));
         }
      }

      this.L();
   }

   private boolean a(String $$0, ekl $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void K() {
      this.m();
      this.b(this.I);
      this.L();
   }

   private void L() {
      this.a(this.o());
      this.E.d(true);
   }

   private void c(vu $$0) {
      this.c.a(new fgi(vu.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fmg.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fmg.c $$1 ? $$1.f : null);
   }

   public Optional<fmg.c> d() {
      fmg.a $$0 = this.i();
      return $$0 instanceof fmg.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fmb e() {
      return this.E;
   }

   @Override
   public void a(ffc $$0) {
      if (this.l().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fcc.a<fmg.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fmg.a {
      private static final vu a = vu.c("selectWorld.loading_list");
      private final ezg b;

      public b(ezg $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fgq.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public vu a() {
         return a;
      }
   }

   public final class c extends fmg.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final ezg d;
      private final fmb e;
      final ekl f;
      private final fgj g;
      @Nullable
      private Path h;
      private long i;

      public c(fmg $$1, ekl $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = fgj.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<epi> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     fmg.v.warn("{}", epg.a(this.h, $$1));
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
               fmg.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public vu a() {
         vu $$0 = vu.a("narrator.select.world_info", this.f.b(), vu.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = vt.a($$0, fmg.A);
         }

         if (this.f.e()) {
            $$0 = vt.a($$0, fmg.D);
         }

         return vu.a("narrator.select", $$0);
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fmg.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gke.a("selectWorld.world") + " " + ($$1 + 1);
         }

         vu $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.X().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ajh $$16 = $$15 ? fmg.t : fmg.u;
            ajh $$17 = $$15 ? fmg.q : fmg.r;
            ajh $$18 = $$15 ? fmg.m : fmg.n;
            ajh $$19 = $$15 ? fmg.o : fmg.p;
            if (this.f instanceof ekl.c || this.f instanceof ekl.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fmg.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fmg.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fmg.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fmg.w.g(), fmg.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fmg.y.g(), fmg.z.g()));
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
            fmg.this.a((fmg.a)this);
            if (!($$0 - (double)fmg.this.q() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return true;
            } else {
               if (this.b()) {
                  this.d.ak().a(gmh.a(aty.zN, 1.0F));
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
            if (this.f instanceof ekl.c) {
               this.d.a(fgu.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fmg.this.I();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new ffx($$0 -> {
            if ($$0) {
               this.d.a(new fhc(true));
               this.e();
            }

            this.d.a(this.e);
         }, vu.c("selectWorld.deleteQuestion"), vu.a("selectWorld.deleteWarning", this.f.b()), vu.c("selectWorld.deleteButton"), vt.e));
      }

      public void e() {
         ekk $$0 = this.d.m();
         String $$1 = this.f.a();

         try (ekk.c $$2 = $$0.e($$1)) {
            $$2.i();
         } catch (IOException var8) {
            fdo.b(this.d, $$1);
            fmg.v.error("Failed to delete world {}", $$1, var8);
         }

         fmg.this.I();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         ekk.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fdo.a(this.d, $$0);
            fmg.v.error("Failed to access level {}", $$0, var6);
            fmg.this.I();
            return;
         } catch (epg var7) {
            fmg.v.warn("{}", var7.getMessage());
            this.d.a(fgu.a(() -> this.d.a(this.e)));
            return;
         }

         flx $$5;
         try {
            $$5 = flx.a(this.d, $$1, $$1x -> {
               $$1.a();
               if ($$1x) {
                  fmg.this.I();
               }

               this.d.a(this.e);
            });
         } catch (tl | tr | IOException var5) {
            $$1.a();
            fdo.a(this.d, $$0);
            fmg.v.error("Failed to load world data {}", $$0, var5);
            fmg.this.I();
            return;
         }

         this.d.a($$5);
      }

      public void g() {
         this.k();

         try (ekk.c $$0 = this.d.m().d(this.f.a())) {
            Pair<cxd, fmd> $$1 = this.d.x().a($$0);
            cxd $$2 = (cxd)$$1.getFirst();
            fmd $$3 = (fmd)$$1.getSecond();
            Path $$4 = flv.a($$0.a(eki.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new ffx(
                        $$3x -> this.d.a((fhf)($$3x ? flv.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        vu.c("selectWorld.recreate.customized.title"),
                        vu.c("selectWorld.recreate.customized.text"),
                        vt.i,
                        vt.e
                     )
                  );
            } else {
               this.d.a(flv.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (epg var8) {
            fmg.v.warn("{}", var8.getMessage());
            this.d.a(fgu.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fmg.v.error("Unable to recreate world", var9);
            this.d.a(new ffr(() -> this.d.a(this.e), vu.c("selectWorld.recreate.error.title"), vu.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fgl(vu.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eta.a($$1));
            } catch (Throwable var7) {
               fmg.v.error("Invalid icon for world {}", this.f.a(), var7);
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
