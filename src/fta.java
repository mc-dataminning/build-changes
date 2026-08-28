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

public class fta extends fob {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger r = LogUtils.getLogger();
   private static final String s = "mcworld-";
   static final wz u = wz.c("selectWorld.gameMode");
   static final wz v = wz.c("selectWorld.enterName");
   static final wz w = wz.c("selectWorld.experiments");
   static final wz x = wz.c("selectWorld.allowCommands.info");
   private static final wz y = wz.c("createWorld.preparing");
   private static final int z = 10;
   private static final int A = 8;
   public static final akr a = akr.b("textures/gui/tab_header_background.png");
   private final flx B = new flx(this);
   final ftj C;
   private final fkn D = new fkn(this::c, $$1x -> this.e($$1x));
   private boolean E;
   private final ewq F;
   @Nullable
   private final fob G;
   @Nullable
   private Path H;
   @Nullable
   private atp I;
   @Nullable
   private fko J;

   public static void a(fgm $$0, @Nullable fob $$1) {
      a($$0, y);
      atp $$2 = new atp(new ats($$0.bb()));
      alo.c $$3 = a($$2, ddr.c);
      CompletableFuture<fti> $$4 = alo.a(
         $$3, $$0x -> new alo.b<>(new fta.a(new dzu(dzw.a(), ejf.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fti($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fta($$0, $$1, $$4.join(), Optional.of(ejf.a), OptionalLong.empty()));
   }

   public static fta a(fgm $$0, @Nullable fob $$1, dda $$2, fti $$3, @Nullable Path $$4) {
      fta $$5 = new fta($$0, $$1, $$3, ejf.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.E = true;
      $$5.C.a($$2.a());
      $$5.C.a($$2.e());
      $$5.C.a($$2.d());
      $$5.C.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.C.a(ftj.a.b);
      } else if ($$2.b().h()) {
         $$5.C.a(ftj.a.a);
      } else if ($$2.b().g()) {
         $$5.C.a(ftj.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private fta(fgm $$0, @Nullable fob $$1, fti $$2, Optional<akq<eje>> $$3, OptionalLong $$4) {
      super(wz.c("selectWorld.create"));
      this.G = $$1;
      this.F = $$0.bb();
      this.C = new ftj($$0.m().c(), $$2, $$3, $$4);
   }

   public ftj m() {
      return this.C;
   }

   @Override
   protected void aT_() {
      this.J = fko.a(this.D, this.m).a(new fta.b(), new fta.d(), new fta.c()).a();
      this.c(this.J);
      fmb $$0 = this.B.b(fmb.e().a(8));
      $$0.a(fik.a(wz.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(fik.a(wy.e, $$0x -> this.C()).a());
      this.B.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.C.a();
      this.c();
   }

   @Override
   protected void aI_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.m);
         this.J.b();
         int $$0 = this.J.H().c();
         fmq $$1 = new fmq(0, $$0, this.m, this.n - this.B.b() - $$0);
         this.D.a($$1);
         this.B.b($$0);
         this.B.a();
      }
   }

   private static void a(fgm $$0, wz $$1) {
      $$0.d(new fnm($$1));
   }

   private void D() {
      fti $$0 = this.C.k();
      dzt.b $$1 = $$0.e().a($$0.d());
      jt<ala> $$2 = $$0.f().a(ala.c, $$1.b());
      Lifecycle $$3 = cpn.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.E && $$4 == Lifecycle.stable();
      ftk.a(this.l, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(erh.a $$0, jt<ala> $$1, Lifecycle $$2) {
      a(this.l, y);
      Optional<erd.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == erh.a.c;
         fti $$5 = this.C.k();
         dda $$6 = this.c($$4);
         erj $$7 = new erh($$6, $$5.c(), $$0, $$2);
         this.l.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dda c(boolean $$0) {
      String $$1 = this.C.b().trim();
      if ($$0) {
         dcs $$2 = new dcs();
         $$2.a(dcs.l).a(false, null);
         return new dda($$1, dct.d, false, bqo.a, true, $$2, ddr.c);
      } else {
         return new dda($$1, this.C.d().e, this.C.f(), this.C.e(), this.C.g(), this.C.q(), this.C.k().h());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.J.b($$0)) {
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
      this.l.a(this.G);
      this.F();
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fob.h, 0, this.n - this.B.b() - 2, 0.0F, 0.0F, this.m, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fhx $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.m, this.B.c(), 16, 16);
      this.a($$0, 0, this.B.c(), this.m, this.n);
   }

   @Override
   protected <T extends fkg & fme> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fkg & fjn & fme> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            r.warn("Failed to create temporary dir", var2);
            fks.c(this.l, this.C.c());
            this.C();
         }
      }

      return this.H;
   }

   void a(ddr $$0) {
      Pair<Path, atp> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new ftd(this, (atp)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(ddr $$0) {
      Pair<Path, atp> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new frr((atp)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wz.c("dataPack.title")));
      }
   }

   private void a(atp $$0, boolean $$1, Consumer<ddr> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      ddr $$5 = new ddr(new dck($$3, $$4), this.C.k().h().b());
      if (this.C.a($$5)) {
         this.l.a(this);
      } else {
         cpl $$6 = $$0.e();
         if (cpn.a($$6) && $$1) {
            this.l.a(new fsz($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.C.k().h());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(atp $$0, ddr $$1, Consumer<ddr> $$2) {
      this.l.d(new fnm(wz.c("dataPack.validation.working")));
      alo.c $$3 = a($$0, $$1);
      alo.<fta.a, fti>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lu.aY).c() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lu.aF).c() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fti $$1x = this.C.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dzu.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dzu $$5 = (dzu)$$3x.flatMap($$1xx -> dzu.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alo.b<>(new fta.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fti($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ad.g(),
            this.l
         )
         .thenApply($$0x -> {
            $$0x.b();
            return $$0x;
         })
         .thenAcceptAsync(this.C::a, this.l)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               r.warn("Failed to validate datapack", $$2x);
               this.l.a(new fmz($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.C.k().h());
                  } else {
                     $$2.accept(ddr.c);
                  }
               }, wz.c("dataPack.validation.failed"), wy.a, wz.c("dataPack.validation.back"), wz.c("dataPack.validation.reset")));
            } else {
               this.l.a(this);
            }

            return null;
         }, this.l);
   }

   private static alo.c a(atp $$0, ddr $$1) {
      alo.d $$2 = new alo.d($$0, $$1, false, true);
      return new alo.c($$2, eu.a.c, 2);
   }

   private void F() {
      if (this.H != null) {
         try (Stream<Path> $$0 = Files.walk(this.H)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  r.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            r.warn("Failed to list temporary dir {}", this.H);
         }

         this.H = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ad.b($$0, $$1, $$2);
      } catch (IOException var4) {
         r.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<erd.c> G() {
      String $$0 = this.C.c();

      try {
         erd.c $$1 = this.l.m().e($$0);
         if (this.H == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.H)) {
               Path $$3 = $$1.a(erb.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.H)).forEach($$1x -> a(this.H, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            r.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         r.warn("Failed to create access for {}", $$0, var9);
      }

      fks.c(this.l, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fgm $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  r.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         r.warn("Failed to copy datapacks from world {}", $$0, var8);
         fks.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atp> c(ddr $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = ats.a($$1, this.F);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   static record a(dzu a, ddr b) {
   }

   class b extends fkl {
      private static final wz c = wz.c("createWorld.tab.game.title");
      private static final wz d = wz.c("selectWorld.allowCommands.new");
      private final fit e;

      b() {
         super(c);
         flw.b $$0 = this.a.b(8).d(1);
         fma $$1 = $$0.b();
         this.e = new fit(fta.this.o, 208, 20, wz.c("selectWorld.enterName"));
         this.e.a(fta.this.C.b());
         this.e.b(fta.this.C::a);
         fta.this.C.a($$0x -> this.e.a(fjv.a(wz.a("selectWorld.targetFolder", wz.b($$0x.c()).a(n.u)))));
         fta.this.b(this.e);
         $$0.a(flt.a(fta.this.o, this.e, fta.v), $$0.b().b());
         fir<ftj.a> $$2 = $$0.a(fir.<ftj.a>a($$0x -> $$0x.f).a(ftj.a.a, ftj.a.b, ftj.a.c).a(0, 0, 210, 20, fta.u, ($$0x, $$1x) -> fta.this.C.a($$1x)), $$1);
         fta.this.C.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fjv.a($$1x.d().a()));
         });
         fir<bqo> $$3 = $$0.a(fir.a(bqo::b).a(bqo.values()).a(0, 0, 210, 20, wz.c("options.difficulty"), ($$0x, $$1x) -> fta.this.C.a($$1x)), $$1);
         fta.this.C.a($$1x -> {
            $$3.a(fta.this.C.e());
            $$3.j = !fta.this.C.f();
            $$3.a(fjv.a(fta.this.C.e().d()));
         });
         fir<Boolean> $$4 = $$0.a(fir.e().a($$0x -> fjv.a(fta.x)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fta.this.C.a($$1x)));
         fta.this.C.a($$1x -> {
            $$4.a(fta.this.C.g());
            $$4.j = !fta.this.C.l() && !fta.this.C.f();
         });
         if (!ab.b().g()) {
            $$0.a(fik.a(fta.w, $$0x -> fta.this.a(fta.this.C.k().h())).a(210).a());
         }
      }
   }

   class c extends fkl {
      private static final wz c = wz.c("createWorld.tab.more.title");
      private static final wz d = wz.c("selectWorld.gameRules");
      private static final wz e = wz.c("selectWorld.dataPacks");

      c() {
         super(c);
         flw.b $$0 = this.a.b(8).d(1);
         $$0.a(fik.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fik.a(fta.w, $$0x -> fta.this.a(fta.this.C.k().h())).a(210).a());
         $$0.a(fik.a(e, $$0x -> fta.this.b(fta.this.C.k().h())).a(210).a());
      }

      private void b() {
         fta.this.l.a(new ftb(fta.this.C.q().b(), $$0 -> {
            fta.this.l.a(fta.this);
            $$0.ifPresent(fta.this.C::a);
         }));
      }
   }

   class d extends fkl {
      private static final wz c = wz.c("createWorld.tab.world.title");
      private static final wz d = wz.c("generator.minecraft.amplified.info");
      private static final wz e = wz.c("selectWorld.mapFeatures");
      private static final wz f = wz.c("selectWorld.mapFeatures.info");
      private static final wz g = wz.c("selectWorld.bonusItems");
      private static final wz h = wz.c("selectWorld.enterSeed");
      static final wz i = wz.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fit k;
      private final fik l;

      d() {
         super(c);
         flw.b $$0 = this.a.a(10).b(8).d(2);
         fir<ftj.b> $$1 = $$0.a(
            fir.<ftj.b>a(ftj.b::a).a(this.c()).a(fta.d::a).a(0, 0, 150, 20, wz.c("selectWorld.mapType"), ($$0x, $$1x) -> fta.this.C.a($$1x))
         );
         $$1.a(fta.this.C.m());
         fta.this.C.a($$1x -> {
            ftj.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fjv.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fta.this.C.m().c() != null;
         });
         this.l = $$0.a(fik.a(wz.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fta.this.C.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fit(fta.this.o, 308, 20, wz.c("selectWorld.enterSeed")) {
            @Override
            protected xn aQ_() {
               return super.aQ_().b(wy.t).b(fta.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fta.this.C.h());
         this.k.b($$0x -> fta.this.C.b(this.k.a()));
         $$0.a(flt.a(fta.this.o, this.k, h), 2);
         fth.a $$2 = fth.a(310);
         $$2.a(e, fta.this.C::i, fta.this.C::b).a(() -> !fta.this.C.l()).a(f);
         $$2.a(g, fta.this.C::j, fta.this.C::c).a(() -> !fta.this.C.f() && !fta.this.C.l());
         fth $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fta.this.C.a($$1x -> $$3.a());
      }

      private void b() {
         ftf $$0 = fta.this.C.n();
         if ($$0 != null) {
            fta.this.l.a($$0.createEditScreen(fta.this, fta.this.C.k()));
         }
      }

      private fir.c<ftj.b> c() {
         return new fir.c<ftj.b>() {
            @Override
            public List<ftj.b> a() {
               return fir.a.getAsBoolean() ? fta.this.C.p() : fta.this.C.o();
            }

            @Override
            public List<ftj.b> b() {
               return fta.this.C.o();
            }
         };
      }

      private static xn a(fir<ftj.b> $$0) {
         return $$0.a().b() ? wy.a($$0.c(), d) : $$0.c();
      }
   }
}
