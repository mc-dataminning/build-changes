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

public class fds extends ezd {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final ui p = ui.c("selectWorld.gameMode");
   static final ui q = ui.c("selectWorld.enterName");
   static final ui s = ui.c("selectWorld.experiments");
   static final ui t = ui.c("selectWorld.allowCommands.info");
   private static final ui u = ui.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final afw a = new afw("textures/gui/header_separator.png");
   public static final afw b = new afw("textures/gui/footer_separator.png");
   public static final afw c = new afw("textures/gui/light_dirt_background.png");
   final feb x;
   private final evl y = new evl(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final ehv A;
   @Nullable
   private final ezd B;
   @Nullable
   private Path C;
   @Nullable
   private aoe D;
   @Nullable
   private ews E;
   @Nullable
   private evm F;

   public static void a(ero $$0, @Nullable ezd $$1) {
      a($$0, u);
      aoe $$2 = new aoe(new aoh($$0.bb()));
      agq.c $$3 = a($$2, crs.c);
      CompletableFuture<fea> $$4 = agq.a(
         $$3, $$0x -> new agq.b<>(new fds.a(new dmg(dmi.a(), dvq.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fea($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fds($$0, $$1, $$4.join(), Optional.of(dvq.a), OptionalLong.empty()));
   }

   public static fds a(ero $$0, @Nullable ezd $$1, crd $$2, fea $$3, @Nullable Path $$4) {
      fds $$5 = new fds($$0, $$1, $$3, dvq.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(feb.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(feb.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(feb.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fds(ero $$0, @Nullable ezd $$1, fea $$2, Optional<afv<dvp>> $$3, OptionalLong $$4) {
      super(ui.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bb();
      this.x = new feb($$0.l().c(), $$2, $$3, $$4);
   }

   public feb l() {
      return this.x;
   }

   @Override
   protected void aM_() {
      this.F = evm.a(this.y, this.g).a(new fds.b(), new fds.d(), new fds.c()).a();
      this.d(this.F);
      this.E = new ews().a(10);
      ews.b $$0 = this.E.d(2);
      $$0.a(etj.a(ui.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(etj.a(uh.e, $$0x -> this.C()).a());
      this.E.a($$0x -> {
         $$0x.h(1);
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
         this.F.b();
         this.E.a();
         ewr.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         exm $$1 = new exm(0, $$0, this.g, this.E.r() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(ero $$0, ui $$1) {
      $$0.d(new eyk($$1));
   }

   private void D() {
      fea $$0 = this.x.k();
      dmf.b $$1 = $$0.d().a($$0.c());
      ij<agf> $$2 = $$0.e().a(agf.c, $$1.b());
      Lifecycle $$3 = cfi.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fec.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(edc.a $$0, ij<agf> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<ecy.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == edc.a.c;
         fea $$5 = this.x.k();
         crd $$6 = this.c($$4);
         ede $$7 = new edc($$6, $$5.b(), $$0, $$2);
         this.f.y().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private crd c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cqv $$2 = new cqv();
         $$2.a(cqv.k).a(false, null);
         return new crd($$1, cqw.d, false, bhy.a, true, $$2, crs.c);
      } else {
         return new crd($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void aC_() {
      this.C();
   }

   @Override
   public void C() {
      this.f.a(this.B);
      this.F();
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, asy.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(esy $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eve & exa> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eve & eum & exa> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path E() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            evq.c(this.f, this.x.c());
            this.C();
         }
      }

      return this.C;
   }

   void a(crs $$0) {
      Pair<Path, aoe> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fdv(this, (aoe)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(crs $$0) {
      Pair<Path, aoe> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fcj((aoe)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), ui.c("dataPack.title")));
      }
   }

   private void a(aoe $$0, boolean $$1, Consumer<crs> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      crs $$5 = new crs(new cqn($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cfg $$6 = $$0.e();
         if (cfi.a($$6) && $$1) {
            this.f.a(new fdr($$0.f(), $$3x -> {
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

   private void a(aoe $$0, crs $$1, Consumer<crs> $$2) {
      this.f.d(new eyk(ui.c("dataPack.validation.working")));
      agq.c $$3 = a($$0, $$1);
      agq.<fds.a, fea>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jz.aG).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jz.aq).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fea $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = afu.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dmg.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = afu.a(JsonOps.INSTANCE, $$0x.c());
                  dmg $$5 = (dmg)$$3x.flatMap($$1xx -> dmg.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new agq.b<>(new fds.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fea($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new exx($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(crs.c);
                  }
               }, ui.c("dataPack.validation.failed"), uh.a, ui.c("dataPack.validation.back"), ui.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static agq.c a(aoe $$0, crs $$1) {
      agq.d $$2 = new agq.d($$0, $$1, false, true);
      return new agq.c($$2, dv.a.c, 2);
   }

   private void F() {
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

   private Optional<ecy.c> G() {
      String $$0 = this.x.c();

      try {
         ecy.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(ecw.j);
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

      evq.c(this.f, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ero $$1) {
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
         evq.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aoe> c(crs $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = aoh.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dmg a, crs b) {
   }

   class b extends evj {
      private static final ui c = ui.c("createWorld.tab.game.title");
      private static final ui d = ui.c("selectWorld.allowCommands");
      private final ets e;

      b() {
         super(c);
         ews.b $$0 = this.a.b(8).d(1);
         eww $$1 = $$0.b();
         this.e = new ets(fds.this.i, 208, 20, ui.c("selectWorld.enterName"));
         this.e.a(fds.this.x.b());
         this.e.b(fds.this.x::a);
         fds.this.x.a($$0x -> this.e.a(euu.a(ui.a("selectWorld.targetFolder", ui.b($$0x.c()).a(n.u)))));
         fds.this.c(this.e);
         $$0.a(ewp.a(fds.this.i, this.e, fds.q), $$0.b().b());
         etq<feb.a> $$2 = $$0.a(etq.<feb.a>a($$0x -> $$0x.f).a(feb.a.a, feb.a.b, feb.a.c).a(0, 0, 210, 20, fds.p, ($$0x, $$1x) -> fds.this.x.a($$1x)), $$1);
         fds.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(euu.a($$1x.d().a()));
         });
         etq<bhy> $$3 = $$0.a(etq.a(bhy::b).a(bhy.values()).a(0, 0, 210, 20, ui.c("options.difficulty"), ($$0x, $$1x) -> fds.this.x.a($$1x)), $$1);
         fds.this.x.a($$1x -> {
            $$3.a(fds.this.x.e());
            $$3.i = !fds.this.x.f();
            $$3.a(euu.a(fds.this.x.e().d()));
         });
         etq<Boolean> $$4 = $$0.a(etq.e().a($$0x -> euu.a(fds.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fds.this.x.a($$1x)));
         fds.this.x.a($$1x -> {
            $$4.a(fds.this.x.g());
            $$4.i = !fds.this.x.l() && !fds.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(etj.a(fds.s, $$0x -> fds.this.a(fds.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends evj {
      private static final ui c = ui.c("createWorld.tab.more.title");
      private static final ui d = ui.c("selectWorld.gameRules");
      private static final ui e = ui.c("selectWorld.dataPacks");

      c() {
         super(c);
         ews.b $$0 = this.a.b(8).d(1);
         $$0.a(etj.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(etj.a(fds.s, $$0x -> fds.this.a(fds.this.x.k().g())).a(210).a());
         $$0.a(etj.a(e, $$0x -> fds.this.b(fds.this.x.k().g())).a(210).a());
      }

      private void b() {
         fds.this.f.a(new fdt(fds.this.x.q().b(), $$0 -> {
            fds.this.f.a(fds.this);
            $$0.ifPresent(fds.this.x::a);
         }));
      }
   }

   class d extends evj {
      private static final ui c = ui.c("createWorld.tab.world.title");
      private static final ui d = ui.c("generator.minecraft.amplified.info");
      private static final ui e = ui.c("selectWorld.mapFeatures");
      private static final ui f = ui.c("selectWorld.mapFeatures.info");
      private static final ui g = ui.c("selectWorld.bonusItems");
      private static final ui h = ui.c("selectWorld.enterSeed");
      static final ui i = ui.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final ets k;
      private final etj l;

      d() {
         super(c);
         ews.b $$0 = this.a.a(10).b(8).d(2);
         etq<feb.b> $$1 = $$0.a(
            etq.<feb.b>a(feb.b::a).a(this.c()).a(fds.d::a).a(0, 0, 150, 20, ui.c("selectWorld.mapType"), ($$0x, $$1x) -> fds.this.x.a($$1x))
         );
         $$1.a(fds.this.x.m());
         fds.this.x.a($$1x -> {
            feb.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(euu.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fds.this.x.m().c() != null;
         });
         this.l = $$0.a(etj.a(ui.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fds.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new ets(fds.this.i, 308, 20, ui.c("selectWorld.enterSeed")) {
            @Override
            protected uw aI_() {
               return super.aI_().b(uh.s).b(fds.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fds.this.x.h());
         this.k.b($$0x -> fds.this.x.b(this.k.a()));
         $$0.a(ewp.a(fds.this.i, this.k, h), 2);
         fdz.a $$2 = fdz.a(310);
         $$2.a(e, fds.this.x::i, fds.this.x::b).a(() -> !fds.this.x.l()).a(f);
         $$2.a(g, fds.this.x::j, fds.this.x::c).a(() -> !fds.this.x.f() && !fds.this.x.l());
         fdz $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fds.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fdx $$0 = fds.this.x.n();
         if ($$0 != null) {
            fds.this.f.a($$0.createEditScreen(fds.this, fds.this.x.k()));
         }
      }

      private etq.c<feb.b> c() {
         return new etq.c<feb.b>() {
            @Override
            public List<feb.b> a() {
               return etq.a.getAsBoolean() ? fds.this.x.p() : fds.this.x.o();
            }

            @Override
            public List<feb.b> b() {
               return fds.this.x.o();
            }
         };
      }

      private static uw a(etq<feb.b> $$0) {
         return $$0.a().b() ? uh.a($$0.b(), d) : $$0.b();
      }
   }
}
