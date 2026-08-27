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

public class fth extends fon {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final xe s = xe.c("selectWorld.gameMode");
   static final xe u = xe.c("selectWorld.enterName");
   static final xe v = xe.c("selectWorld.experiments");
   static final xe w = xe.c("selectWorld.allowCommands.info");
   private static final xe x = xe.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final akt a = new akt("textures/gui/tab_header_background.png");
   private final fma A = new fma(this);
   final ftq B;
   private final fkq C = new fkq(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final ewk E;
   @Nullable
   private final fon F;
   @Nullable
   private Path G;
   @Nullable
   private ato H;
   @Nullable
   private fkr I;

   public static void a(fgj $$0, @Nullable fon $$1) {
      a($$0, x);
      ato $$2 = new ato(new atr($$0.bf()));
      alp.c $$3 = a($$2, dcu.c);
      CompletableFuture<ftp> $$4 = alp.a(
         $$3, $$0x -> new alp.b<>(new fth.a(new dzq(dzs.a(), ejj.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new ftp($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fth($$0, $$1, $$4.join(), Optional.of(ejj.a), OptionalLong.empty()));
   }

   public static fth a(fgj $$0, @Nullable fon $$1, dce $$2, ftp $$3, @Nullable Path $$4) {
      fth $$5 = new fth($$0, $$1, $$3, ejj.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(ftq.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(ftq.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(ftq.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fth(fgj $$0, @Nullable fon $$1, ftp $$2, Optional<aks<eji>> $$3, OptionalLong $$4) {
      super(xe.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bf();
      this.B = new ftq($$0.m().c(), $$2, $$3, $$4);
   }

   public ftq B() {
      return this.B;
   }

   @Override
   protected void aN_() {
      this.I = fkr.a(this.C, this.n).a(new fth.b(), new fth.d(), new fth.c()).a();
      this.c(this.I);
      fme $$0 = this.A.b(fme.e().a(8));
      $$0.a(fin.a(xe.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(fin.a(xd.e, $$0x -> this.C()).a());
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
         fmt $$1 = new fmt(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fgj $$0, xe $$1) {
      $$0.d(new fns($$1));
   }

   private void D() {
      ftp $$0 = this.B.k();
      dzp.b $$1 = $$0.d().a($$0.c());
      jh<alc> $$2 = $$0.e().a(alc.c, $$1.b());
      Lifecycle $$3 = cor.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      ftr.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(erj.a $$0, jh<alc> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<erf.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == erj.a.c;
         ftp $$5 = this.B.k();
         dce $$6 = this.c($$4);
         erl $$7 = new erj($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dce c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbw $$2 = new dbw();
         $$2.a(dbw.l).a(false, null);
         return new dce($$1, dbx.d, false, bpx.a, true, $$2, dcu.c);
      } else {
         return new dce($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fon.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fia $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fkj & fmh> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fkj & fjq & fmh> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fkv.c(this.m, this.B.c());
            this.C();
         }
      }

      return this.G;
   }

   void a(dcu $$0) {
      Pair<Path, ato> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new ftk(this, (ato)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dcu $$0) {
      Pair<Path, ato> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fry((ato)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xe.c("dataPack.title")));
      }
   }

   private void a(ato $$0, boolean $$1, Consumer<dcu> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dcu $$5 = new dcu(new dbo($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cop $$6 = $$0.e();
         if (cor.a($$6) && $$1) {
            this.m.a(new ftg($$0.f(), $$3x -> {
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

   private void a(ato $$0, dcu $$1, Consumer<dcu> $$2) {
      this.m.d(new fns(xe.c("dataPack.validation.working")));
      alp.c $$3 = a($$0, $$1);
      alp.<fth.a, ftp>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(li.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(li.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  ftp $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dzq.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dzq $$5 = (dzq)$$3x.flatMap($$1xx -> dzq.a.parse($$4, $$1xx))
                     .getOrThrow(false, ad.a("Error parsing worldgen settings after loading data packs: ", d::error));
                  return new alp.b<>(new fth.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new ftp($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ad.f(),
            this.m
         )
         .thenAcceptAsync(this.B::a, this.m)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new fne($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dcu.c);
                  }
               }, xe.c("dataPack.validation.failed"), xd.a, xe.c("dataPack.validation.back"), xe.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         });
   }

   private static alp.c a(ato $$0, dcu $$1) {
      alp.d $$2 = new alp.d($$0, $$1, false, true);
      return new alp.c($$2, ei.a.c, 2);
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
         ad.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<erf.c> I() {
      String $$0 = this.B.c();

      try {
         erf.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(erd.j);
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

      fkv.c(this.m, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fgj $$1) {
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
         fkv.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, ato> c(dcu $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atr.a($$1, this.E);
            this.H.a();
         }

         this.H.a($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dzq a, dcu b) {
   }

   class b extends fko {
      private static final xe c = xe.c("createWorld.tab.game.title");
      private static final xe d = xe.c("selectWorld.allowCommands.new");
      private final fiw e;

      b() {
         super(c);
         flz.b $$0 = this.a.b(8).d(1);
         fmd $$1 = $$0.b();
         this.e = new fiw(fth.this.p, 208, 20, xe.c("selectWorld.enterName"));
         this.e.a(fth.this.B.b());
         this.e.b(fth.this.B::a);
         fth.this.B.a($$0x -> this.e.a(fjy.a(xe.a("selectWorld.targetFolder", xe.b($$0x.c()).a(n.u)))));
         fth.this.b(this.e);
         $$0.a(flw.a(fth.this.p, this.e, fth.u), $$0.b().b());
         fiu<ftq.a> $$2 = $$0.a(fiu.<ftq.a>a($$0x -> $$0x.f).a(ftq.a.a, ftq.a.b, ftq.a.c).a(0, 0, 210, 20, fth.s, ($$0x, $$1x) -> fth.this.B.a($$1x)), $$1);
         fth.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fjy.a($$1x.d().a()));
         });
         fiu<bpx> $$3 = $$0.a(fiu.a(bpx::b).a(bpx.values()).a(0, 0, 210, 20, xe.c("options.difficulty"), ($$0x, $$1x) -> fth.this.B.a($$1x)), $$1);
         fth.this.B.a($$1x -> {
            $$3.a(fth.this.B.e());
            $$3.j = !fth.this.B.f();
            $$3.a(fjy.a(fth.this.B.e().d()));
         });
         fiu<Boolean> $$4 = $$0.a(fiu.e().a($$0x -> fjy.a(fth.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fth.this.B.a($$1x)));
         fth.this.B.a($$1x -> {
            $$4.a(fth.this.B.g());
            $$4.j = !fth.this.B.l() && !fth.this.B.f();
         });
         if (!ab.b().g()) {
            $$0.a(fin.a(fth.v, $$0x -> fth.this.a(fth.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fko {
      private static final xe c = xe.c("createWorld.tab.more.title");
      private static final xe d = xe.c("selectWorld.gameRules");
      private static final xe e = xe.c("selectWorld.dataPacks");

      c() {
         super(c);
         flz.b $$0 = this.a.b(8).d(1);
         $$0.a(fin.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fin.a(fth.v, $$0x -> fth.this.a(fth.this.B.k().g())).a(210).a());
         $$0.a(fin.a(e, $$0x -> fth.this.b(fth.this.B.k().g())).a(210).a());
      }

      private void b() {
         fth.this.m.a(new fti(fth.this.B.q().b(), $$0 -> {
            fth.this.m.a(fth.this);
            $$0.ifPresent(fth.this.B::a);
         }));
      }
   }

   class d extends fko {
      private static final xe c = xe.c("createWorld.tab.world.title");
      private static final xe d = xe.c("generator.minecraft.amplified.info");
      private static final xe e = xe.c("selectWorld.mapFeatures");
      private static final xe f = xe.c("selectWorld.mapFeatures.info");
      private static final xe g = xe.c("selectWorld.bonusItems");
      private static final xe h = xe.c("selectWorld.enterSeed");
      static final xe i = xe.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fiw k;
      private final fin l;

      d() {
         super(c);
         flz.b $$0 = this.a.a(10).b(8).d(2);
         fiu<ftq.b> $$1 = $$0.a(
            fiu.<ftq.b>a(ftq.b::a).a(this.c()).a(fth.d::a).a(0, 0, 150, 20, xe.c("selectWorld.mapType"), ($$0x, $$1x) -> fth.this.B.a($$1x))
         );
         $$1.a(fth.this.B.m());
         fth.this.B.a($$1x -> {
            ftq.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fjy.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fth.this.B.m().c() != null;
         });
         this.l = $$0.a(fin.a(xe.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fth.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fiw(fth.this.p, 308, 20, xe.c("selectWorld.enterSeed")) {
            @Override
            protected xs aK_() {
               return super.aK_().a(xd.t).a(fth.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fth.this.B.h());
         this.k.b($$0x -> fth.this.B.b(this.k.a()));
         $$0.a(flw.a(fth.this.p, this.k, h), 2);
         fto.a $$2 = fto.a(310);
         $$2.a(e, fth.this.B::i, fth.this.B::b).a(() -> !fth.this.B.l()).a(f);
         $$2.a(g, fth.this.B::j, fth.this.B::c).a(() -> !fth.this.B.f() && !fth.this.B.l());
         fto $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fth.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         ftm $$0 = fth.this.B.n();
         if ($$0 != null) {
            fth.this.m.a($$0.createEditScreen(fth.this, fth.this.B.k()));
         }
      }

      private fiu.c<ftq.b> c() {
         return new fiu.c<ftq.b>() {
            @Override
            public List<ftq.b> a() {
               return fiu.a.getAsBoolean() ? fth.this.B.p() : fth.this.B.o();
            }

            @Override
            public List<ftq.b> b() {
               return fth.this.B.o();
            }
         };
      }

      private static xs a(fiu<ftq.b> $$0) {
         return $$0.a().b() ? xd.a($$0.d(), d) : $$0.d();
      }
   }
}
