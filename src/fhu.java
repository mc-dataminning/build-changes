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

public class fhu extends exu<fhu.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ahd m = new ahd("world_list/error_highlighted");
   static final ahd n = new ahd("world_list/error");
   static final ahd o = new ahd("world_list/marked_join_highlighted");
   static final ahd p = new ahd("world_list/marked_join");
   static final ahd q = new ahd("world_list/warning_highlighted");
   static final ahd r = new ahd("world_list/warning");
   static final ahd t = new ahd("world_list/join_highlighted");
   static final ahd u = new ahd("world_list/join");
   static final Logger v = LogUtils.getLogger();
   private static final ahd w = new ahd("textures/misc/unknown_server.png");
   static final vd x = vd.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final vd y = vd.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final vd z = vd.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final vd A = vd.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final vd B = vd.c("selectWorld.locked").a(n.m);
   static final vd C = vd.c("selectWorld.conversion.tooltip").a(n.m);
   static final vd D = vd.c("selectWorld.incompatible.tooltip").a(n.m);
   static final vd E = vd.c("selectWorld.experimental");
   private final fhp F;
   private CompletableFuture<List<egg>> G;
   @Nullable
   private List<egg> H;
   private String I;
   private final fhu.b J;

   public fhu(fhp $$0, eva $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fhu $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.F = $$0;
      this.J = new fhu.b($$1);
      this.I = $$6;
      if ($$7 != null) {
         this.G = $$7.G;
      } else {
         this.G = this.J();
      }

      this.a(this.H());
   }

   @Override
   protected void m() {
      this.l().forEach(fhu.a::close);
      super.m();
   }

   @Nullable
   private List<egg> H() {
      try {
         return this.G.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void I() {
      this.G = this.J();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (faw.a($$0)) {
         Optional<fhu.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ah().a(ghi.a(arm.zu, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      List<egg> $$4 = this.H();
      if ($$4 != this.H) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<egg> $$0) {
      if ($$0 == null) {
         this.K();
      } else {
         this.a(this.I, $$0);
      }

      this.H = $$0;
   }

   public void a(String $$0) {
      if (this.H != null && !$$0.equals(this.I)) {
         this.a($$0, this.H);
      }

      this.I = $$0;
   }

   private CompletableFuture<List<egg>> J() {
      egf.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (ege var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fhj.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<egg> $$1) {
      this.m();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (egg $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fhu.c(this, $$2));
         }
      }

      this.L();
   }

   private boolean a(String $$0, egg $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void K() {
      this.m();
      this.b(this.J);
      this.L();
   }

   private void L() {
      this.a(this.o());
      this.F.d(true);
   }

   private void c(vd $$0) {
      this.c.a(new fbx(vd.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fhu.a $$0) {
      super.a($$0);
      this.F.a($$0 instanceof fhu.c $$1 ? $$1.f : null);
   }

   public Optional<fhu.c> d() {
      fhu.a $$0 = this.i();
      return $$0 instanceof fhu.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fhp e() {
      return this.F;
   }

   @Override
   public void a(far $$0) {
      if (this.l().contains(this.J)) {
         this.J.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends exu.a<fhu.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fhu.a {
      private static final vd a = vd.c("selectWorld.loading_list");
      private final eva b;

      public b(eva $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fce.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public vd a() {
         return a;
      }
   }

   public final class c extends fhu.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final eva d;
      private final fhp e;
      final egg f;
      private final fby g;
      @Nullable
      private Path h;
      private long i;

      public c(fhu $$1, egg $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = fby.a(this.d.X(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<eld> $$1 = this.d.ba().a(this.h);
                  if (!$$1.isEmpty()) {
                     fhu.v.warn("{}", elb.a(this.h, $$1));
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
               fhu.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public vd a() {
         vd $$0 = vd.a("narrator.select.world_info", this.f.b(), vd.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = vc.a($$0, fhu.B);
         }

         if (this.f.e()) {
            $$0 = vc.a($$0, fhu.E);
         }

         return vd.a("narrator.select", $$0);
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fhu.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gfl.a("selectWorld.world") + " " + ($$1 + 1);
         }

         vd $$13 = this.f.s();
         $$0.a(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, 16777215, false);
         $$0.a(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712, false);
         $$0.a(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712, false);
         RenderSystem.enableBlend();
         $$0.a(this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         RenderSystem.disableBlend();
         if (this.d.m.W().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ahd $$16 = $$15 ? fhu.t : fhu.u;
            ahd $$17 = $$15 ? fhu.q : fhu.r;
            ahd $$18 = $$15 ? fhu.m : fhu.n;
            ahd $$19 = $$15 ? fhu.o : fhu.p;
            if (this.f instanceof egg.c || this.f instanceof egg.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fhu.B, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fhu.C, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fhu.D, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fhu.x.g(), fhu.y.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fhu.z.g(), fhu.A.g()));
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
            fhu.this.a((fhu.a)this);
            if (!($$0 - (double)fhu.this.q() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return true;
            } else {
               if (this.b()) {
                  this.d.ah().a(ghi.a(arm.zu, 1.0F));
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
            if (this.f instanceof egg.c) {
               this.d.a(fci.a(() -> this.d.a(this.e)));
            } else {
               this.d.w().a(this.f.a(), () -> {
                  fhu.this.I();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fbm($$0 -> {
            if ($$0) {
               this.d.a(new fcq(true));
               this.e();
            }

            this.d.a(this.e);
         }, vd.c("selectWorld.deleteQuestion"), vd.a("selectWorld.deleteWarning", this.f.b()), vd.c("selectWorld.deleteButton"), vc.e));
      }

      public void e() {
         egf $$0 = this.d.l();
         String $$1 = this.f.a();

         try (egf.c $$2 = $$0.e($$1)) {
            $$2.i();
         } catch (IOException var8) {
            ezf.b(this.d, $$1);
            fhu.v.error("Failed to delete world {}", $$1, var8);
         }

         fhu.this.I();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         egf.c $$1;
         try {
            $$1 = this.d.l().d($$0);
         } catch (IOException var6) {
            ezf.a(this.d, $$0);
            fhu.v.error("Failed to access level {}", $$0, var6);
            fhu.this.I();
            return;
         } catch (elb var7) {
            fhu.v.warn("{}", var7.getMessage());
            this.d.a(fci.a(() -> this.d.a(this.e)));
            return;
         }

         fhl $$5;
         try {
            $$5 = fhl.a(this.d, $$1, $$1x -> {
               $$1.a();
               if ($$1x) {
                  fhu.this.I();
               }

               this.d.a(this.e);
            });
         } catch (sw | tc | IOException var5) {
            $$1.a();
            ezf.a(this.d, $$0);
            fhu.v.error("Failed to load world data {}", $$0, var5);
            fhu.this.I();
            return;
         }

         this.d.a($$5);
      }

      public void g() {
         this.k();

         try (egf.c $$0 = this.d.l().d(this.f.a())) {
            Pair<ctm, fhr> $$1 = this.d.w().a($$0);
            ctm $$2 = (ctm)$$1.getFirst();
            fhr $$3 = (fhr)$$1.getSecond();
            Path $$4 = fhj.a($$0.a(egd.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fbm(
                        $$3x -> this.d.a((fct)($$3x ? fhj.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        vd.c("selectWorld.recreate.customized.title"),
                        vd.c("selectWorld.recreate.customized.text"),
                        vc.i,
                        vc.e
                     )
                  );
            } else {
               this.d.a(fhj.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (elb var8) {
            fhu.v.warn("{}", var8.getMessage());
            this.d.a(fci.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fhu.v.error("Unable to recreate world", var9);
            this.d.a(new fbg(() -> this.d.a(this.e), vd.c("selectWorld.recreate.error.title"), vd.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fbz(vd.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eou.a($$1));
            } catch (Throwable var7) {
               fhu.v.error("Invalid icon for world {}", this.f.a(), var7);
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
