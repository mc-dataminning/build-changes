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

public class fhj extends fct {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vd p = vd.c("selectWorld.gameMode");
   static final vd q = vd.c("selectWorld.enterName");
   static final vd r = vd.c("selectWorld.experiments");
   static final vd t = vd.c("selectWorld.allowCommands.info");
   private static final vd u = vd.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final ahd a = new ahd("textures/gui/header_separator.png");
   public static final ahd b = new ahd("textures/gui/footer_separator.png");
   public static final ahd c = new ahd("textures/gui/light_dirt_background.png");
   final fhs x;
   private final eza y = new eza(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final elc A;
   @Nullable
   private final fct B;
   @Nullable
   private Path C;
   @Nullable
   private apn D;
   @Nullable
   private fah E;
   @Nullable
   private ezb F;

   public static void a(eva $$0, @Nullable fct $$1) {
      a($$0, u);
      apn $$2 = new apn(new apq($$0.ba()));
      ahy.c $$3 = a($$2, cuc.c);
      CompletableFuture<fhr> $$4 = ahy.a(
         $$3, $$0x -> new ahy.b<>(new fhj.a(new dpf(dph.a(), dyp.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fhr($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fhj($$0, $$1, $$4.join(), Optional.of(dyp.a), OptionalLong.empty()));
   }

   public static fhj a(eva $$0, @Nullable fct $$1, ctm $$2, fhr $$3, @Nullable Path $$4) {
      fhj $$5 = new fhj($$0, $$1, $$3, dyp.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fhs.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fhs.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fhs.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fhj(eva $$0, @Nullable fct $$1, fhr $$2, Optional<ahc<dyo>> $$3, OptionalLong $$4) {
      super(vd.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.ba();
      this.x = new fhs($$0.l().c(), $$2, $$3, $$4);
   }

   public fhs n() {
      return this.x;
   }

   @Override
   protected void aN_() {
      this.F = ezb.a(this.y, this.g).a(new fhj.b(), new fhj.d(), new fhj.c()).a();
      this.d(this.F);
      this.E = new fah().a(10);
      fah.b $$0 = this.E.d(2);
      $$0.a(ewy.a(vd.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(ewy.a(vc.e, $$0x -> this.C()).a());
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
         fag.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         fbb $$1 = new fbb(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(eva $$0, vd $$1) {
      $$0.d(new fbz($$1));
   }

   private void D() {
      fhr $$0 = this.x.k();
      dpe.b $$1 = $$0.d().a($$0.c());
      io<ahm> $$2 = $$0.e().a(ahm.c, $$1.b());
      Lifecycle $$3 = chn.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fht.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(egj.a $$0, io<ahm> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<egf.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.H();
         boolean $$4 = $$0 == egj.a.c;
         fhr $$5 = this.x.k();
         ctm $$6 = this.c($$4);
         egl $$7 = new egj($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private ctm c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cte $$2 = new cte();
         $$2.a(cte.l).a(false, null);
         return new ctm($$1, ctf.d, false, bjs.a, true, $$2, cuc.c);
      } else {
         return new ctm($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void aE_() {
      this.C();
   }

   @Override
   public void C() {
      this.f.a(this.B);
      this.H();
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, aui.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(ewm $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eyt & fap> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eyt & eyb & fap> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path E() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            ezf.c(this.f, this.x.c());
            this.C();
         }
      }

      return this.C;
   }

   void a(cuc $$0) {
      Pair<Path, apn> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fhm(this, (apn)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cuc $$0) {
      Pair<Path, apn> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fga((apn)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vd.c("dataPack.title")));
      }
   }

   private void a(apn $$0, boolean $$1, Consumer<cuc> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cuc $$5 = new cuc(new csw($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         chl $$6 = $$0.e();
         if (chn.a($$6) && $$1) {
            this.f.a(new fhi($$0.f(), $$3x -> {
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

   private void a(apn $$0, cuc $$1, Consumer<cuc> $$2) {
      this.f.d(new fbz(vd.c("dataPack.validation.working")));
      ahy.c $$3 = a($$0, $$1);
      ahy.<fhj.a, fhr>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ke.aK).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ke.at).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fhr $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = ahb.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dpf.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = ahb.a(JsonOps.INSTANCE, $$0x.c());
                  dpf $$5 = (dpf)$$3x.flatMap($$1xx -> dpf.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new ahy.b<>(new fhj.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fhr($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new fbm($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cuc.c);
                  }
               }, vd.c("dataPack.validation.failed"), vc.a, vd.c("dataPack.validation.back"), vd.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static ahy.c a(apn $$0, cuc $$1) {
      ahy.d $$2 = new ahy.d($$0, $$1, false, true);
      return new ahy.c($$2, dt.a.c, 2);
   }

   private void H() {
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

   private Optional<egf.c> I() {
      String $$0 = this.x.c();

      try {
         egf.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(egd.j);
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

      ezf.c(this.f, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eva $$1) {
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
         ezf.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, apn> c(cuc $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = apq.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dpf a, cuc b) {
   }

   class b extends eyy {
      private static final vd c = vd.c("createWorld.tab.game.title");
      private static final vd d = vd.c("selectWorld.allowCommands");
      private final exh e;

      b() {
         super(c);
         fah.b $$0 = this.a.b(8).d(1);
         fal $$1 = $$0.b();
         this.e = new exh(fhj.this.i, 208, 20, vd.c("selectWorld.enterName"));
         this.e.a(fhj.this.x.b());
         this.e.b(fhj.this.x::a);
         fhj.this.x.a($$0x -> this.e.a(eyj.a(vd.a("selectWorld.targetFolder", vd.b($$0x.c()).a(n.u)))));
         fhj.this.c(this.e);
         $$0.a(fae.a(fhj.this.i, this.e, fhj.q), $$0.b().b());
         exf<fhs.a> $$2 = $$0.a(exf.<fhs.a>a($$0x -> $$0x.f).a(fhs.a.a, fhs.a.b, fhs.a.c).a(0, 0, 210, 20, fhj.p, ($$0x, $$1x) -> fhj.this.x.a($$1x)), $$1);
         fhj.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(eyj.a($$1x.d().a()));
         });
         exf<bjs> $$3 = $$0.a(exf.a(bjs::b).a(bjs.values()).a(0, 0, 210, 20, vd.c("options.difficulty"), ($$0x, $$1x) -> fhj.this.x.a($$1x)), $$1);
         fhj.this.x.a($$1x -> {
            $$3.a(fhj.this.x.e());
            $$3.j = !fhj.this.x.f();
            $$3.a(eyj.a(fhj.this.x.e().d()));
         });
         exf<Boolean> $$4 = $$0.a(exf.e().a($$0x -> eyj.a(fhj.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fhj.this.x.a($$1x)));
         fhj.this.x.a($$1x -> {
            $$4.a(fhj.this.x.g());
            $$4.j = !fhj.this.x.l() && !fhj.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(ewy.a(fhj.r, $$0x -> fhj.this.a(fhj.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends eyy {
      private static final vd c = vd.c("createWorld.tab.more.title");
      private static final vd d = vd.c("selectWorld.gameRules");
      private static final vd e = vd.c("selectWorld.dataPacks");

      c() {
         super(c);
         fah.b $$0 = this.a.b(8).d(1);
         $$0.a(ewy.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ewy.a(fhj.r, $$0x -> fhj.this.a(fhj.this.x.k().g())).a(210).a());
         $$0.a(ewy.a(e, $$0x -> fhj.this.b(fhj.this.x.k().g())).a(210).a());
      }

      private void b() {
         fhj.this.f.a(new fhk(fhj.this.x.q().b(), $$0 -> {
            fhj.this.f.a(fhj.this);
            $$0.ifPresent(fhj.this.x::a);
         }));
      }
   }

   class d extends eyy {
      private static final vd c = vd.c("createWorld.tab.world.title");
      private static final vd d = vd.c("generator.minecraft.amplified.info");
      private static final vd e = vd.c("selectWorld.mapFeatures");
      private static final vd f = vd.c("selectWorld.mapFeatures.info");
      private static final vd g = vd.c("selectWorld.bonusItems");
      private static final vd h = vd.c("selectWorld.enterSeed");
      static final vd i = vd.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final exh k;
      private final ewy l;

      d() {
         super(c);
         fah.b $$0 = this.a.a(10).b(8).d(2);
         exf<fhs.b> $$1 = $$0.a(
            exf.<fhs.b>a(fhs.b::a).a(this.c()).a(fhj.d::a).a(0, 0, 150, 20, vd.c("selectWorld.mapType"), ($$0x, $$1x) -> fhj.this.x.a($$1x))
         );
         $$1.a(fhj.this.x.m());
         fhj.this.x.a($$1x -> {
            fhs.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(eyj.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fhj.this.x.m().c() != null;
         });
         this.l = $$0.a(ewy.a(vd.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fhj.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new exh(fhj.this.i, 308, 20, vd.c("selectWorld.enterSeed")) {
            @Override
            protected vr aK_() {
               return super.aK_().b(vc.s).b(fhj.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fhj.this.x.h());
         this.k.b($$0x -> fhj.this.x.b(this.k.a()));
         $$0.a(fae.a(fhj.this.i, this.k, h), 2);
         fhq.a $$2 = fhq.a(310);
         $$2.a(e, fhj.this.x::i, fhj.this.x::b).a(() -> !fhj.this.x.l()).a(f);
         $$2.a(g, fhj.this.x::j, fhj.this.x::c).a(() -> !fhj.this.x.f() && !fhj.this.x.l());
         fhq $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fhj.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fho $$0 = fhj.this.x.n();
         if ($$0 != null) {
            fhj.this.f.a($$0.createEditScreen(fhj.this, fhj.this.x.k()));
         }
      }

      private exf.c<fhs.b> c() {
         return new exf.c<fhs.b>() {
            @Override
            public List<fhs.b> a() {
               return exf.a.getAsBoolean() ? fhj.this.x.p() : fhj.this.x.o();
            }

            @Override
            public List<fhs.b> b() {
               return fhj.this.x.o();
            }
         };
      }

      private static vr a(exf<fhs.b> $$0) {
         return $$0.a().b() ? vc.a($$0.d(), d) : $$0.d();
      }
   }
}
