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

public class fsr extends fio<fsr.a> {
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
   private final fsm E;
   private CompletableFuture<List<eqj>> F;
   @Nullable
   private List<eqj> G;
   private String H;
   private final fsr.b I;

   public fsr(fsm $$0, fft $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable fsr $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new fsr.b($$1);
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
      this.aG_().forEach(fsr.a::close);
      super.k();
   }

   @Nullable
   private List<eqj> K() {
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
      if (flt.a($$0)) {
         Optional<fsr.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.aj().a(gsx.a(avh.Ar, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      List<eqj> $$4 = this.K();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<eqj> $$0) {
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

   private CompletableFuture<List<eqj>> M() {
      eqi.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (eqh var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         fsg.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(o.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<eqj> $$1) {
      this.k();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (eqj $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new fsr.c(this, $$2));
         }
      }

      this.O();
   }

   private boolean a(String $$0, eqj $$1) {
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
      this.c.a(new fms(wu.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int b() {
      return 270;
   }

   public void a(@Nullable fsr.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof fsr.c $$1 ? $$1.f : null);
   }

   public Optional<fsr.c> c() {
      fsr.a $$0 = this.h();
      return $$0 instanceof fsr.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public fsm J() {
      return this.E;
   }

   @Override
   public void a(flo $$0) {
      if (this.aG_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fio.a<fsr.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends fsr.a {
      private static final wu a = wu.c("selectWorld.loading_list");
      private final fft b;

      public b(fft $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.y.m - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.a(this.b.h, a, $$10, $$11, 16777215, false);
         String $$12 = fmy.a(ac.c());
         int $$13 = (this.b.y.m - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.a(this.b.h, $$12, $$13, $$14, -8355712, false);
      }

      @Override
      public wu a() {
         return a;
      }
   }

   public final class c extends fsr.a implements AutoCloseable {
      private static final int b = 32;
      private static final int c = 32;
      private final fft d;
      private final fsm e;
      final eqj f;
      private final fmt g;
      @Nullable
      private Path h;
      private long i;

      public c(final fsr $$1, final eqj $$2) {
         this.d = $$1.c;
         this.e = $$1.J();
         this.f = $$2;
         this.g = fmt.a(this.d.aa(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<evw> $$1 = this.d.bd().a(this.h);
                  if (!$$1.isEmpty()) {
                     fsr.v.warn("{}", evu.a(this.h, $$1));
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
               fsr.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public wu a() {
         wu $$0 = wu.a("narrator.select.world_info", this.f.b(), wu.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = wt.a($$0, fsr.A);
         }

         if (this.f.e()) {
            $$0 = wt.a($$0, fsr.D);
         }

         return wu.a("narrator.select", $$0);
      }

      @Override
      public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + fsr.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = gqu.a("selectWorld.world") + " " + ($$1 + 1);
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
            akk $$16 = $$15 ? fsr.s : fsr.u;
            akk $$17 = $$15 ? fsr.q : fsr.r;
            akk $$18 = $$15 ? fsr.m : fsr.n;
            akk $$19 = $$15 ? fsr.o : fsr.p;
            if (this.f instanceof eqj.c || this.f instanceof eqj.b) {
               $$0.a($$18, $$3, $$2, 32, 32);
               $$0.a($$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsr.A, 175));
               }
            } else if (this.f.d()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsr.B, 175));
               }
            } else if (!this.f.r()) {
               $$0.a($$18, $$3, $$2, 32, 32);
               if ($$15) {
                  this.e.b(this.d.h.c(fsr.C, 175));
               }
            } else if (this.f.m()) {
               $$0.a($$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a($$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsr.w.g(), fsr.x.g()));
                  }
               } else if (!aa.b().g()) {
                  $$0.a($$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     this.e.b(ImmutableList.of(fsr.y.g(), fsr.z.g()));
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
            fsr.this.a((fsr.a)this);
            if (!($$0 - (double)fsr.this.s() <= 32.0) && ac.c() - this.i >= 250L) {
               this.i = ac.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.aj().a(gsx.a(avh.Ar, 1.0F));
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
            if (this.f instanceof eqj.c) {
               this.d.a(fnb.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  fsr.this.L();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new fmh($$0 -> {
            if ($$0) {
               this.d.a(new fng(true));
               this.e();
            }

            this.d.a(this.e);
         }, wu.c("selectWorld.deleteQuestion"), wu.a("selectWorld.deleteWarning", this.f.b()), wu.c("selectWorld.deleteButton"), wt.e));
      }

      public void e() {
         eqi $$0 = this.d.m();
         String $$1 = this.f.a();

         try (eqi.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            fka.b(this.d, $$1);
            fsr.v.error("Failed to delete world {}", $$1, var8);
         }

         fsr.this.L();
      }

      public void f() {
         this.k();
         String $$0 = this.f.a();

         eqi.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            fka.a(this.d, $$0);
            fsr.v.error("Failed to access level {}", $$0, var6);
            fsr.this.L();
            return;
         } catch (evu var7) {
            fsr.v.warn("{}", var7.getMessage());
            this.d.a(fnb.a(() -> this.d.a(this.e)));
            return;
         }

         fsi $$5;
         try {
            $$5 = fsi.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  fsr.this.L();
               }

               this.d.a(this.e);
            });
         } catch (ui | uo | IOException var5) {
            $$1.c();
            fka.a(this.d, $$0);
            fsr.v.error("Failed to load world data {}", $$0, var5);
            fsr.this.L();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (eqi.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dcj, fso> $$1 = this.d.x().a($$0);
            dcj $$2 = (dcj)$$1.getFirst();
            fso $$3 = (fso)$$1.getSecond();
            Path $$4 = fsg.a($$0.a(eqg.j), this.d);
            $$3.b();
            if ($$3.c().e()) {
               this.d
                  .a(
                     new fmh(
                        $$3x -> this.d.a((fnj)($$3x ? fsg.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        wu.c("selectWorld.recreate.customized.title"),
                        wu.c("selectWorld.recreate.customized.text"),
                        wt.i,
                        wt.e
                     )
                  );
            } else {
               this.d.a(fsg.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (evu var8) {
            fsr.v.warn("{}", var8.getMessage());
            this.d.a(fnb.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            fsr.v.error("Unable to recreate world", var9);
            this.d.a(new fmc(() -> this.d.a(this.e), wu.c("selectWorld.recreate.error.title"), wu.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.d(new fmu(wu.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(ezn.a($$1));
            } catch (Throwable var7) {
               fsr.v.error("Invalid icon for world {}", this.f.a(), var7);
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
