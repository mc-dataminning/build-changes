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

public class foo extends fel<foo.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ajt m = new ajt("world_list/error_highlighted");
   static final ajt n = new ajt("world_list/error");
   static final ajt o = new ajt("world_list/marked_join_highlighted");
   static final ajt p = new ajt("world_list/marked_join");
   static final ajt q = new ajt("world_list/warning_highlighted");
   static final ajt r = new ajt("world_list/warning");
   static final ajt s = new ajt("world_list/join_highlighted");
   static final ajt u = new ajt("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final wg w = wg.c("selectWorld.tooltip.fromNewerVersion1").a(n.m);
   static final wg x = wg.c("selectWorld.tooltip.fromNewerVersion2").a(n.m);
   static final wg y = wg.c("selectWorld.tooltip.snapshot1").a(n.g);
   static final wg z = wg.c("selectWorld.tooltip.snapshot2").a(n.g);
   static final wg A = wg.c("selectWorld.locked").a(n.m);
   static final wg B = wg.c("selectWorld.conversion.tooltip").a(n.m);
   static final wg C = wg.c("selectWorld.incompatible.tooltip").a(n.m);
   static final wg D = wg.c("selectWorld.experimental");
   private final foj E;
   private CompletableFuture<List<ems>> F;
   @Nullable
   private List<ems> G;
   private String H;
   private final foo.b I;

   public foo(foj $$0, fbp $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable foo $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new foo.b($$1);
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
      this.aF_().forEach(foo.a::close);
      super.k();
   }

   @Nullable
   private List<ems> J() {
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
      if (fhq.a($$0)) {
         Optional<foo.c> $$3 = this.d();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.ak().a(gor.a(aum.zV, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      List<ems> $$4 = this.J();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<ems> $$0) {
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

   private CompletableFuture<List<ems>> L() {
      emr.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (emq var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fod.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<ems> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (ems $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new foo.c(this, $$2));
         }
      }

      this.N();
   }

   private boolean a(String $$0, ems $$1) {
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

   private void c(wg $$0) {
      this.c.a(new fir(wg.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable foo.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof foo.c $$1 ? $$1.f : null);
   }

   public Optional<foo.c> d() {
      foo.a $$0 = this.h();
      return $$0 instanceof foo.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public foj I() {
      return this.E;
   }

   @Override
   public void a(fhl $$0) {
      if (this.aF_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fel.a<foo.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends foo.a {
      private static final wg a = wg.c("selectWorld.loading_list");
      private final fbp b;

      public b(fbp $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.k - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fiz.a(ac.b());
         int $$13 = (this.b.y.k - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wg a() {
         return a;
      }
   }

   public final class c extends foo.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fbp d;
      private final foj e;
      final ems f;
      private final fis g;
      @Nullable
      private Path h;
      private long i;

      public c(foo $$1, ems $$2) {
         this.d = $$1.c;
         this.e = $$1.I();
         this.f = $$2;
         this.g = fis.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<err> $$1 = this.d.be().a(this.h);
                  if (!$$1.isEmpty()) {
                     foo.v.warn("{}", erp.a(this.h, $$1));
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
               foo.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wg a() {
         wg $$0 = wg.a("narrator.select.world_info", this.f.b(), wg.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wf.a($$0, foo.A);
         }

         if (this.f.e()) {
            $$0 = wf.a($$0, foo.D);
         }

         return wg.a("narrator.select", $$0);
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + foo.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gmo.a("selectWorld.world") + " " + ($$1 + 1);
         }

         wg $$13 = this.f.s();
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
            ajt $$16 = $$15 ? foo.s : foo.u;
            ajt $$17 = $$15 ? foo.q : foo.r;
            ajt $$18 = $$15 ? foo.m : foo.n;
            ajt $$19 = $$15 ? foo.o : foo.p;
            if (this.f instanceof ems.c || this.f instanceof ems.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(foo.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(foo.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(foo.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(foo.w.g(), foo.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(foo.y.g(), foo.z.g()));
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
            foo.this.a((foo.a)this);
            if (!($$0 - (double)foo.this.r() <= 32.0) && ac.b() - this.i >= 250L) {
               this.i = ac.b();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.ak().a(gor.a(aum.zV, 1.0F));
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
            if (this.f instanceof ems.c) {
               this.d.a(fjd.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  foo.this.K();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fig($$0 -> {
            if ($$0) {
               this.d.a(new fjl(true));
               this.e();
            }

            this.d.a(this.e);
         }, wg.c("selectWorld.deleteQuestion"), wg.a("selectWorld.deleteWarning", this.f.b()), wg.c("selectWorld.deleteButton"), wf.e));
      }

      public void e() {
         emr $$0 = this.d.m();
         String $$1 = this.f.a();

         try (emr.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            ffx.b(this.d, $$1);
            foo.v.error("Failed to delete world {}", $$1, var8);
         }

         foo.this.K();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         emr.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            ffx.a(this.d, $$0);
            foo.v.error("Failed to access level {}", $$0, var6);
            foo.this.K();
            return;
         } catch (erp var7) {
            foo.v.warn("{}", var7.getMessage());
            this.d.a(fjd.a(() -> this.d.a(this.e)));
            return;
         }

         fof $$5;
         try {
            $$5 = fof.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  foo.this.K();
               }

               this.d.a(this.e);
            });
         } catch (tx | ud | IOException var5) {
            $$1.c();
            ffx.a(this.d, $$0);
            foo.v.error("Failed to load world data {}", $$0, var5);
            foo.this.K();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (emr.c $$0 = this.d.m().d(this.f.a())) {
            Pair<czb, fol> $$1 = this.d.x().a($$0);
            czb $$2 = (czb)$$1.getFirst();
            fol $$3 = (fol)$$1.getSecond();
            Path $$4 = fod.a($$0.a(emp.j), this.d);
            if ($$3.b().e()) {
               this.d
                  .a(
                     new fig(
                        $$3x -> this.d.a((fjo)($$3x ? fod.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wg.c("selectWorld.recreate.customized.title"),
                        wg.c("selectWorld.recreate.customized.text"),
                        wf.i,
                        wf.e
                     )
                  );
            } else {
               this.d.a(fod.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (erp var8) {
            foo.v.warn("{}", var8.getMessage());
            this.d.a(fjd.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            foo.v.error("Unable to recreate world", var9);
            this.d.a(new fia(() -> this.d.a(this.e), wg.c("selectWorld.recreate.error.title"), wg.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fiu(wg.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(evj.a($$1));
            } catch (Throwable var7) {
               foo.v.error("Invalid icon for world {}", this.f.a(), var7);
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
