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

public class fcj extends exz {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final int n = 1;
   private static final Logger o = LogUtils.getLogger();
   private static final String p = "mcworld-";
   static final tf q = tf.c("selectWorld.gameMode");
   static final tf s = tf.c("selectWorld.enterName");
   static final tf t = tf.c("selectWorld.experiments");
   static final tf u = tf.c("selectWorld.allowCommands.info");
   private static final tf v = tf.c("createWorld.preparing");
   private static final int w = 10;
   private static final int x = 8;
   public static final aer a = new aer("textures/gui/header_separator.png");
   public static final aer b = new aer("textures/gui/footer_separator.png");
   public static final aer c = new aer("textures/gui/light_dirt_background.png");
   final fcs y;
   private final euh z = new euh(this::d, $$1x -> this.f($$1x));
   private boolean A;
   private final egu B;
   @Nullable
   private final exz C;
   @Nullable
   private Path D;
   @Nullable
   private amx E;
   @Nullable
   private evn F;
   @Nullable
   private eui G;

   public static void a(eqm $$0, @Nullable exz $$1) {
      a($$0, v);
      amx $$2 = new amx(new ana($$0.bb()));
      afl.c $$3 = a($$2, cqf.c);
      CompletableFuture<fcr> $$4 = afl.a(
         $$3, $$0x -> new afl.b<>(new fcj.a(new dlf(dlh.a(), dup.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fcr($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fcj($$0, $$1, $$4.join(), Optional.of(dup.a), OptionalLong.empty()));
   }

   public static fcj a(eqm $$0, @Nullable exz $$1, cpq $$2, fcr $$3, @Nullable Path $$4) {
      fcj $$5 = new fcj($$0, $$1, $$3, dup.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.A = true;
      $$5.y.a($$2.a());
      $$5.y.a($$2.e());
      $$5.y.a($$2.d());
      $$5.y.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.y.a(fcs.a.b);
      } else if ($$2.b().h()) {
         $$5.y.a(fcs.a.a);
      } else if ($$2.b().g()) {
         $$5.y.a(fcs.a.c);
      }

      $$5.D = $$4;
      return $$5;
   }

   private fcj(eqm $$0, @Nullable exz $$1, fcr $$2, Optional<aeq<duo>> $$3, OptionalLong $$4) {
      super(tf.c("selectWorld.create"));
      this.C = $$1;
      this.B = $$0.bb();
      this.y = new fcs($$0.l().c(), $$2, $$3, $$4);
   }

   public fcs l() {
      return this.y;
   }

   @Override
   protected void aE_() {
      this.G = eui.a(this.z, this.g).a(new fcj.b(), new fcj.d(), new fcj.c()).a();
      this.d(this.G);
      this.F = new evn().a(10);
      evn.b $$0 = this.F.d(2);
      $$0.a(esh.a(tf.c("selectWorld.create"), $$0x -> this.C()).a());
      $$0.a(esh.a(te.e, $$0x -> this.B()).a());
      this.F.a($$0x -> {
         $$0x.g(1);
         this.d($$0x);
      });
      this.G.a(0, false);
      this.y.a();
      this.b();
   }

   @Override
   public void b() {
      if (this.G != null && this.F != null) {
         this.G.a(this.g);
         this.G.b();
         this.F.a();
         evm.a(this.F, 0, this.h - 36, this.g, 36);
         int $$0 = this.G.s().c();
         ewh $$1 = new ewh(0, $$0, this.g, this.F.r() - $$0);
         this.z.a($$1);
      }
   }

   private static void a(eqm $$0, tf $$1) {
      $$0.d(new exf($$1));
   }

   private void C() {
      fcr $$0 = this.y.k();
      dle.b $$1 = $$0.d().a($$0.c());
      hl<afa> $$2 = $$0.e().a(afa.c, $$1.b());
      Lifecycle $$3 = cdx.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.A && $$4 == Lifecycle.stable();
      fct.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(ecb.a $$0, hl<afa> $$1, Lifecycle $$2) {
      a(this.f, v);
      Optional<ebx.c> $$3 = this.F();
      if (!$$3.isEmpty()) {
         this.E();
         boolean $$4 = $$0 == ecb.a.c;
         fcr $$5 = this.y.k();
         cpq $$6 = this.c($$4);
         ecd $$7 = new ecb($$6, $$5.b(), $$0, $$2);
         this.f.y().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cpq c(boolean $$0) {
      String $$1 = this.y.b().trim();
      if ($$0) {
         cpi $$2 = new cpi();
         $$2.a(cpi.k).a(false, null);
         return new cpq($$1, cpj.d, false, bgn.a, true, $$2, cqf.c);
      } else {
         return new cpq($$1, this.y.d().e, this.y.f(), this.y.e(), this.y.g(), this.y.q(), this.y.k().g());
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
         this.C();
         return true;
      }
   }

   @Override
   public void au_() {
      this.B();
   }

   @Override
   public void B() {
      this.f.a(this.C);
      this.E();
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, arp.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(erw $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eua & evv> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eua & eti & evv> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path D() {
      if (this.D == null) {
         try {
            this.D = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            o.warn("Failed to create temporary dir", var2);
            eum.c(this.f, this.y.c());
            this.B();
         }
      }

      return this.D;
   }

   void a(cqf $$0) {
      Pair<Path, amx> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fcm(this, (amx)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cqf $$0) {
      Pair<Path, amx> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fbe((amx)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), tf.c("dataPack.title")));
      }
   }

   private void a(amx $$0, boolean $$1, Consumer<cqf> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cqf $$5 = new cqf(new cpa($$3, $$4), this.y.k().g().b());
      if (this.y.a($$5)) {
         this.f.a(this);
      } else {
         cdv $$6 = $$0.e();
         if (cdx.a($$6) && $$1) {
            this.f.a(new fci($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.y.k().g());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(amx $$0, cqf $$1, Consumer<cqf> $$2) {
      this.f.d(new exf(tf.c("dataPack.validation.working")));
      afl.c $$3 = a($$0, $$1);
      afl.<fcj.a, fcr>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jc.aF).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jc.ap).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fcr $$1x = this.y.k();
                  DynamicOps<JsonElement> $$2x = aep.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dlf.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aep.a(JsonOps.INSTANCE, $$0x.c());
                  dlf $$5 = (dlf)$$3x.flatMap($$1xx -> dlf.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", o::error));
                  return new afl.b<>(new fcj.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fcr($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.y::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               o.warn("Failed to validate datapack", $$2x);
               this.f.a(new ews($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.y.k().g());
                  } else {
                     $$2.accept(cqf.c);
                  }
               }, tf.c("dataPack.validation.failed"), te.a, tf.c("dataPack.validation.back"), tf.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static afl.c a(amx $$0, cqf $$1) {
      afl.d $$2 = new afl.d($$0, $$1, false, true);
      return new afl.c($$2, ds.a.c, 2);
   }

   private void E() {
      if (this.D != null) {
         try (Stream<Path> $$0 = Files.walk(this.D)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  o.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            o.warn("Failed to list temporary dir {}", this.D);
         }

         this.D = null;
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

   private Optional<ebx.c> F() {
      String $$0 = this.y.c();

      try {
         ebx.c $$1 = this.f.l().d($$0);
         if (this.D == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.D)) {
               Path $$3 = $$1.a(ebv.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.D)).forEach($$1x -> a(this.D, $$3, $$1x));
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

      eum.c(this.f, $$0);
      this.B();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eqm $$1) {
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
         eum.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, amx> c(cqf $$0) {
      Path $$1 = this.D();
      if ($$1 != null) {
         if (this.E == null) {
            this.E = ana.a($$1, this.B);
            this.E.a();
         }

         this.E.a($$0.a().a());
         return Pair.of($$1, this.E);
      } else {
         return null;
      }
   }

   static record a(dlf a, cqf b) {
   }

   class b extends euf {
      private static final tf c = tf.c("createWorld.tab.game.title");
      private static final tf d = tf.c("selectWorld.allowCommands");
      private final esq e;

      b() {
         super(c);
         evn.b $$0 = this.a.b(8).d(1);
         evr $$1 = $$0.b();
         evn.b $$2 = new evn().b(4).d(1);
         $$2.a(new etm(fcj.s, fcj.this.f.h), $$2.b().b(1));
         this.e = $$2.a(new esq(fcj.this.i, 210, 20, tf.c("selectWorld.enterName")), $$2.b());
         this.e.a(fcj.this.y.b());
         this.e.b(fcj.this.y::a);
         fcj.this.y.a($$0x -> this.e.a(etq.a(tf.a("selectWorld.targetFolder", tf.b($$0x.c()).a(n.u)))));
         fcj.this.c(this.e);
         $$0.a($$2.a(), $$0.b().b());
         eso<fcs.a> $$3 = $$0.a(eso.<fcs.a>a($$0x -> $$0x.f).a(fcs.a.a, fcs.a.b, fcs.a.c).a(0, 0, 210, 20, fcj.q, ($$0x, $$1x) -> fcj.this.y.a($$1x)), $$1);
         fcj.this.y.a($$1x -> {
            $$3.a($$1x.d());
            $$3.i = !$$1x.l();
            $$3.a(etq.a($$1x.d().a()));
         });
         eso<bgn> $$4 = $$0.a(eso.a(bgn::b).a(bgn.values()).a(0, 0, 210, 20, tf.c("options.difficulty"), ($$0x, $$1x) -> fcj.this.y.a($$1x)), $$1);
         fcj.this.y.a($$1x -> {
            $$4.a(fcj.this.y.e());
            $$4.i = !fcj.this.y.f();
            $$4.a(etq.a(fcj.this.y.e().d()));
         });
         eso<Boolean> $$5 = $$0.a(eso.e().a($$0x -> etq.a(fcj.u)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fcj.this.y.a($$1x)));
         fcj.this.y.a($$1x -> {
            $$5.a(fcj.this.y.g());
            $$5.i = !fcj.this.y.l() && !fcj.this.y.f();
         });
         if (!aa.b().g()) {
            $$0.a(esh.a(fcj.t, $$0x -> fcj.this.a(fcj.this.y.k().g())).a(210).a());
         }
      }
   }

   class c extends euf {
      private static final tf c = tf.c("createWorld.tab.more.title");
      private static final tf d = tf.c("selectWorld.gameRules");
      private static final tf e = tf.c("selectWorld.dataPacks");

      c() {
         super(c);
         evn.b $$0 = this.a.b(8).d(1);
         $$0.a(esh.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(esh.a(fcj.t, $$0x -> fcj.this.a(fcj.this.y.k().g())).a(210).a());
         $$0.a(esh.a(e, $$0x -> fcj.this.b(fcj.this.y.k().g())).a(210).a());
      }

      private void b() {
         fcj.this.f.a(new fck(fcj.this.y.q().b(), $$0 -> {
            fcj.this.f.a(fcj.this);
            $$0.ifPresent(fcj.this.y::a);
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
      private final esq k;
      private final esh l;

      d() {
         super(c);
         evn.b $$0 = this.a.a(10).b(8).d(2);
         eso<fcs.b> $$1 = $$0.a(
            eso.<fcs.b>a(fcs.b::a).a(this.c()).a(fcj.d::a).a(0, 0, 150, 20, tf.c("selectWorld.mapType"), ($$0x, $$1x) -> fcj.this.y.a($$1x))
         );
         $$1.a(fcj.this.y.m());
         fcj.this.y.a($$1x -> {
            fcs.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(etq.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fcj.this.y.m().c() != null;
         });
         this.l = $$0.a(esh.a(tf.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fcj.this.y.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         evn.b $$2 = new evn().b(4).d(1);
         $$2.a(new etm(h, fcj.this.i).e());
         this.k = $$2.a(new esq(fcj.this.i, 310, 20, tf.c("selectWorld.enterSeed")) {
            @Override
            protected ts aB_() {
               return super.aB_().b(te.s).b(fcj.d.i);
            }
         });
         this.k.c(i);
         this.k.a(fcj.this.y.h());
         this.k.b($$0x -> fcj.this.y.b(this.k.a()));
         $$0.a($$2.a(), 2);
         fcq.a $$3 = fcq.a(310).a(1);
         $$3.a(e, fcj.this.y::i, fcj.this.y::b).a(() -> !fcj.this.y.l()).a(f);
         $$3.a(g, fcj.this.y::j, fcj.this.y::c).a(() -> !fcj.this.y.f() && !fcj.this.y.l());
         fcq $$4 = $$3.a($$1x -> $$0.a($$1x, 2));
         fcj.this.y.a($$1x -> $$4.a());
      }

      private void b() {
         fco $$0 = fcj.this.y.n();
         if ($$0 != null) {
            fcj.this.f.a($$0.createEditScreen(fcj.this, fcj.this.y.k()));
         }
      }

      private eso.c<fcs.b> c() {
         return new eso.c<fcs.b>() {
            @Override
            public List<fcs.b> a() {
               return eso.a.getAsBoolean() ? fcj.this.y.p() : fcj.this.y.o();
            }

            @Override
            public List<fcs.b> b() {
               return fcj.this.y.o();
            }
         };
      }

      private static ts a(eso<fcs.b> $$0) {
         return $$0.a().b() ? te.a($$0.b(), d) : $$0.b();
      }
   }
}
