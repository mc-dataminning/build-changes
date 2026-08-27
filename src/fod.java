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

public class fod extends fjo {
   private static final int c = 1;
   private static final int d = 210;
   private static final Logger o = LogUtils.getLogger();
   private static final String p = "mcworld-";
   static final wg q = wg.c("selectWorld.gameMode");
   static final wg r = wg.c("selectWorld.enterName");
   static final wg s = wg.c("selectWorld.experiments");
   static final wg u = wg.c("selectWorld.allowCommands.info");
   private static final wg v = wg.c("createWorld.preparing");
   private static final int w = 10;
   private static final int x = 8;
   public static final ajt a = new ajt("textures/gui/header_separator.png");
   public static final ajt b = new ajt("textures/gui/footer_separator.png");
   private final fhc y = new fhc(this);
   final fom z;
   private final ffs A = new ffs(this::c, $$1x -> this.e($$1x));
   private boolean B;
   private final erq C;
   @Nullable
   private final fjo D;
   @Nullable
   private Path E;
   @Nullable
   private asn F;
   @Nullable
   private fft G;

   public static void a(fbp $$0, @Nullable fjo $$1) {
      a($$0, v);
      asn $$2 = new asn(new asq($$0.be()));
      ako.c $$3 = a($$2, czr.c);
      CompletableFuture<fol> $$4 = ako.a(
         $$3, $$0x -> new ako.b<>(new fod.a(new dvn(dvp.a(), eex.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fol($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fod($$0, $$1, $$4.join(), Optional.of(eex.a), OptionalLong.empty()));
   }

   public static fod a(fbp $$0, @Nullable fjo $$1, czb $$2, fol $$3, @Nullable Path $$4) {
      fod $$5 = new fod($$0, $$1, $$3, eex.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.B = true;
      $$5.z.a($$2.a());
      $$5.z.a($$2.e());
      $$5.z.a($$2.d());
      $$5.z.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.z.a(fom.a.b);
      } else if ($$2.b().h()) {
         $$5.z.a(fom.a.a);
      } else if ($$2.b().g()) {
         $$5.z.a(fom.a.c);
      }

      $$5.E = $$4;
      return $$5;
   }

   private fod(fbp $$0, @Nullable fjo $$1, fol $$2, Optional<ajs<eew>> $$3, OptionalLong $$4) {
      super(wg.c("selectWorld.create"));
      this.D = $$1;
      this.C = $$0.be();
      this.z = new fom($$0.m().c(), $$2, $$3, $$4);
   }

   public fom m() {
      return this.z;
   }

   @Override
   protected void aN_() {
      this.G = fft.a(this.A, this.k).a(new fod.b(), new fod.d(), new fod.c()).a();
      this.c(this.G);
      fhg $$0 = this.y.b(fhg.e().a(8));
      $$0.a(fdp.a(wg.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(fdp.a(wf.e, $$0x -> this.C()).a());
      this.y.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.G.a(0, false);
      this.z.a();
      this.c();
   }

   @Override
   protected void aD_() {
   }

   @Override
   public void c() {
      if (this.G != null) {
         this.G.a(this.k);
         this.G.b();
         int $$0 = this.G.G().c();
         fhv $$1 = new fhv(0, $$0, this.k, this.l - this.y.b() - $$0);
         this.A.a($$1);
         this.y.b($$0);
         this.y.a();
      }
   }

   private static void a(fbp $$0, wg $$1) {
      $$0.d(new fiu($$1));
   }

   private void D() {
      fol $$0 = this.z.k();
      dvm.b $$1 = $$0.d().a($$0.c());
      is<akc> $$2 = $$0.e().a(akc.c, $$1.b());
      Lifecycle $$3 = cmi.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.B && $$4 == Lifecycle.stable();
      fon.a(this.j, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(emv.a $$0, is<akc> $$1, Lifecycle $$2) {
      a(this.j, v);
      Optional<emr.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == emv.a.c;
         fol $$5 = this.z.k();
         czb $$6 = this.c($$4);
         emx $$7 = new emv($$6, $$5.b(), $$0, $$2);
         this.j.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private czb c(boolean $$0) {
      String $$1 = this.z.b().trim();
      if ($$0) {
         cyt $$2 = new cyt();
         $$2.a(cyt.l).a(false, null);
         return new czb($$1, cyu.d, false, bnx.a, true, $$2, czr.c);
      } else {
         return new czb($$1, this.z.d().e, this.z.f(), this.z.e(), this.z.g(), this.z.q(), this.z.k().g());
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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(b, 0, this.l - this.y.b() - 2, 0.0F, 0.0F, this.k, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fdc $$0) {
      this.a($$0, 0, this.y.c(), this.k, this.l);
   }

   @Override
   protected <T extends ffl & fhj> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends ffl & fes & fhj> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.E == null) {
         try {
            this.E = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            o.warn("Failed to create temporary dir", var2);
            ffx.c(this.j, this.z.c());
            this.C();
         }
      }

      return this.E;
   }

   void a(czr $$0) {
      Pair<Path, asn> $$1 = this.c($$0);
      if ($$1 != null) {
         this.j.a(new fog(this, (asn)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(czr $$0) {
      Pair<Path, asn> $$1 = this.c($$0);
      if ($$1 != null) {
         this.j.a(new fmu((asn)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wg.c("dataPack.title")));
      }
   }

   private void a(asn $$0, boolean $$1, Consumer<czr> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      czr $$5 = new czr(new cyl($$3, $$4), this.z.k().g().b());
      if (this.z.a($$5)) {
         this.j.a(this);
      } else {
         cmg $$6 = $$0.e();
         if (cmi.a($$6) && $$1) {
            this.j.a(new foc($$0.f(), $$3x -> {
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

   private void a(asn $$0, czr $$1, Consumer<czr> $$2) {
      this.j.d(new fiu(wg.c("dataPack.validation.working")));
      ako.c $$3 = a($$0, $$1);
      ako.<fod.a, fol>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ks.aM).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ks.av).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fol $$1x = this.z.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dvn.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dvn $$5 = (dvn)$$3x.flatMap($$1xx -> dvn.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", o::error));
                  return new ako.b<>(new fod.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fol($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.j
         )
         .thenAcceptAsync(this.z::a, this.j)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               o.warn("Failed to validate datapack", $$2x);
               this.j.a(new fig($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.z.k().g());
                  } else {
                     $$2.accept(czr.c);
                  }
               }, wg.c("dataPack.validation.failed"), wf.a, wg.c("dataPack.validation.back"), wg.c("dataPack.validation.reset")));
            } else {
               this.j.a(this);
            }

            return null;
         });
   }

   private static ako.c a(asn $$0, czr $$1) {
      ako.d $$2 = new ako.d($$0, $$1, false, true);
      return new ako.c($$2, dv.a.c, 2);
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

   private Optional<emr.c> I() {
      String $$0 = this.z.c();

      try {
         emr.c $$1 = this.j.m().e($$0);
         if (this.E == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.E)) {
               Path $$3 = $$1.a(emp.j);
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

      ffx.c(this.j, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fbp $$1) {
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
         ffx.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, asn> c(czr $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.F == null) {
            this.F = asq.a($$1, this.C);
            this.F.a();
         }

         this.F.a($$0.a().a());
         return Pair.of($$1, this.F);
      } else {
         return null;
      }
   }

   static record a(dvn a, czr b) {
   }

   class b extends ffq {
      private static final wg c = wg.c("createWorld.tab.game.title");
      private static final wg d = wg.c("selectWorld.allowCommands.new");
      private final fdy e;

      b() {
         super(c);
         fhb.b $$0 = this.a.b(8).d(1);
         fhf $$1 = $$0.b();
         this.e = new fdy(fod.this.m, 208, 20, wg.c("selectWorld.enterName"));
         this.e.a(fod.this.z.b());
         this.e.b(fod.this.z::a);
         fod.this.z.a($$0x -> this.e.a(ffa.a(wg.a("selectWorld.targetFolder", wg.b($$0x.c()).a(n.u)))));
         fod.this.b(this.e);
         $$0.a(fgy.a(fod.this.m, this.e, fod.r), $$0.b().b());
         fdw<fom.a> $$2 = $$0.a(fdw.<fom.a>a($$0x -> $$0x.f).a(fom.a.a, fom.a.b, fom.a.c).a(0, 0, 210, 20, fod.q, ($$0x, $$1x) -> fod.this.z.a($$1x)), $$1);
         fod.this.z.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(ffa.a($$1x.d().a()));
         });
         fdw<bnx> $$3 = $$0.a(fdw.a(bnx::b).a(bnx.values()).a(0, 0, 210, 20, wg.c("options.difficulty"), ($$0x, $$1x) -> fod.this.z.a($$1x)), $$1);
         fod.this.z.a($$1x -> {
            $$3.a(fod.this.z.e());
            $$3.j = !fod.this.z.f();
            $$3.a(ffa.a(fod.this.z.e().d()));
         });
         fdw<Boolean> $$4 = $$0.a(fdw.e().a($$0x -> ffa.a(fod.u)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fod.this.z.a($$1x)));
         fod.this.z.a($$1x -> {
            $$4.a(fod.this.z.g());
            $$4.j = !fod.this.z.l() && !fod.this.z.f();
         });
         if (!aa.b().g()) {
            $$0.a(fdp.a(fod.s, $$0x -> fod.this.a(fod.this.z.k().g())).a(210).a());
         }
      }
   }

   class c extends ffq {
      private static final wg c = wg.c("createWorld.tab.more.title");
      private static final wg d = wg.c("selectWorld.gameRules");
      private static final wg e = wg.c("selectWorld.dataPacks");

      c() {
         super(c);
         fhb.b $$0 = this.a.b(8).d(1);
         $$0.a(fdp.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fdp.a(fod.s, $$0x -> fod.this.a(fod.this.z.k().g())).a(210).a());
         $$0.a(fdp.a(e, $$0x -> fod.this.b(fod.this.z.k().g())).a(210).a());
      }

      private void b() {
         fod.this.j.a(new foe(fod.this.z.q().b(), $$0 -> {
            fod.this.j.a(fod.this);
            $$0.ifPresent(fod.this.z::a);
         }));
      }
   }

   class d extends ffq {
      private static final wg c = wg.c("createWorld.tab.world.title");
      private static final wg d = wg.c("generator.minecraft.amplified.info");
      private static final wg e = wg.c("selectWorld.mapFeatures");
      private static final wg f = wg.c("selectWorld.mapFeatures.info");
      private static final wg g = wg.c("selectWorld.bonusItems");
      private static final wg h = wg.c("selectWorld.enterSeed");
      static final wg i = wg.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fdy k;
      private final fdp l;

      d() {
         super(c);
         fhb.b $$0 = this.a.a(10).b(8).d(2);
         fdw<fom.b> $$1 = $$0.a(
            fdw.<fom.b>a(fom.b::a).a(this.c()).a(fod.d::a).a(0, 0, 150, 20, wg.c("selectWorld.mapType"), ($$0x, $$1x) -> fod.this.z.a($$1x))
         );
         $$1.a(fod.this.z.m());
         fod.this.z.a($$1x -> {
            fom.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ffa.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fod.this.z.m().c() != null;
         });
         this.l = $$0.a(fdp.a(wg.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fod.this.z.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fdy(fod.this.m, 308, 20, wg.c("selectWorld.enterSeed")) {
            @Override
            protected wu aL_() {
               return super.aL_().b(wf.t).b(fod.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fod.this.z.h());
         this.k.b($$0x -> fod.this.z.b(this.k.a()));
         $$0.a(fgy.a(fod.this.m, this.k, h), 2);
         fok.a $$2 = fok.a(310);
         $$2.a(e, fod.this.z::i, fod.this.z::b).a(() -> !fod.this.z.l()).a(f);
         $$2.a(g, fod.this.z::j, fod.this.z::c).a(() -> !fod.this.z.f() && !fod.this.z.l());
         fok $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fod.this.z.a($$1x -> $$3.a());
      }

      private void b() {
         foi $$0 = fod.this.z.n();
         if ($$0 != null) {
            fod.this.j.a($$0.createEditScreen(fod.this, fod.this.z.k()));
         }
      }

      private fdw.c<fom.b> c() {
         return new fdw.c<fom.b>() {
            @Override
            public List<fom.b> a() {
               return fdw.a.getAsBoolean() ? fod.this.z.p() : fod.this.z.o();
            }

            @Override
            public List<fom.b> b() {
               return fod.this.z.o();
            }
         };
      }

      private static wu a(fdw<fom.b> $$0) {
         return $$0.a().b() ? wf.a($$0.d(), d) : $$0.d();
      }
   }
}
