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

public class frn extends fmy {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final xl s = xl.c("selectWorld.gameMode");
   static final xl u = xl.c("selectWorld.enterName");
   static final xl v = xl.c("selectWorld.experiments");
   static final xl w = xl.c("selectWorld.allowCommands.info");
   private static final xl x = xl.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final alb a = new alb("textures/gui/tab_header_background.png");
   private final fkm A = new fkm(this);
   final frw B;
   private final fjc C = new fjc(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evc E;
   @Nullable
   private final fmy F;
   @Nullable
   private Path G;
   @Nullable
   private atw H;
   @Nullable
   private fjd I;

   public static void a(ffa $$0, @Nullable fmy $$1) {
      a($$0, x);
      atw $$2 = new atw(new atz($$0.bd()));
      alx.c $$3 = a($$2, dcn.c);
      CompletableFuture<frv> $$4 = alx.a(
         $$3, $$0x -> new alx.b<>(new frn.a(new dyl(dyn.a(), ehv.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new frv($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new frn($$0, $$1, $$4.join(), Optional.of(ehv.a), OptionalLong.empty()));
   }

   public static frn a(ffa $$0, @Nullable fmy $$1, dbx $$2, frv $$3, @Nullable Path $$4) {
      frn $$5 = new frn($$0, $$1, $$3, ehv.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(frw.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(frw.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(frw.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private frn(ffa $$0, @Nullable fmy $$1, frv $$2, Optional<ala<ehu>> $$3, OptionalLong $$4) {
      super(xl.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new frw($$0.m().c(), $$2, $$3, $$4);
   }

   public frw m() {
      return this.B;
   }

   @Override
   protected void aN_() {
      this.I = fjd.a(this.C, this.n).a(new frn.b(), new frn.d(), new frn.c()).a();
      this.c(this.I);
      fkq $$0 = this.A.b(fkq.e().a(8));
      $$0.a(fgz.a(xl.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(fgz.a(xk.e, $$0x -> this.C()).a());
      this.A.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.I.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aD_() {
   }

   @Override
   public void c() {
      if (this.I != null) {
         this.I.a(this.n);
         this.I.b();
         int $$0 = this.I.G().c();
         flf $$1 = new flf(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(ffa $$0, xl $$1) {
      $$0.d(new fme($$1));
   }

   private void D() {
      frv $$0 = this.B.k();
      dyk.b $$1 = $$0.d().a($$0.c());
      jp<alk> $$2 = $$0.e().a(alk.c, $$1.b());
      Lifecycle $$3 = cpi.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      frx.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(epv.a $$0, jp<alk> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<epr.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == epv.a.c;
         frv $$5 = this.B.k();
         dbx $$6 = this.c($$4);
         epx $$7 = new epv($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dbx c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbp $$2 = new dbp();
         $$2.a(dbp.l).a(false, null);
         return new dbx($$1, dbq.d, false, bqm.a, true, $$2, dcn.c);
      } else {
         return new dbx($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.I.b($$0)) {
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
      this.m.a(this.F);
      this.F();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fmy.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fgm $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fiv & fkt> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fiv & fic & fkt> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fjh.c(this.m, this.B.c());
            this.C();
         }
      }

      return this.G;
   }

   void a(dcn $$0) {
      Pair<Path, atw> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new frq(this, (atw)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dcn $$0) {
      Pair<Path, atw> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fqe((atw)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xl.c("dataPack.title")));
      }
   }

   private void a(atw $$0, boolean $$1, Consumer<dcn> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dcn $$5 = new dcn(new dbh($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cpg $$6 = $$0.e();
         if (cpi.a($$6) && $$1) {
            this.m.a(new frm($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.B.k().g());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(atw $$0, dcn $$1, Consumer<dcn> $$2) {
      this.m.d(new fme(xl.c("dataPack.validation.working")));
      alx.c $$3 = a($$0, $$1);
      alx.<frn.a, frv>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lq.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lq.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  frv $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dyl.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dyl $$5 = (dyl)$$3x.flatMap($$1xx -> dyl.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alx.b<>(new frn.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new frv($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.m
         )
         .thenAcceptAsync(this.B::a, this.m)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new flq($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dcn.c);
                  }
               }, xl.c("dataPack.validation.failed"), xk.a, xl.c("dataPack.validation.back"), xl.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         });
   }

   private static alx.c a(atw $$0, dcn $$1) {
      alx.d $$2 = new alx.d($$0, $$1, false, true);
      return new alx.c($$2, eq.a.c, 2);
   }

   private void F() {
      if (this.G != null) {
         try (Stream<Path> $$0 = Files.walk(this.G)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  d.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            d.warn("Failed to list temporary dir {}", this.G);
         }

         this.G = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ac.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<epr.c> I() {
      String $$0 = this.B.c();

      try {
         epr.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(epp.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.G)).forEach($$1x -> a(this.G, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            d.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         d.warn("Failed to create access for {}", $$0, var9);
      }

      fjh.c(this.m, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ffa $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  d.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         d.warn("Failed to copy datapacks from world {}", $$0, var8);
         fjh.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atw> c(dcn $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atz.a($$1, this.E);
            this.H.a();
         }

         this.H.a($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dyl a, dcn b) {
   }

   class b extends fja {
      private static final xl c = xl.c("createWorld.tab.game.title");
      private static final xl d = xl.c("selectWorld.allowCommands.new");
      private final fhi e;

      b() {
         super(c);
         fkl.b $$0 = this.a.b(8).d(1);
         fkp $$1 = $$0.b();
         this.e = new fhi(frn.this.p, 208, 20, xl.c("selectWorld.enterName"));
         this.e.a(frn.this.B.b());
         this.e.b(frn.this.B::a);
         frn.this.B.a($$0x -> this.e.a(fik.a(xl.a("selectWorld.targetFolder", xl.b($$0x.c()).a(n.u)))));
         frn.this.b(this.e);
         $$0.a(fki.a(frn.this.p, this.e, frn.u), $$0.b().b());
         fhg<frw.a> $$2 = $$0.a(fhg.<frw.a>a($$0x -> $$0x.f).a(frw.a.a, frw.a.b, frw.a.c).a(0, 0, 210, 20, frn.s, ($$0x, $$1x) -> frn.this.B.a($$1x)), $$1);
         frn.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fik.a($$1x.d().a()));
         });
         fhg<bqm> $$3 = $$0.a(fhg.a(bqm::b).a(bqm.values()).a(0, 0, 210, 20, xl.c("options.difficulty"), ($$0x, $$1x) -> frn.this.B.a($$1x)), $$1);
         frn.this.B.a($$1x -> {
            $$3.a(frn.this.B.e());
            $$3.j = !frn.this.B.f();
            $$3.a(fik.a(frn.this.B.e().d()));
         });
         fhg<Boolean> $$4 = $$0.a(fhg.e().a($$0x -> fik.a(frn.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> frn.this.B.a($$1x)));
         frn.this.B.a($$1x -> {
            $$4.a(frn.this.B.g());
            $$4.j = !frn.this.B.l() && !frn.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fgz.a(frn.v, $$0x -> frn.this.a(frn.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fja {
      private static final xl c = xl.c("createWorld.tab.more.title");
      private static final xl d = xl.c("selectWorld.gameRules");
      private static final xl e = xl.c("selectWorld.dataPacks");

      c() {
         super(c);
         fkl.b $$0 = this.a.b(8).d(1);
         $$0.a(fgz.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fgz.a(frn.v, $$0x -> frn.this.a(frn.this.B.k().g())).a(210).a());
         $$0.a(fgz.a(e, $$0x -> frn.this.b(frn.this.B.k().g())).a(210).a());
      }

      private void b() {
         frn.this.m.a(new fro(frn.this.B.q().b(), $$0 -> {
            frn.this.m.a(frn.this);
            $$0.ifPresent(frn.this.B::a);
         }));
      }
   }

   class d extends fja {
      private static final xl c = xl.c("createWorld.tab.world.title");
      private static final xl d = xl.c("generator.minecraft.amplified.info");
      private static final xl e = xl.c("selectWorld.mapFeatures");
      private static final xl f = xl.c("selectWorld.mapFeatures.info");
      private static final xl g = xl.c("selectWorld.bonusItems");
      private static final xl h = xl.c("selectWorld.enterSeed");
      static final xl i = xl.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fhi k;
      private final fgz l;

      d() {
         super(c);
         fkl.b $$0 = this.a.a(10).b(8).d(2);
         fhg<frw.b> $$1 = $$0.a(
            fhg.<frw.b>a(frw.b::a).a(this.c()).a(frn.d::a).a(0, 0, 150, 20, xl.c("selectWorld.mapType"), ($$0x, $$1x) -> frn.this.B.a($$1x))
         );
         $$1.a(frn.this.B.m());
         frn.this.B.a($$1x -> {
            frw.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fik.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = frn.this.B.m().c() != null;
         });
         this.l = $$0.a(fgz.a(xl.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         frn.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fhi(frn.this.p, 308, 20, xl.c("selectWorld.enterSeed")) {
            @Override
            protected xz aL_() {
               return super.aL_().b(xk.t).b(frn.d.i);
            }
         };
         this.k.c(i);
         this.k.a(frn.this.B.h());
         this.k.b($$0x -> frn.this.B.b(this.k.a()));
         $$0.a(fki.a(frn.this.p, this.k, h), 2);
         fru.a $$2 = fru.a(310);
         $$2.a(e, frn.this.B::i, frn.this.B::b).a(() -> !frn.this.B.l()).a(f);
         $$2.a(g, frn.this.B::j, frn.this.B::c).a(() -> !frn.this.B.f() && !frn.this.B.l());
         fru $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         frn.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         frs $$0 = frn.this.B.n();
         if ($$0 != null) {
            frn.this.m.a($$0.createEditScreen(frn.this, frn.this.B.k()));
         }
      }

      private fhg.c<frw.b> c() {
         return new fhg.c<frw.b>() {
            @Override
            public List<frw.b> a() {
               return fhg.a.getAsBoolean() ? frn.this.B.p() : frn.this.B.o();
            }

            @Override
            public List<frw.b> b() {
               return frn.this.B.o();
            }
         };
      }

      private static xz a(fhg<frw.b> $$0) {
         return $$0.a().b() ? xk.a($$0.d(), d) : $$0.d();
      }
   }
}
