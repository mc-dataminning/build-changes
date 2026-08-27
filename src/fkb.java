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

public class fkb extends ffl {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final vq p = vq.c("selectWorld.gameMode");
   static final vq q = vq.c("selectWorld.enterName");
   static final vq r = vq.c("selectWorld.experiments");
   static final vq t = vq.c("selectWorld.allowCommands.info");
   private static final vq u = vq.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final aiy a = new aiy("textures/gui/header_separator.png");
   public static final aiy b = new aiy("textures/gui/footer_separator.png");
   public static final aiy c = new aiy("textures/gui/light_dirt_background.png");
   final fkk x;
   private final fbr y = new fbr(this::c, $$1x -> this.e($$1x));
   private boolean z;
   private final enp A;
   @Nullable
   private final ffl B;
   @Nullable
   private Path C;
   @Nullable
   private arm D;
   @Nullable
   private fcz E;
   @Nullable
   private fbs F;

   public static void a(exo $$0, @Nullable ffl $$1) {
      a($$0, u);
      arm $$2 = new arm(new arp($$0.bd()));
      ajt.c $$3 = a($$2, cwl.c);
      CompletableFuture<fkj> $$4 = ajt.a(
         $$3, $$0x -> new ajt.b<>(new fkb.a(new drr(drt.a(), ebb.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fkj($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fkb($$0, $$1, $$4.join(), Optional.of(ebb.a), OptionalLong.empty()));
   }

   public static fkb a(exo $$0, @Nullable ffl $$1, cvv $$2, fkj $$3, @Nullable Path $$4) {
      fkb $$5 = new fkb($$0, $$1, $$3, ebb.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(fkk.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(fkk.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(fkk.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fkb(exo $$0, @Nullable ffl $$1, fkj $$2, Optional<aix<eba>> $$3, OptionalLong $$4) {
      super(vq.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.bd();
      this.x = new fkk($$0.l().c(), $$2, $$3, $$4);
   }

   public fkk o() {
      return this.x;
   }

   @Override
   protected void aQ_() {
      this.F = fbs.a(this.y, this.g).a(new fkb.b(), new fkb.d(), new fkb.c()).a();
      this.c(this.F);
      this.E = new fcz().a(10);
      fcz.b $$0 = this.E.d(2);
      $$0.a(ezo.a(vq.c("selectWorld.create"), $$0x -> this.H()).a());
      $$0.a(ezo.a(vp.e, $$0x -> this.E()).a());
      this.E.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.F.a(0, false);
      this.x.a();
      this.c();
   }

   @Override
   protected void aH_() {
   }

   @Override
   public void c() {
      if (this.F != null && this.E != null) {
         this.F.a(this.g);
         this.F.a();
         this.E.a();
         fcy.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.F().c();
         fdt $$1 = new fdt(0, $$0, this.g, this.E.C() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(exo $$0, vq $$1) {
      $$0.d(new fer($$1));
   }

   private void H() {
      fkj $$0 = this.x.k();
      drq.b $$1 = $$0.d().a($$0.c());
      iq<ajh> $$2 = $$0.e().a(ajh.c, $$1.b());
      Lifecycle $$3 = cjy.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      fkl.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eiw.a $$0, iq<ajh> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<eis.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eiw.a.c;
         fkj $$5 = this.x.k();
         cvv $$6 = this.c($$4);
         eiy $$7 = new eiw($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private cvv c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cvn $$2 = new cvn();
         $$2.a(cvn.l).a(false, null);
         return new cvv($$1, cvo.d, false, blt.a, true, $$2, cwl.c);
      } else {
         return new cvv($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, awi.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(ezb $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends fbk & fdh> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fbk & far & fdh> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path I() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            fbw.c(this.f, this.x.c());
            this.E();
         }
      }

      return this.C;
   }

   void a(cwl $$0) {
      Pair<Path, arm> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fke(this, (arm)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(cwl $$0) {
      Pair<Path, arm> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fis((arm)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), vq.c("dataPack.title")));
      }
   }

   private void a(arm $$0, boolean $$1, Consumer<cwl> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      cwl $$5 = new cwl(new cvf($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cjw $$6 = $$0.e();
         if (cjy.a($$6) && $$1) {
            this.f.a(new fka($$0.f(), $$3x -> {
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

   private void a(arm $$0, cwl $$1, Consumer<cwl> $$2) {
      this.f.d(new fer(vq.c("dataPack.validation.working")));
      ajt.c $$3 = a($$0, $$1);
      ajt.<fkb.a, fkj>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(kg.aK).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(kg.at).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fkj $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = aiw.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = drr.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = aiw.a(JsonOps.INSTANCE, $$0x.c());
                  drr $$5 = (drr)$$3x.flatMap($$1xx -> drr.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new ajt.b<>(new fkb.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fkj($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new fee($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(cwl.c);
                  }
               }, vq.c("dataPack.validation.failed"), vp.a, vq.c("dataPack.validation.back"), vq.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static ajt.c a(arm $$0, cwl $$1) {
      ajt.d $$2 = new ajt.d($$0, $$1, false, true);
      return new ajt.c($$2, dv.a.c, 2);
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

   private Optional<eis.c> K() {
      String $$0 = this.x.c();

      try {
         eis.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(eiq.j);
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

      fbw.c(this.f, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, exo $$1) {
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
         fbw.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, arm> c(cwl $$0) {
      Path $$1 = this.I();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = arp.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(drr a, cwl b) {
   }

   class b extends fbp {
      private static final vq c = vq.c("createWorld.tab.game.title");
      private static final vq d = vq.c("selectWorld.allowCommands.new");
      private final ezx e;

      b() {
         super(c);
         fcz.b $$0 = this.a.b(8).d(1);
         fdd $$1 = $$0.b();
         this.e = new ezx(fkb.this.i, 208, 20, vq.c("selectWorld.enterName"));
         this.e.a(fkb.this.x.b());
         this.e.b(fkb.this.x::a);
         fkb.this.x.a($$0x -> this.e.a(faz.a(vq.a("selectWorld.targetFolder", vq.b($$0x.c()).a(n.u)))));
         fkb.this.b(this.e);
         $$0.a(fcw.a(fkb.this.i, this.e, fkb.q), $$0.b().b());
         ezv<fkk.a> $$2 = $$0.a(ezv.<fkk.a>a($$0x -> $$0x.f).a(fkk.a.a, fkk.a.b, fkk.a.c).a(0, 0, 210, 20, fkb.p, ($$0x, $$1x) -> fkb.this.x.a($$1x)), $$1);
         fkb.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(faz.a($$1x.d().a()));
         });
         ezv<blt> $$3 = $$0.a(ezv.a(blt::b).a(blt.values()).a(0, 0, 210, 20, vq.c("options.difficulty"), ($$0x, $$1x) -> fkb.this.x.a($$1x)), $$1);
         fkb.this.x.a($$1x -> {
            $$3.a(fkb.this.x.e());
            $$3.j = !fkb.this.x.f();
            $$3.a(faz.a(fkb.this.x.e().d()));
         });
         ezv<Boolean> $$4 = $$0.a(ezv.e().a($$0x -> faz.a(fkb.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fkb.this.x.a($$1x)));
         fkb.this.x.a($$1x -> {
            $$4.a(fkb.this.x.g());
            $$4.j = !fkb.this.x.l() && !fkb.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(ezo.a(fkb.r, $$0x -> fkb.this.a(fkb.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends fbp {
      private static final vq c = vq.c("createWorld.tab.more.title");
      private static final vq d = vq.c("selectWorld.gameRules");
      private static final vq e = vq.c("selectWorld.dataPacks");

      c() {
         super(c);
         fcz.b $$0 = this.a.b(8).d(1);
         $$0.a(ezo.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ezo.a(fkb.r, $$0x -> fkb.this.a(fkb.this.x.k().g())).a(210).a());
         $$0.a(ezo.a(e, $$0x -> fkb.this.b(fkb.this.x.k().g())).a(210).a());
      }

      private void b() {
         fkb.this.f.a(new fkc(fkb.this.x.q().b(), $$0 -> {
            fkb.this.f.a(fkb.this);
            $$0.ifPresent(fkb.this.x::a);
         }));
      }
   }

   class d extends fbp {
      private static final vq c = vq.c("createWorld.tab.world.title");
      private static final vq d = vq.c("generator.minecraft.amplified.info");
      private static final vq e = vq.c("selectWorld.mapFeatures");
      private static final vq f = vq.c("selectWorld.mapFeatures.info");
      private static final vq g = vq.c("selectWorld.bonusItems");
      private static final vq h = vq.c("selectWorld.enterSeed");
      static final vq i = vq.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final ezx k;
      private final ezo l;

      d() {
         super(c);
         fcz.b $$0 = this.a.a(10).b(8).d(2);
         ezv<fkk.b> $$1 = $$0.a(
            ezv.<fkk.b>a(fkk.b::a).a(this.c()).a(fkb.d::a).a(0, 0, 150, 20, vq.c("selectWorld.mapType"), ($$0x, $$1x) -> fkb.this.x.a($$1x))
         );
         $$1.a(fkb.this.x.m());
         fkb.this.x.a($$1x -> {
            fkk.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(faz.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fkb.this.x.m().c() != null;
         });
         this.l = $$0.a(ezo.a(vq.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fkb.this.x.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new ezx(fkb.this.i, 308, 20, vq.c("selectWorld.enterSeed")) {
            @Override
            protected we aN_() {
               return super.aN_().b(vp.t).b(fkb.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fkb.this.x.h());
         this.k.b($$0x -> fkb.this.x.b(this.k.a()));
         $$0.a(fcw.a(fkb.this.i, this.k, h), 2);
         fki.a $$2 = fki.a(310);
         $$2.a(e, fkb.this.x::i, fkb.this.x::b).a(() -> !fkb.this.x.l()).a(f);
         $$2.a(g, fkb.this.x::j, fkb.this.x::c).a(() -> !fkb.this.x.f() && !fkb.this.x.l());
         fki $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fkb.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         fkg $$0 = fkb.this.x.n();
         if ($$0 != null) {
            fkb.this.f.a($$0.createEditScreen(fkb.this, fkb.this.x.k()));
         }
      }

      private ezv.c<fkk.b> c() {
         return new ezv.c<fkk.b>() {
            @Override
            public List<fkk.b> a() {
               return ezv.a.getAsBoolean() ? fkb.this.x.p() : fkb.this.x.o();
            }

            @Override
            public List<fkk.b> b() {
               return fkb.this.x.o();
            }
         };
      }

      private static we a(ezv<fkk.b> $$0) {
         return $$0.a().b() ? vp.a($$0.d(), d) : $$0.d();
      }
   }
}
