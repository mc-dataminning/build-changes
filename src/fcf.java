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

public class fcf extends exv {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final int n = 1;
   private static final Logger o = LogUtils.getLogger();
   private static final String p = "mcworld-";
   static final te q = te.c("selectWorld.gameMode");
   static final te s = te.c("selectWorld.enterName");
   static final te t = te.c("selectWorld.experiments");
   static final te u = te.c("selectWorld.allowCommands.info");
   private static final te v = te.c("createWorld.preparing");
   private static final int w = 10;
   private static final int x = 8;
   public static final aep a = new aep("textures/gui/header_separator.png");
   public static final aep b = new aep("textures/gui/footer_separator.png");
   public static final aep c = new aep("textures/gui/light_dirt_background.png");
   final fco y;
   private final eud z = new eud(this::d, $$1x -> this.f($$1x));
   private boolean A;
   private final egv B;
   @Nullable
   private final exv C;
   @Nullable
   private Path D;
   @Nullable
   private amv E;
   @Nullable
   private evj F;
   @Nullable
   private eue G;

   public static void a(eqn $$0, @Nullable exv $$1) {
      a($$0, v);
      amv $$2 = new amv(new amy($$0.ba()));
      afj.c $$3 = a($$2, cqd.c);
      CompletableFuture<fcn> $$4 = afj.a(
         $$3, $$0x -> new afj.b<>(new fcf.a(new dld(dlf.a(), dun.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fcn($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fcf($$0, $$1, $$4.join(), Optional.of(dun.a), OptionalLong.empty()));
   }

   public static fcf a(eqn $$0, @Nullable exv $$1, cpo $$2, fcn $$3, @Nullable Path $$4) {
      fcf $$5 = new fcf($$0, $$1, $$3, dun.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.A = true;
      $$5.y.a($$2.a());
      $$5.y.a($$2.e());
      $$5.y.a($$2.d());
      $$5.y.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.y.a(fco.a.b);
      } else if ($$2.b().h()) {
         $$5.y.a(fco.a.a);
      } else if ($$2.b().g()) {
         $$5.y.a(fco.a.c);
      }

      $$5.D = $$4;
      return $$5;
   }

   private fcf(eqn $$0, @Nullable exv $$1, fcn $$2, Optional<aeo<dum>> $$3, OptionalLong $$4) {
      super(te.c("selectWorld.create"));
      this.C = $$1;
      this.B = $$0.ba();
      this.y = new fco($$0.k().c(), $$2, $$3, $$4);
   }

   public fco l() {
      return this.y;
   }

   @Override
   protected void aE_() {
      this.G = eue.a(this.z, this.g).a(new fcf.b(), new fcf.d(), new fcf.c()).a();
      this.d(this.G);
      this.F = new evj().a(10);
      evj.b $$0 = this.F.d(2);
      $$0.a(esi.a(te.c("selectWorld.create"), $$0x -> this.C()).a());
      $$0.a(esi.a(td.e, $$0x -> this.B()).a());
      this.F.a($$0x -> {
         $$0x.g(1);
         this.d($$0x);
      });
      this.G.a(0, false);
      this.y.a();
      this.b();
   }

   @Override
   public void b() {
      if (this.G != null && this.F != null) {
         this.G.a(this.g);
         this.G.b();
         this.F.a();
         evi.a(this.F, 0, this.h - 36, this.g, 36);
         int $$0 = this.G.s().c();
         ewd $$1 = new ewd(0, $$0, this.g, this.F.r() - $$0);
         this.z.a($$1);
      }
   }

   private static void a(eqn $$0, te $$1) {
      $$0.d(new exb($$1));
   }

   private void C() {
      fcn $$0 = this.y.k();
      dlc.b $$1 = $$0.d().a($$0.c());
      hm<aey> $$2 = $$0.e().a(aey.c, $$1.b());
      Lifecycle $$3 = cdv.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.A && $$4 == Lifecycle.stable();
      fcp.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(ebz.a $$0, hm<aey> $$1, Lifecycle $$2) {
      a(this.f, v);
      Optional<ebv.c> $$3 = this.F();
      if (!$$3.isEmpty()) {
         this.E();
         boolean $$4 = $$0 == ebz.a.c;
         fcn $$5 = this.y.k();
         cpo $$6 = this.c($$4);
         ecb $$7 = new ebz($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cpo c(boolean $$0) {
      String $$1 = this.y.b().trim();
      if ($$0) {
         cpg $$2 = new cpg();
         $$2.a(cpg.k).a(false, null);
         return new cpo($$1, cph.d, false, bgl.a, true, $$2, cqd.c);
      } else {
         return new cpo($$1, this.y.d().e, this.y.f(), this.y.e(), this.y.g(), this.y.q(), this.y.k().g());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.G.b($$0)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.C();
         return true;
      }
   }

   @Override
   public void au_() {
      this.B();
   }

   @Override
   public void B() {
      this.f.a(this.C);
      this.E();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, aro.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(erx $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends etw & evr> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends etw & etj & evr> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path D() {
      if (this.D == null) {
         try {
            this.D = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            o.warn("Failed to create temporary dir", var2);
            eui.c(this.f, this.y.c());
            this.B();
         }
      }

      return this.D;
   }

   void a(cqd $$0) {
      Pair<Path, amv> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fci(this, (amv)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cqd $$0) {
      Pair<Path, amv> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fba((amv)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), te.c("dataPack.title")));
      }
   }

   private void a(amv $$0, boolean $$1, Consumer<cqd> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cqd $$5 = new cqd(new coy($$3, $$4), this.y.k().g().b());
      if (this.y.a($$5)) {
         this.f.a(this);
      } else {
         cdt $$6 = $$0.e();
         if (cdv.a($$6) && $$1) {
            this.f.a(new fce($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.y.k().g());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(amv $$0, cqd $$1, Consumer<cqd> $$2) {
      this.f.d(new exb(te.c("dataPack.validation.working")));
      afj.c $$3 = a($$0, $$1);
      afj.<fcf.a, fcn>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jd.aF).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jd.ap).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fcn $$1x = this.y.k();
                  DynamicOps<JsonElement> $$2x = aen.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dld.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aen.a(JsonOps.INSTANCE, $$0x.c());
                  dld $$5 = (dld)$$3x.flatMap($$1xx -> dld.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", o::error));
                  return new afj.b<>(new fcf.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fcn($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.y::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               o.warn("Failed to validate datapack", $$2x);
               this.f.a(new ewo($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.y.k().g());
                  } else {
                     $$2.accept(cqd.c);
                  }
               }, te.c("dataPack.validation.failed"), td.a, te.c("dataPack.validation.back"), te.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static afj.c a(amv $$0, cqd $$1) {
      afj.d $$2 = new afj.d($$0, $$1, false, true);
      return new afj.c($$2, dt.a.c, 2);
   }

   private void E() {
      if (this.D != null) {
         try (Stream<Path> $$0 = Files.walk(this.D)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  o.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            o.warn("Failed to list temporary dir {}", this.D);
         }

         this.D = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ac.b($$0, $$1, $$2);
      } catch (IOException var4) {
         o.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<ebv.c> F() {
      String $$0 = this.y.c();

      try {
         ebv.c $$1 = this.f.k().d($$0);
         if (this.D == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.D)) {
               Path $$3 = $$1.a(ebt.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.D)).forEach($$1x -> a(this.D, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            o.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         o.warn("Failed to create access for {}", $$0, var9);
      }

      eui.c(this.f, $$0);
      this.B();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eqn $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  o.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         o.warn("Failed to copy datapacks from world {}", $$0, var8);
         eui.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, amv> c(cqd $$0) {
      Path $$1 = this.D();
      if ($$1 != null) {
         if (this.E == null) {
            this.E = amy.a($$1, this.B);
            this.E.a();
         }

         this.E.a($$0.a().a());
         return Pair.of($$1, this.E);
      } else {
         return null;
      }
   }

   static record a(dld a, cqd b) {
   }

   class b extends eub {
      private static final te c = te.c("createWorld.tab.game.title");
      private static final te d = te.c("selectWorld.allowCommands");
      private final esr e;

      b() {
         super(c);
         evj.b $$0 = this.a.b(8).d(1);
         evn $$1 = $$0.b();
         evj.b $$2 = new evj().b(4).d(1);
         $$2.a(new etn(fcf.s, fcf.this.f.h), $$2.b().b(1));
         this.e = $$2.a(new esr(fcf.this.i, 208, 20, te.c("selectWorld.enterName")), $$2.b().a(1));
         this.e.a(fcf.this.y.b());
         this.e.b(fcf.this.y::a);
         fcf.this.y.a($$0x -> this.e.a(etr.a(te.a("selectWorld.targetFolder", te.b($$0x.c()).a(n.u)))));
         fcf.this.c(this.e);
         $$0.a($$2.a(), $$0.b().b());
         esp<fco.a> $$3 = $$0.a(esp.<fco.a>a($$0x -> $$0x.f).a(fco.a.a, fco.a.b, fco.a.c).a(0, 0, 210, 20, fcf.q, ($$0x, $$1x) -> fcf.this.y.a($$1x)), $$1);
         fcf.this.y.a($$1x -> {
            $$3.a($$1x.d());
            $$3.i = !$$1x.l();
            $$3.a(etr.a($$1x.d().a()));
         });
         esp<bgl> $$4 = $$0.a(esp.a(bgl::b).a(bgl.values()).a(0, 0, 210, 20, te.c("options.difficulty"), ($$0x, $$1x) -> fcf.this.y.a($$1x)), $$1);
         fcf.this.y.a($$1x -> {
            $$4.a(fcf.this.y.e());
            $$4.i = !fcf.this.y.f();
            $$4.a(etr.a(fcf.this.y.e().d()));
         });
         esp<Boolean> $$5 = $$0.a(esp.e().a($$0x -> etr.a(fcf.u)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fcf.this.y.a($$1x)));
         fcf.this.y.a($$1x -> {
            $$5.a(fcf.this.y.g());
            $$5.i = !fcf.this.y.l() && !fcf.this.y.f();
         });
         if (!aa.b().g()) {
            $$0.a(esi.a(fcf.t, $$0x -> fcf.this.a(fcf.this.y.k().g())).a(210).a());
         }
      }
   }

   class c extends eub {
      private static final te c = te.c("createWorld.tab.more.title");
      private static final te d = te.c("selectWorld.gameRules");
      private static final te e = te.c("selectWorld.dataPacks");

      c() {
         super(c);
         evj.b $$0 = this.a.b(8).d(1);
         $$0.a(esi.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(esi.a(fcf.t, $$0x -> fcf.this.a(fcf.this.y.k().g())).a(210).a());
         $$0.a(esi.a(e, $$0x -> fcf.this.b(fcf.this.y.k().g())).a(210).a());
      }

      private void b() {
         fcf.this.f.a(new fcg(fcf.this.y.q().b(), $$0 -> {
            fcf.this.f.a(fcf.this);
            $$0.ifPresent(fcf.this.y::a);
         }));
      }
   }

   class d extends eub {
      private static final te c = te.c("createWorld.tab.world.title");
      private static final te d = te.c("generator.minecraft.amplified.info");
      private static final te e = te.c("selectWorld.mapFeatures");
      private static final te f = te.c("selectWorld.mapFeatures.info");
      private static final te g = te.c("selectWorld.bonusItems");
      private static final te h = te.c("selectWorld.enterSeed");
      static final te i = te.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final esr k;
      private final esi l;

      d() {
         super(c);
         evj.b $$0 = this.a.a(10).b(8).d(2);
         esp<fco.b> $$1 = $$0.a(
            esp.<fco.b>a(fco.b::a).a(this.c()).a(fcf.d::a).a(0, 0, 150, 20, te.c("selectWorld.mapType"), ($$0x, $$1x) -> fcf.this.y.a($$1x))
         );
         $$1.a(fcf.this.y.m());
         fcf.this.y.a($$1x -> {
            fco.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(etr.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fcf.this.y.m().c() != null;
         });
         this.l = $$0.a(esi.a(te.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fcf.this.y.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         evj.b $$2 = new evj().b(4).d(1);
         $$2.a(new etn(h, fcf.this.i).e());
         this.k = $$2.a(new esr(fcf.this.i, 308, 20, te.c("selectWorld.enterSeed")) {
            @Override
            protected tr aB_() {
               return super.aB_().b(td.s).b(fcf.d.i);
            }
         }, $$0.b().a(1));
         this.k.c(i);
         this.k.a(fcf.this.y.h());
         this.k.b($$0x -> fcf.this.y.b(this.k.a()));
         $$0.a($$2.a(), 2);
         fcm.a $$3 = fcm.a(310).a(1);
         $$3.a(e, fcf.this.y::i, fcf.this.y::b).a(() -> !fcf.this.y.l()).a(f);
         $$3.a(g, fcf.this.y::j, fcf.this.y::c).a(() -> !fcf.this.y.f() && !fcf.this.y.l());
         fcm $$4 = $$3.a($$1x -> $$0.a($$1x, 2));
         fcf.this.y.a($$1x -> $$4.a());
      }

      private void b() {
         fck $$0 = fcf.this.y.n();
         if ($$0 != null) {
            fcf.this.f.a($$0.createEditScreen(fcf.this, fcf.this.y.k()));
         }
      }

      private esp.c<fco.b> c() {
         return new esp.c<fco.b>() {
            @Override
            public List<fco.b> a() {
               return esp.a.getAsBoolean() ? fcf.this.y.p() : fcf.this.y.o();
            }

            @Override
            public List<fco.b> b() {
               return fcf.this.y.o();
            }
         };
      }

      private static tr a(esp<fco.b> $$0) {
         return $$0.a().b() ? td.a($$0.b(), d) : $$0.b();
      }
   }
}
