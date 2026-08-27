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

public class fct extends eye {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final tl p = tl.c("selectWorld.gameMode");
   static final tl q = tl.c("selectWorld.enterName");
   static final tl s = tl.c("selectWorld.experiments");
   static final tl t = tl.c("selectWorld.allowCommands.info");
   private static final tl u = tl.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final aez a = new aez("textures/gui/header_separator.png");
   public static final aez b = new aez("textures/gui/footer_separator.png");
   public static final aez c = new aez("textures/gui/light_dirt_background.png");
   final fdc x;
   private final eum y = new eum(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final egx A;
   @Nullable
   private final eye B;
   @Nullable
   private Path C;
   @Nullable
   private anh D;
   @Nullable
   private evt E;
   @Nullable
   private eun F;

   public static void a(eqp $$0, @Nullable eye $$1) {
      a($$0, u);
      anh $$2 = new anh(new ank($$0.bb()));
      aft.c $$3 = a($$2, cqu.c);
      CompletableFuture<fdb> $$4 = aft.a(
         $$3, $$0x -> new aft.b<>(new fct.a(new dli(dlk.a(), dus.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fdb($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fct($$0, $$1, $$4.join(), Optional.of(dus.a), OptionalLong.empty()));
   }

   public static fct a(eqp $$0, @Nullable eye $$1, cqf $$2, fdb $$3, @Nullable Path $$4) {
      fct $$5 = new fct($$0, $$1, $$3, dus.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fdc.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fdc.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fdc.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fct(eqp $$0, @Nullable eye $$1, fdb $$2, Optional<aey<dur>> $$3, OptionalLong $$4) {
      super(tl.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bb();
      this.x = new fdc($$0.l().c(), $$2, $$3, $$4);
   }

   public fdc l() {
      return this.x;
   }

   @Override
   protected void aH_() {
      this.F = eun.a(this.y, this.g).a(new fct.b(), new fct.d(), new fct.c()).a();
      this.d(this.F);
      this.E = new evt().a(10);
      evt.b $$0 = this.E.d(2);
      $$0.a(esk.a(tl.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(esk.a(tk.e, $$0x -> this.D()).a());
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
         evs.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         ewn $$1 = new ewn(0, $$0, this.g, this.E.t() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(eqp $$0, tl $$1) {
      $$0.d(new exl($$1));
   }

   private void E() {
      fdb $$0 = this.x.k();
      dlh.b $$1 = $$0.d().a($$0.c());
      hl<afi> $$2 = $$0.e().a(afi.c, $$1.b());
      Lifecycle $$3 = cek.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fdd.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(ece.a $$0, hl<afi> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<eca.c> $$3 = this.H();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == ece.a.c;
         fdb $$5 = this.x.k();
         cqf $$6 = this.c($$4);
         ecg $$7 = new ece($$6, $$5.b(), $$0, $$2);
         this.f.y().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cqf c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cpx $$2 = new cpx();
         $$2.a(cpx.k).a(false, null);
         return new cqf($$1, cpy.d, false, bhb.a, true, $$2, cqu.c);
      } else {
         return new cqf($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, asb.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(erz $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends euf & ewb> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends euf & etn & ewb> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path F() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            eur.c(this.f, this.x.c());
            this.D();
         }
      }

      return this.C;
   }

   void a(cqu $$0) {
      Pair<Path, anh> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fcw(this, (anh)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cqu $$0) {
      Pair<Path, anh> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fbk((anh)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), tl.c("dataPack.title")));
      }
   }

   private void a(anh $$0, boolean $$1, Consumer<cqu> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cqu $$5 = new cqu(new cpp($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cei $$6 = $$0.e();
         if (cek.a($$6) && $$1) {
            this.f.a(new fcs($$0.f(), $$3x -> {
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

   private void a(anh $$0, cqu $$1, Consumer<cqu> $$2) {
      this.f.d(new exl(tl.c("dataPack.validation.working")));
      aft.c $$3 = a($$0, $$1);
      aft.<fct.a, fdb>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jc.aG).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jc.aq).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fdb $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aex.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dli.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aex.a(JsonOps.INSTANCE, $$0x.c());
                  dli $$5 = (dli)$$3x.flatMap($$1xx -> dli.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new aft.b<>(new fct.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fdb($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new ewy($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cqu.c);
                  }
               }, tl.c("dataPack.validation.failed"), tk.a, tl.c("dataPack.validation.back"), tl.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static aft.c a(anh $$0, cqu $$1) {
      aft.d $$2 = new aft.d($$0, $$1, false, true);
      return new aft.c($$2, du.a.c, 2);
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

   private Optional<eca.c> H() {
      String $$0 = this.x.c();

      try {
         eca.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(eby.j);
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

      eur.c(this.f, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eqp $$1) {
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
         eur.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, anh> c(cqu $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = ank.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dli a, cqu b) {
   }

   class b extends euk {
      private static final tl c = tl.c("createWorld.tab.game.title");
      private static final tl d = tl.c("selectWorld.allowCommands");
      private final est e;

      b() {
         super(c);
         evt.b $$0 = this.a.b(8).d(1);
         evx $$1 = $$0.b();
         this.e = new est(fct.this.i, 208, 20, tl.c("selectWorld.enterName"));
         this.e.a(fct.this.x.b());
         this.e.b(fct.this.x::a);
         fct.this.x.a($$0x -> this.e.a(etv.a(tl.a("selectWorld.targetFolder", tl.b($$0x.c()).a(n.u)))));
         fct.this.c(this.e);
         $$0.a(evq.a(fct.this.i, this.e, fct.q), $$0.b().b());
         esr<fdc.a> $$2 = $$0.a(esr.<fdc.a>a($$0x -> $$0x.f).a(fdc.a.a, fdc.a.b, fdc.a.c).a(0, 0, 210, 20, fct.p, ($$0x, $$1x) -> fct.this.x.a($$1x)), $$1);
         fct.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(etv.a($$1x.d().a()));
         });
         esr<bhb> $$3 = $$0.a(esr.a(bhb::b).a(bhb.values()).a(0, 0, 210, 20, tl.c("options.difficulty"), ($$0x, $$1x) -> fct.this.x.a($$1x)), $$1);
         fct.this.x.a($$1x -> {
            $$3.a(fct.this.x.e());
            $$3.i = !fct.this.x.f();
            $$3.a(etv.a(fct.this.x.e().d()));
         });
         esr<Boolean> $$4 = $$0.a(esr.e().a($$0x -> etv.a(fct.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fct.this.x.a($$1x)));
         fct.this.x.a($$1x -> {
            $$4.a(fct.this.x.g());
            $$4.i = !fct.this.x.l() && !fct.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(esk.a(fct.s, $$0x -> fct.this.a(fct.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends euk {
      private static final tl c = tl.c("createWorld.tab.more.title");
      private static final tl d = tl.c("selectWorld.gameRules");
      private static final tl e = tl.c("selectWorld.dataPacks");

      c() {
         super(c);
         evt.b $$0 = this.a.b(8).d(1);
         $$0.a(esk.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(esk.a(fct.s, $$0x -> fct.this.a(fct.this.x.k().g())).a(210).a());
         $$0.a(esk.a(e, $$0x -> fct.this.b(fct.this.x.k().g())).a(210).a());
      }

      private void b() {
         fct.this.f.a(new fcu(fct.this.x.q().b(), $$0 -> {
            fct.this.f.a(fct.this);
            $$0.ifPresent(fct.this.x::a);
         }));
      }
   }

   class d extends euk {
      private static final tl c = tl.c("createWorld.tab.world.title");
      private static final tl d = tl.c("generator.minecraft.amplified.info");
      private static final tl e = tl.c("selectWorld.mapFeatures");
      private static final tl f = tl.c("selectWorld.mapFeatures.info");
      private static final tl g = tl.c("selectWorld.bonusItems");
      private static final tl h = tl.c("selectWorld.enterSeed");
      static final tl i = tl.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final est k;
      private final esk l;

      d() {
         super(c);
         evt.b $$0 = this.a.a(10).b(8).d(2);
         esr<fdc.b> $$1 = $$0.a(
            esr.<fdc.b>a(fdc.b::a).a(this.c()).a(fct.d::a).a(0, 0, 150, 20, tl.c("selectWorld.mapType"), ($$0x, $$1x) -> fct.this.x.a($$1x))
         );
         $$1.a(fct.this.x.m());
         fct.this.x.a($$1x -> {
            fdc.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(etv.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fct.this.x.m().c() != null;
         });
         this.l = $$0.a(esk.a(tl.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fct.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new est(fct.this.i, 308, 20, tl.c("selectWorld.enterSeed")) {
            @Override
            protected tz aE_() {
               return super.aE_().b(tk.s).b(fct.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fct.this.x.h());
         this.k.b($$0x -> fct.this.x.b(this.k.a()));
         $$0.a(evq.a(fct.this.i, this.k, h), 2);
         fda.a $$2 = fda.a(310);
         $$2.a(e, fct.this.x::i, fct.this.x::b).a(() -> !fct.this.x.l()).a(f);
         $$2.a(g, fct.this.x::j, fct.this.x::c).a(() -> !fct.this.x.f() && !fct.this.x.l());
         fda $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fct.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fcy $$0 = fct.this.x.n();
         if ($$0 != null) {
            fct.this.f.a($$0.createEditScreen(fct.this, fct.this.x.k()));
         }
      }

      private esr.c<fdc.b> c() {
         return new esr.c<fdc.b>() {
            @Override
            public List<fdc.b> a() {
               return esr.a.getAsBoolean() ? fct.this.x.p() : fct.this.x.o();
            }

            @Override
            public List<fdc.b> b() {
               return fct.this.x.o();
            }
         };
      }

      private static tz a(esr<fdc.b> $$0) {
         return $$0.a().b() ? tk.a($$0.b(), d) : $$0.b();
      }
   }
}
