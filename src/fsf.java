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

public class fsf extends fic<fsf.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final alf m = new alf("world_list/error_highlighted");
   static final alf n = new alf("world_list/error");
   static final alf o = new alf("world_list/marked_join_highlighted");
   static final alf p = new alf("world_list/marked_join");
   static final alf q = new alf("world_list/warning_highlighted");
   static final alf r = new alf("world_list/warning");
   static final alf s = new alf("world_list/join_highlighted");
   static final alf u = new alf("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xp w = xp.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final xp x = xp.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final xp y = xp.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final xp z = xp.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final xp A = xp.c("selectWorld.locked").a(n.m);
   static final xp B = xp.c("selectWorld.conversion.tooltip").a(n.m);
   static final xp C = xp.c("selectWorld.incompatible.tooltip").a(n.m);
   static final xp D = xp.c("selectWorld.experimental");
   private final fsa E;
   private CompletableFuture<List<epz>> F;
   @Nullable
   private List<epz> G;
   private String H;
   private final fsf.b I;

   public fsf(fsa $$0, ffh $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fsf $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fsf.b($$1);
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
      this.aD_().forEach(fsf.a::close);
      super.k();
   }

   @Nullable
   private List<epz> J() {
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
      if (flh.a($$0)) {
         Optional<fsf.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gsk.a(awa.Ao, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      List<epz> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<epz> $$0) {
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

   private CompletableFuture<List<epz>> L() {
      epy.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (epx var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fru.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<epz> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (epz $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fsf.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, epz $$1) {
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

   private void c(xp $$0) {
      this.c.a(new fmi(xp.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fsf.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fsf.c $$1 ? $$1.f : null);
   }

   public Optional<fsf.c> c() {
      fsf.a $$0 = this.h();
      return $$0 instanceof fsf.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fsa I() {
      return this.E;
   }

   @Override
   public void a(flc $$0) {
      if (this.aD_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fic.a<fsf.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fsf.a {
      private static final xp a = xp.c("selectWorld.loading_list");
      private final ffh b;

      public b(ffh $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fmq.a(ac.c());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xp a() {
         return a;
      }
   }

   public final class c extends fsf.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final ffh d;
      private final fsa e;
      final epz f;
      private final fmj g;
      @Nullable
      private Path h;
      private long i;

      public c(final fsf $$1, final epz $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fmj.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<evk> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fsf.v.warn("{}", evi.a(this.h, $$1));
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
               fsf.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xp a() {
         xp $$0 = xp.a("narrator.select.world_info", this.f.b(), xp.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xo.a($$0, fsf.A);
         }

         if (this.f.e()) {
            $$0 = xo.a($$0, fsf.D);
         }

         return xp.a("narrator.select", $$0);
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fsf.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gqh.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xp $$13 = this.f.s();
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
            alf $$16 = $$15 ? fsf.s : fsf.u;
            alf $$17 = $$15 ? fsf.q : fsf.r;
            alf $$18 = $$15 ? fsf.m : fsf.n;
            alf $$19 = $$15 ? fsf.o : fsf.p;
            if (this.f instanceof epz.c || this.f instanceof epz.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsf.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsf.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsf.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsf.w.g(), fsf.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsf.y.g(), fsf.z.g()));
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
            fsf.this.a((fsf.a)this);
            if (!($$0 - (double)fsf.this.r() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gsk.a(awa.Ao, 1.0F));
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
            if (this.f instanceof epz.c) {
               this.d.a(fmu.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fsf.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new flx($$0 -> {
            if ($$0) {
               this.d.a(new fnc(true));
               this.e();
            }

            this.d.a(this.e);
         }, xp.c("selectWorld.deleteQuestion"), xp.a("selectWorld.deleteWarning", this.f.b()), xp.c("selectWorld.deleteButton"), xo.e));
      }

      public void e() {
         epy $$0 = this.d.m();
         String $$1 = this.f.a();

         try (epy.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fjo.b(this.d, $$1);
            fsf.v.error("Failed to delete world {}", $$1, var8);
         }

         fsf.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         epy.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fjo.a(this.d, $$0);
            fsf.v.error("Failed to access level {}", $$0, var6);
            fsf.this.K();
            return;
         } catch (evi var7) {
            fsf.v.warn("{}", var7.getMessage());
            this.d.a(fmu.a(() -> this.d.a(this.e)));
            return;
         }

         frw $$5;
         try {
            $$5 = frw.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fsf.this.K();
               }

               this.d.a(this.e);
            });
         } catch (vd | vj | IOException var5) {
            $$1.c();
            fjo.a(this.d, $$0);
            fsf.v.error("Failed to load world data {}", $$0, var5);
            fsf.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (epy.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dce, fsc> $$1 = this.d.x().a($$0);
            dce $$2 = (dce)$$1.getFirst();
            fsc $$3 = (fsc)$$1.getSecond();
            Path $$4 = fru.a($$0.a(epw.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new flx(
                        $$3x -> this.d.a((fnf)($$3x ? fru.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xp.c("selectWorld.recreate.customized.title"),
                        xp.c("selectWorld.recreate.customized.text"),
                        xo.i,
                        xo.e
                     )
                  );
            } else {
               this.d.a(fru.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (evi var8) {
            fsf.v.warn("{}", var8.getMessage());
            this.d.a(fmu.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fsf.v.error("Unable to recreate world", var9);
            this.d.a(new flr(() -> this.d.a(this.e), xp.c("selectWorld.recreate.error.title"), xp.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fml(xp.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ezb.a($$1));
            } catch (Throwable var7) {
               fsf.v.error("Invalid icon for world {}", this.f.a(), var7);
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
