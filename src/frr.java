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

public class frr extends fnc {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final xo s = xo.c("selectWorld.gameMode");
   static final xo u = xo.c("selectWorld.enterName");
   static final xo v = xo.c("selectWorld.experiments");
   static final xo w = xo.c("selectWorld.allowCommands.info");
   private static final xo x = xo.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final ale a = new ale("textures/gui/tab_header_background.png");
   private final fkq A = new fkq(this);
   final fsa B;
   private final fjg C = new fjg(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evg E;
   @Nullable
   private final fnc F;
   @Nullable
   private Path G;
   @Nullable
   private atz H;
   @Nullable
   private fjh I;

   public static void a(ffe $$0, @Nullable fnc $$1) {
      a($$0, x);
      atz $$2 = new atz(new auc($$0.bd()));
      ama.c $$3 = a($$2, dcr.c);
      CompletableFuture<frz> $$4 = ama.a(
         $$3, $$0x -> new ama.b<>(new frr.a(new dyp(dyr.a(), ehz.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new frz($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new frr($$0, $$1, $$4.join(), Optional.of(ehz.a), OptionalLong.empty()));
   }

   public static frr a(ffe $$0, @Nullable fnc $$1, dcb $$2, frz $$3, @Nullable Path $$4) {
      frr $$5 = new frr($$0, $$1, $$3, ehz.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fsa.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fsa.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fsa.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private frr(ffe $$0, @Nullable fnc $$1, frz $$2, Optional<ald<ehy>> $$3, OptionalLong $$4) {
      super(xo.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new fsa($$0.m().c(), $$2, $$3, $$4);
   }

   public fsa m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fjh.a(this.C, this.n).a(new frr.b(), new frr.d(), new frr.c()).a();
      this.c(this.I);
      fku $$0 = this.A.b(fku.e().a(8));
      $$0.a(fhd.a(xo.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fhd.a(xn.e, $$0x -> this.E()).a());
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
         flj $$1 = new flj(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(ffe $$0, xo $$1) {
      $$0.d(new fmi($$1));
   }

   private void F() {
      frz $$0 = this.B.k();
      dyo.b $$1 = $$0.d().a($$0.c());
      jp<aln> $$2 = $$0.e().a(aln.c, $$1.b());
      Lifecycle $$3 = cpm.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fsb.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(epz.a $$0, jp<aln> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<epv.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == epz.a.c;
         frz $$5 = this.B.k();
         dcb $$6 = this.c($$4);
         eqb $$7 = new epz($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dcb c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbt $$2 = new dbt();
         $$2.a(dbt.l).a(false, null);
         return new dcb($$1, dbu.d, false, bqq.a, true, $$2, dcr.c);
      } else {
         return new dcb($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnc.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fgq $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fiz & fkx> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fiz & fig & fkx> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fjl.c(this.m, this.B.c());
            this.E();
         }
      }

      return this.G;
   }

   void a(dcr $$0) {
      Pair<Path, atz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fru(this, (atz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dcr $$0) {
      Pair<Path, atz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fqi((atz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xo.c("dataPack.title")));
      }
   }

   private void a(atz $$0, boolean $$1, Consumer<dcr> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dcr $$5 = new dcr(new dbl($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cpk $$6 = $$0.e();
         if (cpm.a($$6) && $$1) {
            this.m.a(new frq($$0.f(), $$3x -> {
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

   private void a(atz $$0, dcr $$1, Consumer<dcr> $$2) {
      this.m.d(new fmi(xo.c("dataPack.validation.working")));
      ama.c $$3 = a($$0, $$1);
      ama.<frr.a, frz>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lq.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lq.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  frz $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dyp.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dyp $$5 = (dyp)$$3x.flatMap($$1xx -> dyp.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ama.b<>(new frr.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new frz($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.m
         )
         .thenApplyAsync($$0x -> {
            for (dvu $$1x : $$0x.c()) {
               $$1x.b().a();
            }

            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.m)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new flu($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dcr.c);
                  }
               }, xo.c("dataPack.validation.failed"), xn.a, xo.c("dataPack.validation.back"), xo.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ama.c a(atz $$0, dcr $$1) {
      ama.d $$2 = new ama.d($$0, $$1, false, true);
      return new ama.c($$2, eq.a.c, 2);
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

   private Optional<epv.c> K() {
      String $$0 = this.B.c();

      try {
         epv.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(ept.j);
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

      fjl.c(this.m, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ffe $$1) {
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
         fjl.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atz> c(dcr $$0) {
      Path $$1 = this.I();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = auc.a($$1, this.E);
            this.H.a();
         }

         this.H.b($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dyp a, dcr b) {
   }

   class b extends fje {
      private static final xo c = xo.c("createWorld.tab.game.title");
      private static final xo d = xo.c("selectWorld.allowCommands.new");
      private final fhm e;

      b() {
         super(c);
         fkp.b $$0 = this.a.b(8).d(1);
         fkt $$1 = $$0.b();
         this.e = new fhm(frr.this.p, 208, 20, xo.c("selectWorld.enterName"));
         this.e.a(frr.this.B.b());
         this.e.b(frr.this.B::a);
         frr.this.B.a($$0x -> this.e.a(fio.a(xo.a("selectWorld.targetFolder", xo.b($$0x.c()).a(n.u)))));
         frr.this.b(this.e);
         $$0.a(fkm.a(frr.this.p, this.e, frr.u), $$0.b().b());
         fhk<fsa.a> $$2 = $$0.a(fhk.<fsa.a>a($$0x -> $$0x.f).a(fsa.a.a, fsa.a.b, fsa.a.c).a(0, 0, 210, 20, frr.s, ($$0x, $$1x) -> frr.this.B.a($$1x)), $$1);
         frr.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fio.a($$1x.d().a()));
         });
         fhk<bqq> $$3 = $$0.a(fhk.a(bqq::b).a(bqq.values()).a(0, 0, 210, 20, xo.c("options.difficulty"), ($$0x, $$1x) -> frr.this.B.a($$1x)), $$1);
         frr.this.B.a($$1x -> {
            $$3.a(frr.this.B.e());
            $$3.j = !frr.this.B.f();
            $$3.a(fio.a(frr.this.B.e().d()));
         });
         fhk<Boolean> $$4 = $$0.a(fhk.e().a($$0x -> fio.a(frr.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> frr.this.B.a($$1x)));
         frr.this.B.a($$1x -> {
            $$4.a(frr.this.B.g());
            $$4.j = !frr.this.B.l() && !frr.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhd.a(frr.v, $$0x -> frr.this.a(frr.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fje {
      private static final xo c = xo.c("createWorld.tab.more.title");
      private static final xo d = xo.c("selectWorld.gameRules");
      private static final xo e = xo.c("selectWorld.dataPacks");

      c() {
         super(c);
         fkp.b $$0 = this.a.b(8).d(1);
         $$0.a(fhd.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhd.a(frr.v, $$0x -> frr.this.a(frr.this.B.k().g())).a(210).a());
         $$0.a(fhd.a(e, $$0x -> frr.this.b(frr.this.B.k().g())).a(210).a());
      }

      private void b() {
         frr.this.m.a(new frs(frr.this.B.q().b(), $$0 -> {
            frr.this.m.a(frr.this);
            $$0.ifPresent(frr.this.B::a);
         }));
      }
   }

   class d extends fje {
      private static final xo c = xo.c("createWorld.tab.world.title");
      private static final xo d = xo.c("generator.minecraft.amplified.info");
      private static final xo e = xo.c("selectWorld.mapFeatures");
      private static final xo f = xo.c("selectWorld.mapFeatures.info");
      private static final xo g = xo.c("selectWorld.bonusItems");
      private static final xo h = xo.c("selectWorld.enterSeed");
      static final xo i = xo.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fhm k;
      private final fhd l;

      d() {
         super(c);
         fkp.b $$0 = this.a.a(10).b(8).d(2);
         fhk<fsa.b> $$1 = $$0.a(
            fhk.<fsa.b>a(fsa.b::a).a(this.c()).a(frr.d::a).a(0, 0, 150, 20, xo.c("selectWorld.mapType"), ($$0x, $$1x) -> frr.this.B.a($$1x))
         );
         $$1.a(frr.this.B.m());
         frr.this.B.a($$1x -> {
            fsa.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fio.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = frr.this.B.m().c() != null;
         });
         this.l = $$0.a(fhd.a(xo.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         frr.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fhm(frr.this.p, 308, 20, xo.c("selectWorld.enterSeed")) {
            @Override
            protected yc aJ_() {
               return super.aJ_().b(xn.t).b(frr.d.i);
            }
         };
         this.k.c(i);
         this.k.a(frr.this.B.h());
         this.k.b($$0x -> frr.this.B.b(this.k.a()));
         $$0.a(fkm.a(frr.this.p, this.k, h), 2);
         fry.a $$2 = fry.a(310);
         $$2.a(e, frr.this.B::i, frr.this.B::b).a(() -> !frr.this.B.l()).a(f);
         $$2.a(g, frr.this.B::j, frr.this.B::c).a(() -> !frr.this.B.f() && !frr.this.B.l());
         fry $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         frr.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         frw $$0 = frr.this.B.n();
         if ($$0 != null) {
            frr.this.m.a($$0.createEditScreen(frr.this, frr.this.B.k()));
         }
      }

      private fhk.c<fsa.b> c() {
         return new fhk.c<fsa.b>() {
            @Override
            public List<fsa.b> a() {
               return fhk.a.getAsBoolean() ? frr.this.B.p() : frr.this.B.o();
            }

            @Override
            public List<fsa.b> b() {
               return frr.this.B.o();
            }
         };
      }

      private static yc a(fhk<fsa.b> $$0) {
         return $$0.a().b() ? xn.a($$0.c(), d) : $$0.c();
      }
   }
}
