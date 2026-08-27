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

public class fkx extends fgh {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vs p = vs.c("selectWorld.gameMode");
   static final vs q = vs.c("selectWorld.enterName");
   static final vs r = vs.c("selectWorld.experiments");
   static final vs t = vs.c("selectWorld.allowCommands.info");
   private static final vs u = vs.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final ajc a = new ajc("textures/gui/header_separator.png");
   public static final ajc b = new ajc("textures/gui/footer_separator.png");
   public static final ajc c = new ajc("textures/gui/light_dirt_background.png");
   final flg x;
   private final fcn y = new fcn(this::c, $$1x -> this.e($$1x));
   private boolean z;
   private final eol A;
   @Nullable
   private final fgh B;
   @Nullable
   private Path C;
   @Nullable
   private arq D;
   @Nullable
   private fdv E;
   @Nullable
   private fco F;

   public static void a(eyk $$0, @Nullable fgh $$1) {
      a($$0, u);
      arq $$2 = new arq(new art($$0.bd()));
      ajx.c $$3 = a($$2, cwy.c);
      CompletableFuture<flf> $$4 = ajx.a(
         $$3, $$0x -> new ajx.b<>(new fkx.a(new dsm(dso.a(), ebw.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new flf($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fkx($$0, $$1, $$4.join(), Optional.of(ebw.a), OptionalLong.empty()));
   }

   public static fkx a(eyk $$0, @Nullable fgh $$1, cwi $$2, flf $$3, @Nullable Path $$4) {
      fkx $$5 = new fkx($$0, $$1, $$3, ebw.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(flg.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(flg.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(flg.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fkx(eyk $$0, @Nullable fgh $$1, flf $$2, Optional<ajb<ebv>> $$3, OptionalLong $$4) {
      super(vs.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bd();
      this.x = new flg($$0.l().c(), $$2, $$3, $$4);
   }

   public flg o() {
      return this.x;
   }

   @Override
   protected void aP_() {
      this.F = fco.a(this.y, this.g).a(new fkx.b(), new fkx.d(), new fkx.c()).a();
      this.c(this.F);
      this.E = new fdv().a(10);
      fdv.b $$0 = this.E.d(2);
      $$0.a(fak.a(vs.c("selectWorld.create"), $$0x -> this.H()).a());
      $$0.a(fak.a(vr.e, $$0x -> this.E()).a());
      this.E.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.F.a(0, false);
      this.x.a();
      this.c();
   }

   @Override
   protected void aG_() {
   }

   @Override
   public void c() {
      if (this.F != null && this.E != null) {
         this.F.a(this.g);
         this.F.a();
         this.E.a();
         fdu.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         fep $$1 = new fep(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(eyk $$0, vs $$1) {
      $$0.d(new ffn($$1));
   }

   private void H() {
      flf $$0 = this.x.k();
      dsl.b $$1 = $$0.d().a($$0.c());
      is<ajl> $$2 = $$0.e().a(ajl.c, $$1.b());
      Lifecycle $$3 = ckn.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      flh.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(ejs.a $$0, is<ajl> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<ejo.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == ejs.a.c;
         flf $$5 = this.x.k();
         cwi $$6 = this.c($$4);
         eju $$7 = new ejs($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cwi c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cwa $$2 = new cwa();
         $$2.a(cwa.l).a(false, null);
         return new cwi($$1, cwb.d, false, bmi.a, true, $$2, cwy.c);
      } else {
         return new cwi($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, awm.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(ezx $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends fcg & fed> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fcg & fbn & fed> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            fcs.c(this.f, this.x.c());
            this.E();
         }
      }

      return this.C;
   }

   void a(cwy $$0) {
      Pair<Path, arq> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fla(this, (arq)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cwy $$0) {
      Pair<Path, arq> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fjo((arq)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vs.c("dataPack.title")));
      }
   }

   private void a(arq $$0, boolean $$1, Consumer<cwy> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cwy $$5 = new cwy(new cvs($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         ckl $$6 = $$0.e();
         if (ckn.a($$6) && $$1) {
            this.f.a(new fkw($$0.f(), $$3x -> {
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

   private void a(arq $$0, cwy $$1, Consumer<cwy> $$2) {
      this.f.d(new ffn(vs.c("dataPack.validation.working")));
      ajx.c $$3 = a($$0, $$1);
      ajx.<fkx.a, flf>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ki.aL).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ki.au).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  flf $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aja.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dsm.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aja.a(JsonOps.INSTANCE, $$0x.c());
                  dsm $$5 = (dsm)$$3x.flatMap($$1xx -> dsm.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new ajx.b<>(new fkx.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new flf($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new ffa($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cwy.c);
                  }
               }, vs.c("dataPack.validation.failed"), vr.a, vs.c("dataPack.validation.back"), vs.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static ajx.c a(arq $$0, cwy $$1) {
      ajx.d $$2 = new ajx.d($$0, $$1, false, true);
      return new ajx.c($$2, dv.a.c, 2);
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

   private Optional<ejo.c> K() {
      String $$0 = this.x.c();

      try {
         ejo.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(ejm.j);
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

      fcs.c(this.f, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eyk $$1) {
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
         fcs.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, arq> c(cwy $$0) {
      Path $$1 = this.I();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = art.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dsm a, cwy b) {
   }

   class b extends fcl {
      private static final vs c = vs.c("createWorld.tab.game.title");
      private static final vs d = vs.c("selectWorld.allowCommands.new");
      private final fat e;

      b() {
         super(c);
         fdv.b $$0 = this.a.b(8).d(1);
         fdz $$1 = $$0.b();
         this.e = new fat(fkx.this.i, 208, 20, vs.c("selectWorld.enterName"));
         this.e.a(fkx.this.x.b());
         this.e.b(fkx.this.x::a);
         fkx.this.x.a($$0x -> this.e.a(fbv.a(vs.a("selectWorld.targetFolder", vs.b($$0x.c()).a(n.u)))));
         fkx.this.b(this.e);
         $$0.a(fds.a(fkx.this.i, this.e, fkx.q), $$0.b().b());
         far<flg.a> $$2 = $$0.a(far.<flg.a>a($$0x -> $$0x.f).a(flg.a.a, flg.a.b, flg.a.c).a(0, 0, 210, 20, fkx.p, ($$0x, $$1x) -> fkx.this.x.a($$1x)), $$1);
         fkx.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fbv.a($$1x.d().a()));
         });
         far<bmi> $$3 = $$0.a(far.a(bmi::b).a(bmi.values()).a(0, 0, 210, 20, vs.c("options.difficulty"), ($$0x, $$1x) -> fkx.this.x.a($$1x)), $$1);
         fkx.this.x.a($$1x -> {
            $$3.a(fkx.this.x.e());
            $$3.j = !fkx.this.x.f();
            $$3.a(fbv.a(fkx.this.x.e().d()));
         });
         far<Boolean> $$4 = $$0.a(far.e().a($$0x -> fbv.a(fkx.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fkx.this.x.a($$1x)));
         fkx.this.x.a($$1x -> {
            $$4.a(fkx.this.x.g());
            $$4.j = !fkx.this.x.l() && !fkx.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(fak.a(fkx.r, $$0x -> fkx.this.a(fkx.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends fcl {
      private static final vs c = vs.c("createWorld.tab.more.title");
      private static final vs d = vs.c("selectWorld.gameRules");
      private static final vs e = vs.c("selectWorld.dataPacks");

      c() {
         super(c);
         fdv.b $$0 = this.a.b(8).d(1);
         $$0.a(fak.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fak.a(fkx.r, $$0x -> fkx.this.a(fkx.this.x.k().g())).a(210).a());
         $$0.a(fak.a(e, $$0x -> fkx.this.b(fkx.this.x.k().g())).a(210).a());
      }

      private void b() {
         fkx.this.f.a(new fky(fkx.this.x.q().b(), $$0 -> {
            fkx.this.f.a(fkx.this);
            $$0.ifPresent(fkx.this.x::a);
         }));
      }
   }

   class d extends fcl {
      private static final vs c = vs.c("createWorld.tab.world.title");
      private static final vs d = vs.c("generator.minecraft.amplified.info");
      private static final vs e = vs.c("selectWorld.mapFeatures");
      private static final vs f = vs.c("selectWorld.mapFeatures.info");
      private static final vs g = vs.c("selectWorld.bonusItems");
      private static final vs h = vs.c("selectWorld.enterSeed");
      static final vs i = vs.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fat k;
      private final fak l;

      d() {
         super(c);
         fdv.b $$0 = this.a.a(10).b(8).d(2);
         far<flg.b> $$1 = $$0.a(
            far.<flg.b>a(flg.b::a).a(this.c()).a(fkx.d::a).a(0, 0, 150, 20, vs.c("selectWorld.mapType"), ($$0x, $$1x) -> fkx.this.x.a($$1x))
         );
         $$1.a(fkx.this.x.m());
         fkx.this.x.a($$1x -> {
            flg.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fbv.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fkx.this.x.m().c() != null;
         });
         this.l = $$0.a(fak.a(vs.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fkx.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fat(fkx.this.i, 308, 20, vs.c("selectWorld.enterSeed")) {
            @Override
            protected wg aM_() {
               return super.aM_().b(vr.t).b(fkx.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fkx.this.x.h());
         this.k.b($$0x -> fkx.this.x.b(this.k.a()));
         $$0.a(fds.a(fkx.this.i, this.k, h), 2);
         fle.a $$2 = fle.a(310);
         $$2.a(e, fkx.this.x::i, fkx.this.x::b).a(() -> !fkx.this.x.l()).a(f);
         $$2.a(g, fkx.this.x::j, fkx.this.x::c).a(() -> !fkx.this.x.f() && !fkx.this.x.l());
         fle $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fkx.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         flc $$0 = fkx.this.x.n();
         if ($$0 != null) {
            fkx.this.f.a($$0.createEditScreen(fkx.this, fkx.this.x.k()));
         }
      }

      private far.c<flg.b> c() {
         return new far.c<flg.b>() {
            @Override
            public List<flg.b> a() {
               return far.a.getAsBoolean() ? fkx.this.x.p() : fkx.this.x.o();
            }

            @Override
            public List<flg.b> b() {
               return fkx.this.x.o();
            }
         };
      }

      private static wg a(far<flg.b> $$0) {
         return $$0.a().b() ? vr.a($$0.d(), d) : $$0.d();
      }
   }
}
