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

public class flv extends fhf {
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
   final fme x;
   private final fdj y = new fdj(this::c, $$1x -> this.e($$1x));
   private boolean z;
   private final eph A;
   @Nullable
   private final fhf B;
   @Nullable
   private Path C;
   @Nullable
   private arz D;
   @Nullable
   private fes E;
   @Nullable
   private fdk F;

   public static void a(ezg $$0, @Nullable fhf $$1) {
      a($$0, u);
      arz $$2 = new arz(new asc($$0.be()));
      akc.c $$3 = a($$2, cxt.c);
      CompletableFuture<fmd> $$4 = akc.a(
         $$3, $$0x -> new akc.b<>(new flv.a(new dti(dtk.a(), ecs.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fmd($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new flv($$0, $$1, $$4.join(), Optional.of(ecs.a), OptionalLong.empty()));
   }

   public static flv a(ezg $$0, @Nullable fhf $$1, cxd $$2, fmd $$3, @Nullable Path $$4) {
      flv $$5 = new flv($$0, $$1, $$3, ecs.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fme.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fme.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fme.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private flv(ezg $$0, @Nullable fhf $$1, fmd $$2, Optional<ajg<ecr>> $$3, OptionalLong $$4) {
      super(vu.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.be();
      this.x = new fme($$0.m().c(), $$2, $$3, $$4);
   }

   public fme o() {
      return this.x;
   }

   @Override
   protected void aO_() {
      this.F = fdk.a(this.y, this.g).a(new flv.b(), new flv.d(), new flv.c()).a();
      this.c(this.F);
      this.E = new fes().a(10);
      fes.b $$0 = this.E.d(2);
      $$0.a(fbg.a(vu.c("selectWorld.create"), $$0x -> this.H()).a());
      $$0.a(fbg.a(vt.e, $$0x -> this.E()).a());
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
         fer.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         ffm $$1 = new ffm(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(ezg $$0, vu $$1) {
      $$0.d(new fgl($$1));
   }

   private void H() {
      fmd $$0 = this.x.k();
      dth.b $$1 = $$0.d().a($$0.c());
      is<ajq> $$2 = $$0.e().a(ajq.c, $$1.b());
      Lifecycle $$3 = clh.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fmf.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eko.a $$0, is<ajq> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<ekk.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eko.a.c;
         fmd $$5 = this.x.k();
         cxd $$6 = this.c($$4);
         ekq $$7 = new eko($$6, $$5.b(), $$0, $$2);
         this.f.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cxd c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cwv $$2 = new cwv();
         $$2.a(cwv.l).a(false, null);
         return new cxd($$1, cww.d, false, bmz.a, true, $$2, cxt.c);
      } else {
         return new cxd($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, aww.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(fat $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends fdc & ffa> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fdc & fcj & ffa> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            fdo.c(this.f, this.x.c());
            this.E();
         }
      }

      return this.C;
   }

   void a(cxt $$0) {
      Pair<Path, arz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fly(this, (arz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cxt $$0) {
      Pair<Path, arz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fkm((arz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vu.c("dataPack.title")));
      }
   }

   private void a(arz $$0, boolean $$1, Consumer<cxt> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cxt $$5 = new cxt(new cwn($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         clf $$6 = $$0.e();
         if (clh.a($$6) && $$1) {
            this.f.a(new flu($$0.f(), $$3x -> {
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

   private void a(arz $$0, cxt $$1, Consumer<cxt> $$2) {
      this.f.d(new fgl(vu.c("dataPack.validation.working")));
      akc.c $$3 = a($$0, $$1);
      akc.<flv.a, fmd>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(kj.aL).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(kj.au).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fmd $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = ajf.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dti.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = ajf.a(JsonOps.INSTANCE, $$0x.c());
                  dti $$5 = (dti)$$3x.flatMap($$1xx -> dti.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new akc.b<>(new flv.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fmd($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new ffx($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cxt.c);
                  }
               }, vu.c("dataPack.validation.failed"), vt.a, vu.c("dataPack.validation.back"), vu.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static akc.c a(arz $$0, cxt $$1) {
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

   private Optional<ekk.c> K() {
      String $$0 = this.x.c();

      try {
         ekk.c $$1 = this.f.m().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(eki.j);
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

      fdo.c(this.f, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ezg $$1) {
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
         fdo.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, arz> c(cxt $$0) {
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

   static record a(dti a, cxt b) {
   }

   class b extends fdh {
      private static final vu c = vu.c("createWorld.tab.game.title");
      private static final vu d = vu.c("selectWorld.allowCommands.new");
      private final fbp e;

      b() {
         super(c);
         fes.b $$0 = this.a.b(8).d(1);
         few $$1 = $$0.b();
         this.e = new fbp(flv.this.i, 208, 20, vu.c("selectWorld.enterName"));
         this.e.a(flv.this.x.b());
         this.e.b(flv.this.x::a);
         flv.this.x.a($$0x -> this.e.a(fcr.a(vu.a("selectWorld.targetFolder", vu.b($$0x.c()).a(n.u)))));
         flv.this.b(this.e);
         $$0.a(fep.a(flv.this.i, this.e, flv.q), $$0.b().b());
         fbn<fme.a> $$2 = $$0.a(fbn.<fme.a>a($$0x -> $$0x.f).a(fme.a.a, fme.a.b, fme.a.c).a(0, 0, 210, 20, flv.p, ($$0x, $$1x) -> flv.this.x.a($$1x)), $$1);
         flv.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fcr.a($$1x.d().a()));
         });
         fbn<bmz> $$3 = $$0.a(fbn.a(bmz::b).a(bmz.values()).a(0, 0, 210, 20, vu.c("options.difficulty"), ($$0x, $$1x) -> flv.this.x.a($$1x)), $$1);
         flv.this.x.a($$1x -> {
            $$3.a(flv.this.x.e());
            $$3.j = !flv.this.x.f();
            $$3.a(fcr.a(flv.this.x.e().d()));
         });
         fbn<Boolean> $$4 = $$0.a(fbn.e().a($$0x -> fcr.a(flv.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> flv.this.x.a($$1x)));
         flv.this.x.a($$1x -> {
            $$4.a(flv.this.x.g());
            $$4.j = !flv.this.x.l() && !flv.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(fbg.a(flv.r, $$0x -> flv.this.a(flv.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends fdh {
      private static final vu c = vu.c("createWorld.tab.more.title");
      private static final vu d = vu.c("selectWorld.gameRules");
      private static final vu e = vu.c("selectWorld.dataPacks");

      c() {
         super(c);
         fes.b $$0 = this.a.b(8).d(1);
         $$0.a(fbg.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fbg.a(flv.r, $$0x -> flv.this.a(flv.this.x.k().g())).a(210).a());
         $$0.a(fbg.a(e, $$0x -> flv.this.b(flv.this.x.k().g())).a(210).a());
      }

      private void b() {
         flv.this.f.a(new flw(flv.this.x.q().b(), $$0 -> {
            flv.this.f.a(flv.this);
            $$0.ifPresent(flv.this.x::a);
         }));
      }
   }

   class d extends fdh {
      private static final vu c = vu.c("createWorld.tab.world.title");
      private static final vu d = vu.c("generator.minecraft.amplified.info");
      private static final vu e = vu.c("selectWorld.mapFeatures");
      private static final vu f = vu.c("selectWorld.mapFeatures.info");
      private static final vu g = vu.c("selectWorld.bonusItems");
      private static final vu h = vu.c("selectWorld.enterSeed");
      static final vu i = vu.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fbp k;
      private final fbg l;

      d() {
         super(c);
         fes.b $$0 = this.a.a(10).b(8).d(2);
         fbn<fme.b> $$1 = $$0.a(
            fbn.<fme.b>a(fme.b::a).a(this.c()).a(flv.d::a).a(0, 0, 150, 20, vu.c("selectWorld.mapType"), ($$0x, $$1x) -> flv.this.x.a($$1x))
         );
         $$1.a(flv.this.x.m());
         flv.this.x.a($$1x -> {
            fme.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fcr.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = flv.this.x.m().c() != null;
         });
         this.l = $$0.a(fbg.a(vu.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         flv.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fbp(flv.this.i, 308, 20, vu.c("selectWorld.enterSeed")) {
            @Override
            protected wi aL_() {
               return super.aL_().b(vt.t).b(flv.d.i);
            }
         };
         this.k.c(i);
         this.k.a(flv.this.x.h());
         this.k.b($$0x -> flv.this.x.b(this.k.a()));
         $$0.a(fep.a(flv.this.i, this.k, h), 2);
         fmc.a $$2 = fmc.a(310);
         $$2.a(e, flv.this.x::i, flv.this.x::b).a(() -> !flv.this.x.l()).a(f);
         $$2.a(g, flv.this.x::j, flv.this.x::c).a(() -> !flv.this.x.f() && !flv.this.x.l());
         fmc $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         flv.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fma $$0 = flv.this.x.n();
         if ($$0 != null) {
            flv.this.f.a($$0.createEditScreen(flv.this, flv.this.x.k()));
         }
      }

      private fbn.c<fme.b> c() {
         return new fbn.c<fme.b>() {
            @Override
            public List<fme.b> a() {
               return fbn.a.getAsBoolean() ? flv.this.x.p() : flv.this.x.o();
            }

            @Override
            public List<fme.b> b() {
               return flv.this.x.o();
            }
         };
      }

      private static wi a(fbn<fme.b> $$0) {
         return $$0.a().b() ? vt.a($$0.d(), d) : $$0.d();
      }
   }
}
