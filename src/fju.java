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

public class fju extends ffe {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vq p = vq.c("selectWorld.gameMode");
   static final vq q = vq.c("selectWorld.enterName");
   static final vq r = vq.c("selectWorld.experiments");
   static final vq t = vq.c("selectWorld.allowCommands.info");
   private static final vq u = vq.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final aiy a = new aiy("textures/gui/header_separator.png");
   public static final aiy b = new aiy("textures/gui/footer_separator.png");
   public static final aiy c = new aiy("textures/gui/light_dirt_background.png");
   final fkd x;
   private final fbk y = new fbk(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final eni A;
   @Nullable
   private final ffe B;
   @Nullable
   private Path C;
   @Nullable
   private arl D;
   @Nullable
   private fcs E;
   @Nullable
   private fbl F;

   public static void a(exh $$0, @Nullable ffe $$1) {
      a($$0, u);
      arl $$2 = new arl(new aro($$0.bc()));
      ajt.c $$3 = a($$2, cwh.c);
      CompletableFuture<fkc> $$4 = ajt.a(
         $$3, $$0x -> new ajt.b<>(new fju.a(new drk(drm.a(), eau.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fkc($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fju($$0, $$1, $$4.join(), Optional.of(eau.a), OptionalLong.empty()));
   }

   public static fju a(exh $$0, @Nullable ffe $$1, cvr $$2, fkc $$3, @Nullable Path $$4) {
      fju $$5 = new fju($$0, $$1, $$3, eau.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fkd.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fkd.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fkd.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fju(exh $$0, @Nullable ffe $$1, fkc $$2, Optional<aix<eat>> $$3, OptionalLong $$4) {
      super(vq.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bc();
      this.x = new fkd($$0.l().c(), $$2, $$3, $$4);
   }

   public fkd o() {
      return this.x;
   }

   @Override
   protected void aQ_() {
      this.F = fbl.a(this.y, this.g).a(new fju.b(), new fju.d(), new fju.c()).a();
      this.d(this.F);
      this.E = new fcs().a(10);
      fcs.b $$0 = this.E.d(2);
      $$0.a(ezh.a(vq.c("selectWorld.create"), $$0x -> this.H()).a());
      $$0.a(ezh.a(vp.e, $$0x -> this.E()).a());
      this.E.a($$0x -> {
         $$0x.o(1);
         this.d($$0x);
      });
      this.F.a(0, false);
      this.x.a();
      this.c();
   }

   @Override
   protected void aH_() {
   }

   @Override
   public void c() {
      if (this.F != null && this.E != null) {
         this.F.a(this.g);
         this.F.a();
         this.E.a();
         fcr.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         fdm $$1 = new fdm(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(exh $$0, vq $$1) {
      $$0.d(new fek($$1));
   }

   private void H() {
      fkc $$0 = this.x.k();
      drj.b $$1 = $$0.d().a($$0.c());
      iq<ajh> $$2 = $$0.e().a(ajh.c, $$1.b());
      Lifecycle $$3 = cju.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fke.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eip.a $$0, iq<ajh> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<eil.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eip.a.c;
         fkc $$5 = this.x.k();
         cvr $$6 = this.c($$4);
         eir $$7 = new eip($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cvr c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cvj $$2 = new cvj();
         $$2.a(cvj.l).a(false, null);
         return new cvr($$1, cvk.d, false, blr.a, true, $$2, cwh.c);
      } else {
         return new cvr($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, awh.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(eyu $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends fbd & fda> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends fbd & fak & fda> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path I() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            fbp.c(this.f, this.x.c());
            this.E();
         }
      }

      return this.C;
   }

   void a(cwh $$0) {
      Pair<Path, arl> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fjx(this, (arl)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cwh $$0) {
      Pair<Path, arl> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fil((arl)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vq.c("dataPack.title")));
      }
   }

   private void a(arl $$0, boolean $$1, Consumer<cwh> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cwh $$5 = new cwh(new cvb($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cjs $$6 = $$0.e();
         if (cju.a($$6) && $$1) {
            this.f.a(new fjt($$0.f(), $$3x -> {
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

   private void a(arl $$0, cwh $$1, Consumer<cwh> $$2) {
      this.f.d(new fek(vq.c("dataPack.validation.working")));
      ajt.c $$3 = a($$0, $$1);
      ajt.<fju.a, fkc>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(kg.aK).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(kg.at).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fkc $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aiw.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = drk.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aiw.a(JsonOps.INSTANCE, $$0x.c());
                  drk $$5 = (drk)$$3x.flatMap($$1xx -> drk.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new ajt.b<>(new fju.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fkc($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new fdx($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cwh.c);
                  }
               }, vq.c("dataPack.validation.failed"), vp.a, vq.c("dataPack.validation.back"), vq.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static ajt.c a(arl $$0, cwh $$1) {
      ajt.d $$2 = new ajt.d($$0, $$1, false, true);
      return new ajt.c($$2, dv.a.c, 2);
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

   private Optional<eil.c> K() {
      String $$0 = this.x.c();

      try {
         eil.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(eij.j);
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

      fbp.c(this.f, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, exh $$1) {
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
         fbp.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, arl> c(cwh $$0) {
      Path $$1 = this.I();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = aro.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(drk a, cwh b) {
   }

   class b extends fbi {
      private static final vq c = vq.c("createWorld.tab.game.title");
      private static final vq d = vq.c("selectWorld.allowCommands");
      private final ezq e;

      b() {
         super(c);
         fcs.b $$0 = this.a.b(8).d(1);
         fcw $$1 = $$0.b();
         this.e = new ezq(fju.this.i, 208, 20, vq.c("selectWorld.enterName"));
         this.e.a(fju.this.x.b());
         this.e.b(fju.this.x::a);
         fju.this.x.a($$0x -> this.e.a(fas.a(vq.a("selectWorld.targetFolder", vq.b($$0x.c()).a(n.u)))));
         fju.this.c(this.e);
         $$0.a(fcp.a(fju.this.i, this.e, fju.q), $$0.b().b());
         ezo<fkd.a> $$2 = $$0.a(ezo.<fkd.a>a($$0x -> $$0x.f).a(fkd.a.a, fkd.a.b, fkd.a.c).a(0, 0, 210, 20, fju.p, ($$0x, $$1x) -> fju.this.x.a($$1x)), $$1);
         fju.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fas.a($$1x.d().a()));
         });
         ezo<blr> $$3 = $$0.a(ezo.a(blr::b).a(blr.values()).a(0, 0, 210, 20, vq.c("options.difficulty"), ($$0x, $$1x) -> fju.this.x.a($$1x)), $$1);
         fju.this.x.a($$1x -> {
            $$3.a(fju.this.x.e());
            $$3.j = !fju.this.x.f();
            $$3.a(fas.a(fju.this.x.e().d()));
         });
         ezo<Boolean> $$4 = $$0.a(ezo.e().a($$0x -> fas.a(fju.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fju.this.x.a($$1x)));
         fju.this.x.a($$1x -> {
            $$4.a(fju.this.x.g());
            $$4.j = !fju.this.x.l() && !fju.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(ezh.a(fju.r, $$0x -> fju.this.a(fju.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends fbi {
      private static final vq c = vq.c("createWorld.tab.more.title");
      private static final vq d = vq.c("selectWorld.gameRules");
      private static final vq e = vq.c("selectWorld.dataPacks");

      c() {
         super(c);
         fcs.b $$0 = this.a.b(8).d(1);
         $$0.a(ezh.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ezh.a(fju.r, $$0x -> fju.this.a(fju.this.x.k().g())).a(210).a());
         $$0.a(ezh.a(e, $$0x -> fju.this.b(fju.this.x.k().g())).a(210).a());
      }

      private void b() {
         fju.this.f.a(new fjv(fju.this.x.q().b(), $$0 -> {
            fju.this.f.a(fju.this);
            $$0.ifPresent(fju.this.x::a);
         }));
      }
   }

   class d extends fbi {
      private static final vq c = vq.c("createWorld.tab.world.title");
      private static final vq d = vq.c("generator.minecraft.amplified.info");
      private static final vq e = vq.c("selectWorld.mapFeatures");
      private static final vq f = vq.c("selectWorld.mapFeatures.info");
      private static final vq g = vq.c("selectWorld.bonusItems");
      private static final vq h = vq.c("selectWorld.enterSeed");
      static final vq i = vq.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final ezq k;
      private final ezh l;

      d() {
         super(c);
         fcs.b $$0 = this.a.a(10).b(8).d(2);
         ezo<fkd.b> $$1 = $$0.a(
            ezo.<fkd.b>a(fkd.b::a).a(this.c()).a(fju.d::a).a(0, 0, 150, 20, vq.c("selectWorld.mapType"), ($$0x, $$1x) -> fju.this.x.a($$1x))
         );
         $$1.a(fju.this.x.m());
         fju.this.x.a($$1x -> {
            fkd.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fas.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fju.this.x.m().c() != null;
         });
         this.l = $$0.a(ezh.a(vq.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fju.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new ezq(fju.this.i, 308, 20, vq.c("selectWorld.enterSeed")) {
            @Override
            protected we aN_() {
               return super.aN_().b(vp.t).b(fju.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fju.this.x.h());
         this.k.b($$0x -> fju.this.x.b(this.k.a()));
         $$0.a(fcp.a(fju.this.i, this.k, h), 2);
         fkb.a $$2 = fkb.a(310);
         $$2.a(e, fju.this.x::i, fju.this.x::b).a(() -> !fju.this.x.l()).a(f);
         $$2.a(g, fju.this.x::j, fju.this.x::c).a(() -> !fju.this.x.f() && !fju.this.x.l());
         fkb $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fju.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fjz $$0 = fju.this.x.n();
         if ($$0 != null) {
            fju.this.f.a($$0.createEditScreen(fju.this, fju.this.x.k()));
         }
      }

      private ezo.c<fkd.b> c() {
         return new ezo.c<fkd.b>() {
            @Override
            public List<fkd.b> a() {
               return ezo.a.getAsBoolean() ? fju.this.x.p() : fju.this.x.o();
            }

            @Override
            public List<fkd.b> b() {
               return fju.this.x.o();
            }
         };
      }

      private static we a(ezo<fkd.b> $$0) {
         return $$0.a().b() ? vp.a($$0.d(), d) : $$0.d();
      }
   }
}
