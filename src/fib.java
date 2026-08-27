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

public class fib extends eyb<fib.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ahg m = new ahg("world_list/error_highlighted");
   static final ahg n = new ahg("world_list/error");
   static final ahg o = new ahg("world_list/marked_join_highlighted");
   static final ahg p = new ahg("world_list/marked_join");
   static final ahg q = new ahg("world_list/warning_highlighted");
   static final ahg r = new ahg("world_list/warning");
   static final ahg t = new ahg("world_list/join_highlighted");
   static final ahg u = new ahg("world_list/join");
   static final Logger v = LogUtils.getLogger();
   private static final ahg w = new ahg("textures/misc/unknown_server.png");
   static final vf x = vf.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final vf y = vf.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final vf z = vf.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final vf A = vf.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final vf B = vf.c("selectWorld.locked").a(n.m);
   static final vf C = vf.c("selectWorld.conversion.tooltip").a(n.m);
   static final vf D = vf.c("selectWorld.incompatible.tooltip").a(n.m);
   static final vf E = vf.c("selectWorld.experimental");
   private final fhw F;
   private CompletableFuture<List<egm>> G;
   @Nullable
   private List<egm> H;
   private String I;
   private final fib.b J;

   public fib(fhw $$0, evh $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fib $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.F = $$0;
      this.J = new fib.b($$1);
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
      this.l().forEach(fib.a::close);
      super.m();
   }

   @Nullable
   private List<egm> H() {
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
      if (fbd.a($$0)) {
         Optional<fib.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ai().a(ghu.a(arr.zu, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      List<egm> $$4 = this.H();
      if ($$4 != this.H) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<egm> $$0) {
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

   private CompletableFuture<List<egm>> J() {
      egl.a $$0;
      try {
         $$0 = this.c.l().b();
      } catch (egk var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fhq.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.l().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<egm> $$1) {
      this.m();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (egm $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fib.c(this, $$2));
         }
      }

      this.L();
   }

   private boolean a(String $$0, egm $$1) {
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

   private void c(vf $$0) {
      this.c.a(new fce(vf.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   protected int c() {
      return super.c() + 20;
   }

   @Override
   public int b() {
      return super.b() + 50;
   }

   public void a(@Nullable fib.a $$0) {
      super.a($$0);
      this.F.a($$0 instanceof fib.c $$1 ? $$1.f : null);
   }

   public Optional<fib.c> d() {
      fib.a $$0 = this.i();
      return $$0 instanceof fib.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fhw e() {
      return this.F;
   }

   @Override
   public void a(fay $$0) {
      if (this.l().contains(this.J)) {
         this.J.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends eyb.a<fib.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fib.a {
      private static final vf a = vf.c("selectWorld.loading_list");
      private final evh b;

      public b(evh $$0) {
         this.b = $$0;
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.g - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fcl.a(ac.b());
         int $$13 = (this.b.y.g - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public vf a() {
         return a;
      }
   }

   public final class c extends fib.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final evh d;
      private final fhw e;
      final egm f;
      private final fcf g;
      @Nullable
      private Path h;
      private long i;

      public c(fib $$1, egm $$2) {
         this.d = $$1.c;
         this.e = $$1.e();
         this.f = $$2;
         this.g = fcf.a(this.d.Y(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<elj> $$1 = this.d.bb().a(this.h);
                  if (!$$1.isEmpty()) {
                     fib.v.warn("{}", elh.a(this.h, $$1));
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
               fib.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public vf a() {
         vf $$0 = vf.a("narrator.select.world_info", this.f.b(), vf.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = ve.a($$0, fib.B);
         }

         if (this.f.e()) {
            $$0 = ve.a($$0, fib.E);
         }

         return vf.a("narrator.select", $$0);
      }

      @Override
      public void a(ewt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fib.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gfr.a("selectWorld.world") + " " + ($$1 + 1);
         }

         vf $$13 = this.f.s();
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
            ahg $$16 = $$15 ? fib.t : fib.u;
            ahg $$17 = $$15 ? fib.q : fib.r;
            ahg $$18 = $$15 ? fib.m : fib.n;
            ahg $$19 = $$15 ? fib.o : fib.p;
            if (this.f instanceof egm.c || this.f instanceof egm.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fib.B, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fib.C, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fib.D, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fib.x.g(), fib.y.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fib.z.g(), fib.A.g()));
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
            fib.this.a((fib.a)this);
            if (!($$0 - (double)fib.this.q() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return true;
            } else {
               if (this.b()) {
                  this.d.ai().a(ghu.a(arr.zu, 1.0F));
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
            if (this.f instanceof egm.c) {
               this.d.a(fcp.a(() -> this.d.a(this.e)));
            } else {
               this.d.w().a(this.f.a(), () -> {
                  fib.this.I();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fbt($$0 -> {
            if ($$0) {
               this.d.a(new fcx(true));
               this.e();
            }

            this.d.a(this.e);
         }, vf.c("selectWorld.deleteQuestion"), vf.a("selectWorld.deleteWarning", this.f.b()), vf.c("selectWorld.deleteButton"), ve.e));
      }

      public void e() {
         egl $$0 = this.d.l();
         String $$1 = this.f.a();

         try (egl.c $$2 = $$0.e($$1)) {
            $$2.i();
         } catch (IOException var8) {
            ezm.b(this.d, $$1);
            fib.v.error("Failed to delete world {}", $$1, var8);
         }

         fib.this.I();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         egl.c $$1;
         try {
            $$1 = this.d.l().d($$0);
         } catch (IOException var6) {
            ezm.a(this.d, $$0);
            fib.v.error("Failed to access level {}", $$0, var6);
            fib.this.I();
            return;
         } catch (elh var7) {
            fib.v.warn("{}", var7.getMessage());
            this.d.a(fcp.a(() -> this.d.a(this.e)));
            return;
         }

         fhs $$5;
         try {
            $$5 = fhs.a(this.d, $$1, $$1x -> {
               $$1.a();
               if ($$1x) {
                  fib.this.I();
               }

               this.d.a(this.e);
            });
         } catch (sy | te | IOException var5) {
            $$1.a();
            ezm.a(this.d, $$0);
            fib.v.error("Failed to load world data {}", $$0, var5);
            fib.this.I();
            return;
         }

         this.d.a($$5);
      }

      public void g() {
         this.k();

         try (egl.c $$0 = this.d.l().d(this.f.a())) {
            Pair<cts, fhy> $$1 = this.d.w().a($$0);
            cts $$2 = (cts)$$1.getFirst();
            fhy $$3 = (fhy)$$1.getSecond();
            Path $$4 = fhq.a($$0.a(egj.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fbt(
                        $$3x -> this.d.a((fda)($$3x ? fhq.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        vf.c("selectWorld.recreate.customized.title"),
                        vf.c("selectWorld.recreate.customized.text"),
                        ve.i,
                        ve.e
                     )
                  );
            } else {
               this.d.a(fhq.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (elh var8) {
            fib.v.warn("{}", var8.getMessage());
            this.d.a(fcp.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fib.v.error("Unable to recreate world", var9);
            this.d.a(new fbn(() -> this.d.a(this.e), vf.c("selectWorld.recreate.error.title"), vf.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fcg(vf.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(epb.a($$1));
            } catch (Throwable var7) {
               fib.v.error("Invalid icon for world {}", this.f.a(), var7);
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
