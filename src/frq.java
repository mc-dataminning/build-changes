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

public class frq extends fnb {
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
   private final fkp A = new fkp(this);
   final frz B;
   private final fjf C = new fjf(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evf E;
   @Nullable
   private final fnb F;
   @Nullable
   private Path G;
   @Nullable
   private atz H;
   @Nullable
   private fjg I;

   public static void a(ffd $$0, @Nullable fnb $$1) {
      a($$0, x);
      atz $$2 = new atz(new auc($$0.bd()));
      ama.c $$3 = a($$2, dcq.c);
      CompletableFuture<fry> $$4 = ama.a(
         $$3, $$0x -> new ama.b<>(new frq.a(new dyo(dyq.a(), ehy.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fry($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new frq($$0, $$1, $$4.join(), Optional.of(ehy.a), OptionalLong.empty()));
   }

   public static frq a(ffd $$0, @Nullable fnb $$1, dca $$2, fry $$3, @Nullable Path $$4) {
      frq $$5 = new frq($$0, $$1, $$3, ehy.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(frz.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(frz.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(frz.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private frq(ffd $$0, @Nullable fnb $$1, fry $$2, Optional<ald<ehx>> $$3, OptionalLong $$4) {
      super(xo.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new frz($$0.m().c(), $$2, $$3, $$4);
   }

   public frz m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fjg.a(this.C, this.n).a(new frq.b(), new frq.d(), new frq.c()).a();
      this.c(this.I);
      fkt $$0 = this.A.b(fkt.e().a(8));
      $$0.a(fhc.a(xo.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(fhc.a(xn.e, $$0x -> this.D()).a());
      this.A.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.I.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aC_() {
   }

   @Override
   public void c() {
      if (this.I != null) {
         this.I.a(this.n);
         this.I.b();
         int $$0 = this.I.G().c();
         fli $$1 = new fli(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(ffd $$0, xo $$1) {
      $$0.d(new fmh($$1));
   }

   private void E() {
      fry $$0 = this.B.k();
      dyn.b $$1 = $$0.d().a($$0.c());
      jp<aln> $$2 = $$0.e().a(aln.c, $$1.b());
      Lifecycle $$3 = cpl.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fsa.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(epy.a $$0, jp<aln> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<epu.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.I();
         boolean $$4 = $$0 == epy.a.c;
         fry $$5 = this.B.k();
         dca $$6 = this.c($$4);
         eqa $$7 = new epy($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dca c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbs $$2 = new dbs();
         $$2.a(dbs.l).a(false, null);
         return new dca($$1, dbt.d, false, bqp.a, true, $$2, dcq.c);
      } else {
         return new dca($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
         this.E();
         return true;
      }
   }

   @Override
   public void d() {
      this.D();
   }

   public void D() {
      this.m.a(this.F);
      this.I();
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnb.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fgp $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fiy & fkw> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fiy & fif & fkw> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fjk.c(this.m, this.B.c());
            this.D();
         }
      }

      return this.G;
   }

   void a(dcq $$0) {
      Pair<Path, atz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new frt(this, (atz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dcq $$0) {
      Pair<Path, atz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fqh((atz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xo.c("dataPack.title")));
      }
   }

   private void a(atz $$0, boolean $$1, Consumer<dcq> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dcq $$5 = new dcq(new dbk($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cpj $$6 = $$0.e();
         if (cpl.a($$6) && $$1) {
            this.m.a(new frp($$0.f(), $$3x -> {
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

   private void a(atz $$0, dcq $$1, Consumer<dcq> $$2) {
      this.m.d(new fmh(xo.c("dataPack.validation.working")));
      ama.c $$3 = a($$0, $$1);
      ama.<frq.a, fry>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lq.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lq.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fry $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dyo.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dyo $$5 = (dyo)$$3x.flatMap($$1xx -> dyo.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ama.b<>(new frq.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fry($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.m
         )
         .thenApplyAsync($$0x -> {
            for (dvt $$1x : $$0x.c()) {
               $$1x.b().a();
            }

            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.m)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new flt($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dcq.c);
                  }
               }, xo.c("dataPack.validation.failed"), xn.a, xo.c("dataPack.validation.back"), xo.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static ama.c a(atz $$0, dcq $$1) {
      ama.d $$2 = new ama.d($$0, $$1, false, true);
      return new ama.c($$2, eq.a.c, 2);
   }

   private void I() {
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

   private Optional<epu.c> J() {
      String $$0 = this.B.c();

      try {
         epu.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(eps.j);
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

      fjk.c(this.m, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ffd $$1) {
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
         fjk.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atz> c(dcq $$0) {
      Path $$1 = this.F();
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

   static record a(dyo a, dcq b) {
   }

   class b extends fjd {
      private static final xo c = xo.c("createWorld.tab.game.title");
      private static final xo d = xo.c("selectWorld.allowCommands.new");
      private final fhl e;

      b() {
         super(c);
         fko.b $$0 = this.a.b(8).d(1);
         fks $$1 = $$0.b();
         this.e = new fhl(frq.this.p, 208, 20, xo.c("selectWorld.enterName"));
         this.e.a(frq.this.B.b());
         this.e.b(frq.this.B::a);
         frq.this.B.a($$0x -> this.e.a(fin.a(xo.a("selectWorld.targetFolder", xo.b($$0x.c()).a(n.u)))));
         frq.this.b(this.e);
         $$0.a(fkl.a(frq.this.p, this.e, frq.u), $$0.b().b());
         fhj<frz.a> $$2 = $$0.a(fhj.<frz.a>a($$0x -> $$0x.f).a(frz.a.a, frz.a.b, frz.a.c).a(0, 0, 210, 20, frq.s, ($$0x, $$1x) -> frq.this.B.a($$1x)), $$1);
         frq.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fin.a($$1x.d().a()));
         });
         fhj<bqp> $$3 = $$0.a(fhj.a(bqp::b).a(bqp.values()).a(0, 0, 210, 20, xo.c("options.difficulty"), ($$0x, $$1x) -> frq.this.B.a($$1x)), $$1);
         frq.this.B.a($$1x -> {
            $$3.a(frq.this.B.e());
            $$3.j = !frq.this.B.f();
            $$3.a(fin.a(frq.this.B.e().d()));
         });
         fhj<Boolean> $$4 = $$0.a(fhj.e().a($$0x -> fin.a(frq.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> frq.this.B.a($$1x)));
         frq.this.B.a($$1x -> {
            $$4.a(frq.this.B.g());
            $$4.j = !frq.this.B.l() && !frq.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhc.a(frq.v, $$0x -> frq.this.a(frq.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fjd {
      private static final xo c = xo.c("createWorld.tab.more.title");
      private static final xo d = xo.c("selectWorld.gameRules");
      private static final xo e = xo.c("selectWorld.dataPacks");

      c() {
         super(c);
         fko.b $$0 = this.a.b(8).d(1);
         $$0.a(fhc.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhc.a(frq.v, $$0x -> frq.this.a(frq.this.B.k().g())).a(210).a());
         $$0.a(fhc.a(e, $$0x -> frq.this.b(frq.this.B.k().g())).a(210).a());
      }

      private void b() {
         frq.this.m.a(new frr(frq.this.B.q().b(), $$0 -> {
            frq.this.m.a(frq.this);
            $$0.ifPresent(frq.this.B::a);
         }));
      }
   }

   class d extends fjd {
      private static final xo c = xo.c("createWorld.tab.world.title");
      private static final xo d = xo.c("generator.minecraft.amplified.info");
      private static final xo e = xo.c("selectWorld.mapFeatures");
      private static final xo f = xo.c("selectWorld.mapFeatures.info");
      private static final xo g = xo.c("selectWorld.bonusItems");
      private static final xo h = xo.c("selectWorld.enterSeed");
      static final xo i = xo.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fhl k;
      private final fhc l;

      d() {
         super(c);
         fko.b $$0 = this.a.a(10).b(8).d(2);
         fhj<frz.b> $$1 = $$0.a(
            fhj.<frz.b>a(frz.b::a).a(this.c()).a(frq.d::a).a(0, 0, 150, 20, xo.c("selectWorld.mapType"), ($$0x, $$1x) -> frq.this.B.a($$1x))
         );
         $$1.a(frq.this.B.m());
         frq.this.B.a($$1x -> {
            frz.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fin.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = frq.this.B.m().c() != null;
         });
         this.l = $$0.a(fhc.a(xo.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         frq.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fhl(frq.this.p, 308, 20, xo.c("selectWorld.enterSeed")) {
            @Override
            protected yc aK_() {
               return super.aK_().b(xn.t).b(frq.d.i);
            }
         };
         this.k.c(i);
         this.k.a(frq.this.B.h());
         this.k.b($$0x -> frq.this.B.b(this.k.a()));
         $$0.a(fkl.a(frq.this.p, this.k, h), 2);
         frx.a $$2 = frx.a(310);
         $$2.a(e, frq.this.B::i, frq.this.B::b).a(() -> !frq.this.B.l()).a(f);
         $$2.a(g, frq.this.B::j, frq.this.B::c).a(() -> !frq.this.B.f() && !frq.this.B.l());
         frx $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         frq.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         frv $$0 = frq.this.B.n();
         if ($$0 != null) {
            frq.this.m.a($$0.createEditScreen(frq.this, frq.this.B.k()));
         }
      }

      private fhj.c<frz.b> c() {
         return new fhj.c<frz.b>() {
            @Override
            public List<frz.b> a() {
               return fhj.a.getAsBoolean() ? frq.this.B.p() : frq.this.B.o();
            }

            @Override
            public List<frz.b> b() {
               return frq.this.B.o();
            }
         };
      }

      private static yc a(fhj<frz.b> $$0) {
         return $$0.a().b() ? xn.a($$0.d(), d) : $$0.d();
      }
   }
}
