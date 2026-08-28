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

public class frs extends fnd {
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
   private final fkr A = new fkr(this);
   final fsb B;
   private final fjh C = new fjh(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evh E;
   @Nullable
   private final fnd F;
   @Nullable
   private Path G;
   @Nullable
   private aua H;
   @Nullable
   private fji I;

   public static void a(fff $$0, @Nullable fnd $$1) {
      a($$0, x);
      aua $$2 = new aua(new aud($$0.bd()));
      amb.c $$3 = a($$2, dcs.c);
      CompletableFuture<fsa> $$4 = amb.a(
         $$3, $$0x -> new amb.b<>(new frs.a(new dyq(dys.a(), eia.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fsa($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new frs($$0, $$1, $$4.join(), Optional.of(eia.a), OptionalLong.empty()));
   }

   public static frs a(fff $$0, @Nullable fnd $$1, dcc $$2, fsa $$3, @Nullable Path $$4) {
      frs $$5 = new frs($$0, $$1, $$3, eia.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fsb.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fsb.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fsb.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private frs(fff $$0, @Nullable fnd $$1, fsa $$2, Optional<ale<ehz>> $$3, OptionalLong $$4) {
      super(xp.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new fsb($$0.m().c(), $$2, $$3, $$4);
   }

   public fsb m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fji.a(this.C, this.n).a(new frs.b(), new frs.d(), new frs.c()).a();
      this.c(this.I);
      fkv $$0 = this.A.b(fkv.e().a(8));
      $$0.a(fhe.a(xp.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fhe.a(xo.e, $$0x -> this.E()).a());
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
         flk $$1 = new flk(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fff $$0, xp $$1) {
      $$0.d(new fmj($$1));
   }

   private void F() {
      fsa $$0 = this.B.k();
      dyp.b $$1 = $$0.d().a($$0.c());
      jp<alo> $$2 = $$0.e().a(alo.c, $$1.b());
      Lifecycle $$3 = cpn.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fsc.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eqa.a $$0, jp<alo> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<epw.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eqa.a.c;
         fsa $$5 = this.B.k();
         dcc $$6 = this.c($$4);
         eqc $$7 = new eqa($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dcc c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbu $$2 = new dbu();
         $$2.a(dbu.l).a(false, null);
         return new dcc($$1, dbv.d, false, bqr.a, true, $$2, dcs.c);
      } else {
         return new dcc($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnd.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fgr $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fja & fky> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fja & fih & fky> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fjm.c(this.m, this.B.c());
            this.E();
         }
      }

      return this.G;
   }

   void a(dcs $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new frv(this, (aua)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dcs $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fqj((aua)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xp.c("dataPack.title")));
      }
   }

   private void a(aua $$0, boolean $$1, Consumer<dcs> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dcs $$5 = new dcs(new dbm($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cpl $$6 = $$0.e();
         if (cpn.a($$6) && $$1) {
            this.m.a(new frr($$0.f(), $$3x -> {
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

   private void a(aua $$0, dcs $$1, Consumer<dcs> $$2) {
      this.m.d(new fmj(xp.c("dataPack.validation.working")));
      amb.c $$3 = a($$0, $$1);
      amb.<frs.a, fsa>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lq.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lq.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fsa $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dyq.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dyq $$5 = (dyq)$$3x.flatMap($$1xx -> dyq.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amb.b<>(new frs.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fsa($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.m
         )
         .thenApplyAsync($$0x -> {
            for (dvv $$1x : $$0x.c()) {
               $$1x.b().a();
            }

            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.m)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new flv($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dcs.c);
                  }
               }, xp.c("dataPack.validation.failed"), xo.a, xp.c("dataPack.validation.back"), xp.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amb.c a(aua $$0, dcs $$1) {
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

   private Optional<epw.c> K() {
      String $$0 = this.B.c();

      try {
         epw.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(epu.j);
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

      fjm.c(this.m, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fff $$1) {
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
         fjm.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aua> c(dcs $$0) {
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

   static record a(dyq a, dcs b) {
   }

   class b extends fjf {
      private static final xp c = xp.c("createWorld.tab.game.title");
      private static final xp d = xp.c("selectWorld.allowCommands.new");
      private final fhn e;

      b() {
         super(c);
         fkq.b $$0 = this.a.b(8).d(1);
         fku $$1 = $$0.b();
         this.e = new fhn(frs.this.p, 208, 20, xp.c("selectWorld.enterName"));
         this.e.a(frs.this.B.b());
         this.e.b(frs.this.B::a);
         frs.this.B.a($$0x -> this.e.a(fip.a(xp.a("selectWorld.targetFolder", xp.b($$0x.c()).a(n.u)))));
         frs.this.b(this.e);
         $$0.a(fkn.a(frs.this.p, this.e, frs.u), $$0.b().b());
         fhl<fsb.a> $$2 = $$0.a(fhl.<fsb.a>a($$0x -> $$0x.f).a(fsb.a.a, fsb.a.b, fsb.a.c).a(0, 0, 210, 20, frs.s, ($$0x, $$1x) -> frs.this.B.a($$1x)), $$1);
         frs.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fip.a($$1x.d().a()));
         });
         fhl<bqr> $$3 = $$0.a(fhl.a(bqr::b).a(bqr.values()).a(0, 0, 210, 20, xp.c("options.difficulty"), ($$0x, $$1x) -> frs.this.B.a($$1x)), $$1);
         frs.this.B.a($$1x -> {
            $$3.a(frs.this.B.e());
            $$3.j = !frs.this.B.f();
            $$3.a(fip.a(frs.this.B.e().d()));
         });
         fhl<Boolean> $$4 = $$0.a(fhl.e().a($$0x -> fip.a(frs.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> frs.this.B.a($$1x)));
         frs.this.B.a($$1x -> {
            $$4.a(frs.this.B.g());
            $$4.j = !frs.this.B.l() && !frs.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhe.a(frs.v, $$0x -> frs.this.a(frs.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fjf {
      private static final xp c = xp.c("createWorld.tab.more.title");
      private static final xp d = xp.c("selectWorld.gameRules");
      private static final xp e = xp.c("selectWorld.dataPacks");

      c() {
         super(c);
         fkq.b $$0 = this.a.b(8).d(1);
         $$0.a(fhe.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhe.a(frs.v, $$0x -> frs.this.a(frs.this.B.k().g())).a(210).a());
         $$0.a(fhe.a(e, $$0x -> frs.this.b(frs.this.B.k().g())).a(210).a());
      }

      private void b() {
         frs.this.m.a(new frt(frs.this.B.q().b(), $$0 -> {
            frs.this.m.a(frs.this);
            $$0.ifPresent(frs.this.B::a);
         }));
      }
   }

   class d extends fjf {
      private static final xp c = xp.c("createWorld.tab.world.title");
      private static final xp d = xp.c("generator.minecraft.amplified.info");
      private static final xp e = xp.c("selectWorld.mapFeatures");
      private static final xp f = xp.c("selectWorld.mapFeatures.info");
      private static final xp g = xp.c("selectWorld.bonusItems");
      private static final xp h = xp.c("selectWorld.enterSeed");
      static final xp i = xp.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fhn k;
      private final fhe l;

      d() {
         super(c);
         fkq.b $$0 = this.a.a(10).b(8).d(2);
         fhl<fsb.b> $$1 = $$0.a(
            fhl.<fsb.b>a(fsb.b::a).a(this.c()).a(frs.d::a).a(0, 0, 150, 20, xp.c("selectWorld.mapType"), ($$0x, $$1x) -> frs.this.B.a($$1x))
         );
         $$1.a(frs.this.B.m());
         frs.this.B.a($$1x -> {
            fsb.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fip.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = frs.this.B.m().c() != null;
         });
         this.l = $$0.a(fhe.a(xp.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         frs.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fhn(frs.this.p, 308, 20, xp.c("selectWorld.enterSeed")) {
            @Override
            protected yd aJ_() {
               return super.aJ_().b(xo.t).b(frs.d.i);
            }
         };
         this.k.c(i);
         this.k.a(frs.this.B.h());
         this.k.b($$0x -> frs.this.B.b(this.k.a()));
         $$0.a(fkn.a(frs.this.p, this.k, h), 2);
         frz.a $$2 = frz.a(310);
         $$2.a(e, frs.this.B::i, frs.this.B::b).a(() -> !frs.this.B.l()).a(f);
         $$2.a(g, frs.this.B::j, frs.this.B::c).a(() -> !frs.this.B.f() && !frs.this.B.l());
         frz $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         frs.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         frx $$0 = frs.this.B.n();
         if ($$0 != null) {
            frs.this.m.a($$0.createEditScreen(frs.this, frs.this.B.k()));
         }
      }

      private fhl.c<fsb.b> c() {
         return new fhl.c<fsb.b>() {
            @Override
            public List<fsb.b> a() {
               return fhl.a.getAsBoolean() ? frs.this.B.p() : frs.this.B.o();
            }

            @Override
            public List<fsb.b> b() {
               return frs.this.B.o();
            }
         };
      }

      private static yd a(fhl<fsb.b> $$0) {
         return $$0.a().b() ? xo.a($$0.c(), d) : $$0.c();
      }
   }
}
