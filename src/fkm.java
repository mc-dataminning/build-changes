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

public class fkm extends fak<fkm.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final aiy m = new aiy("world_list/error_highlighted");
   static final aiy n = new aiy("world_list/error");
   static final aiy o = new aiy("world_list/marked_join_highlighted");
   static final aiy p = new aiy("world_list/marked_join");
   static final aiy q = new aiy("world_list/warning_highlighted");
   static final aiy r = new aiy("world_list/warning");
   static final aiy t = new aiy("world_list/join_highlighted");
   static final aiy u = new aiy("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final vq w = vq.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final vq x = vq.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final vq y = vq.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final vq z = vq.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final vq A = vq.c("selectWorld.locked").a(n.m);
   static final vq B = vq.c("selectWorld.conversion.tooltip").a(n.m);
   static final vq C = vq.c("selectWorld.incompatible.tooltip").a(n.m);
   static final vq D = vq.c("selectWorld.experimental");
   private final fkh E;
   private CompletableFuture<List<eit>> F;
   @Nullable
   private List<eit> G;
   private String H;
   private final fkm.b I;

   public fkm(fkh $$0, exo $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fkm $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fkm.b($$1);
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
      this.l().forEach(fkm.a::close);
      super.m();
   }

   @Nullable
   private List<eit> H() {
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
      if (fdo.a($$0)) {
         Optional<fkm.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gkj.a(atl.zK, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      List<eit> $$4 = this.H();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eit> $$0) {
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

   private CompletableFuture<List<eit>> J() {
      eis.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (eir var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fkb.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eit> $$1) {
      this.m();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eit $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fkm.c(this, $$2));
         }
      }

      this.L();
   }

   private boolean a(String $$0, eit $$1) {
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

   private void c(vq $$0) {
      this.c.a(new fep(vq.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fkm.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fkm.c $$1 ? $$1.f : null);
   }

   public Optional<fkm.c> d() {
      fkm.a $$0 = this.i();
      return $$0 instanceof fkm.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fkh e() {
      return this.E;
   }

   @Override
   public void a(fdj $$0) {
      if (this.l().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fak.a<fkm.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fkm.a {
      private static final vq a = vq.c("selectWorld.loading_list");
      private final exo b;

      public b(exo $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = few.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public vq a() {
         return a;
      }
   }

   public final class c extends fkm.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final exo d;
      private final fkh e;
      final eit f;
      private final feq g;
      @Nullable
      private Path h;
      private long i;

      public c(fkm $$1, eit $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = feq.a(this.d.Z(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<enq> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fkm.v.warn("{}", eno.a(this.h, $$1));
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
               fkm.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public vq a() {
         vq $$0 = vq.a("narrator.select.world_info", this.f.b(), vq.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = vp.a($$0, fkm.A);
         }

         if (this.f.e()) {
            $$0 = vp.a($$0, fkm.D);
         }

         return vq.a("narrator.select", $$0);
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fkm.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gig.a("selectWorld.world") + " " + ($$1 + 1);
         }

         vq $$13 = this.f.s();
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
            aiy $$16 = $$15 ? fkm.t : fkm.u;
            aiy $$17 = $$15 ? fkm.q : fkm.r;
            aiy $$18 = $$15 ? fkm.m : fkm.n;
            aiy $$19 = $$15 ? fkm.o : fkm.p;
            if (this.f instanceof eit.c || this.f instanceof eit.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fkm.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fkm.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fkm.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fkm.w.g(), fkm.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fkm.y.g(), fkm.z.g()));
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
            fkm.this.a((fkm.a)this);
            if (!($$0 - (double)fkm.this.q() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return true;
            } else {
               if (this.b()) {
                  this.d.aj().a(gkj.a(atl.zK, 1.0F));
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
            if (this.f instanceof eit.c) {
               this.d.a(ffa.a(() -> this.d.a(this.e)));
            } else {
               this.d.w().a(this.f.a(), () -> {
                  fkm.this.I();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fee($$0 -> {
            if ($$0) {
               this.d.a(new ffi(true));
               this.e();
            }

            this.d.a(this.e);
         }, vq.c("selectWorld.deleteQuestion"), vq.a("selectWorld.deleteWarning", this.f.b()), vq.c("selectWorld.deleteButton"), vp.e));
      }

      public void e() {
         eis $$0 = this.d.l();
         String $$1 = this.f.a();

         try (eis.c $$2 = $$0.e($$1)) {
            $$2.i();
         } catch (IOException var8) {
            fbw.b(this.d, $$1);
            fkm.v.error("Failed to delete world {}", $$1, var8);
         }

         fkm.this.I();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         eis.c $$1;
         try {
            $$1 = this.d.l().d($$0);
         } catch (IOException var6) {
            fbw.a(this.d, $$0);
            fkm.v.error("Failed to access level {}", $$0, var6);
            fkm.this.I();
            return;
         } catch (eno var7) {
            fkm.v.warn("{}", var7.getMessage());
            this.d.a(ffa.a(() -> this.d.a(this.e)));
            return;
         }

         fkd $$5;
         try {
            $$5 = fkd.a(this.d, $$1, $$1x -> {
               $$1.a();
               if ($$1x) {
                  fkm.this.I();
               }

               this.d.a(this.e);
            });
         } catch (th | tn | IOException var5) {
            $$1.a();
            fbw.a(this.d, $$0);
            fkm.v.error("Failed to load world data {}", $$0, var5);
            fkm.this.I();
            return;
         }

         this.d.a($$5);
      }

      public void g() {
         this.k();

         try (eis.c $$0 = this.d.l().d(this.f.a())) {
            Pair<cvv, fkj> $$1 = this.d.w().a($$0);
            cvv $$2 = (cvv)$$1.getFirst();
            fkj $$3 = (fkj)$$1.getSecond();
            Path $$4 = fkb.a($$0.a(eiq.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fee(
                        $$3x -> this.d.a((ffl)($$3x ? fkb.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        vq.c("selectWorld.recreate.customized.title"),
                        vq.c("selectWorld.recreate.customized.text"),
                        vp.i,
                        vp.e
                     )
                  );
            } else {
               this.d.a(fkb.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (eno var8) {
            fkm.v.warn("{}", var8.getMessage());
            this.d.a(ffa.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fkm.v.error("Unable to recreate world", var9);
            this.d.a(new fdy(() -> this.d.a(this.e), vq.c("selectWorld.recreate.error.title"), vq.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fer(vq.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eri.a($$1));
            } catch (Throwable var7) {
               fkm.v.error("Invalid icon for world {}", this.f.a(), var7);
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
