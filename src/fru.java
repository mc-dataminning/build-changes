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

public class fru extends fnf {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final xp s = xp.c("selectWorld.gameMode");
   static final xp u = xp.c("selectWorld.enterName");
   static final xp v = xp.c("selectWorld.experiments");
   static final xp w = xp.c("selectWorld.allowCommands.info");
   private static final xp x = xp.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final alf a = new alf("textures/gui/tab_header_background.png");
   private final fkt A = new fkt(this);
   final fsd B;
   private final fjj C = new fjj(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evj E;
   @Nullable
   private final fnf F;
   @Nullable
   private Path G;
   @Nullable
   private aua H;
   @Nullable
   private fjk I;

   public static void a(ffh $$0, @Nullable fnf $$1) {
      a($$0, x);
      aua $$2 = new aua(new aud($$0.bd()));
      amb.c $$3 = a($$2, dcu.c);
      CompletableFuture<fsc> $$4 = amb.a(
         $$3, $$0x -> new amb.b<>(new fru.a(new dys(dyu.a(), eic.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fsc($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fru($$0, $$1, $$4.join(), Optional.of(eic.a), OptionalLong.empty()));
   }

   public static fru a(ffh $$0, @Nullable fnf $$1, dce $$2, fsc $$3, @Nullable Path $$4) {
      fru $$5 = new fru($$0, $$1, $$3, eic.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fsd.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fsd.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fsd.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fru(ffh $$0, @Nullable fnf $$1, fsc $$2, Optional<ale<eib>> $$3, OptionalLong $$4) {
      super(xp.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new fsd($$0.m().c(), $$2, $$3, $$4);
   }

   public fsd m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fjk.a(this.C, this.n).a(new fru.b(), new fru.d(), new fru.c()).a();
      this.c(this.I);
      fkx $$0 = this.A.b(fkx.e().a(8));
      $$0.a(fhg.a(xp.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fhg.a(xo.e, $$0x -> this.E()).a());
      this.A.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.I.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aB_() {
   }

   @Override
   public void c() {
      if (this.I != null) {
         this.I.a(this.n);
         this.I.b();
         int $$0 = this.I.G().c();
         flm $$1 = new flm(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(ffh $$0, xp $$1) {
      $$0.d(new fml($$1));
   }

   private void F() {
      fsc $$0 = this.B.k();
      dyr.b $$1 = $$0.d().a($$0.c());
      jp<alo> $$2 = $$0.e().a(alo.c, $$1.b());
      Lifecycle $$3 = cpp.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fse.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eqc.a $$0, jp<alo> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<epy.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eqc.a.c;
         fsc $$5 = this.B.k();
         dce $$6 = this.c($$4);
         eqe $$7 = new eqc($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dce c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbw $$2 = new dbw();
         $$2.a(dbw.l).a(false, null);
         return new dce($$1, dbx.d, false, bqt.a, true, $$2, dcu.c);
      } else {
         return new dce($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
      this.m.a(this.F);
      this.J();
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnf.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fgt $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fjc & fla> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fjc & fij & fla> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fjo.c(this.m, this.B.c());
            this.E();
         }
      }

      return this.G;
   }

   void a(dcu $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new frx(this, (aua)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dcu $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fql((aua)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xp.c("dataPack.title")));
      }
   }

   private void a(aua $$0, boolean $$1, Consumer<dcu> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dcu $$5 = new dcu(new dbo($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cpn $$6 = $$0.e();
         if (cpp.a($$6) && $$1) {
            this.m.a(new frt($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.B.k().g());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(aua $$0, dcu $$1, Consumer<dcu> $$2) {
      this.m.d(new fml(xp.c("dataPack.validation.working")));
      amb.c $$3 = a($$0, $$1);
      amb.<fru.a, fsc>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lq.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lq.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fsc $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dys.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dys $$5 = (dys)$$3x.flatMap($$1xx -> dys.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amb.b<>(new fru.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fsc($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.m
         )
         .thenApplyAsync($$0x -> {
            for (dvx $$1x : $$0x.c()) {
               $$1x.b().a();
            }

            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.m)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new flx($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dcu.c);
                  }
               }, xp.c("dataPack.validation.failed"), xo.a, xp.c("dataPack.validation.back"), xp.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amb.c a(aua $$0, dcu $$1) {
      amb.d $$2 = new amb.d($$0, $$1, false, true);
      return new amb.c($$2, eq.a.c, 2);
   }

   private void J() {
      if (this.G != null) {
         try (Stream<Path> $$0 = Files.walk(this.G)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  d.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            d.warn("Failed to list temporary dir {}", this.G);
         }

         this.G = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ac.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<epy.c> K() {
      String $$0 = this.B.c();

      try {
         epy.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(epw.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.G)).forEach($$1x -> a(this.G, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            d.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         d.warn("Failed to create access for {}", $$0, var9);
      }

      fjo.c(this.m, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ffh $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  d.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         d.warn("Failed to copy datapacks from world {}", $$0, var8);
         fjo.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aua> c(dcu $$0) {
      Path $$1 = this.I();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = aud.a($$1, this.E);
            this.H.a();
         }

         this.H.b($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dys a, dcu b) {
   }

   class b extends fjh {
      private static final xp c = xp.c("createWorld.tab.game.title");
      private static final xp d = xp.c("selectWorld.allowCommands.new");
      private final fhp e;

      b() {
         super(c);
         fks.b $$0 = this.a.b(8).d(1);
         fkw $$1 = $$0.b();
         this.e = new fhp(fru.this.p, 208, 20, xp.c("selectWorld.enterName"));
         this.e.a(fru.this.B.b());
         this.e.b(fru.this.B::a);
         fru.this.B.a($$0x -> this.e.a(fir.a(xp.a("selectWorld.targetFolder", xp.b($$0x.c()).a(n.u)))));
         fru.this.b(this.e);
         $$0.a(fkp.a(fru.this.p, this.e, fru.u), $$0.b().b());
         fhn<fsd.a> $$2 = $$0.a(fhn.<fsd.a>a($$0x -> $$0x.f).a(fsd.a.a, fsd.a.b, fsd.a.c).a(0, 0, 210, 20, fru.s, ($$0x, $$1x) -> fru.this.B.a($$1x)), $$1);
         fru.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fir.a($$1x.d().a()));
         });
         fhn<bqt> $$3 = $$0.a(fhn.a(bqt::b).a(bqt.values()).a(0, 0, 210, 20, xp.c("options.difficulty"), ($$0x, $$1x) -> fru.this.B.a($$1x)), $$1);
         fru.this.B.a($$1x -> {
            $$3.a(fru.this.B.e());
            $$3.j = !fru.this.B.f();
            $$3.a(fir.a(fru.this.B.e().d()));
         });
         fhn<Boolean> $$4 = $$0.a(fhn.e().a($$0x -> fir.a(fru.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fru.this.B.a($$1x)));
         fru.this.B.a($$1x -> {
            $$4.a(fru.this.B.g());
            $$4.j = !fru.this.B.l() && !fru.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhg.a(fru.v, $$0x -> fru.this.a(fru.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fjh {
      private static final xp c = xp.c("createWorld.tab.more.title");
      private static final xp d = xp.c("selectWorld.gameRules");
      private static final xp e = xp.c("selectWorld.dataPacks");

      c() {
         super(c);
         fks.b $$0 = this.a.b(8).d(1);
         $$0.a(fhg.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhg.a(fru.v, $$0x -> fru.this.a(fru.this.B.k().g())).a(210).a());
         $$0.a(fhg.a(e, $$0x -> fru.this.b(fru.this.B.k().g())).a(210).a());
      }

      private void b() {
         fru.this.m.a(new frv(fru.this.B.q().b(), $$0 -> {
            fru.this.m.a(fru.this);
            $$0.ifPresent(fru.this.B::a);
         }));
      }
   }

   class d extends fjh {
      private static final xp c = xp.c("createWorld.tab.world.title");
      private static final xp d = xp.c("generator.minecraft.amplified.info");
      private static final xp e = xp.c("selectWorld.mapFeatures");
      private static final xp f = xp.c("selectWorld.mapFeatures.info");
      private static final xp g = xp.c("selectWorld.bonusItems");
      private static final xp h = xp.c("selectWorld.enterSeed");
      static final xp i = xp.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fhp k;
      private final fhg l;

      d() {
         super(c);
         fks.b $$0 = this.a.a(10).b(8).d(2);
         fhn<fsd.b> $$1 = $$0.a(
            fhn.<fsd.b>a(fsd.b::a).a(this.c()).a(fru.d::a).a(0, 0, 150, 20, xp.c("selectWorld.mapType"), ($$0x, $$1x) -> fru.this.B.a($$1x))
         );
         $$1.a(fru.this.B.m());
         fru.this.B.a($$1x -> {
            fsd.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fir.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fru.this.B.m().c() != null;
         });
         this.l = $$0.a(fhg.a(xp.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fru.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fhp(fru.this.p, 308, 20, xp.c("selectWorld.enterSeed")) {
            @Override
            protected yd aJ_() {
               return super.aJ_().b(xo.t).b(fru.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fru.this.B.h());
         this.k.b($$0x -> fru.this.B.b(this.k.a()));
         $$0.a(fkp.a(fru.this.p, this.k, h), 2);
         fsb.a $$2 = fsb.a(310);
         $$2.a(e, fru.this.B::i, fru.this.B::b).a(() -> !fru.this.B.l()).a(f);
         $$2.a(g, fru.this.B::j, fru.this.B::c).a(() -> !fru.this.B.f() && !fru.this.B.l());
         fsb $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fru.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         frz $$0 = fru.this.B.n();
         if ($$0 != null) {
            fru.this.m.a($$0.createEditScreen(fru.this, fru.this.B.k()));
         }
      }

      private fhn.c<fsd.b> c() {
         return new fhn.c<fsd.b>() {
            @Override
            public List<fsd.b> a() {
               return fhn.a.getAsBoolean() ? fru.this.B.p() : fru.this.B.o();
            }

            @Override
            public List<fsd.b> b() {
               return fru.this.B.o();
            }
         };
      }

      private static yd a(fhn<fsd.b> $$0) {
         return $$0.a().b() ? xo.a($$0.c(), d) : $$0.c();
      }
   }
}
