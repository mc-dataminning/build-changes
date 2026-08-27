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

public class flx extends fhh {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vu p = vu.c("selectWorld.gameMode");
   static final vu q = vu.c("selectWorld.enterName");
   static final vu r = vu.c("selectWorld.experiments");
   static final vu t = vu.c("selectWorld.allowCommands.info");
   private static final vu u = vu.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final ajh a = new ajh("textures/gui/header_separator.png");
   public static final ajh b = new ajh("textures/gui/footer_separator.png");
   public static final ajh c = new ajh("textures/gui/light_dirt_background.png");
   final fmg x;
   private final fdl y = new fdl(this::c, $$1x -> this.e($$1x));
   private boolean z;
   private final epj A;
   @Nullable
   private final fhh B;
   @Nullable
   private Path C;
   @Nullable
   private arz D;
   @Nullable
   private feu E;
   @Nullable
   private fdm F;

   public static void a(ezi $$0, @Nullable fhh $$1) {
      a($$0, u);
      arz $$2 = new arz(new asc($$0.be()));
      akc.c $$3 = a($$2, cxv.c);
      CompletableFuture<fmf> $$4 = akc.a(
         $$3, $$0x -> new akc.b<>(new flx.a(new dtk(dtm.a(), ecu.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fmf($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new flx($$0, $$1, $$4.join(), Optional.of(ecu.a), OptionalLong.empty()));
   }

   public static flx a(ezi $$0, @Nullable fhh $$1, cxf $$2, fmf $$3, @Nullable Path $$4) {
      flx $$5 = new flx($$0, $$1, $$3, ecu.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fmg.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fmg.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fmg.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private flx(ezi $$0, @Nullable fhh $$1, fmf $$2, Optional<ajg<ect>> $$3, OptionalLong $$4) {
      super(vu.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.be();
      this.x = new fmg($$0.m().c(), $$2, $$3, $$4);
   }

   public fmg o() {
      return this.x;
   }

   @Override
   protected void aO_() {
      this.F = fdm.a(this.y, this.g).a(new flx.b(), new flx.d(), new flx.c()).a();
      this.c(this.F);
      this.E = new feu().a(10);
      feu.b $$0 = this.E.d(2);
      $$0.a(fbi.a(vu.c("selectWorld.create"), $$0x -> this.H()).a());
      $$0.a(fbi.a(vt.e, $$0x -> this.E()).a());
      this.E.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.F.a(0, false);
      this.x.a();
      this.c();
   }

   @Override
   protected void aF_() {
   }

   @Override
   public void c() {
      if (this.F != null && this.E != null) {
         this.F.a(this.g);
         this.F.a();
         this.E.a();
         fet.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         ffo $$1 = new ffo(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(ezi $$0, vu $$1) {
      $$0.d(new fgn($$1));
   }

   private void H() {
      fmf $$0 = this.x.k();
      dtj.b $$1 = $$0.d().a($$0.c());
      is<ajq> $$2 = $$0.e().a(ajq.c, $$1.b());
      Lifecycle $$3 = clj.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fmh.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(ekq.a $$0, is<ajq> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<ekm.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == ekq.a.c;
         fmf $$5 = this.x.k();
         cxf $$6 = this.c($$4);
         eks $$7 = new ekq($$6, $$5.b(), $$0, $$2);
         this.f.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cxf c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cwx $$2 = new cwx();
         $$2.a(cwx.l).a(false, null);
         return new cxf($$1, cwy.d, false, bna.a, true, $$2, cxv.c);
      } else {
         return new cxf($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, aww.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(fav $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends fde & ffc> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fde & fcl & ffc> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            fdq.c(this.f, this.x.c());
            this.E();
         }
      }

      return this.C;
   }

   void a(cxv $$0) {
      Pair<Path, arz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fma(this, (arz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cxv $$0) {
      Pair<Path, arz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fko((arz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vu.c("dataPack.title")));
      }
   }

   private void a(arz $$0, boolean $$1, Consumer<cxv> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cxv $$5 = new cxv(new cwp($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         clh $$6 = $$0.e();
         if (clj.a($$6) && $$1) {
            this.f.a(new flw($$0.f(), $$3x -> {
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

   private void a(arz $$0, cxv $$1, Consumer<cxv> $$2) {
      this.f.d(new fgn(vu.c("dataPack.validation.working")));
      akc.c $$3 = a($$0, $$1);
      akc.<flx.a, fmf>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(kj.aL).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(kj.au).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fmf $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dtk.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dtk $$5 = (dtk)$$3x.flatMap($$1xx -> dtk.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new akc.b<>(new flx.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fmf($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new ffz($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cxv.c);
                  }
               }, vu.c("dataPack.validation.failed"), vt.a, vu.c("dataPack.validation.back"), vu.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static akc.c a(arz $$0, cxv $$1) {
      akc.d $$2 = new akc.d($$0, $$1, false, true);
      return new akc.c($$2, dv.a.c, 2);
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

   private Optional<ekm.c> K() {
      String $$0 = this.x.c();

      try {
         ekm.c $$1 = this.f.m().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(ekk.j);
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

      fdq.c(this.f, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ezi $$1) {
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
         fdq.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, arz> c(cxv $$0) {
      Path $$1 = this.I();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = asc.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dtk a, cxv b) {
   }

   class b extends fdj {
      private static final vu c = vu.c("createWorld.tab.game.title");
      private static final vu d = vu.c("selectWorld.allowCommands.new");
      private final fbr e;

      b() {
         super(c);
         feu.b $$0 = this.a.b(8).d(1);
         fey $$1 = $$0.b();
         this.e = new fbr(flx.this.i, 208, 20, vu.c("selectWorld.enterName"));
         this.e.a(flx.this.x.b());
         this.e.b(flx.this.x::a);
         flx.this.x.a($$0x -> this.e.a(fct.a(vu.a("selectWorld.targetFolder", vu.b($$0x.c()).a(n.u)))));
         flx.this.b(this.e);
         $$0.a(fer.a(flx.this.i, this.e, flx.q), $$0.b().b());
         fbp<fmg.a> $$2 = $$0.a(fbp.<fmg.a>a($$0x -> $$0x.f).a(fmg.a.a, fmg.a.b, fmg.a.c).a(0, 0, 210, 20, flx.p, ($$0x, $$1x) -> flx.this.x.a($$1x)), $$1);
         flx.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fct.a($$1x.d().a()));
         });
         fbp<bna> $$3 = $$0.a(fbp.a(bna::b).a(bna.values()).a(0, 0, 210, 20, vu.c("options.difficulty"), ($$0x, $$1x) -> flx.this.x.a($$1x)), $$1);
         flx.this.x.a($$1x -> {
            $$3.a(flx.this.x.e());
            $$3.j = !flx.this.x.f();
            $$3.a(fct.a(flx.this.x.e().d()));
         });
         fbp<Boolean> $$4 = $$0.a(fbp.e().a($$0x -> fct.a(flx.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> flx.this.x.a($$1x)));
         flx.this.x.a($$1x -> {
            $$4.a(flx.this.x.g());
            $$4.j = !flx.this.x.l() && !flx.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(fbi.a(flx.r, $$0x -> flx.this.a(flx.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends fdj {
      private static final vu c = vu.c("createWorld.tab.more.title");
      private static final vu d = vu.c("selectWorld.gameRules");
      private static final vu e = vu.c("selectWorld.dataPacks");

      c() {
         super(c);
         feu.b $$0 = this.a.b(8).d(1);
         $$0.a(fbi.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fbi.a(flx.r, $$0x -> flx.this.a(flx.this.x.k().g())).a(210).a());
         $$0.a(fbi.a(e, $$0x -> flx.this.b(flx.this.x.k().g())).a(210).a());
      }

      private void b() {
         flx.this.f.a(new fly(flx.this.x.q().b(), $$0 -> {
            flx.this.f.a(flx.this);
            $$0.ifPresent(flx.this.x::a);
         }));
      }
   }

   class d extends fdj {
      private static final vu c = vu.c("createWorld.tab.world.title");
      private static final vu d = vu.c("generator.minecraft.amplified.info");
      private static final vu e = vu.c("selectWorld.mapFeatures");
      private static final vu f = vu.c("selectWorld.mapFeatures.info");
      private static final vu g = vu.c("selectWorld.bonusItems");
      private static final vu h = vu.c("selectWorld.enterSeed");
      static final vu i = vu.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fbr k;
      private final fbi l;

      d() {
         super(c);
         feu.b $$0 = this.a.a(10).b(8).d(2);
         fbp<fmg.b> $$1 = $$0.a(
            fbp.<fmg.b>a(fmg.b::a).a(this.c()).a(flx.d::a).a(0, 0, 150, 20, vu.c("selectWorld.mapType"), ($$0x, $$1x) -> flx.this.x.a($$1x))
         );
         $$1.a(flx.this.x.m());
         flx.this.x.a($$1x -> {
            fmg.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fct.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = flx.this.x.m().c() != null;
         });
         this.l = $$0.a(fbi.a(vu.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         flx.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fbr(flx.this.i, 308, 20, vu.c("selectWorld.enterSeed")) {
            @Override
            protected wi aL_() {
               return super.aL_().b(vt.t).b(flx.d.i);
            }
         };
         this.k.c(i);
         this.k.a(flx.this.x.h());
         this.k.b($$0x -> flx.this.x.b(this.k.a()));
         $$0.a(fer.a(flx.this.i, this.k, h), 2);
         fme.a $$2 = fme.a(310);
         $$2.a(e, flx.this.x::i, flx.this.x::b).a(() -> !flx.this.x.l()).a(f);
         $$2.a(g, flx.this.x::j, flx.this.x::c).a(() -> !flx.this.x.f() && !flx.this.x.l());
         fme $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         flx.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fmc $$0 = flx.this.x.n();
         if ($$0 != null) {
            flx.this.f.a($$0.createEditScreen(flx.this, flx.this.x.k()));
         }
      }

      private fbp.c<fmg.b> c() {
         return new fbp.c<fmg.b>() {
            @Override
            public List<fmg.b> a() {
               return fbp.a.getAsBoolean() ? flx.this.x.p() : flx.this.x.o();
            }

            @Override
            public List<fmg.b> b() {
               return flx.this.x.o();
            }
         };
      }

      private static wi a(fbp<fmg.b> $$0) {
         return $$0.a().b() ? vt.a($$0.d(), d) : $$0.d();
      }
   }
}
