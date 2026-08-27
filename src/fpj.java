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

public class fpj extends fkt {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final ws s = ws.c("selectWorld.gameMode");
   static final ws u = ws.c("selectWorld.enterName");
   static final ws v = ws.c("selectWorld.experiments");
   static final ws w = ws.c("selectWorld.allowCommands.info");
   private static final ws x = ws.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final akf a = new akf("textures/gui/tab_header_background.png");
   private final fih A = new fih(this);
   final fps B;
   private final fgx C = new fgx(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final esv E;
   @Nullable
   private final fkt F;
   @Nullable
   private Path G;
   @Nullable
   private asz H;
   @Nullable
   private fgy I;

   public static void a(fcu $$0, @Nullable fkt $$1) {
      a($$0, x);
      asz $$2 = new asz(new atc($$0.be()));
      ala.c $$3 = a($$2, dao.c);
      CompletableFuture<fpr> $$4 = ala.a(
         $$3, $$0x -> new ala.b<>(new fpj.a(new dwm(dwo.a(), efw.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fpr($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fpj($$0, $$1, $$4.join(), Optional.of(efw.a), OptionalLong.empty()));
   }

   public static fpj a(fcu $$0, @Nullable fkt $$1, czy $$2, fpr $$3, @Nullable Path $$4) {
      fpj $$5 = new fpj($$0, $$1, $$3, efw.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fps.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fps.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fps.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fpj(fcu $$0, @Nullable fkt $$1, fpr $$2, Optional<ake<efv>> $$3, OptionalLong $$4) {
      super(ws.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.be();
      this.B = new fps($$0.m().c(), $$2, $$3, $$4);
   }

   public fps m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fgy.a(this.C, this.n).a(new fpj.b(), new fpj.d(), new fpj.c()).a();
      this.c(this.I);
      fil $$0 = this.A.b(fil.e().a(8));
      $$0.a(feu.a(ws.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(feu.a(wr.e, $$0x -> this.C()).a());
      this.A.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.I.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aC_() {
   }

   @Override
   public void c() {
      if (this.I != null) {
         this.I.a(this.n);
         this.I.b();
         int $$0 = this.I.G().c();
         fja $$1 = new fja(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fcu $$0, ws $$1) {
      $$0.d(new fjz($$1));
   }

   private void D() {
      fpr $$0 = this.B.k();
      dwl.b $$1 = $$0.d().a($$0.c());
      jc<ako> $$2 = $$0.e().a(ako.c, $$1.b());
      Lifecycle $$3 = cna.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fpt.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(enu.a $$0, jc<ako> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<enq.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == enu.a.c;
         fpr $$5 = this.B.k();
         czy $$6 = this.c($$4);
         enw $$7 = new enu($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private czy c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         czq $$2 = new czq();
         $$2.a(czq.l).a(false, null);
         return new czy($$1, czr.d, false, bon.a, true, $$2, dao.c);
      } else {
         return new czy($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fkt.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(feh $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fgq & fio> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fgq & ffx & fio> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fhc.c(this.m, this.B.c());
            this.C();
         }
      }

      return this.G;
   }

   void a(dao $$0) {
      Pair<Path, asz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fpm(this, (asz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dao $$0) {
      Pair<Path, asz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fnz((asz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), ws.c("dataPack.title")));
      }
   }

   private void a(asz $$0, boolean $$1, Consumer<dao> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dao $$5 = new dao(new czi($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cmy $$6 = $$0.e();
         if (cna.a($$6) && $$1) {
            this.m.a(new fpi($$0.f(), $$3x -> {
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

   private void a(asz $$0, dao $$1, Consumer<dao> $$2) {
      this.m.d(new fjz(ws.c("dataPack.validation.working")));
      ala.c $$3 = a($$0, $$1);
      ala.<fpj.a, fpr>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(ld.aP).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(ld.ay).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fpr $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dwm.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dwm $$5 = (dwm)$$3x.flatMap($$1xx -> dwm.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", d::error));
                  return new ala.b<>(new fpj.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fpr($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.m
         )
         .thenAcceptAsync(this.B::a, this.m)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new fjl($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dao.c);
                  }
               }, ws.c("dataPack.validation.failed"), wr.a, ws.c("dataPack.validation.back"), ws.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         });
   }

   private static ala.c a(asz $$0, dao $$1) {
      ala.d $$2 = new ala.d($$0, $$1, false, true);
      return new ala.c($$2, ed.a.c, 2);
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

   private Optional<enq.c> I() {
      String $$0 = this.B.c();

      try {
         enq.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(eno.j);
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

      fhc.c(this.m, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fcu $$1) {
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
         fhc.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, asz> c(dao $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atc.a($$1, this.E);
            this.H.a();
         }

         this.H.a($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dwm a, dao b) {
   }

   class b extends fgv {
      private static final ws c = ws.c("createWorld.tab.game.title");
      private static final ws d = ws.c("selectWorld.allowCommands.new");
      private final ffd e;

      b() {
         super(c);
         fig.b $$0 = this.a.b(8).d(1);
         fik $$1 = $$0.b();
         this.e = new ffd(fpj.this.p, 208, 20, ws.c("selectWorld.enterName"));
         this.e.a(fpj.this.B.b());
         this.e.b(fpj.this.B::a);
         fpj.this.B.a($$0x -> this.e.a(fgf.a(ws.a("selectWorld.targetFolder", ws.b($$0x.c()).a(n.u)))));
         fpj.this.b(this.e);
         $$0.a(fid.a(fpj.this.p, this.e, fpj.u), $$0.b().b());
         ffb<fps.a> $$2 = $$0.a(ffb.<fps.a>a($$0x -> $$0x.f).a(fps.a.a, fps.a.b, fps.a.c).a(0, 0, 210, 20, fpj.s, ($$0x, $$1x) -> fpj.this.B.a($$1x)), $$1);
         fpj.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fgf.a($$1x.d().a()));
         });
         ffb<bon> $$3 = $$0.a(ffb.a(bon::b).a(bon.values()).a(0, 0, 210, 20, ws.c("options.difficulty"), ($$0x, $$1x) -> fpj.this.B.a($$1x)), $$1);
         fpj.this.B.a($$1x -> {
            $$3.a(fpj.this.B.e());
            $$3.j = !fpj.this.B.f();
            $$3.a(fgf.a(fpj.this.B.e().d()));
         });
         ffb<Boolean> $$4 = $$0.a(ffb.e().a($$0x -> fgf.a(fpj.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fpj.this.B.a($$1x)));
         fpj.this.B.a($$1x -> {
            $$4.a(fpj.this.B.g());
            $$4.j = !fpj.this.B.l() && !fpj.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(feu.a(fpj.v, $$0x -> fpj.this.a(fpj.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fgv {
      private static final ws c = ws.c("createWorld.tab.more.title");
      private static final ws d = ws.c("selectWorld.gameRules");
      private static final ws e = ws.c("selectWorld.dataPacks");

      c() {
         super(c);
         fig.b $$0 = this.a.b(8).d(1);
         $$0.a(feu.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(feu.a(fpj.v, $$0x -> fpj.this.a(fpj.this.B.k().g())).a(210).a());
         $$0.a(feu.a(e, $$0x -> fpj.this.b(fpj.this.B.k().g())).a(210).a());
      }

      private void b() {
         fpj.this.m.a(new fpk(fpj.this.B.q().b(), $$0 -> {
            fpj.this.m.a(fpj.this);
            $$0.ifPresent(fpj.this.B::a);
         }));
      }
   }

   class d extends fgv {
      private static final ws c = ws.c("createWorld.tab.world.title");
      private static final ws d = ws.c("generator.minecraft.amplified.info");
      private static final ws e = ws.c("selectWorld.mapFeatures");
      private static final ws f = ws.c("selectWorld.mapFeatures.info");
      private static final ws g = ws.c("selectWorld.bonusItems");
      private static final ws h = ws.c("selectWorld.enterSeed");
      static final ws i = ws.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final ffd k;
      private final feu l;

      d() {
         super(c);
         fig.b $$0 = this.a.a(10).b(8).d(2);
         ffb<fps.b> $$1 = $$0.a(
            ffb.<fps.b>a(fps.b::a).a(this.c()).a(fpj.d::a).a(0, 0, 150, 20, ws.c("selectWorld.mapType"), ($$0x, $$1x) -> fpj.this.B.a($$1x))
         );
         $$1.a(fpj.this.B.m());
         fpj.this.B.a($$1x -> {
            fps.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fgf.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fpj.this.B.m().c() != null;
         });
         this.l = $$0.a(feu.a(ws.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fpj.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new ffd(fpj.this.p, 308, 20, ws.c("selectWorld.enterSeed")) {
            @Override
            protected xg aK_() {
               return super.aK_().b(wr.t).b(fpj.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fpj.this.B.h());
         this.k.b($$0x -> fpj.this.B.b(this.k.a()));
         $$0.a(fid.a(fpj.this.p, this.k, h), 2);
         fpq.a $$2 = fpq.a(310);
         $$2.a(e, fpj.this.B::i, fpj.this.B::b).a(() -> !fpj.this.B.l()).a(f);
         $$2.a(g, fpj.this.B::j, fpj.this.B::c).a(() -> !fpj.this.B.f() && !fpj.this.B.l());
         fpq $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fpj.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         fpo $$0 = fpj.this.B.n();
         if ($$0 != null) {
            fpj.this.m.a($$0.createEditScreen(fpj.this, fpj.this.B.k()));
         }
      }

      private ffb.c<fps.b> c() {
         return new ffb.c<fps.b>() {
            @Override
            public List<fps.b> a() {
               return ffb.a.getAsBoolean() ? fpj.this.B.p() : fpj.this.B.o();
            }

            @Override
            public List<fps.b> b() {
               return fpj.this.B.o();
            }
         };
      }

      private static xg a(ffb<fps.b> $$0) {
         return $$0.a().b() ? wr.a($$0.d(), d) : $$0.d();
      }
   }
}
