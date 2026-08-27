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

public class fhq extends fda {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vf p = vf.c("selectWorld.gameMode");
   static final vf q = vf.c("selectWorld.enterName");
   static final vf r = vf.c("selectWorld.experiments");
   static final vf t = vf.c("selectWorld.allowCommands.info");
   private static final vf u = vf.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final ahg a = new ahg("textures/gui/header_separator.png");
   public static final ahg b = new ahg("textures/gui/footer_separator.png");
   public static final ahg c = new ahg("textures/gui/light_dirt_background.png");
   final fhz x;
   private final ezh y = new ezh(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final eli A;
   @Nullable
   private final fda B;
   @Nullable
   private Path C;
   @Nullable
   private aps D;
   @Nullable
   private fao E;
   @Nullable
   private ezi F;

   public static void a(evh $$0, @Nullable fda $$1) {
      a($$0, u);
      aps $$2 = new aps(new apv($$0.bb()));
      aib.c $$3 = a($$2, cui.c);
      CompletableFuture<fhy> $$4 = aib.a(
         $$3, $$0x -> new aib.b<>(new fhq.a(new dpl(dpn.a(), dyv.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fhy($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fhq($$0, $$1, $$4.join(), Optional.of(dyv.a), OptionalLong.empty()));
   }

   public static fhq a(evh $$0, @Nullable fda $$1, cts $$2, fhy $$3, @Nullable Path $$4) {
      fhq $$5 = new fhq($$0, $$1, $$3, dyv.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fhz.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fhz.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fhz.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fhq(evh $$0, @Nullable fda $$1, fhy $$2, Optional<ahf<dyu>> $$3, OptionalLong $$4) {
      super(vf.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bb();
      this.x = new fhz($$0.l().c(), $$2, $$3, $$4);
   }

   public fhz n() {
      return this.x;
   }

   @Override
   protected void aN_() {
      this.F = ezi.a(this.y, this.g).a(new fhq.b(), new fhq.d(), new fhq.c()).a();
      this.d(this.F);
      this.E = new fao().a(10);
      fao.b $$0 = this.E.d(2);
      $$0.a(exf.a(vf.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(exf.a(ve.e, $$0x -> this.D()).a());
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
         fan.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         fbi $$1 = new fbi(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(evh $$0, vf $$1) {
      $$0.d(new fcg($$1));
   }

   private void E() {
      fhy $$0 = this.x.k();
      dpk.b $$1 = $$0.d().a($$0.c());
      io<ahp> $$2 = $$0.e().a(ahp.c, $$1.b());
      Lifecycle $$3 = cht.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fia.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(egp.a $$0, io<ahp> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<egl.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.I();
         boolean $$4 = $$0 == egp.a.c;
         fhy $$5 = this.x.k();
         cts $$6 = this.c($$4);
         egr $$7 = new egp($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cts c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         ctk $$2 = new ctk();
         $$2.a(ctk.l).a(false, null);
         return new cts($$1, ctl.d, false, bjx.a, true, $$2, cui.c);
      } else {
         return new cts($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
         this.E();
         return true;
      }
   }

   @Override
   public void aE_() {
      this.D();
   }

   public void D() {
      this.f.a(this.B);
      this.I();
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, aun.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(ewt $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eza & faw> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eza & eyi & faw> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path H() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            ezm.c(this.f, this.x.c());
            this.D();
         }
      }

      return this.C;
   }

   void a(cui $$0) {
      Pair<Path, aps> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fht(this, (aps)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cui $$0) {
      Pair<Path, aps> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fgh((aps)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vf.c("dataPack.title")));
      }
   }

   private void a(aps $$0, boolean $$1, Consumer<cui> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cui $$5 = new cui(new ctc($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         chr $$6 = $$0.e();
         if (cht.a($$6) && $$1) {
            this.f.a(new fhp($$0.f(), $$3x -> {
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

   private void a(aps $$0, cui $$1, Consumer<cui> $$2) {
      this.f.d(new fcg(vf.c("dataPack.validation.working")));
      aib.c $$3 = a($$0, $$1);
      aib.<fhq.a, fhy>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ke.aK).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ke.at).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fhy $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = ahe.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dpl.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = ahe.a(JsonOps.INSTANCE, $$0x.c());
                  dpl $$5 = (dpl)$$3x.flatMap($$1xx -> dpl.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new aib.b<>(new fhq.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fhy($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new fbt($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cui.c);
                  }
               }, vf.c("dataPack.validation.failed"), ve.a, vf.c("dataPack.validation.back"), vf.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static aib.c a(aps $$0, cui $$1) {
      aib.d $$2 = new aib.d($$0, $$1, false, true);
      return new aib.c($$2, dt.a.c, 2);
   }

   private void I() {
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

   private Optional<egl.c> J() {
      String $$0 = this.x.c();

      try {
         egl.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(egj.j);
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

      ezm.c(this.f, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, evh $$1) {
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
         ezm.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aps> c(cui $$0) {
      Path $$1 = this.H();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = apv.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dpl a, cui b) {
   }

   class b extends ezf {
      private static final vf c = vf.c("createWorld.tab.game.title");
      private static final vf d = vf.c("selectWorld.allowCommands");
      private final exo e;

      b() {
         super(c);
         fao.b $$0 = this.a.b(8).d(1);
         fas $$1 = $$0.b();
         this.e = new exo(fhq.this.i, 208, 20, vf.c("selectWorld.enterName"));
         this.e.a(fhq.this.x.b());
         this.e.b(fhq.this.x::a);
         fhq.this.x.a($$0x -> this.e.a(eyq.a(vf.a("selectWorld.targetFolder", vf.b($$0x.c()).a(n.u)))));
         fhq.this.c(this.e);
         $$0.a(fal.a(fhq.this.i, this.e, fhq.q), $$0.b().b());
         exm<fhz.a> $$2 = $$0.a(exm.<fhz.a>a($$0x -> $$0x.f).a(fhz.a.a, fhz.a.b, fhz.a.c).a(0, 0, 210, 20, fhq.p, ($$0x, $$1x) -> fhq.this.x.a($$1x)), $$1);
         fhq.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(eyq.a($$1x.d().a()));
         });
         exm<bjx> $$3 = $$0.a(exm.a(bjx::b).a(bjx.values()).a(0, 0, 210, 20, vf.c("options.difficulty"), ($$0x, $$1x) -> fhq.this.x.a($$1x)), $$1);
         fhq.this.x.a($$1x -> {
            $$3.a(fhq.this.x.e());
            $$3.j = !fhq.this.x.f();
            $$3.a(eyq.a(fhq.this.x.e().d()));
         });
         exm<Boolean> $$4 = $$0.a(exm.e().a($$0x -> eyq.a(fhq.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fhq.this.x.a($$1x)));
         fhq.this.x.a($$1x -> {
            $$4.a(fhq.this.x.g());
            $$4.j = !fhq.this.x.l() && !fhq.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(exf.a(fhq.r, $$0x -> fhq.this.a(fhq.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends ezf {
      private static final vf c = vf.c("createWorld.tab.more.title");
      private static final vf d = vf.c("selectWorld.gameRules");
      private static final vf e = vf.c("selectWorld.dataPacks");

      c() {
         super(c);
         fao.b $$0 = this.a.b(8).d(1);
         $$0.a(exf.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(exf.a(fhq.r, $$0x -> fhq.this.a(fhq.this.x.k().g())).a(210).a());
         $$0.a(exf.a(e, $$0x -> fhq.this.b(fhq.this.x.k().g())).a(210).a());
      }

      private void b() {
         fhq.this.f.a(new fhr(fhq.this.x.q().b(), $$0 -> {
            fhq.this.f.a(fhq.this);
            $$0.ifPresent(fhq.this.x::a);
         }));
      }
   }

   class d extends ezf {
      private static final vf c = vf.c("createWorld.tab.world.title");
      private static final vf d = vf.c("generator.minecraft.amplified.info");
      private static final vf e = vf.c("selectWorld.mapFeatures");
      private static final vf f = vf.c("selectWorld.mapFeatures.info");
      private static final vf g = vf.c("selectWorld.bonusItems");
      private static final vf h = vf.c("selectWorld.enterSeed");
      static final vf i = vf.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final exo k;
      private final exf l;

      d() {
         super(c);
         fao.b $$0 = this.a.a(10).b(8).d(2);
         exm<fhz.b> $$1 = $$0.a(
            exm.<fhz.b>a(fhz.b::a).a(this.c()).a(fhq.d::a).a(0, 0, 150, 20, vf.c("selectWorld.mapType"), ($$0x, $$1x) -> fhq.this.x.a($$1x))
         );
         $$1.a(fhq.this.x.m());
         fhq.this.x.a($$1x -> {
            fhz.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(eyq.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fhq.this.x.m().c() != null;
         });
         this.l = $$0.a(exf.a(vf.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fhq.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new exo(fhq.this.i, 308, 20, vf.c("selectWorld.enterSeed")) {
            @Override
            protected vt aK_() {
               return super.aK_().b(ve.s).b(fhq.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fhq.this.x.h());
         this.k.b($$0x -> fhq.this.x.b(this.k.a()));
         $$0.a(fal.a(fhq.this.i, this.k, h), 2);
         fhx.a $$2 = fhx.a(310);
         $$2.a(e, fhq.this.x::i, fhq.this.x::b).a(() -> !fhq.this.x.l()).a(f);
         $$2.a(g, fhq.this.x::j, fhq.this.x::c).a(() -> !fhq.this.x.f() && !fhq.this.x.l());
         fhx $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fhq.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fhv $$0 = fhq.this.x.n();
         if ($$0 != null) {
            fhq.this.f.a($$0.createEditScreen(fhq.this, fhq.this.x.k()));
         }
      }

      private exm.c<fhz.b> c() {
         return new exm.c<fhz.b>() {
            @Override
            public List<fhz.b> a() {
               return exm.a.getAsBoolean() ? fhq.this.x.p() : fhq.this.x.o();
            }

            @Override
            public List<fhz.b> b() {
               return fhq.this.x.o();
            }
         };
      }

      private static vt a(exm<fhz.b> $$0) {
         return $$0.a().b() ? ve.a($$0.d(), d) : $$0.d();
      }
   }
}
