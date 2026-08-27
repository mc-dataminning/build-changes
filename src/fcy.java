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

public class fcy extends eyk {
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
   public static final aew a = new aew("textures/gui/header_separator.png");
   public static final aew b = new aew("textures/gui/footer_separator.png");
   public static final aew c = new aew("textures/gui/light_dirt_background.png");
   final fdh x;
   private final eur y = new eur(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final ehd A;
   @Nullable
   private final eyk B;
   @Nullable
   private Path C;
   @Nullable
   private ane D;
   @Nullable
   private evy E;
   @Nullable
   private eus F;

   public static void a(eqv $$0, @Nullable eyk $$1) {
      a($$0, u);
      ane $$2 = new ane(new anh($$0.bb()));
      afq.c $$3 = a($$2, cqo.c);
      CompletableFuture<fdg> $$4 = afq.a(
         $$3, $$0x -> new afq.b<>(new fcy.a(new dlo(dlq.a(), duy.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fdg($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fcy($$0, $$1, $$4.join(), Optional.of(duy.a), OptionalLong.empty()));
   }

   public static fcy a(eqv $$0, @Nullable eyk $$1, cpz $$2, fdg $$3, @Nullable Path $$4) {
      fcy $$5 = new fcy($$0, $$1, $$3, duy.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fdh.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fdh.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fdh.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fcy(eqv $$0, @Nullable eyk $$1, fdg $$2, Optional<aev<dux>> $$3, OptionalLong $$4) {
      super(tl.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bb();
      this.x = new fdh($$0.l().c(), $$2, $$3, $$4);
   }

   public fdh l() {
      return this.x;
   }

   @Override
   protected void aH_() {
      this.F = eus.a(this.y, this.g).a(new fcy.b(), new fcy.d(), new fcy.c()).a();
      this.d(this.F);
      this.E = new evy().a(10);
      evy.b $$0 = this.E.d(2);
      $$0.a(esq.a(tl.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(esq.a(tk.e, $$0x -> this.D()).a());
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
         evx.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         ews $$1 = new ews(0, $$0, this.g, this.E.t() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(eqv $$0, tl $$1) {
      $$0.d(new exq($$1));
   }

   private void E() {
      fdg $$0 = this.x.k();
      dln.b $$1 = $$0.d().a($$0.c());
      hl<aff> $$2 = $$0.e().a(aff.c, $$1.b());
      Lifecycle $$3 = cee.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fdi.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eck.a $$0, hl<aff> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<ecg.c> $$3 = this.H();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == eck.a.c;
         fdg $$5 = this.x.k();
         cpz $$6 = this.c($$4);
         ecm $$7 = new eck($$6, $$5.b(), $$0, $$2);
         this.f.y().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cpz c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cpr $$2 = new cpr();
         $$2.a(cpr.k).a(false, null);
         return new cpz($$1, cps.d, false, bgv.a, true, $$2, cqo.c);
      } else {
         return new cpz($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, arw.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(esf $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends euk & ewg> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends euk & ets & ewg> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path F() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            euw.c(this.f, this.x.c());
            this.D();
         }
      }

      return this.C;
   }

   void a(cqo $$0) {
      Pair<Path, ane> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fdb(this, (ane)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cqo $$0) {
      Pair<Path, ane> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fbp((ane)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), tl.c("dataPack.title")));
      }
   }

   private void a(ane $$0, boolean $$1, Consumer<cqo> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cqo $$5 = new cqo(new cpj($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cec $$6 = $$0.e();
         if (cee.a($$6) && $$1) {
            this.f.a(new fcx($$0.f(), $$3x -> {
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

   private void a(ane $$0, cqo $$1, Consumer<cqo> $$2) {
      this.f.d(new exq(tl.c("dataPack.validation.working")));
      afq.c $$3 = a($$0, $$1);
      afq.<fcy.a, fdg>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jc.aF).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jc.ap).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fdg $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aeu.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dlo.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aeu.a(JsonOps.INSTANCE, $$0x.c());
                  dlo $$5 = (dlo)$$3x.flatMap($$1xx -> dlo.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new afq.b<>(new fcy.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fdg($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new exd($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cqo.c);
                  }
               }, tl.c("dataPack.validation.failed"), tk.a, tl.c("dataPack.validation.back"), tl.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static afq.c a(ane $$0, cqo $$1) {
      afq.d $$2 = new afq.d($$0, $$1, false, true);
      return new afq.c($$2, du.a.c, 2);
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

   private Optional<ecg.c> H() {
      String $$0 = this.x.c();

      try {
         ecg.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(ece.j);
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

      euw.c(this.f, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eqv $$1) {
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
         euw.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, ane> c(cqo $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = anh.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dlo a, cqo b) {
   }

   class b extends eup {
      private static final tl c = tl.c("createWorld.tab.game.title");
      private static final tl d = tl.c("selectWorld.allowCommands");
      private final esz e;

      b() {
         super(c);
         evy.b $$0 = this.a.b(8).d(1);
         ewc $$1 = $$0.b();
         this.e = new esz(fcy.this.i, 208, 20, tl.c("selectWorld.enterName"));
         this.e.a(fcy.this.x.b());
         this.e.b(fcy.this.x::a);
         fcy.this.x.a($$0x -> this.e.a(eua.a(tl.a("selectWorld.targetFolder", tl.b($$0x.c()).a(n.u)))));
         fcy.this.c(this.e);
         $$0.a(evv.a(fcy.this.i, this.e, fcy.q), $$0.b().b());
         esx<fdh.a> $$2 = $$0.a(esx.<fdh.a>a($$0x -> $$0x.f).a(fdh.a.a, fdh.a.b, fdh.a.c).a(0, 0, 210, 20, fcy.p, ($$0x, $$1x) -> fcy.this.x.a($$1x)), $$1);
         fcy.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(eua.a($$1x.d().a()));
         });
         esx<bgv> $$3 = $$0.a(esx.a(bgv::b).a(bgv.values()).a(0, 0, 210, 20, tl.c("options.difficulty"), ($$0x, $$1x) -> fcy.this.x.a($$1x)), $$1);
         fcy.this.x.a($$1x -> {
            $$3.a(fcy.this.x.e());
            $$3.i = !fcy.this.x.f();
            $$3.a(eua.a(fcy.this.x.e().d()));
         });
         esx<Boolean> $$4 = $$0.a(esx.e().a($$0x -> eua.a(fcy.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fcy.this.x.a($$1x)));
         fcy.this.x.a($$1x -> {
            $$4.a(fcy.this.x.g());
            $$4.i = !fcy.this.x.l() && !fcy.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(esq.a(fcy.s, $$0x -> fcy.this.a(fcy.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends eup {
      private static final tl c = tl.c("createWorld.tab.more.title");
      private static final tl d = tl.c("selectWorld.gameRules");
      private static final tl e = tl.c("selectWorld.dataPacks");

      c() {
         super(c);
         evy.b $$0 = this.a.b(8).d(1);
         $$0.a(esq.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(esq.a(fcy.s, $$0x -> fcy.this.a(fcy.this.x.k().g())).a(210).a());
         $$0.a(esq.a(e, $$0x -> fcy.this.b(fcy.this.x.k().g())).a(210).a());
      }

      private void b() {
         fcy.this.f.a(new fcz(fcy.this.x.q().b(), $$0 -> {
            fcy.this.f.a(fcy.this);
            $$0.ifPresent(fcy.this.x::a);
         }));
      }
   }

   class d extends eup {
      private static final tl c = tl.c("createWorld.tab.world.title");
      private static final tl d = tl.c("generator.minecraft.amplified.info");
      private static final tl e = tl.c("selectWorld.mapFeatures");
      private static final tl f = tl.c("selectWorld.mapFeatures.info");
      private static final tl g = tl.c("selectWorld.bonusItems");
      private static final tl h = tl.c("selectWorld.enterSeed");
      static final tl i = tl.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final esz k;
      private final esq l;

      d() {
         super(c);
         evy.b $$0 = this.a.a(10).b(8).d(2);
         esx<fdh.b> $$1 = $$0.a(
            esx.<fdh.b>a(fdh.b::a).a(this.c()).a(fcy.d::a).a(0, 0, 150, 20, tl.c("selectWorld.mapType"), ($$0x, $$1x) -> fcy.this.x.a($$1x))
         );
         $$1.a(fcy.this.x.m());
         fcy.this.x.a($$1x -> {
            fdh.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(eua.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fcy.this.x.m().c() != null;
         });
         this.l = $$0.a(esq.a(tl.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fcy.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new esz(fcy.this.i, 308, 20, tl.c("selectWorld.enterSeed")) {
            @Override
            protected ty aE_() {
               return super.aE_().b(tk.s).b(fcy.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fcy.this.x.h());
         this.k.b($$0x -> fcy.this.x.b(this.k.a()));
         $$0.a(evv.a(fcy.this.i, this.k, h), 2);
         fdf.a $$2 = fdf.a(310);
         $$2.a(e, fcy.this.x::i, fcy.this.x::b).a(() -> !fcy.this.x.l()).a(f);
         $$2.a(g, fcy.this.x::j, fcy.this.x::c).a(() -> !fcy.this.x.f() && !fcy.this.x.l());
         fdf $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fcy.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fdd $$0 = fcy.this.x.n();
         if ($$0 != null) {
            fcy.this.f.a($$0.createEditScreen(fcy.this, fcy.this.x.k()));
         }
      }

      private esx.c<fdh.b> c() {
         return new esx.c<fdh.b>() {
            @Override
            public List<fdh.b> a() {
               return esx.a.getAsBoolean() ? fcy.this.x.p() : fcy.this.x.o();
            }

            @Override
            public List<fdh.b> b() {
               return fcy.this.x.o();
            }
         };
      }

      private static ty a(esx<fdh.b> $$0) {
         return $$0.a().b() ? tk.a($$0.b(), d) : $$0.b();
      }
   }
}
