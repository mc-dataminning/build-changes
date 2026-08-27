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

public class ffk extends fau {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final ur p = ur.c("selectWorld.gameMode");
   static final ur q = ur.c("selectWorld.enterName");
   static final ur r = ur.c("selectWorld.experiments");
   static final ur t = ur.c("selectWorld.allowCommands.info");
   private static final ur u = ur.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final agi a = new agi("textures/gui/header_separator.png");
   public static final agi b = new agi("textures/gui/footer_separator.png");
   public static final agi c = new agi("textures/gui/light_dirt_background.png");
   final fft x;
   private final exb y = new exb(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final ejk A;
   @Nullable
   private final fau B;
   @Nullable
   private Path C;
   @Nullable
   private aos D;
   @Nullable
   private eyi E;
   @Nullable
   private exc F;

   public static void a(etd $$0, @Nullable fau $$1) {
      a($$0, u);
      aos $$2 = new aos(new aov($$0.ba()));
      ahd.c $$3 = a($$2, cst.c);
      CompletableFuture<ffs> $$4 = ahd.a(
         $$3, $$0x -> new ahd.b<>(new ffk.a(new dnn(dnp.a(), dwx.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new ffs($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new ffk($$0, $$1, $$4.join(), Optional.of(dwx.a), OptionalLong.empty()));
   }

   public static ffk a(etd $$0, @Nullable fau $$1, cse $$2, ffs $$3, @Nullable Path $$4) {
      ffk $$5 = new ffk($$0, $$1, $$3, dwx.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fft.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fft.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fft.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private ffk(etd $$0, @Nullable fau $$1, ffs $$2, Optional<agh<dww>> $$3, OptionalLong $$4) {
      super(ur.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.ba();
      this.x = new fft($$0.l().c(), $$2, $$3, $$4);
   }

   public fft l() {
      return this.x;
   }

   @Override
   protected void aP_() {
      this.F = exc.a(this.y, this.g).a(new ffk.b(), new ffk.d(), new ffk.c()).a();
      this.d(this.F);
      this.E = new eyi().a(10);
      eyi.b $$0 = this.E.d(2);
      $$0.a(euz.a(ur.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(euz.a(uq.e, $$0x -> this.C()).a());
      this.E.a($$0x -> {
         $$0x.h(1);
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
         this.F.b();
         this.E.a();
         eyh.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         ezc $$1 = new ezc(0, $$0, this.g, this.E.r() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(etd $$0, ur $$1) {
      $$0.d(new faa($$1));
   }

   private void D() {
      ffs $$0 = this.x.k();
      dnm.b $$1 = $$0.d().a($$0.c());
      ij<agr> $$2 = $$0.e().a(agr.c, $$1.b());
      Lifecycle $$3 = cgf.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      ffu.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eer.a $$0, ij<agr> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<een.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == eer.a.c;
         ffs $$5 = this.x.k();
         cse $$6 = this.c($$4);
         eet $$7 = new eer($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cse c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         crw $$2 = new crw();
         $$2.a(crw.l).a(false, null);
         return new cse($$1, crx.d, false, biu.a, true, $$2, cst.c);
      } else {
         return new cse($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
         this.D();
         return true;
      }
   }

   @Override
   public void aF_() {
      this.C();
   }

   @Override
   public void C() {
      this.f.a(this.B);
      this.F();
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, atm.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(euo $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends ewu & eyq> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends ewu & ewc & eyq> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path E() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            exg.c(this.f, this.x.c());
            this.C();
         }
      }

      return this.C;
   }

   void a(cst $$0) {
      Pair<Path, aos> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new ffn(this, (aos)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cst $$0) {
      Pair<Path, aos> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new feb((aos)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), ur.c("dataPack.title")));
      }
   }

   private void a(aos $$0, boolean $$1, Consumer<cst> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cst $$5 = new cst(new cro($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cgd $$6 = $$0.e();
         if (cgf.a($$6) && $$1) {
            this.f.a(new ffj($$0.f(), $$3x -> {
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

   private void a(aos $$0, cst $$1, Consumer<cst> $$2) {
      this.f.d(new faa(ur.c("dataPack.validation.working")));
      ahd.c $$3 = a($$0, $$1);
      ahd.<ffk.a, ffs>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jz.aH).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jz.ar).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  ffs $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = agg.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dnn.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = agg.a(JsonOps.INSTANCE, $$0x.c());
                  dnn $$5 = (dnn)$$3x.flatMap($$1xx -> dnn.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new ahd.b<>(new ffk.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new ffs($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new ezn($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cst.c);
                  }
               }, ur.c("dataPack.validation.failed"), uq.a, ur.c("dataPack.validation.back"), ur.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static ahd.c a(aos $$0, cst $$1) {
      ahd.d $$2 = new ahd.d($$0, $$1, false, true);
      return new ahd.c($$2, dv.a.c, 2);
   }

   private void F() {
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

   private Optional<een.c> G() {
      String $$0 = this.x.c();

      try {
         een.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(eel.j);
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

      exg.c(this.f, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, etd $$1) {
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
         exg.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aos> c(cst $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = aov.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dnn a, cst b) {
   }

   class b extends ewz {
      private static final ur c = ur.c("createWorld.tab.game.title");
      private static final ur d = ur.c("selectWorld.allowCommands");
      private final evi e;

      b() {
         super(c);
         eyi.b $$0 = this.a.b(8).d(1);
         eym $$1 = $$0.b();
         this.e = new evi(ffk.this.i, 208, 20, ur.c("selectWorld.enterName"));
         this.e.a(ffk.this.x.b());
         this.e.b(ffk.this.x::a);
         ffk.this.x.a($$0x -> this.e.a(ewk.a(ur.a("selectWorld.targetFolder", ur.b($$0x.c()).a(n.u)))));
         ffk.this.c(this.e);
         $$0.a(eyf.a(ffk.this.i, this.e, ffk.q), $$0.b().b());
         evg<fft.a> $$2 = $$0.a(evg.<fft.a>a($$0x -> $$0x.f).a(fft.a.a, fft.a.b, fft.a.c).a(0, 0, 210, 20, ffk.p, ($$0x, $$1x) -> ffk.this.x.a($$1x)), $$1);
         ffk.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(ewk.a($$1x.d().a()));
         });
         evg<biu> $$3 = $$0.a(evg.a(biu::b).a(biu.values()).a(0, 0, 210, 20, ur.c("options.difficulty"), ($$0x, $$1x) -> ffk.this.x.a($$1x)), $$1);
         ffk.this.x.a($$1x -> {
            $$3.a(ffk.this.x.e());
            $$3.i = !ffk.this.x.f();
            $$3.a(ewk.a(ffk.this.x.e().d()));
         });
         evg<Boolean> $$4 = $$0.a(evg.f().a($$0x -> ewk.a(ffk.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> ffk.this.x.a($$1x)));
         ffk.this.x.a($$1x -> {
            $$4.a(ffk.this.x.g());
            $$4.i = !ffk.this.x.l() && !ffk.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(euz.a(ffk.r, $$0x -> ffk.this.a(ffk.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends ewz {
      private static final ur c = ur.c("createWorld.tab.more.title");
      private static final ur d = ur.c("selectWorld.gameRules");
      private static final ur e = ur.c("selectWorld.dataPacks");

      c() {
         super(c);
         eyi.b $$0 = this.a.b(8).d(1);
         $$0.a(euz.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(euz.a(ffk.r, $$0x -> ffk.this.a(ffk.this.x.k().g())).a(210).a());
         $$0.a(euz.a(e, $$0x -> ffk.this.b(ffk.this.x.k().g())).a(210).a());
      }

      private void b() {
         ffk.this.f.a(new ffl(ffk.this.x.q().b(), $$0 -> {
            ffk.this.f.a(ffk.this);
            $$0.ifPresent(ffk.this.x::a);
         }));
      }
   }

   class d extends ewz {
      private static final ur c = ur.c("createWorld.tab.world.title");
      private static final ur d = ur.c("generator.minecraft.amplified.info");
      private static final ur e = ur.c("selectWorld.mapFeatures");
      private static final ur f = ur.c("selectWorld.mapFeatures.info");
      private static final ur g = ur.c("selectWorld.bonusItems");
      private static final ur h = ur.c("selectWorld.enterSeed");
      static final ur i = ur.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final evi k;
      private final euz l;

      d() {
         super(c);
         eyi.b $$0 = this.a.a(10).b(8).d(2);
         evg<fft.b> $$1 = $$0.a(
            evg.<fft.b>a(fft.b::a).a(this.c()).a(ffk.d::a).a(0, 0, 150, 20, ur.c("selectWorld.mapType"), ($$0x, $$1x) -> ffk.this.x.a($$1x))
         );
         $$1.a(ffk.this.x.m());
         ffk.this.x.a($$1x -> {
            fft.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ewk.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = ffk.this.x.m().c() != null;
         });
         this.l = $$0.a(euz.a(ur.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         ffk.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new evi(ffk.this.i, 308, 20, ur.c("selectWorld.enterSeed")) {
            @Override
            protected vf aM_() {
               return super.aM_().b(uq.s).b(ffk.d.i);
            }
         };
         this.k.c(i);
         this.k.a(ffk.this.x.h());
         this.k.b($$0x -> ffk.this.x.b(this.k.a()));
         $$0.a(eyf.a(ffk.this.i, this.k, h), 2);
         ffr.a $$2 = ffr.a(310);
         $$2.a(e, ffk.this.x::i, ffk.this.x::b).a(() -> !ffk.this.x.l()).a(f);
         $$2.a(g, ffk.this.x::j, ffk.this.x::c).a(() -> !ffk.this.x.f() && !ffk.this.x.l());
         ffr $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         ffk.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         ffp $$0 = ffk.this.x.n();
         if ($$0 != null) {
            ffk.this.f.a($$0.createEditScreen(ffk.this, ffk.this.x.k()));
         }
      }

      private evg.c<fft.b> c() {
         return new evg.c<fft.b>() {
            @Override
            public List<fft.b> a() {
               return evg.a.getAsBoolean() ? ffk.this.x.p() : ffk.this.x.o();
            }

            @Override
            public List<fft.b> b() {
               return ffk.this.x.o();
            }
         };
      }

      private static vf a(evg<fft.b> $$0) {
         return $$0.a().b() ? uq.a($$0.e(), d) : $$0.e();
      }
   }
}
