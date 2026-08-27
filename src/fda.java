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

public class fda extends eym {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final tn p = tn.c("selectWorld.gameMode");
   static final tn q = tn.c("selectWorld.enterName");
   static final tn s = tn.c("selectWorld.experiments");
   static final tn t = tn.c("selectWorld.allowCommands.info");
   private static final tn u = tn.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final aey a = new aey("textures/gui/header_separator.png");
   public static final aey b = new aey("textures/gui/footer_separator.png");
   public static final aey c = new aey("textures/gui/light_dirt_background.png");
   final fdj x;
   private final eut y = new eut(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final ehf A;
   @Nullable
   private final eym B;
   @Nullable
   private Path C;
   @Nullable
   private ang D;
   @Nullable
   private ewa E;
   @Nullable
   private euu F;

   public static void a(eqx $$0, @Nullable eym $$1) {
      a($$0, u);
      ang $$2 = new ang(new anj($$0.bb()));
      afs.c $$3 = a($$2, cqq.c);
      CompletableFuture<fdi> $$4 = afs.a(
         $$3, $$0x -> new afs.b<>(new fda.a(new dlq(dls.a(), dva.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fdi($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fda($$0, $$1, $$4.join(), Optional.of(dva.a), OptionalLong.empty()));
   }

   public static fda a(eqx $$0, @Nullable eym $$1, cqb $$2, fdi $$3, @Nullable Path $$4) {
      fda $$5 = new fda($$0, $$1, $$3, dva.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fdj.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fdj.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fdj.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fda(eqx $$0, @Nullable eym $$1, fdi $$2, Optional<aex<duz>> $$3, OptionalLong $$4) {
      super(tn.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bb();
      this.x = new fdj($$0.l().c(), $$2, $$3, $$4);
   }

   public fdj l() {
      return this.x;
   }

   @Override
   protected void aH_() {
      this.F = euu.a(this.y, this.g).a(new fda.b(), new fda.d(), new fda.c()).a();
      this.d(this.F);
      this.E = new ewa().a(10);
      ewa.b $$0 = this.E.d(2);
      $$0.a(ess.a(tn.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(ess.a(tm.e, $$0x -> this.D()).a());
      this.E.a($$0x -> {
         $$0x.h(1);
         this.d($$0x);
      });
      this.F.a(0, false);
      this.x.a();
      this.b();
   }

   @Override
   public void b() {
      if (this.F != null && this.E != null) {
         this.F.a(this.g);
         this.F.b();
         this.E.a();
         evz.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         ewu $$1 = new ewu(0, $$0, this.g, this.E.t() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(eqx $$0, tn $$1) {
      $$0.d(new exs($$1));
   }

   private void E() {
      fdi $$0 = this.x.k();
      dlp.b $$1 = $$0.d().a($$0.c());
      hn<afh> $$2 = $$0.e().a(afh.c, $$1.b());
      Lifecycle $$3 = ceg.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fdk.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(ecm.a $$0, hn<afh> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<eci.c> $$3 = this.H();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == ecm.a.c;
         fdi $$5 = this.x.k();
         cqb $$6 = this.c($$4);
         eco $$7 = new ecm($$6, $$5.b(), $$0, $$2);
         this.f.y().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cqb c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cpt $$2 = new cpt();
         $$2.a(cpt.k).a(false, null);
         return new cqb($$1, cpu.d, false, bgx.a, true, $$2, cqq.c);
      } else {
         return new cqb($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void az_() {
      this.D();
   }

   @Override
   public void D() {
      this.f.a(this.B);
      this.G();
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, ary.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(esh $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eum & ewi> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eum & etu & ewi> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path F() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            euy.c(this.f, this.x.c());
            this.D();
         }
      }

      return this.C;
   }

   void a(cqq $$0) {
      Pair<Path, ang> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fdd(this, (ang)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cqq $$0) {
      Pair<Path, ang> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fbr((ang)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), tn.c("dataPack.title")));
      }
   }

   private void a(ang $$0, boolean $$1, Consumer<cqq> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cqq $$5 = new cqq(new cpl($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cee $$6 = $$0.e();
         if (ceg.a($$6) && $$1) {
            this.f.a(new fcz($$0.f(), $$3x -> {
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

   private void a(ang $$0, cqq $$1, Consumer<cqq> $$2) {
      this.f.d(new exs(tn.c("dataPack.validation.working")));
      afs.c $$3 = a($$0, $$1);
      afs.<fda.a, fdi>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(je.aF).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(je.ap).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fdi $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aew.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dlq.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aew.a(JsonOps.INSTANCE, $$0x.c());
                  dlq $$5 = (dlq)$$3x.flatMap($$1xx -> dlq.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new afs.b<>(new fda.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fdi($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new exf($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cqq.c);
                  }
               }, tn.c("dataPack.validation.failed"), tm.a, tn.c("dataPack.validation.back"), tn.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static afs.c a(ang $$0, cqq $$1) {
      afs.d $$2 = new afs.d($$0, $$1, false, true);
      return new afs.c($$2, du.a.c, 2);
   }

   private void G() {
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

   private Optional<eci.c> H() {
      String $$0 = this.x.c();

      try {
         eci.c $$1 = this.f.l().d($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(ecg.j);
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

      euy.c(this.f, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eqx $$1) {
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
         euy.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, ang> c(cqq $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = anj.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dlq a, cqq b) {
   }

   class b extends eur {
      private static final tn c = tn.c("createWorld.tab.game.title");
      private static final tn d = tn.c("selectWorld.allowCommands");
      private final etb e;

      b() {
         super(c);
         ewa.b $$0 = this.a.b(8).d(1);
         ewe $$1 = $$0.b();
         this.e = new etb(fda.this.i, 208, 20, tn.c("selectWorld.enterName"));
         this.e.a(fda.this.x.b());
         this.e.b(fda.this.x::a);
         fda.this.x.a($$0x -> this.e.a(euc.a(tn.a("selectWorld.targetFolder", tn.b($$0x.c()).a(n.u)))));
         fda.this.c(this.e);
         $$0.a(evx.a(fda.this.i, this.e, fda.q), $$0.b().b());
         esz<fdj.a> $$2 = $$0.a(esz.<fdj.a>a($$0x -> $$0x.f).a(fdj.a.a, fdj.a.b, fdj.a.c).a(0, 0, 210, 20, fda.p, ($$0x, $$1x) -> fda.this.x.a($$1x)), $$1);
         fda.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(euc.a($$1x.d().a()));
         });
         esz<bgx> $$3 = $$0.a(esz.a(bgx::b).a(bgx.values()).a(0, 0, 210, 20, tn.c("options.difficulty"), ($$0x, $$1x) -> fda.this.x.a($$1x)), $$1);
         fda.this.x.a($$1x -> {
            $$3.a(fda.this.x.e());
            $$3.i = !fda.this.x.f();
            $$3.a(euc.a(fda.this.x.e().d()));
         });
         esz<Boolean> $$4 = $$0.a(esz.e().a($$0x -> euc.a(fda.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fda.this.x.a($$1x)));
         fda.this.x.a($$1x -> {
            $$4.a(fda.this.x.g());
            $$4.i = !fda.this.x.l() && !fda.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(ess.a(fda.s, $$0x -> fda.this.a(fda.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends eur {
      private static final tn c = tn.c("createWorld.tab.more.title");
      private static final tn d = tn.c("selectWorld.gameRules");
      private static final tn e = tn.c("selectWorld.dataPacks");

      c() {
         super(c);
         ewa.b $$0 = this.a.b(8).d(1);
         $$0.a(ess.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ess.a(fda.s, $$0x -> fda.this.a(fda.this.x.k().g())).a(210).a());
         $$0.a(ess.a(e, $$0x -> fda.this.b(fda.this.x.k().g())).a(210).a());
      }

      private void b() {
         fda.this.f.a(new fdb(fda.this.x.q().b(), $$0 -> {
            fda.this.f.a(fda.this);
            $$0.ifPresent(fda.this.x::a);
         }));
      }
   }

   class d extends eur {
      private static final tn c = tn.c("createWorld.tab.world.title");
      private static final tn d = tn.c("generator.minecraft.amplified.info");
      private static final tn e = tn.c("selectWorld.mapFeatures");
      private static final tn f = tn.c("selectWorld.mapFeatures.info");
      private static final tn g = tn.c("selectWorld.bonusItems");
      private static final tn h = tn.c("selectWorld.enterSeed");
      static final tn i = tn.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final etb k;
      private final ess l;

      d() {
         super(c);
         ewa.b $$0 = this.a.a(10).b(8).d(2);
         esz<fdj.b> $$1 = $$0.a(
            esz.<fdj.b>a(fdj.b::a).a(this.c()).a(fda.d::a).a(0, 0, 150, 20, tn.c("selectWorld.mapType"), ($$0x, $$1x) -> fda.this.x.a($$1x))
         );
         $$1.a(fda.this.x.m());
         fda.this.x.a($$1x -> {
            fdj.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(euc.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fda.this.x.m().c() != null;
         });
         this.l = $$0.a(ess.a(tn.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fda.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new etb(fda.this.i, 308, 20, tn.c("selectWorld.enterSeed")) {
            @Override
            protected ua aE_() {
               return super.aE_().b(tm.s).b(fda.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fda.this.x.h());
         this.k.b($$0x -> fda.this.x.b(this.k.a()));
         $$0.a(evx.a(fda.this.i, this.k, h), 2);
         fdh.a $$2 = fdh.a(310);
         $$2.a(e, fda.this.x::i, fda.this.x::b).a(() -> !fda.this.x.l()).a(f);
         $$2.a(g, fda.this.x::j, fda.this.x::c).a(() -> !fda.this.x.f() && !fda.this.x.l());
         fdh $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fda.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fdf $$0 = fda.this.x.n();
         if ($$0 != null) {
            fda.this.f.a($$0.createEditScreen(fda.this, fda.this.x.k()));
         }
      }

      private esz.c<fdj.b> c() {
         return new esz.c<fdj.b>() {
            @Override
            public List<fdj.b> a() {
               return esz.a.getAsBoolean() ? fda.this.x.p() : fda.this.x.o();
            }

            @Override
            public List<fdj.b> b() {
               return fda.this.x.o();
            }
         };
      }

      private static ua a(esz<fdj.b> $$0) {
         return $$0.a().b() ? tm.a($$0.b(), d) : $$0.b();
      }
   }
}
