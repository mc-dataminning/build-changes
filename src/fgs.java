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

public class fgs extends fcc {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vb p = vb.c("selectWorld.gameMode");
   static final vb q = vb.c("selectWorld.enterName");
   static final vb r = vb.c("selectWorld.experiments");
   static final vb t = vb.c("selectWorld.allowCommands.info");
   private static final vb u = vb.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final agt a = new agt("textures/gui/header_separator.png");
   public static final agt b = new agt("textures/gui/footer_separator.png");
   public static final agt c = new agt("textures/gui/light_dirt_background.png");
   final fhb x;
   private final eyj y = new eyj(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final ekr A;
   @Nullable
   private final fcc B;
   @Nullable
   private Path C;
   @Nullable
   private apd D;
   @Nullable
   private ezq E;
   @Nullable
   private eyk F;

   public static void a(euk $$0, @Nullable fcc $$1) {
      a($$0, u);
      apd $$2 = new apd(new apg($$0.ba()));
      aho.c $$3 = a($$2, cts.c);
      CompletableFuture<fha> $$4 = aho.a(
         $$3, $$0x -> new aho.b<>(new fgs.a(new dou(dow.a(), dye.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fha($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fgs($$0, $$1, $$4.join(), Optional.of(dye.a), OptionalLong.empty()));
   }

   public static fgs a(euk $$0, @Nullable fcc $$1, ctc $$2, fha $$3, @Nullable Path $$4) {
      fgs $$5 = new fgs($$0, $$1, $$3, dye.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fhb.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fhb.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fhb.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fgs(euk $$0, @Nullable fcc $$1, fha $$2, Optional<ags<dyd>> $$3, OptionalLong $$4) {
      super(vb.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.ba();
      this.x = new fhb($$0.l().c(), $$2, $$3, $$4);
   }

   public fhb l() {
      return this.x;
   }

   @Override
   protected void aP_() {
      this.F = eyk.a(this.y, this.g).a(new fgs.b(), new fgs.d(), new fgs.c()).a();
      this.d(this.F);
      this.E = new ezq().a(10);
      ezq.b $$0 = this.E.d(2);
      $$0.a(ewh.a(vb.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(ewh.a(va.e, $$0x -> this.C()).a());
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
         ezp.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         fak $$1 = new fak(0, $$0, this.g, this.E.r() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(euk $$0, vb $$1) {
      $$0.d(new fbi($$1));
   }

   private void D() {
      fha $$0 = this.x.k();
      dot.b $$1 = $$0.d().a($$0.c());
      im<ahc> $$2 = $$0.e().a(ahc.c, $$1.b());
      Lifecycle $$3 = chd.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fhc.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(efy.a $$0, im<ahc> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<efu.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == efy.a.c;
         fha $$5 = this.x.k();
         ctc $$6 = this.c($$4);
         ega $$7 = new efy($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private ctc c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         csu $$2 = new csu();
         $$2.a(csu.l).a(false, null);
         return new ctc($$1, csv.d, false, bji.a, true, $$2, cts.c);
      } else {
         return new ctc($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void aF_() {
      this.C();
   }

   @Override
   public void C() {
      this.f.a(this.B);
      this.F();
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, aty.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(evw $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends eyc & ezy> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends eyc & exk & ezy> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path E() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            eyo.c(this.f, this.x.c());
            this.C();
         }
      }

      return this.C;
   }

   void a(cts $$0) {
      Pair<Path, apd> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fgv(this, (apd)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cts $$0) {
      Pair<Path, apd> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new ffj((apd)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vb.c("dataPack.title")));
      }
   }

   private void a(apd $$0, boolean $$1, Consumer<cts> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cts $$5 = new cts(new csm($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         chb $$6 = $$0.e();
         if (chd.a($$6) && $$1) {
            this.f.a(new fgr($$0.f(), $$3x -> {
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

   private void a(apd $$0, cts $$1, Consumer<cts> $$2) {
      this.f.d(new fbi(vb.c("dataPack.validation.working")));
      aho.c $$3 = a($$0, $$1);
      aho.<fgs.a, fha>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(kc.aJ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(kc.as).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fha $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = agr.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dou.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = agr.a(JsonOps.INSTANCE, $$0x.c());
                  dou $$5 = (dou)$$3x.flatMap($$1xx -> dou.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new aho.b<>(new fgs.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fha($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new fav($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cts.c);
                  }
               }, vb.c("dataPack.validation.failed"), va.a, vb.c("dataPack.validation.back"), vb.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static aho.c a(apd $$0, cts $$1) {
      aho.d $$2 = new aho.d($$0, $$1, false, true);
      return new aho.c($$2, dt.a.c, 2);
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

   private Optional<efu.c> G() {
      String $$0 = this.x.c();

      try {
         efu.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(efs.j);
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

      eyo.c(this.f, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, euk $$1) {
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
         eyo.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, apd> c(cts $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = apg.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dou a, cts b) {
   }

   class b extends eyh {
      private static final vb c = vb.c("createWorld.tab.game.title");
      private static final vb d = vb.c("selectWorld.allowCommands");
      private final ewq e;

      b() {
         super(c);
         ezq.b $$0 = this.a.b(8).d(1);
         ezu $$1 = $$0.b();
         this.e = new ewq(fgs.this.i, 208, 20, vb.c("selectWorld.enterName"));
         this.e.a(fgs.this.x.b());
         this.e.b(fgs.this.x::a);
         fgs.this.x.a($$0x -> this.e.a(exs.a(vb.a("selectWorld.targetFolder", vb.b($$0x.c()).a(n.u)))));
         fgs.this.c(this.e);
         $$0.a(ezn.a(fgs.this.i, this.e, fgs.q), $$0.b().b());
         ewo<fhb.a> $$2 = $$0.a(ewo.<fhb.a>a($$0x -> $$0x.f).a(fhb.a.a, fhb.a.b, fhb.a.c).a(0, 0, 210, 20, fgs.p, ($$0x, $$1x) -> fgs.this.x.a($$1x)), $$1);
         fgs.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(exs.a($$1x.d().a()));
         });
         ewo<bji> $$3 = $$0.a(ewo.a(bji::b).a(bji.values()).a(0, 0, 210, 20, vb.c("options.difficulty"), ($$0x, $$1x) -> fgs.this.x.a($$1x)), $$1);
         fgs.this.x.a($$1x -> {
            $$3.a(fgs.this.x.e());
            $$3.i = !fgs.this.x.f();
            $$3.a(exs.a(fgs.this.x.e().d()));
         });
         ewo<Boolean> $$4 = $$0.a(ewo.f().a($$0x -> exs.a(fgs.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fgs.this.x.a($$1x)));
         fgs.this.x.a($$1x -> {
            $$4.a(fgs.this.x.g());
            $$4.i = !fgs.this.x.l() && !fgs.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(ewh.a(fgs.r, $$0x -> fgs.this.a(fgs.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends eyh {
      private static final vb c = vb.c("createWorld.tab.more.title");
      private static final vb d = vb.c("selectWorld.gameRules");
      private static final vb e = vb.c("selectWorld.dataPacks");

      c() {
         super(c);
         ezq.b $$0 = this.a.b(8).d(1);
         $$0.a(ewh.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ewh.a(fgs.r, $$0x -> fgs.this.a(fgs.this.x.k().g())).a(210).a());
         $$0.a(ewh.a(e, $$0x -> fgs.this.b(fgs.this.x.k().g())).a(210).a());
      }

      private void b() {
         fgs.this.f.a(new fgt(fgs.this.x.q().b(), $$0 -> {
            fgs.this.f.a(fgs.this);
            $$0.ifPresent(fgs.this.x::a);
         }));
      }
   }

   class d extends eyh {
      private static final vb c = vb.c("createWorld.tab.world.title");
      private static final vb d = vb.c("generator.minecraft.amplified.info");
      private static final vb e = vb.c("selectWorld.mapFeatures");
      private static final vb f = vb.c("selectWorld.mapFeatures.info");
      private static final vb g = vb.c("selectWorld.bonusItems");
      private static final vb h = vb.c("selectWorld.enterSeed");
      static final vb i = vb.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final ewq k;
      private final ewh l;

      d() {
         super(c);
         ezq.b $$0 = this.a.a(10).b(8).d(2);
         ewo<fhb.b> $$1 = $$0.a(
            ewo.<fhb.b>a(fhb.b::a).a(this.c()).a(fgs.d::a).a(0, 0, 150, 20, vb.c("selectWorld.mapType"), ($$0x, $$1x) -> fgs.this.x.a($$1x))
         );
         $$1.a(fgs.this.x.m());
         fgs.this.x.a($$1x -> {
            fhb.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(exs.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fgs.this.x.m().c() != null;
         });
         this.l = $$0.a(ewh.a(vb.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fgs.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new ewq(fgs.this.i, 308, 20, vb.c("selectWorld.enterSeed")) {
            @Override
            protected vp aM_() {
               return super.aM_().b(va.s).b(fgs.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fgs.this.x.h());
         this.k.b($$0x -> fgs.this.x.b(this.k.a()));
         $$0.a(ezn.a(fgs.this.i, this.k, h), 2);
         fgz.a $$2 = fgz.a(310);
         $$2.a(e, fgs.this.x::i, fgs.this.x::b).a(() -> !fgs.this.x.l()).a(f);
         $$2.a(g, fgs.this.x::j, fgs.this.x::c).a(() -> !fgs.this.x.f() && !fgs.this.x.l());
         fgz $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fgs.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fgx $$0 = fgs.this.x.n();
         if ($$0 != null) {
            fgs.this.f.a($$0.createEditScreen(fgs.this, fgs.this.x.k()));
         }
      }

      private ewo.c<fhb.b> c() {
         return new ewo.c<fhb.b>() {
            @Override
            public List<fhb.b> a() {
               return ewo.a.getAsBoolean() ? fgs.this.x.p() : fgs.this.x.o();
            }

            @Override
            public List<fhb.b> b() {
               return fgs.this.x.o();
            }
         };
      }

      private static vp a(ewo<fhb.b> $$0) {
         return $$0.a().b() ? va.a($$0.e(), d) : $$0.e();
      }
   }
}
