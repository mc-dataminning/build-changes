import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ftc extends fod {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger r = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final wz u = wz.c("selectWorld.gameMode");
   static final wz v = wz.c("selectWorld.enterName");
   static final wz w = wz.c("selectWorld.experiments");
   static final wz x = wz.c("selectWorld.allowCommands.info");
   private static final wz y = wz.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final akr a = akr.b("textures/gui/tab_header_background.png");
   private final flz B = new flz(this);
   final ftl C;
   private final fkp D = new fkp(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final ews F;
   @Nullable
   private final fod G;
   @Nullable
   private Path H;
   @Nullable
   private atp I;
   @Nullable
   private fkq J;

   public static void a(fgo $$0, @Nullable fod $$1) {
      a($$0, y);
      atp $$2 = new atp(new ats($$0.bb()));
      alo.c $$3 = a($$2, ddr.c);
      CompletableFuture<ftk> $$4 = alo.a(
         $$3, $$0x -> new alo.b<>(new ftc.a(new dzu(dzw.a(), ejh.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new ftk($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new ftc($$0, $$1, $$4.join(), Optional.of(ejh.a), OptionalLong.empty()));
   }

   public static ftc a(fgo $$0, @Nullable fod $$1, dda $$2, ftk $$3, @Nullable Path $$4) {
      ftc $$5 = new ftc($$0, $$1, $$3, ejh.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(ftl.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(ftl.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(ftl.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private ftc(fgo $$0, @Nullable fod $$1, ftk $$2, Optional<akq<ejg>> $$3, OptionalLong $$4) {
      super(wz.c("selectWorld.create"));
      this.G = $$1;
      this.F = $$0.bb();
      this.C = new ftl($$0.m().c(), $$2, $$3, $$4);
   }

   public ftl m() {
      return this.C;
   }

   @Override
   protected void aT_() {
      this.J = fkq.a(this.D, this.m).a(new ftc.b(), new ftc.d(), new ftc.c()).a();
      this.c(this.J);
      fmd $$0 = this.B.b(fmd.e().a(8));
      $$0.a(fim.a(wz.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(fim.a(wy.e, $$0x -> this.C()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aI_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.m);
         this.J.b();
         int $$0 = this.J.H().c();
         fms $$1 = new fms(0, $$0, this.m, this.n - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fgo $$0, wz $$1) {
      $$0.d(new fno($$1));
   }

   private void D() {
      ftk $$0 = this.C.k();
      dzt.b $$1 = $$0.e().a($$0.d());
      jt<ala> $$2 = $$0.f().a(ala.c, $$1.b());
      Lifecycle $$3 = cpn.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      ftm.a(this.l, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(erj.a $$0, jt<ala> $$1, Lifecycle $$2) {
      a(this.l, y);
      Optional<erf.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == erj.a.c;
         ftk $$5 = this.C.k();
         dda $$6 = this.c($$4);
         erl $$7 = new erj($$6, $$5.c(), $$0, $$2);
         this.l.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dda c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dcs $$2 = new dcs();
         $$2.a(dcs.l).a(false, null);
         return new dda($$1, dct.d, false, bqo.a, true, $$2, ddr.c);
      } else {
         return new dda($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.J.b($$0)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.D();
         return true;
      }
   }

   @Override
   public void d() {
      this.C();
   }

   public void C() {
      this.l.a(this.G);
      this.F();
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fod.h, 0, this.n - this.B.b() - 2, 0.0F, 0.0F, this.m, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fhz $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.m, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.m, this.n);
   }

   @Override
   protected <T extends fki & fmg> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fki & fjp & fmg> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            r.warn("Failed to create temporary dir", var2);
            fku.c(this.l, this.C.c());
            this.C();
         }
      }

      return this.H;
   }

   void a(ddr $$0) {
      Pair<Path, atp> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new ftf(this, (atp)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(ddr $$0) {
      Pair<Path, atp> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new frt((atp)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wz.c("dataPack.title")));
      }
   }

   private void a(atp $$0, boolean $$1, Consumer<ddr> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      ddr $$5 = new ddr(new dck($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.l.a(this);
      } else {
         cpl $$6 = $$0.e();
         if (cpn.a($$6) && $$1) {
            this.l.a(new ftb($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.C.k().h());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(atp $$0, ddr $$1, Consumer<ddr> $$2) {
      this.l.d(new fno(wz.c("dataPack.validation.working")));
      alo.c $$3 = a($$0, $$1);
      alo.<ftc.a, ftk>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lu.aY).c() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lu.aF).c() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  ftk $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dzu.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dzu $$5 = (dzu)$$3x.flatMap($$1xx -> dzu.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alo.b<>(new ftc.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new ftk($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ad.g(),
            this.l
         )
         .thenApply($$0x -> {
            $$0x.b();
            return $$0x;
         })
         .thenAcceptAsync(this.C::a, this.l)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               r.warn("Failed to validate datapack", $$2x);
               this.l.a(new fnb($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(ddr.c);
                  }
               }, wz.c("dataPack.validation.failed"), wy.a, wz.c("dataPack.validation.back"), wz.c("dataPack.validation.reset")));
            } else {
               this.l.a(this);
            }

            return null;
         }, this.l);
   }

   private static alo.c a(atp $$0, ddr $$1) {
      alo.d $$2 = new alo.d($$0, $$1, false, true);
      return new alo.c($$2, eu.a.c, 2);
   }

   private void F() {
      if (this.H != null) {
         try (Stream<Path> $$0 = Files.walk(this.H)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  r.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            r.warn("Failed to list temporary dir {}", this.H);
         }

         this.H = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ad.b($$0, $$1, $$2);
      } catch (IOException var4) {
         r.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<erf.c> G() {
      String $$0 = this.C.c();

      try {
         erf.c $$1 = this.l.m().e($$0);
         if (this.H == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.H)) {
               Path $$3 = $$1.a(erd.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.H)).forEach($$1x -> a(this.H, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            r.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         r.warn("Failed to create access for {}", $$0, var9);
      }

      fku.c(this.l, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fgo $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  r.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         r.warn("Failed to copy datapacks from world {}", $$0, var8);
         fku.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atp> c(ddr $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = ats.a($$1, this.F);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   static record a(dzu a, ddr b) {
   }

   class b extends fkn {
      private static final wz c = wz.c("createWorld.tab.game.title");
      private static final wz d = wz.c("selectWorld.allowCommands.new");
      private final fiv e;

      b() {
         super(c);
         fly.b $$0 = this.a.b(8).d(1);
         fmc $$1 = $$0.b();
         this.e = new fiv(ftc.this.o, 208, 20, wz.c("selectWorld.enterName"));
         this.e.a(ftc.this.C.b());
         this.e.b(ftc.this.C::a);
         ftc.this.C.a($$0x -> this.e.a(fjx.a(wz.a("selectWorld.targetFolder", wz.b($$0x.c()).a(n.u)))));
         ftc.this.b(this.e);
         $$0.a(flv.a(ftc.this.o, this.e, ftc.v), $$0.b().b());
         fit<ftl.a> $$2 = $$0.a(fit.<ftl.a>a($$0x -> $$0x.f).a(ftl.a.a, ftl.a.b, ftl.a.c).a(0, 0, 210, 20, ftc.u, ($$0x, $$1x) -> ftc.this.C.a($$1x)), $$1);
         ftc.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fjx.a($$1x.d().a()));
         });
         fit<bqo> $$3 = $$0.a(fit.a(bqo::b).a(bqo.values()).a(0, 0, 210, 20, wz.c("options.difficulty"), ($$0x, $$1x) -> ftc.this.C.a($$1x)), $$1);
         ftc.this.C.a($$1x -> {
            $$3.a(ftc.this.C.e());
            $$3.j = !ftc.this.C.f();
            $$3.a(fjx.a(ftc.this.C.e().d()));
         });
         fit<Boolean> $$4 = $$0.a(fit.e().a($$0x -> fjx.a(ftc.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> ftc.this.C.a($$1x)));
         ftc.this.C.a($$1x -> {
            $$4.a(ftc.this.C.g());
            $$4.j = !ftc.this.C.l() && !ftc.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fim.a(ftc.w, $$0x -> ftc.this.a(ftc.this.C.k().h())).a(210).a());
         }
      }
   }

   class c extends fkn {
      private static final wz c = wz.c("createWorld.tab.more.title");
      private static final wz d = wz.c("selectWorld.gameRules");
      private static final wz e = wz.c("selectWorld.dataPacks");

      c() {
         super(c);
         fly.b $$0 = this.a.b(8).d(1);
         $$0.a(fim.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fim.a(ftc.w, $$0x -> ftc.this.a(ftc.this.C.k().h())).a(210).a());
         $$0.a(fim.a(e, $$0x -> ftc.this.b(ftc.this.C.k().h())).a(210).a());
      }

      private void b() {
         ftc.this.l.a(new ftd(ftc.this.C.q().b(), $$0 -> {
            ftc.this.l.a(ftc.this);
            $$0.ifPresent(ftc.this.C::a);
         }));
      }
   }

   class d extends fkn {
      private static final wz c = wz.c("createWorld.tab.world.title");
      private static final wz d = wz.c("generator.minecraft.amplified.info");
      private static final wz e = wz.c("selectWorld.mapFeatures");
      private static final wz f = wz.c("selectWorld.mapFeatures.info");
      private static final wz g = wz.c("selectWorld.bonusItems");
      private static final wz h = wz.c("selectWorld.enterSeed");
      static final wz i = wz.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fiv k;
      private final fim l;

      d() {
         super(c);
         fly.b $$0 = this.a.a(10).b(8).d(2);
         fit<ftl.b> $$1 = $$0.a(
            fit.<ftl.b>a(ftl.b::a).a(this.c()).a(ftc.d::a).a(0, 0, 150, 20, wz.c("selectWorld.mapType"), ($$0x, $$1x) -> ftc.this.C.a($$1x))
         );
         $$1.a(ftc.this.C.m());
         ftc.this.C.a($$1x -> {
            ftl.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fjx.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = ftc.this.C.m().c() != null;
         });
         this.l = $$0.a(fim.a(wz.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         ftc.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fiv(ftc.this.o, 308, 20, wz.c("selectWorld.enterSeed")) {
            @Override
            protected xn aQ_() {
               return super.aQ_().b(wy.t).b(ftc.d.i);
            }
         };
         this.k.c(i);
         this.k.a(ftc.this.C.h());
         this.k.b($$0x -> ftc.this.C.b(this.k.a()));
         $$0.a(flv.a(ftc.this.o, this.k, h), 2);
         ftj.a $$2 = ftj.a(310);
         $$2.a(e, ftc.this.C::i, ftc.this.C::b).a(() -> !ftc.this.C.l()).a(f);
         $$2.a(g, ftc.this.C::j, ftc.this.C::c).a(() -> !ftc.this.C.f() && !ftc.this.C.l());
         ftj $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         ftc.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         fth $$0 = ftc.this.C.n();
         if ($$0 != null) {
            ftc.this.l.a($$0.createEditScreen(ftc.this, ftc.this.C.k()));
         }
      }

      private fit.c<ftl.b> c() {
         return new fit.c<ftl.b>() {
            @Override
            public List<ftl.b> a() {
               return fit.a.getAsBoolean() ? ftc.this.C.p() : ftc.this.C.o();
            }

            @Override
            public List<ftl.b> b() {
               return ftc.this.C.o();
            }
         };
      }

      private static xn a(fit<ftl.b> $$0) {
         return $$0.a().b() ? wy.a($$0.c(), d) : $$0.c();
      }
   }
}
