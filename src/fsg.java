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

public class fsg extends fnj {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger q = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final wu s = wu.c("selectWorld.gameMode");
   static final wu u = wu.c("selectWorld.enterName");
   static final wu v = wu.c("selectWorld.experiments");
   static final wu w = wu.c("selectWorld.allowCommands.info");
   private static final wu x = wu.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final akk a = new akk("textures/gui/tab_header_background.png");
   private final flf A = new flf(this);
   final fsp B;
   private final fjv C = new fjv(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evv E;
   @Nullable
   private final fnj F;
   @Nullable
   private Path G;
   @Nullable
   private ath H;
   @Nullable
   private fjw I;

   public static void a(fft $$0, @Nullable fnj $$1) {
      a($$0, x);
      ath $$2 = new ath(new atk($$0.bd()));
      alg.c $$3 = a($$2, dda.c);
      CompletableFuture<fso> $$4 = alg.a(
         $$3, $$0x -> new alg.b<>(new fsg.a(new dzb(dzd.a(), eim.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fso($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fsg($$0, $$1, $$4.join(), Optional.of(eim.a), OptionalLong.empty()));
   }

   public static fsg a(fft $$0, @Nullable fnj $$1, dcj $$2, fso $$3, @Nullable Path $$4) {
      fsg $$5 = new fsg($$0, $$1, $$3, eim.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fsp.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fsp.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fsp.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fsg(fft $$0, @Nullable fnj $$1, fso $$2, Optional<akj<eil>> $$3, OptionalLong $$4) {
      super(wu.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new fsp($$0.m().c(), $$2, $$3, $$4);
   }

   public fsp m() {
      return this.B;
   }

   @Override
   protected void aP_() {
      this.I = fjw.a(this.C, this.m).a(new fsg.b(), new fsg.d(), new fsg.c()).a();
      this.c(this.I);
      flj $$0 = this.A.b(flj.e().a(8));
      $$0.a(fhs.a(wu.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fhs.a(wt.e, $$0x -> this.E()).a());
      this.A.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.I.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aE_() {
   }

   @Override
   public void c() {
      if (this.I != null) {
         this.I.a(this.m);
         this.I.b();
         int $$0 = this.I.H().c();
         fly $$1 = new fly(0, $$0, this.m, this.n - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fft $$0, wu $$1) {
      $$0.d(new fmu($$1));
   }

   private void F() {
      fso $$0 = this.B.k();
      dza.b $$1 = $$0.e().a($$0.d());
      jq<akt> $$2 = $$0.f().a(akt.c, $$1.b());
      Lifecycle $$3 = cpa.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fsq.a(this.l, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eqm.a $$0, jq<akt> $$1, Lifecycle $$2) {
      a(this.l, x);
      Optional<eqi.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eqm.a.c;
         fso $$5 = this.B.k();
         dcj $$6 = this.c($$4);
         eqo $$7 = new eqm($$6, $$5.c(), $$0, $$2);
         this.l.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dcj c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dcb $$2 = new dcb();
         $$2.a(dcb.l).a(false, null);
         return new dcj($$1, dcc.d, false, bqd.a, true, $$2, dda.c);
      } else {
         return new dcj($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().h());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.I.b($$0)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.F();
         return true;
      }
   }

   @Override
   public void d() {
      this.E();
   }

   public void E() {
      this.l.a(this.F);
      this.J();
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnj.h, 0, this.n - this.A.b() - 2, 0.0F, 0.0F, this.m, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fhf $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.m, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.m, this.n);
   }

   @Override
   protected <T extends fjo & flm> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fjo & fiv & flm> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path G() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            q.warn("Failed to create temporary dir", var2);
            fka.c(this.l, this.B.c());
            this.E();
         }
      }

      return this.G;
   }

   void a(dda $$0) {
      Pair<Path, ath> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new fsj(this, (ath)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dda $$0) {
      Pair<Path, ath> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new fqx((ath)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wu.c("dataPack.title")));
      }
   }

   private void a(ath $$0, boolean $$1, Consumer<dda> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dda $$5 = new dda(new dbt($$3, $$4), this.B.k().h().b());
      if (this.B.a($$5)) {
         this.l.a(this);
      } else {
         coy $$6 = $$0.e();
         if (cpa.a($$6) && $$1) {
            this.l.a(new fsf($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.B.k().h());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(ath $$0, dda $$1, Consumer<dda> $$2) {
      this.l.d(new fmu(wu.c("dataPack.validation.working")));
      alg.c $$3 = a($$0, $$1);
      alg.<fsg.a, fso>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lr.aX).c() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lr.aE).c() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fso $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dzb.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dzb $$5 = (dzb)$$3x.flatMap($$1xx -> dzb.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alg.b<>(new fsg.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fso($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.l
         )
         .thenApplyAsync($$0x -> {
            $$0x.b();
            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.l)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               q.warn("Failed to validate datapack", $$2x);
               this.l.a(new fmh($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().h());
                  } else {
                     $$2.accept(dda.c);
                  }
               }, wu.c("dataPack.validation.failed"), wt.a, wu.c("dataPack.validation.back"), wu.c("dataPack.validation.reset")));
            } else {
               this.l.a(this);
            }

            return null;
         }, this.l);
   }

   private static alg.c a(ath $$0, dda $$1) {
      alg.d $$2 = new alg.d($$0, $$1, false, true);
      return new alg.c($$2, er.a.c, 2);
   }

   private void J() {
      if (this.G != null) {
         try (Stream<Path> $$0 = Files.walk(this.G)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  q.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            q.warn("Failed to list temporary dir {}", this.G);
         }

         this.G = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ac.b($$0, $$1, $$2);
      } catch (IOException var4) {
         q.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<eqi.c> K() {
      String $$0 = this.B.c();

      try {
         eqi.c $$1 = this.l.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(eqg.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.G)).forEach($$1x -> a(this.G, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            q.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         q.warn("Failed to create access for {}", $$0, var9);
      }

      fka.c(this.l, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fft $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  q.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         q.warn("Failed to copy datapacks from world {}", $$0, var8);
         fka.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, ath> c(dda $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atk.a($$1, this.E);
            this.H.a();
         }

         this.H.b($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dzb a, dda b) {
   }

   class b extends fjt {
      private static final wu c = wu.c("createWorld.tab.game.title");
      private static final wu d = wu.c("selectWorld.allowCommands.new");
      private final fib e;

      b() {
         super(c);
         fle.b $$0 = this.a.b(8).d(1);
         fli $$1 = $$0.b();
         this.e = new fib(fsg.this.o, 208, 20, wu.c("selectWorld.enterName"));
         this.e.a(fsg.this.B.b());
         this.e.b(fsg.this.B::a);
         fsg.this.B.a($$0x -> this.e.a(fjd.a(wu.a("selectWorld.targetFolder", wu.b($$0x.c()).a(n.u)))));
         fsg.this.b(this.e);
         $$0.a(flb.a(fsg.this.o, this.e, fsg.u), $$0.b().b());
         fhz<fsp.a> $$2 = $$0.a(fhz.<fsp.a>a($$0x -> $$0x.f).a(fsp.a.a, fsp.a.b, fsp.a.c).a(0, 0, 210, 20, fsg.s, ($$0x, $$1x) -> fsg.this.B.a($$1x)), $$1);
         fsg.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fjd.a($$1x.d().a()));
         });
         fhz<bqd> $$3 = $$0.a(fhz.a(bqd::b).a(bqd.values()).a(0, 0, 210, 20, wu.c("options.difficulty"), ($$0x, $$1x) -> fsg.this.B.a($$1x)), $$1);
         fsg.this.B.a($$1x -> {
            $$3.a(fsg.this.B.e());
            $$3.j = !fsg.this.B.f();
            $$3.a(fjd.a(fsg.this.B.e().d()));
         });
         fhz<Boolean> $$4 = $$0.a(fhz.e().a($$0x -> fjd.a(fsg.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fsg.this.B.a($$1x)));
         fsg.this.B.a($$1x -> {
            $$4.a(fsg.this.B.g());
            $$4.j = !fsg.this.B.l() && !fsg.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhs.a(fsg.v, $$0x -> fsg.this.a(fsg.this.B.k().h())).a(210).a());
         }
      }
   }

   class c extends fjt {
      private static final wu c = wu.c("createWorld.tab.more.title");
      private static final wu d = wu.c("selectWorld.gameRules");
      private static final wu e = wu.c("selectWorld.dataPacks");

      c() {
         super(c);
         fle.b $$0 = this.a.b(8).d(1);
         $$0.a(fhs.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhs.a(fsg.v, $$0x -> fsg.this.a(fsg.this.B.k().h())).a(210).a());
         $$0.a(fhs.a(e, $$0x -> fsg.this.b(fsg.this.B.k().h())).a(210).a());
      }

      private void b() {
         fsg.this.l.a(new fsh(fsg.this.B.q().b(), $$0 -> {
            fsg.this.l.a(fsg.this);
            $$0.ifPresent(fsg.this.B::a);
         }));
      }
   }

   class d extends fjt {
      private static final wu c = wu.c("createWorld.tab.world.title");
      private static final wu d = wu.c("generator.minecraft.amplified.info");
      private static final wu e = wu.c("selectWorld.mapFeatures");
      private static final wu f = wu.c("selectWorld.mapFeatures.info");
      private static final wu g = wu.c("selectWorld.bonusItems");
      private static final wu h = wu.c("selectWorld.enterSeed");
      static final wu i = wu.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fib k;
      private final fhs l;

      d() {
         super(c);
         fle.b $$0 = this.a.a(10).b(8).d(2);
         fhz<fsp.b> $$1 = $$0.a(
            fhz.<fsp.b>a(fsp.b::a).a(this.c()).a(fsg.d::a).a(0, 0, 150, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> fsg.this.B.a($$1x))
         );
         $$1.a(fsg.this.B.m());
         fsg.this.B.a($$1x -> {
            fsp.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fjd.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fsg.this.B.m().c() != null;
         });
         this.l = $$0.a(fhs.a(wu.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fsg.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fib(fsg.this.o, 308, 20, wu.c("selectWorld.enterSeed")) {
            @Override
            protected xi aM_() {
               return super.aM_().b(wt.t).b(fsg.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fsg.this.B.h());
         this.k.b($$0x -> fsg.this.B.b(this.k.a()));
         $$0.a(flb.a(fsg.this.o, this.k, h), 2);
         fsn.a $$2 = fsn.a(310);
         $$2.a(e, fsg.this.B::i, fsg.this.B::b).a(() -> !fsg.this.B.l()).a(f);
         $$2.a(g, fsg.this.B::j, fsg.this.B::c).a(() -> !fsg.this.B.f() && !fsg.this.B.l());
         fsn $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fsg.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         fsl $$0 = fsg.this.B.n();
         if ($$0 != null) {
            fsg.this.l.a($$0.createEditScreen(fsg.this, fsg.this.B.k()));
         }
      }

      private fhz.c<fsp.b> c() {
         return new fhz.c<fsp.b>() {
            @Override
            public List<fsp.b> a() {
               return fhz.a.getAsBoolean() ? fsg.this.B.p() : fsg.this.B.o();
            }

            @Override
            public List<fsp.b> b() {
               return fsg.this.B.o();
            }
         };
      }

      private static xi a(fhz<fsp.b> $$0) {
         return $$0.a().b() ? wt.a($$0.c(), d) : $$0.c();
      }
   }
}
