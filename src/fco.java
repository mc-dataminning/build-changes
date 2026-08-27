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

public class fco extends eya {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final tf p = tf.c("selectWorld.gameMode");
   static final tf q = tf.c("selectWorld.enterName");
   static final tf s = tf.c("selectWorld.experiments");
   static final tf t = tf.c("selectWorld.allowCommands.info");
   private static final tf u = tf.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final aer a = new aer("textures/gui/header_separator.png");
   public static final aer b = new aer("textures/gui/footer_separator.png");
   public static final aer c = new aer("textures/gui/light_dirt_background.png");
   final fcx x;
   private final euh y = new euh(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final egt A;
   @Nullable
   private final eya B;
   @Nullable
   private Path C;
   @Nullable
   private amx D;
   @Nullable
   private evo E;
   @Nullable
   private eui F;

   public static void a(eql $$0, @Nullable eya $$1) {
      a($$0, u);
      amx $$2 = new amx(new ana($$0.bb()));
      afl.c $$3 = a($$2, cqe.c);
      CompletableFuture<fcw> $$4 = afl.a(
         $$3, $$0x -> new afl.b<>(new fco.a(new dle(dlg.a(), duo.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fcw($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fco($$0, $$1, $$4.join(), Optional.of(duo.a), OptionalLong.empty()));
   }

   public static fco a(eql $$0, @Nullable eya $$1, cpp $$2, fcw $$3, @Nullable Path $$4) {
      fco $$5 = new fco($$0, $$1, $$3, duo.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fcx.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fcx.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fcx.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fco(eql $$0, @Nullable eya $$1, fcw $$2, Optional<aeq<dun>> $$3, OptionalLong $$4) {
      super(tf.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bb();
      this.x = new fcx($$0.l().c(), $$2, $$3, $$4);
   }

   public fcx l() {
      return this.x;
   }

   @Override
   protected void aC_() {
      this.F = eui.a(this.y, this.g).a(new fco.b(), new fco.d(), new fco.c()).a();
      this.d(this.F);
      this.E = new evo().a(10);
      evo.b $$0 = this.E.d(2);
      $$0.a(esg.a(tf.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(esg.a(te.e, $$0x -> this.C()).a());
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
         evn.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         ewi $$1 = new ewi(0, $$0, this.g, this.E.t() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(eql $$0, tf $$1) {
      $$0.d(new exg($$1));
   }

   private void D() {
      fcw $$0 = this.x.k();
      dld.b $$1 = $$0.d().a($$0.c());
      hl<afa> $$2 = $$0.e().a(afa.c, $$1.b());
      Lifecycle $$3 = cdw.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fcy.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eca.a $$0, hl<afa> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<ebw.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == eca.a.c;
         fcw $$5 = this.x.k();
         cpp $$6 = this.c($$4);
         ecc $$7 = new eca($$6, $$5.b(), $$0, $$2);
         this.f.y().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cpp c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cph $$2 = new cph();
         $$2.a(cph.k).a(false, null);
         return new cpp($$1, cpi.d, false, bgn.a, true, $$2, cqe.c);
      } else {
         return new cpp($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void at_() {
      this.C();
   }

   @Override
   public void C() {
      this.f.a(this.B);
      this.F();
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, arp.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(erv $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eua & evw> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eua & eti & evw> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path E() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            eum.c(this.f, this.x.c());
            this.C();
         }
      }

      return this.C;
   }

   void a(cqe $$0) {
      Pair<Path, amx> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fcr(this, (amx)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cqe $$0) {
      Pair<Path, amx> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fbf((amx)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), tf.c("dataPack.title")));
      }
   }

   private void a(amx $$0, boolean $$1, Consumer<cqe> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cqe $$5 = new cqe(new coz($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cdu $$6 = $$0.e();
         if (cdw.a($$6) && $$1) {
            this.f.a(new fcn($$0.f(), $$3x -> {
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

   private void a(amx $$0, cqe $$1, Consumer<cqe> $$2) {
      this.f.d(new exg(tf.c("dataPack.validation.working")));
      afl.c $$3 = a($$0, $$1);
      afl.<fco.a, fcw>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jc.aF).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jc.ap).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fcw $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aep.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dle.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aep.a(JsonOps.INSTANCE, $$0x.c());
                  dle $$5 = (dle)$$3x.flatMap($$1xx -> dle.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new afl.b<>(new fco.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fcw($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new ewt($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cqe.c);
                  }
               }, tf.c("dataPack.validation.failed"), te.a, tf.c("dataPack.validation.back"), tf.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static afl.c a(amx $$0, cqe $$1) {
      afl.d $$2 = new afl.d($$0, $$1, false, true);
      return new afl.c($$2, ds.a.c, 2);
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

   private Optional<ebw.c> G() {
      String $$0 = this.x.c();

      try {
         ebw.c $$1 = this.f.l().d($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(ebu.j);
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

      eum.c(this.f, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eql $$1) {
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
         eum.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, amx> c(cqe $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = ana.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dle a, cqe b) {
   }

   class b extends euf {
      private static final tf c = tf.c("createWorld.tab.game.title");
      private static final tf d = tf.c("selectWorld.allowCommands");
      private final esp e;

      b() {
         super(c);
         evo.b $$0 = this.a.b(8).d(1);
         evs $$1 = $$0.b();
         this.e = new esp(fco.this.i, 208, 20, tf.c("selectWorld.enterName"));
         this.e.a(fco.this.x.b());
         this.e.b(fco.this.x::a);
         fco.this.x.a($$0x -> this.e.a(etq.a(tf.a("selectWorld.targetFolder", tf.b($$0x.c()).a(n.u)))));
         fco.this.c(this.e);
         $$0.a(evl.a(fco.this.i, this.e, fco.q), $$0.b().b());
         esn<fcx.a> $$2 = $$0.a(esn.<fcx.a>a($$0x -> $$0x.f).a(fcx.a.a, fcx.a.b, fcx.a.c).a(0, 0, 210, 20, fco.p, ($$0x, $$1x) -> fco.this.x.a($$1x)), $$1);
         fco.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(etq.a($$1x.d().a()));
         });
         esn<bgn> $$3 = $$0.a(esn.a(bgn::b).a(bgn.values()).a(0, 0, 210, 20, tf.c("options.difficulty"), ($$0x, $$1x) -> fco.this.x.a($$1x)), $$1);
         fco.this.x.a($$1x -> {
            $$3.a(fco.this.x.e());
            $$3.i = !fco.this.x.f();
            $$3.a(etq.a(fco.this.x.e().d()));
         });
         esn<Boolean> $$4 = $$0.a(esn.e().a($$0x -> etq.a(fco.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fco.this.x.a($$1x)));
         fco.this.x.a($$1x -> {
            $$4.a(fco.this.x.g());
            $$4.i = !fco.this.x.l() && !fco.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(esg.a(fco.s, $$0x -> fco.this.a(fco.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends euf {
      private static final tf c = tf.c("createWorld.tab.more.title");
      private static final tf d = tf.c("selectWorld.gameRules");
      private static final tf e = tf.c("selectWorld.dataPacks");

      c() {
         super(c);
         evo.b $$0 = this.a.b(8).d(1);
         $$0.a(esg.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(esg.a(fco.s, $$0x -> fco.this.a(fco.this.x.k().g())).a(210).a());
         $$0.a(esg.a(e, $$0x -> fco.this.b(fco.this.x.k().g())).a(210).a());
      }

      private void b() {
         fco.this.f.a(new fcp(fco.this.x.q().b(), $$0 -> {
            fco.this.f.a(fco.this);
            $$0.ifPresent(fco.this.x::a);
         }));
      }
   }

   class d extends euf {
      private static final tf c = tf.c("createWorld.tab.world.title");
      private static final tf d = tf.c("generator.minecraft.amplified.info");
      private static final tf e = tf.c("selectWorld.mapFeatures");
      private static final tf f = tf.c("selectWorld.mapFeatures.info");
      private static final tf g = tf.c("selectWorld.bonusItems");
      private static final tf h = tf.c("selectWorld.enterSeed");
      static final tf i = tf.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final esp k;
      private final esg l;

      d() {
         super(c);
         evo.b $$0 = this.a.a(10).b(8).d(2);
         esn<fcx.b> $$1 = $$0.a(
            esn.<fcx.b>a(fcx.b::a).a(this.c()).a(fco.d::a).a(0, 0, 150, 20, tf.c("selectWorld.mapType"), ($$0x, $$1x) -> fco.this.x.a($$1x))
         );
         $$1.a(fco.this.x.m());
         fco.this.x.a($$1x -> {
            fcx.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(etq.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fco.this.x.m().c() != null;
         });
         this.l = $$0.a(esg.a(tf.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fco.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new esp(fco.this.i, 308, 20, tf.c("selectWorld.enterSeed")) {
            @Override
            protected ts az_() {
               return super.az_().b(te.s).b(fco.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fco.this.x.h());
         this.k.b($$0x -> fco.this.x.b(this.k.a()));
         $$0.a(evl.a(fco.this.i, this.k, h), 2);
         fcv.a $$2 = fcv.a(310);
         $$2.a(e, fco.this.x::i, fco.this.x::b).a(() -> !fco.this.x.l()).a(f);
         $$2.a(g, fco.this.x::j, fco.this.x::c).a(() -> !fco.this.x.f() && !fco.this.x.l());
         fcv $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fco.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fct $$0 = fco.this.x.n();
         if ($$0 != null) {
            fco.this.f.a($$0.createEditScreen(fco.this, fco.this.x.k()));
         }
      }

      private esn.c<fcx.b> c() {
         return new esn.c<fcx.b>() {
            @Override
            public List<fcx.b> a() {
               return esn.a.getAsBoolean() ? fco.this.x.p() : fco.this.x.o();
            }

            @Override
            public List<fcx.b> b() {
               return fco.this.x.o();
            }
         };
      }

      private static ts a(esn<fcx.b> $$0) {
         return $$0.a().b() ? te.a($$0.b(), d) : $$0.b();
      }
   }
}
