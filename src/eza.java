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

public class eza extends euq {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final int n = 1;
   private static final Logger o = LogUtils.getLogger();
   private static final String p = "mcworld-";
   static final sw q = sw.c("selectWorld.gameMode");
   static final sw r = sw.c("selectWorld.enterName");
   static final sw s = sw.c("selectWorld.experiments");
   static final sw t = sw.c("selectWorld.allowCommands.info");
   private static final sw u = sw.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final acq a = new acq("textures/gui/header_separator.png");
   public static final acq b = new acq("textures/gui/footer_separator.png");
   public static final acq c = new acq("textures/gui/light_dirt_background.png");
   final ezj x;
   private final era y = new era(this::d, $$1x -> this.f($$1x));
   private boolean z;
   @Nullable
   private final euq A;
   @Nullable
   private Path C;
   @Nullable
   private aki D;
   @Nullable
   private esf E;
   @Nullable
   private erb F;

   public static void a(enn $$0, @Nullable euq $$1) {
      a($$0, u);
      aki $$2 = new aki(new akl());
      adj.c $$3 = a($$2, cnf.c);
      CompletableFuture<ezi> $$4 = adj.a(
         $$3, $$0x -> new adj.b<>(new eza.a(new dig(dii.a(), drq.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new ezi($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new eza($$0, $$1, $$4.join(), Optional.of(drq.a), OptionalLong.empty()));
   }

   public static eza a(enn $$0, @Nullable euq $$1, cmq $$2, ezi $$3, @Nullable Path $$4) {
      eza $$5 = new eza($$0, $$1, $$3, drq.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(ezj.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(ezj.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(ezj.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private eza(enn $$0, @Nullable euq $$1, ezi $$2, Optional<acp<drp>> $$3, OptionalLong $$4) {
      super(sw.c("selectWorld.create"));
      this.A = $$1;
      this.x = new ezj($$0.k().c(), $$2, $$3, $$4);
   }

   public ezj l() {
      return this.x;
   }

   @Override
   public void f() {
      this.y.b();
   }

   @Override
   protected void b() {
      this.F = erb.a(this.y, this.g).a(new eza.b(), new eza.d(), new eza.c()).a();
      this.d(this.F);
      this.E = new esf().a(10);
      esf.b $$0 = this.E.d(2);
      $$0.a(epi.a(sw.c("selectWorld.create"), $$0x -> this.C()).a());
      $$0.a(epi.a(sv.e, $$0x -> this.B()).a());
      this.E.a($$0x -> {
         $$0x.g(1);
         this.d($$0x);
      });
      this.F.a(0, false);
      this.x.a();
      this.aG_();
   }

   @Override
   public void aG_() {
      if (this.F != null && this.E != null) {
         this.F.a(this.g);
         this.F.b();
         this.E.c();
         ese.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         esz $$1 = new esz(0, $$0, this.g, this.E.r() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(enn $$0, sw $$1) {
      $$0.c(new etx($$1));
   }

   private void C() {
      ezi $$0 = this.x.k();
      dif.b $$1 = $$0.d().a($$0.c());
      hl<acz> $$2 = $$0.e().a(acz.c, $$1.b());
      Lifecycle $$3 = cay.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      ezk.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(dzc.a $$0, hl<acz> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<dyy.c> $$3 = this.F();
      if (!$$3.isEmpty()) {
         this.E();
         boolean $$4 = $$0 == dzc.a.c;
         ezi $$5 = this.x.k();
         cmq $$6 = this.c($$4);
         dze $$7 = new dzc($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cmq c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cmi $$2 = new cmi();
         $$2.a(cmi.k).a(false, null);
         return new cmq($$1, cmj.d, false, bdu.a, true, $$2, cnf.c);
      } else {
         return new cmq($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
         this.C();
         return true;
      }
   }

   @Override
   public void aw_() {
      this.B();
   }

   @Override
   public void B() {
      this.f.a(this.A);
      this.E();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(b, 0, apa.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(eox $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eqt & esn> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eqt & eqh & esn> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path D() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            o.warn("Failed to create temporary dir", var2);
            erf.c(this.f, this.x.c());
            this.B();
         }
      }

      return this.C;
   }

   void a(cnf $$0) {
      Pair<Path, aki> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new ezd(this, (aki)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cnf $$0) {
      Pair<Path, aki> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new exv((aki)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), sw.c("dataPack.title")));
      }
   }

   private void a(aki $$0, boolean $$1, Consumer<cnf> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cnf $$5 = new cnf(new cma($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         caw $$6 = $$0.e();
         if (cay.a($$6) && $$1) {
            this.f.a(new eyz($$0.f(), $$3x -> {
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

   private void a(aki $$0, cnf $$1, Consumer<cnf> $$2) {
      this.f.c(new etx(sw.c("dataPack.validation.working")));
      adj.c $$3 = a($$0, $$1);
      adj.<eza.a, ezi>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jc.aF).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jc.ap).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  ezi $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aco.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dig.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aco.a(JsonOps.INSTANCE, $$0x.c());
                  dig $$5 = (dig)$$3x.flatMap($$1xx -> dig.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", o::error));
                  return new adj.b<>(new eza.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new ezi($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               o.warn("Failed to validate datapack", $$2x);
               this.f.a(new etk($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cnf.c);
                  }
               }, sw.c("dataPack.validation.failed"), sv.a, sw.c("dataPack.validation.back"), sw.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static adj.c a(aki $$0, cnf $$1) {
      adj.d $$2 = new adj.d($$0, $$1, false, true);
      return new adj.c($$2, dt.a.c, 2);
   }

   private void E() {
      if (this.C != null) {
         try (Stream<Path> $$0 = Files.walk(this.C)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  o.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            o.warn("Failed to list temporary dir {}", this.C);
         }

         this.C = null;
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

   private Optional<dyy.c> F() {
      String $$0 = this.x.c();

      try {
         dyy.c $$1 = this.f.k().d($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(dyw.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.C)).forEach($$1x -> a(this.C, $$3, $$1x));
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

      erf.c(this.f, $$0);
      this.B();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, enn $$1) {
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
         erf.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aki> c(cnf $$0) {
      Path $$1 = this.D();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = akl.a($$1);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dig a, cnf b) {
   }

   class b extends eqy {
      private static final sw c = sw.c("createWorld.tab.game.title");
      private static final sw d = sw.c("selectWorld.allowCommands");
      private final epr e;

      b() {
         super(c);
         esf.b $$0 = this.a.b(8).d(1);
         esj $$1 = $$0.b();
         esf.b $$2 = new esf().b(4).d(1);
         $$2.a(new eqk(eza.r, eza.this.f.h), $$2.b().b(1));
         this.e = $$2.a(new epr(eza.this.i, 0, 0, 208, 20, sw.c("selectWorld.enterName")), $$2.b().a(1));
         this.e.a(eza.this.x.b());
         this.e.b(eza.this.x::a);
         eza.this.x.a($$0x -> this.e.a(eqp.a(sw.a("selectWorld.targetFolder", sw.b($$0x.c()).a(n.u)))));
         eza.this.c(this.e);
         $$0.a($$2.a(), $$0.b().b());
         epp<ezj.a> $$3 = $$0.a(epp.<ezj.a>a($$0x -> $$0x.f).a(ezj.a.a, ezj.a.b, ezj.a.c).a(0, 0, 210, 20, eza.q, ($$0x, $$1x) -> eza.this.x.a($$1x)), $$1);
         eza.this.x.a($$1x -> {
            $$3.a($$1x.d());
            $$3.r = !$$1x.l();
            $$3.a(eqp.a($$1x.d().a()));
         });
         epp<bdu> $$4 = $$0.a(epp.a(bdu::b).a(bdu.values()).a(0, 0, 210, 20, sw.c("options.difficulty"), ($$0x, $$1x) -> eza.this.x.a($$1x)), $$1);
         eza.this.x.a($$1x -> {
            $$4.a(eza.this.x.e());
            $$4.r = !eza.this.x.f();
            $$4.a(eqp.a(eza.this.x.e().d()));
         });
         epp<Boolean> $$5 = $$0.a(epp.e().a($$0x -> eqp.a(eza.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> eza.this.x.a($$1x)));
         eza.this.x.a($$1x -> {
            $$5.a(eza.this.x.g());
            $$5.r = !eza.this.x.l() && !eza.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(epi.a(eza.s, $$0x -> eza.this.a(eza.this.x.k().g())).a(210).a());
         }
      }

      @Override
      public void b() {
         this.e.a();
      }
   }

   class c extends eqy {
      private static final sw c = sw.c("createWorld.tab.more.title");
      private static final sw d = sw.c("selectWorld.gameRules");
      private static final sw e = sw.c("selectWorld.dataPacks");

      c() {
         super(c);
         esf.b $$0 = this.a.b(8).d(1);
         $$0.a(epi.a(d, $$0x -> this.c()).a(210).a());
         $$0.a(epi.a(eza.s, $$0x -> eza.this.a(eza.this.x.k().g())).a(210).a());
         $$0.a(epi.a(e, $$0x -> eza.this.b(eza.this.x.k().g())).a(210).a());
      }

      private void c() {
         eza.this.f.a(new ezb(eza.this.x.q().b(), $$0 -> {
            eza.this.f.a(eza.this);
            $$0.ifPresent(eza.this.x::a);
         }));
      }
   }

   class d extends eqy {
      private static final sw c = sw.c("createWorld.tab.world.title");
      private static final sw d = sw.c("generator.minecraft.amplified.info");
      private static final sw e = sw.c("selectWorld.mapFeatures");
      private static final sw f = sw.c("selectWorld.mapFeatures.info");
      private static final sw g = sw.c("selectWorld.bonusItems");
      private static final sw h = sw.c("selectWorld.enterSeed");
      static final sw i = sw.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final epr k;
      private final epi l;

      d() {
         super(c);
         esf.b $$0 = this.a.a(10).b(8).d(2);
         epp<ezj.b> $$1 = $$0.a(
            epp.<ezj.b>a(ezj.b::a).a(this.d()).a(eza.d::a).a(0, 0, 150, 20, sw.c("selectWorld.mapType"), ($$0x, $$1x) -> eza.this.x.a($$1x))
         );
         $$1.a(eza.this.x.m());
         eza.this.x.a($$1x -> {
            ezj.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(eqp.a(d));
            } else {
               $$1.a(null);
            }

            $$1.r = eza.this.x.m().c() != null;
         });
         this.l = $$0.a(epi.a(sw.c("selectWorld.customizeType"), $$0x -> this.c()).a());
         eza.this.x.a($$0x -> this.l.r = !$$0x.l() && $$0x.n() != null);
         esf.b $$2 = new esf().b(4).d(1);
         $$2.a(new eqk(h, eza.this.i).e());
         this.k = $$2.a(new epr(eza.this.i, 0, 0, 308, 20, sw.c("selectWorld.enterSeed")) {
            @Override
            protected tj aE_() {
               return super.aE_().b(sv.r).b(eza.d.i);
            }
         }, $$0.b().a(1));
         this.k.c(i);
         this.k.a(eza.this.x.h());
         this.k.b($$0x -> eza.this.x.b(this.k.b()));
         $$0.a($$2.a(), 2);
         ezh.a $$3 = ezh.a(310).a(1);
         $$3.a(e, eza.this.x::i, eza.this.x::b).a(() -> !eza.this.x.l()).a(f);
         $$3.a(g, eza.this.x::j, eza.this.x::c).a(() -> !eza.this.x.f() && !eza.this.x.l());
         ezh $$4 = $$3.a($$1x -> $$0.a($$1x, 2));
         eza.this.x.a($$1x -> $$4.a());
      }

      private void c() {
         ezf $$0 = eza.this.x.n();
         if ($$0 != null) {
            eza.this.f.a($$0.createEditScreen(eza.this, eza.this.x.k()));
         }
      }

      private epp.c<ezj.b> d() {
         return new epp.c<ezj.b>() {
            @Override
            public List<ezj.b> a() {
               return epp.a.getAsBoolean() ? eza.this.x.p() : eza.this.x.o();
            }

            @Override
            public List<ezj.b> b() {
               return eza.this.x.o();
            }
         };
      }

      private static tj a(epp<ezj.b> $$0) {
         return $$0.a().b() ? sv.a($$0.b(), d) : $$0.b();
      }

      @Override
      public void b() {
         this.k.a();
      }
   }
}
