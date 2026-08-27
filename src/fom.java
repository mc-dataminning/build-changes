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

public class fom extends fjx {
   private static final int c = 1;
   private static final int d = 210;
   private static final Logger o = LogUtils.getLogger();
   private static final String p = "mcworld-";
   static final wi q = wi.c("selectWorld.gameMode");
   static final wi r = wi.c("selectWorld.enterName");
   static final wi s = wi.c("selectWorld.experiments");
   static final wi u = wi.c("selectWorld.allowCommands.info");
   private static final wi v = wi.c("createWorld.preparing");
   private static final int w = 10;
   private static final int x = 8;
   public static final ajv a = new ajv("textures/gui/header_separator.png");
   public static final ajv b = new ajv("textures/gui/footer_separator.png");
   private final fhl y = new fhl(this);
   final fow z;
   private final fgb A = new fgb(this::c, $$1x -> this.e($$1x));
   private boolean B;
   private final erz C;
   @Nullable
   private final fjx D;
   @Nullable
   private Path E;
   @Nullable
   private asp F;
   @Nullable
   private fgc G;

   public static void a(fby $$0, @Nullable fjx $$1) {
      a($$0, v);
      asp $$2 = new asp(new ass($$0.be()));
      akq.c $$3 = a($$2, daa.c);
      CompletableFuture<fov> $$4 = akq.a(
         $$3, $$0x -> new akq.b<>(new fom.a(new dvw(dvy.a(), efg.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fov($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fom($$0, $$1, $$4.join(), Optional.of(efg.a), OptionalLong.empty()));
   }

   public static fom a(fby $$0, @Nullable fjx $$1, czk $$2, fov $$3, @Nullable Path $$4) {
      fom $$5 = new fom($$0, $$1, $$3, efg.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.B = true;
      $$5.z.a($$2.a());
      $$5.z.a($$2.e());
      $$5.z.a($$2.d());
      $$5.z.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.z.a(fow.a.b);
      } else if ($$2.b().h()) {
         $$5.z.a(fow.a.a);
      } else if ($$2.b().g()) {
         $$5.z.a(fow.a.c);
      }

      $$5.E = $$4;
      return $$5;
   }

   private fom(fby $$0, @Nullable fjx $$1, fov $$2, Optional<aju<eff>> $$3, OptionalLong $$4) {
      super(wi.c("selectWorld.create"));
      this.D = $$1;
      this.C = $$0.be();
      this.z = new fow($$0.m().c(), $$2, $$3, $$4);
   }

   public fow m() {
      return this.z;
   }

   @Override
   protected void aM_() {
      this.G = fgc.a(this.A, this.k).a(new fom.b(), new fom.d(), new fom.c()).a();
      this.c(this.G);
      fhp $$0 = this.y.b(fhp.e().a(8));
      $$0.a(fdy.a(wi.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(fdy.a(wh.e, $$0x -> this.C()).a());
      this.y.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.G.a(0, false);
      this.z.a();
      this.c();
   }

   @Override
   protected void aC_() {
   }

   @Override
   public void c() {
      if (this.G != null) {
         this.G.a(this.k);
         this.G.b();
         int $$0 = this.G.G().c();
         fie $$1 = new fie(0, $$0, this.k, this.l - this.y.b() - $$0);
         this.A.a($$1);
         this.y.b($$0);
         this.y.a();
      }
   }

   private static void a(fby $$0, wi $$1) {
      $$0.d(new fjd($$1));
   }

   private void D() {
      fov $$0 = this.z.k();
      dvv.b $$1 = $$0.d().a($$0.c());
      iu<ake> $$2 = $$0.e().a(ake.c, $$1.b());
      Lifecycle $$3 = cmp.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.B && $$4 == Lifecycle.stable();
      fox.a(this.j, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(ene.a $$0, iu<ake> $$1, Lifecycle $$2) {
      a(this.j, v);
      Optional<ena.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == ene.a.c;
         fov $$5 = this.z.k();
         czk $$6 = this.c($$4);
         eng $$7 = new ene($$6, $$5.b(), $$0, $$2);
         this.j.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private czk c(boolean $$0) {
      String $$1 = this.z.b().trim();
      if ($$0) {
         czc $$2 = new czc();
         $$2.a(czc.l).a(false, null);
         return new czk($$1, czd.d, false, boc.a, true, $$2, daa.c);
      } else {
         return new czk($$1, this.z.d().e, this.z.f(), this.z.e(), this.z.g(), this.z.q(), this.z.k().g());
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
         this.D();
         return true;
      }
   }

   @Override
   public void d() {
      this.C();
   }

   public void C() {
      this.j.a(this.D);
      this.F();
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(b, 0, this.l - this.y.b() - 2, 0.0F, 0.0F, this.k, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fdl $$0) {
      this.a($$0, 0, this.y.c(), this.k, this.l);
   }

   @Override
   protected <T extends ffu & fhs> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends ffu & ffb & fhs> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.E == null) {
         try {
            this.E = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            o.warn("Failed to create temporary dir", var2);
            fgg.c(this.j, this.z.c());
            this.C();
         }
      }

      return this.E;
   }

   void a(daa $$0) {
      Pair<Path, asp> $$1 = this.c($$0);
      if ($$1 != null) {
         this.j.a(new fop(this, (asp)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(daa $$0) {
      Pair<Path, asp> $$1 = this.c($$0);
      if ($$1 != null) {
         this.j.a(new fnd((asp)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wi.c("dataPack.title")));
      }
   }

   private void a(asp $$0, boolean $$1, Consumer<daa> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      daa $$5 = new daa(new cyu($$3, $$4), this.z.k().g().b());
      if (this.z.a($$5)) {
         this.j.a(this);
      } else {
         cmn $$6 = $$0.e();
         if (cmp.a($$6) && $$1) {
            this.j.a(new fol($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.z.k().g());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(asp $$0, daa $$1, Consumer<daa> $$2) {
      this.j.d(new fjd(wi.c("dataPack.validation.working")));
      akq.c $$3 = a($$0, $$1);
      akq.<fom.a, fov>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ku.aN).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ku.aw).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fov $$1x = this.z.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dvw.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dvw $$5 = (dvw)$$3x.flatMap($$1xx -> dvw.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", o::error));
                  return new akq.b<>(new fom.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fov($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.j
         )
         .thenAcceptAsync(this.z::a, this.j)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               o.warn("Failed to validate datapack", $$2x);
               this.j.a(new fip($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.z.k().g());
                  } else {
                     $$2.accept(daa.c);
                  }
               }, wi.c("dataPack.validation.failed"), wh.a, wi.c("dataPack.validation.back"), wi.c("dataPack.validation.reset")));
            } else {
               this.j.a(this);
            }

            return null;
         });
   }

   private static akq.c a(asp $$0, daa $$1) {
      akq.d $$2 = new akq.d($$0, $$1, false, true);
      return new akq.c($$2, dw.a.c, 2);
   }

   private void F() {
      if (this.E != null) {
         try (Stream<Path> $$0 = Files.walk(this.E)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  o.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            o.warn("Failed to list temporary dir {}", this.E);
         }

         this.E = null;
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

   private Optional<ena.c> I() {
      String $$0 = this.z.c();

      try {
         ena.c $$1 = this.j.m().e($$0);
         if (this.E == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.E)) {
               Path $$3 = $$1.a(emy.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.E)).forEach($$1x -> a(this.E, $$3, $$1x));
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

      fgg.c(this.j, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fby $$1) {
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
         fgg.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, asp> c(daa $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.F == null) {
            this.F = ass.a($$1, this.C);
            this.F.a();
         }

         this.F.a($$0.a().a());
         return Pair.of($$1, this.F);
      } else {
         return null;
      }
   }

   static record a(dvw a, daa b) {
   }

   class b extends ffz {
      private static final wi c = wi.c("createWorld.tab.game.title");
      private static final wi d = wi.c("selectWorld.allowCommands.new");
      private final feh e;

      b() {
         super(c);
         fhk.b $$0 = this.a.b(8).d(1);
         fho $$1 = $$0.b();
         this.e = new feh(fom.this.m, 208, 20, wi.c("selectWorld.enterName"));
         this.e.a(fom.this.z.b());
         this.e.b(fom.this.z::a);
         fom.this.z.a($$0x -> this.e.a(ffj.a(wi.a("selectWorld.targetFolder", wi.b($$0x.c()).a(n.u)))));
         fom.this.b(this.e);
         $$0.a(fhh.a(fom.this.m, this.e, fom.r), $$0.b().b());
         fef<fow.a> $$2 = $$0.a(fef.<fow.a>a($$0x -> $$0x.f).a(fow.a.a, fow.a.b, fow.a.c).a(0, 0, 210, 20, fom.q, ($$0x, $$1x) -> fom.this.z.a($$1x)), $$1);
         fom.this.z.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(ffj.a($$1x.d().a()));
         });
         fef<boc> $$3 = $$0.a(fef.a(boc::b).a(boc.values()).a(0, 0, 210, 20, wi.c("options.difficulty"), ($$0x, $$1x) -> fom.this.z.a($$1x)), $$1);
         fom.this.z.a($$1x -> {
            $$3.a(fom.this.z.e());
            $$3.j = !fom.this.z.f();
            $$3.a(ffj.a(fom.this.z.e().d()));
         });
         fef<Boolean> $$4 = $$0.a(fef.e().a($$0x -> ffj.a(fom.u)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fom.this.z.a($$1x)));
         fom.this.z.a($$1x -> {
            $$4.a(fom.this.z.g());
            $$4.j = !fom.this.z.l() && !fom.this.z.f();
         });
         if (!aa.b().g()) {
            $$0.a(fdy.a(fom.s, $$0x -> fom.this.a(fom.this.z.k().g())).a(210).a());
         }
      }
   }

   class c extends ffz {
      private static final wi c = wi.c("createWorld.tab.more.title");
      private static final wi d = wi.c("selectWorld.gameRules");
      private static final wi e = wi.c("selectWorld.dataPacks");

      c() {
         super(c);
         fhk.b $$0 = this.a.b(8).d(1);
         $$0.a(fdy.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fdy.a(fom.s, $$0x -> fom.this.a(fom.this.z.k().g())).a(210).a());
         $$0.a(fdy.a(e, $$0x -> fom.this.b(fom.this.z.k().g())).a(210).a());
      }

      private void b() {
         fom.this.j.a(new fon(fom.this.z.q().b(), $$0 -> {
            fom.this.j.a(fom.this);
            $$0.ifPresent(fom.this.z::a);
         }));
      }
   }

   class d extends ffz {
      private static final wi c = wi.c("createWorld.tab.world.title");
      private static final wi d = wi.c("generator.minecraft.amplified.info");
      private static final wi e = wi.c("selectWorld.mapFeatures");
      private static final wi f = wi.c("selectWorld.mapFeatures.info");
      private static final wi g = wi.c("selectWorld.bonusItems");
      private static final wi h = wi.c("selectWorld.enterSeed");
      static final wi i = wi.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final feh k;
      private final fdy l;

      d() {
         super(c);
         fhk.b $$0 = this.a.a(10).b(8).d(2);
         fef<fow.b> $$1 = $$0.a(
            fef.<fow.b>a(fow.b::a).a(this.c()).a(fom.d::a).a(0, 0, 150, 20, wi.c("selectWorld.mapType"), ($$0x, $$1x) -> fom.this.z.a($$1x))
         );
         $$1.a(fom.this.z.m());
         fom.this.z.a($$1x -> {
            fow.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ffj.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fom.this.z.m().c() != null;
         });
         this.l = $$0.a(fdy.a(wi.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fom.this.z.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new feh(fom.this.m, 308, 20, wi.c("selectWorld.enterSeed")) {
            @Override
            protected ww aK_() {
               return super.aK_().b(wh.t).b(fom.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fom.this.z.h());
         this.k.b($$0x -> fom.this.z.b(this.k.a()));
         $$0.a(fhh.a(fom.this.m, this.k, h), 2);
         fou.a $$2 = fou.a(310);
         $$2.a(e, fom.this.z::i, fom.this.z::b).a(() -> !fom.this.z.l()).a(f);
         $$2.a(g, fom.this.z::j, fom.this.z::c).a(() -> !fom.this.z.f() && !fom.this.z.l());
         fou $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fom.this.z.a($$1x -> $$3.a());
      }

      private void b() {
         fos $$0 = fom.this.z.n();
         if ($$0 != null) {
            fom.this.j.a($$0.createEditScreen(fom.this, fom.this.z.k()));
         }
      }

      private fef.c<fow.b> c() {
         return new fef.c<fow.b>() {
            @Override
            public List<fow.b> a() {
               return fef.a.getAsBoolean() ? fom.this.z.p() : fom.this.z.o();
            }

            @Override
            public List<fow.b> b() {
               return fom.this.z.o();
            }
         };
      }

      private static ww a(fef<fow.b> $$0) {
         return $$0.a().b() ? wh.a($$0.d(), d) : $$0.d();
      }
   }
}
