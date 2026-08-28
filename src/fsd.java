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

public class fsd extends fia<fsd.a> {
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
   private final fry E;
   private CompletableFuture<List<epx>> F;
   @Nullable
   private List<epx> G;
   private String H;
   private final fsd.b I;

   public fsd(fry $$0, fff $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fsd $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fsd.b($$1);
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
      this.aD_().forEach(fsd.a::close);
      super.k();
   }

   @Nullable
   private List<epx> J() {
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
      if (flf.a($$0)) {
         Optional<fsd.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gsi.a(awa.Ao, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      List<epx> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<epx> $$0) {
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

   private CompletableFuture<List<epx>> L() {
      epw.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (epv var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         frs.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<epx> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (epx $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fsd.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, epx $$1) {
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
      this.c.a(new fmg(xp.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fsd.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fsd.c $$1 ? $$1.f : null);
   }

   public Optional<fsd.c> c() {
      fsd.a $$0 = this.h();
      return $$0 instanceof fsd.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fry I() {
      return this.E;
   }

   @Override
   public void a(fla $$0) {
      if (this.aD_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fia.a<fsd.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fsd.a {
      private static final xp a = xp.c("selectWorld.loading_list");
      private final fff b;

      public b(fff $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.n - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fmo.a(ac.c());
         int $$13 = (this.b.y.n - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public xp a() {
         return a;
      }
   }

   public final class c extends fsd.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fff d;
      private final fry e;
      final epx f;
      private final fmh g;
      @Nullable
      private Path h;
      private long i;

      public c(final fsd $$1, final epx $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fmh.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<evi> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fsd.v.warn("{}", evg.a(this.h, $$1));
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
               fsd.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xp a() {
         xp $$0 = xp.a("narrator.select.world_info", this.f.b(), xp.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xo.a($$0, fsd.A);
         }

         if (this.f.e()) {
            $$0 = xo.a($$0, fsd.D);
         }

         return xp.a("narrator.select", $$0);
      }

      @Override
      public void a(fgr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fsd.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gqf.a("selectWorld.world") + " " + ($$1 + 1);
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
            alf $$16 = $$15 ? fsd.s : fsd.u;
            alf $$17 = $$15 ? fsd.q : fsd.r;
            alf $$18 = $$15 ? fsd.m : fsd.n;
            alf $$19 = $$15 ? fsd.o : fsd.p;
            if (this.f instanceof epx.c || this.f instanceof epx.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsd.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsd.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsd.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsd.w.g(), fsd.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsd.y.g(), fsd.z.g()));
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
            fsd.this.a((fsd.a)this);
            if (!($$0 - (double)fsd.this.r() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gsi.a(awa.Ao, 1.0F));
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
            if (this.f instanceof epx.c) {
               this.d.a(fms.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fsd.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new flv($$0 -> {
            if ($$0) {
               this.d.a(new fna(true));
               this.e();
            }

            this.d.a(this.e);
         }, xp.c("selectWorld.deleteQuestion"), xp.a("selectWorld.deleteWarning", this.f.b()), xp.c("selectWorld.deleteButton"), xo.e));
      }

      public void e() {
         epw $$0 = this.d.m();
         String $$1 = this.f.a();

         try (epw.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fjm.b(this.d, $$1);
            fsd.v.error("Failed to delete world {}", $$1, var8);
         }

         fsd.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         epw.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fjm.a(this.d, $$0);
            fsd.v.error("Failed to access level {}", $$0, var6);
            fsd.this.K();
            return;
         } catch (evg var7) {
            fsd.v.warn("{}", var7.getMessage());
            this.d.a(fms.a(() -> this.d.a(this.e)));
            return;
         }

         fru $$5;
         try {
            $$5 = fru.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fsd.this.K();
               }

               this.d.a(this.e);
            });
         } catch (vd | vj | IOException var5) {
            $$1.c();
            fjm.a(this.d, $$0);
            fsd.v.error("Failed to load world data {}", $$0, var5);
            fsd.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (epw.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dcc, fsa> $$1 = this.d.x().a($$0);
            dcc $$2 = (dcc)$$1.getFirst();
            fsa $$3 = (fsa)$$1.getSecond();
            Path $$4 = frs.a($$0.a(epu.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new flv(
                        $$3x -> this.d.a((fnd)($$3x ? frs.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xp.c("selectWorld.recreate.customized.title"),
                        xp.c("selectWorld.recreate.customized.text"),
                        xo.i,
                        xo.e
                     )
                  );
            } else {
               this.d.a(frs.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (evg var8) {
            fsd.v.warn("{}", var8.getMessage());
            this.d.a(fms.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fsd.v.error("Unable to recreate world", var9);
            this.d.a(new flp(() -> this.d.a(this.e), xp.c("selectWorld.recreate.error.title"), xp.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fmj(xp.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(eyz.a($$1));
            } catch (Throwable var7) {
               fsd.v.error("Invalid icon for world {}", this.f.a(), var7);
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
