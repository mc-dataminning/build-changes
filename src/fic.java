import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
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

public class fic extends fdm {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vg p = vg.c("selectWorld.gameMode");
   static final vg q = vg.c("selectWorld.enterName");
   static final vg r = vg.c("selectWorld.experiments");
   static final vg t = vg.c("selectWorld.allowCommands.info");
   private static final vg u = vg.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final ahh a = new ahh("textures/gui/header_separator.png");
   public static final ahh b = new ahh("textures/gui/footer_separator.png");
   public static final ahh c = new ahh("textures/gui/light_dirt_background.png");
   final fil x;
   private final ezt y = new ezt(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final els A;
   @Nullable
   private final fdm B;
   @Nullable
   private Path C;
   @Nullable
   private apu D;
   @Nullable
   private fba E;
   @Nullable
   private ezu F;

   public static void a(evr $$0, @Nullable fdm $$1) {
      a($$0, u);
      apu $$2 = new apu(new apx($$0.bc()));
      aic.c $$3 = a($$2, cur.c);
      CompletableFuture<fik> $$4 = aic.a(
         $$3, $$0x -> new aic.b<>(new fic.a(new dpu(dpw.a(), dze.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fik($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fic($$0, $$1, $$4.join(), Optional.of(dze.a), OptionalLong.empty()));
   }

   public static fic a(evr $$0, @Nullable fdm $$1, cub $$2, fik $$3, @Nullable Path $$4) {
      fic $$5 = new fic($$0, $$1, $$3, dze.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fil.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fil.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fil.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fic(evr $$0, @Nullable fdm $$1, fik $$2, Optional<ahg<dzd>> $$3, OptionalLong $$4) {
      super(vg.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bc();
      this.x = new fil($$0.l().c(), $$2, $$3, $$4);
   }

   public fil o() {
      return this.x;
   }

   @Override
   protected void aP_() {
      this.F = ezu.a(this.y, this.g).a(new fic.b(), new fic.d(), new fic.c()).a();
      this.d(this.F);
      this.E = new fba().a(10);
      fba.b $$0 = this.E.d(2);
      $$0.a(exr.a(vg.c("selectWorld.create"), $$0x -> this.H()).a());
      $$0.a(exr.a(vf.e, $$0x -> this.E()).a());
      this.E.a($$0x -> {
         $$0x.p(1);
         this.d($$0x);
      });
      this.F.a(0, false);
      this.x.a();
      this.c();
   }

   @Override
   public void c() {
      if (this.F != null && this.E != null) {
         this.F.a(this.g);
         this.F.a();
         this.E.a();
         faz.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         fbu $$1 = new fbu(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(evr $$0, vg $$1) {
      $$0.d(new fcs($$1));
   }

   private void H() {
      fik $$0 = this.x.k();
      dpt.b $$1 = $$0.d().a($$0.c());
      io<ahq> $$2 = $$0.e().a(ahq.c, $$1.b());
      Lifecycle $$3 = cic.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fim.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(egz.a $$0, io<ahq> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<egv.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == egz.a.c;
         fik $$5 = this.x.k();
         cub $$6 = this.c($$4);
         ehb $$7 = new egz($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cub c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         ctt $$2 = new ctt();
         $$2.a(ctt.l).a(false, null);
         return new cub($$1, ctu.d, false, bjz.a, true, $$2, cur.c);
      } else {
         return new cub($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.F.b($$0)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.H();
         return true;
      }
   }

   @Override
   public void d() {
      this.E();
   }

   public void E() {
      this.f.a(this.B);
      this.J();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, aup.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(exe $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends ezm & fbi> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends ezm & eyu & fbi> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path I() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            ezy.c(this.f, this.x.c());
            this.E();
         }
      }

      return this.C;
   }

   void a(cur $$0) {
      Pair<Path, apu> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fif(this, (apu)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cur $$0) {
      Pair<Path, apu> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fgt((apu)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vg.c("dataPack.title")));
      }
   }

   private void a(apu $$0, boolean $$1, Consumer<cur> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cur $$5 = new cur(new ctl($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cia $$6 = $$0.e();
         if (cic.a($$6) && $$1) {
            this.f.a(new fib($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.x.k().g());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(apu $$0, cur $$1, Consumer<cur> $$2) {
      this.f.d(new fcs(vg.c("dataPack.validation.working")));
      aic.c $$3 = a($$0, $$1);
      aic.<fic.a, fik>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ke.aK).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ke.at).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fik $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = ahf.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dpu.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = ahf.a(JsonOps.INSTANCE, $$0x.c());
                  dpu $$5 = (dpu)$$3x.flatMap($$1xx -> dpu.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new aic.b<>(new fic.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fik($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new fcf($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cur.c);
                  }
               }, vg.c("dataPack.validation.failed"), vf.a, vg.c("dataPack.validation.back"), vg.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static aic.c a(apu $$0, cur $$1) {
      aic.d $$2 = new aic.d($$0, $$1, false, true);
      return new aic.c($$2, dt.a.c, 2);
   }

   private void J() {
      if (this.C != null) {
         try (Stream<Path> $$0 = Files.walk(this.C)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  n.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            n.warn("Failed to list temporary dir {}", this.C);
         }

         this.C = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ac.b($$0, $$1, $$2);
      } catch (IOException var4) {
         n.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<egv.c> K() {
      String $$0 = this.x.c();

      try {
         egv.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(egt.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.C)).forEach($$1x -> a(this.C, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            n.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         n.warn("Failed to create access for {}", $$0, var9);
      }

      ezy.c(this.f, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, evr $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  n.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         n.warn("Failed to copy datapacks from world {}", $$0, var8);
         ezy.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, apu> c(cur $$0) {
      Path $$1 = this.I();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = apx.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dpu a, cur b) {
   }

   class b extends ezr {
      private static final vg c = vg.c("createWorld.tab.game.title");
      private static final vg d = vg.c("selectWorld.allowCommands");
      private final eya e;

      b() {
         super(c);
         fba.b $$0 = this.a.b(8).d(1);
         fbe $$1 = $$0.b();
         this.e = new eya(fic.this.i, 208, 20, vg.c("selectWorld.enterName"));
         this.e.a(fic.this.x.b());
         this.e.b(fic.this.x::a);
         fic.this.x.a($$0x -> this.e.a(ezc.a(vg.a("selectWorld.targetFolder", vg.b($$0x.c()).a(n.u)))));
         fic.this.c(this.e);
         $$0.a(fax.a(fic.this.i, this.e, fic.q), $$0.b().b());
         exy<fil.a> $$2 = $$0.a(exy.<fil.a>a($$0x -> $$0x.f).a(fil.a.a, fil.a.b, fil.a.c).a(0, 0, 210, 20, fic.p, ($$0x, $$1x) -> fic.this.x.a($$1x)), $$1);
         fic.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(ezc.a($$1x.d().a()));
         });
         exy<bjz> $$3 = $$0.a(exy.a(bjz::b).a(bjz.values()).a(0, 0, 210, 20, vg.c("options.difficulty"), ($$0x, $$1x) -> fic.this.x.a($$1x)), $$1);
         fic.this.x.a($$1x -> {
            $$3.a(fic.this.x.e());
            $$3.j = !fic.this.x.f();
            $$3.a(ezc.a(fic.this.x.e().d()));
         });
         exy<Boolean> $$4 = $$0.a(exy.e().a($$0x -> ezc.a(fic.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fic.this.x.a($$1x)));
         fic.this.x.a($$1x -> {
            $$4.a(fic.this.x.g());
            $$4.j = !fic.this.x.l() && !fic.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(exr.a(fic.r, $$0x -> fic.this.a(fic.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends ezr {
      private static final vg c = vg.c("createWorld.tab.more.title");
      private static final vg d = vg.c("selectWorld.gameRules");
      private static final vg e = vg.c("selectWorld.dataPacks");

      c() {
         super(c);
         fba.b $$0 = this.a.b(8).d(1);
         $$0.a(exr.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(exr.a(fic.r, $$0x -> fic.this.a(fic.this.x.k().g())).a(210).a());
         $$0.a(exr.a(e, $$0x -> fic.this.b(fic.this.x.k().g())).a(210).a());
      }

      private void b() {
         fic.this.f.a(new fid(fic.this.x.q().b(), $$0 -> {
            fic.this.f.a(fic.this);
            $$0.ifPresent(fic.this.x::a);
         }));
      }
   }

   class d extends ezr {
      private static final vg c = vg.c("createWorld.tab.world.title");
      private static final vg d = vg.c("generator.minecraft.amplified.info");
      private static final vg e = vg.c("selectWorld.mapFeatures");
      private static final vg f = vg.c("selectWorld.mapFeatures.info");
      private static final vg g = vg.c("selectWorld.bonusItems");
      private static final vg h = vg.c("selectWorld.enterSeed");
      static final vg i = vg.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final eya k;
      private final exr l;

      d() {
         super(c);
         fba.b $$0 = this.a.a(10).b(8).d(2);
         exy<fil.b> $$1 = $$0.a(
            exy.<fil.b>a(fil.b::a).a(this.c()).a(fic.d::a).a(0, 0, 150, 20, vg.c("selectWorld.mapType"), ($$0x, $$1x) -> fic.this.x.a($$1x))
         );
         $$1.a(fic.this.x.m());
         fic.this.x.a($$1x -> {
            fil.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ezc.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fic.this.x.m().c() != null;
         });
         this.l = $$0.a(exr.a(vg.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fic.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new eya(fic.this.i, 308, 20, vg.c("selectWorld.enterSeed")) {
            @Override
            protected vu aM_() {
               return super.aM_().b(vf.s).b(fic.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fic.this.x.h());
         this.k.b($$0x -> fic.this.x.b(this.k.a()));
         $$0.a(fax.a(fic.this.i, this.k, h), 2);
         fij.a $$2 = fij.a(310);
         $$2.a(e, fic.this.x::i, fic.this.x::b).a(() -> !fic.this.x.l()).a(f);
         $$2.a(g, fic.this.x::j, fic.this.x::c).a(() -> !fic.this.x.f() && !fic.this.x.l());
         fij $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fic.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fih $$0 = fic.this.x.n();
         if ($$0 != null) {
            fic.this.f.a($$0.createEditScreen(fic.this, fic.this.x.k()));
         }
      }

      private exy.c<fil.b> c() {
         return new exy.c<fil.b>() {
            @Override
            public List<fil.b> a() {
               return exy.a.getAsBoolean() ? fic.this.x.p() : fic.this.x.o();
            }

            @Override
            public List<fil.b> b() {
               return fic.this.x.o();
            }
         };
      }

      private static vu a(exy<fil.b> $$0) {
         return $$0.a().b() ? vf.a($$0.d(), d) : $$0.d();
      }
   }
}
