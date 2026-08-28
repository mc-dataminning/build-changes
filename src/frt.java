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

public class frt extends fne {
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
   private final fks A = new fks(this);
   final fsc B;
   private final fji C = new fji(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evi E;
   @Nullable
   private final fne F;
   @Nullable
   private Path G;
   @Nullable
   private aua H;
   @Nullable
   private fjj I;

   public static void a(ffg $$0, @Nullable fne $$1) {
      a($$0, x);
      aua $$2 = new aua(new aud($$0.bd()));
      amb.c $$3 = a($$2, dct.c);
      CompletableFuture<fsb> $$4 = amb.a(
         $$3, $$0x -> new amb.b<>(new frt.a(new dyr(dyt.a(), eib.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fsb($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new frt($$0, $$1, $$4.join(), Optional.of(eib.a), OptionalLong.empty()));
   }

   public static frt a(ffg $$0, @Nullable fne $$1, dcd $$2, fsb $$3, @Nullable Path $$4) {
      frt $$5 = new frt($$0, $$1, $$3, eib.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fsc.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fsc.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fsc.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private frt(ffg $$0, @Nullable fne $$1, fsb $$2, Optional<ale<eia>> $$3, OptionalLong $$4) {
      super(xp.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new fsc($$0.m().c(), $$2, $$3, $$4);
   }

   public fsc m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fjj.a(this.C, this.n).a(new frt.b(), new frt.d(), new frt.c()).a();
      this.c(this.I);
      fkw $$0 = this.A.b(fkw.e().a(8));
      $$0.a(fhf.a(xp.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fhf.a(xo.e, $$0x -> this.E()).a());
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
         fll $$1 = new fll(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(ffg $$0, xp $$1) {
      $$0.d(new fmk($$1));
   }

   private void F() {
      fsb $$0 = this.B.k();
      dyq.b $$1 = $$0.d().a($$0.c());
      jp<alo> $$2 = $$0.e().a(alo.c, $$1.b());
      Lifecycle $$3 = cpo.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fsd.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eqb.a $$0, jp<alo> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<epx.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eqb.a.c;
         fsb $$5 = this.B.k();
         dcd $$6 = this.c($$4);
         eqd $$7 = new eqb($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dcd c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbv $$2 = new dbv();
         $$2.a(dbv.l).a(false, null);
         return new dcd($$1, dbw.d, false, bqs.a, true, $$2, dct.c);
      } else {
         return new dcd($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fne.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fgs $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fjb & fkz> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fjb & fii & fkz> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fjn.c(this.m, this.B.c());
            this.E();
         }
      }

      return this.G;
   }

   void a(dct $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new frw(this, (aua)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dct $$0) {
      Pair<Path, aua> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fqk((aua)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xp.c("dataPack.title")));
      }
   }

   private void a(aua $$0, boolean $$1, Consumer<dct> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dct $$5 = new dct(new dbn($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cpm $$6 = $$0.e();
         if (cpo.a($$6) && $$1) {
            this.m.a(new frs($$0.f(), $$3x -> {
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

   private void a(aua $$0, dct $$1, Consumer<dct> $$2) {
      this.m.d(new fmk(xp.c("dataPack.validation.working")));
      amb.c $$3 = a($$0, $$1);
      amb.<frt.a, fsb>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lq.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lq.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fsb $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dyr.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dyr $$5 = (dyr)$$3x.flatMap($$1xx -> dyr.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new amb.b<>(new frt.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fsb($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.m
         )
         .thenApplyAsync($$0x -> {
            for (dvw $$1x : $$0x.c()) {
               $$1x.b().a();
            }

            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.m)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new flw($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dct.c);
                  }
               }, xp.c("dataPack.validation.failed"), xo.a, xp.c("dataPack.validation.back"), xp.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         }, this.m);
   }

   private static amb.c a(aua $$0, dct $$1) {
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

   private Optional<epx.c> K() {
      String $$0 = this.B.c();

      try {
         epx.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(epv.j);
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

      fjn.c(this.m, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ffg $$1) {
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
         fjn.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aua> c(dct $$0) {
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

   static record a(dyr a, dct b) {
   }

   class b extends fjg {
      private static final xp c = xp.c("createWorld.tab.game.title");
      private static final xp d = xp.c("selectWorld.allowCommands.new");
      private final fho e;

      b() {
         super(c);
         fkr.b $$0 = this.a.b(8).d(1);
         fkv $$1 = $$0.b();
         this.e = new fho(frt.this.p, 208, 20, xp.c("selectWorld.enterName"));
         this.e.a(frt.this.B.b());
         this.e.b(frt.this.B::a);
         frt.this.B.a($$0x -> this.e.a(fiq.a(xp.a("selectWorld.targetFolder", xp.b($$0x.c()).a(n.u)))));
         frt.this.b(this.e);
         $$0.a(fko.a(frt.this.p, this.e, frt.u), $$0.b().b());
         fhm<fsc.a> $$2 = $$0.a(fhm.<fsc.a>a($$0x -> $$0x.f).a(fsc.a.a, fsc.a.b, fsc.a.c).a(0, 0, 210, 20, frt.s, ($$0x, $$1x) -> frt.this.B.a($$1x)), $$1);
         frt.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fiq.a($$1x.d().a()));
         });
         fhm<bqs> $$3 = $$0.a(fhm.a(bqs::b).a(bqs.values()).a(0, 0, 210, 20, xp.c("options.difficulty"), ($$0x, $$1x) -> frt.this.B.a($$1x)), $$1);
         frt.this.B.a($$1x -> {
            $$3.a(frt.this.B.e());
            $$3.j = !frt.this.B.f();
            $$3.a(fiq.a(frt.this.B.e().d()));
         });
         fhm<Boolean> $$4 = $$0.a(fhm.e().a($$0x -> fiq.a(frt.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> frt.this.B.a($$1x)));
         frt.this.B.a($$1x -> {
            $$4.a(frt.this.B.g());
            $$4.j = !frt.this.B.l() && !frt.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhf.a(frt.v, $$0x -> frt.this.a(frt.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fjg {
      private static final xp c = xp.c("createWorld.tab.more.title");
      private static final xp d = xp.c("selectWorld.gameRules");
      private static final xp e = xp.c("selectWorld.dataPacks");

      c() {
         super(c);
         fkr.b $$0 = this.a.b(8).d(1);
         $$0.a(fhf.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhf.a(frt.v, $$0x -> frt.this.a(frt.this.B.k().g())).a(210).a());
         $$0.a(fhf.a(e, $$0x -> frt.this.b(frt.this.B.k().g())).a(210).a());
      }

      private void b() {
         frt.this.m.a(new fru(frt.this.B.q().b(), $$0 -> {
            frt.this.m.a(frt.this);
            $$0.ifPresent(frt.this.B::a);
         }));
      }
   }

   class d extends fjg {
      private static final xp c = xp.c("createWorld.tab.world.title");
      private static final xp d = xp.c("generator.minecraft.amplified.info");
      private static final xp e = xp.c("selectWorld.mapFeatures");
      private static final xp f = xp.c("selectWorld.mapFeatures.info");
      private static final xp g = xp.c("selectWorld.bonusItems");
      private static final xp h = xp.c("selectWorld.enterSeed");
      static final xp i = xp.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fho k;
      private final fhf l;

      d() {
         super(c);
         fkr.b $$0 = this.a.a(10).b(8).d(2);
         fhm<fsc.b> $$1 = $$0.a(
            fhm.<fsc.b>a(fsc.b::a).a(this.c()).a(frt.d::a).a(0, 0, 150, 20, xp.c("selectWorld.mapType"), ($$0x, $$1x) -> frt.this.B.a($$1x))
         );
         $$1.a(frt.this.B.m());
         frt.this.B.a($$1x -> {
            fsc.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fiq.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = frt.this.B.m().c() != null;
         });
         this.l = $$0.a(fhf.a(xp.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         frt.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fho(frt.this.p, 308, 20, xp.c("selectWorld.enterSeed")) {
            @Override
            protected yd aJ_() {
               return super.aJ_().b(xo.t).b(frt.d.i);
            }
         };
         this.k.c(i);
         this.k.a(frt.this.B.h());
         this.k.b($$0x -> frt.this.B.b(this.k.a()));
         $$0.a(fko.a(frt.this.p, this.k, h), 2);
         fsa.a $$2 = fsa.a(310);
         $$2.a(e, frt.this.B::i, frt.this.B::b).a(() -> !frt.this.B.l()).a(f);
         $$2.a(g, frt.this.B::j, frt.this.B::c).a(() -> !frt.this.B.f() && !frt.this.B.l());
         fsa $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         frt.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         fry $$0 = frt.this.B.n();
         if ($$0 != null) {
            frt.this.m.a($$0.createEditScreen(frt.this, frt.this.B.k()));
         }
      }

      private fhm.c<fsc.b> c() {
         return new fhm.c<fsc.b>() {
            @Override
            public List<fsc.b> a() {
               return fhm.a.getAsBoolean() ? frt.this.B.p() : frt.this.B.o();
            }

            @Override
            public List<fsc.b> b() {
               return frt.this.B.o();
            }
         };
      }

      private static yd a(fhm<fsc.b> $$0) {
         return $$0.a().b() ? xo.a($$0.c(), d) : $$0.c();
      }
   }
}
