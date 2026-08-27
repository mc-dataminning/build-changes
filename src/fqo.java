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

public class fqo extends fly {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final wx s = wx.c("selectWorld.gameMode");
   static final wx u = wx.c("selectWorld.enterName");
   static final wx v = wx.c("selectWorld.experiments");
   static final wx w = wx.c("selectWorld.allowCommands.info");
   private static final wx x = wx.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final akm a = new akm("textures/gui/tab_header_background.png");
   private final fjm A = new fjm(this);
   final fqx B;
   private final fic C = new fic(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final eua E;
   @Nullable
   private final fly F;
   @Nullable
   private Path G;
   @Nullable
   private ath H;
   @Nullable
   private fid I;

   public static void a(fdz $$0, @Nullable fly $$1) {
      a($$0, x);
      ath $$2 = new ath(new atk($$0.bf()));
      ali.c $$3 = a($$2, dbr.c);
      CompletableFuture<fqw> $$4 = ali.a(
         $$3, $$0x -> new ali.b<>(new fqo.a(new dxp(dxr.a(), egz.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fqw($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fqo($$0, $$1, $$4.join(), Optional.of(egz.a), OptionalLong.empty()));
   }

   public static fqo a(fdz $$0, @Nullable fly $$1, dbb $$2, fqw $$3, @Nullable Path $$4) {
      fqo $$5 = new fqo($$0, $$1, $$3, egz.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fqx.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fqx.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fqx.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fqo(fdz $$0, @Nullable fly $$1, fqw $$2, Optional<akl<egy>> $$3, OptionalLong $$4) {
      super(wx.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bf();
      this.B = new fqx($$0.m().c(), $$2, $$3, $$4);
   }

   public fqx m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fid.a(this.C, this.n).a(new fqo.b(), new fqo.d(), new fqo.c()).a();
      this.c(this.I);
      fjq $$0 = this.A.b(fjq.e().a(8));
      $$0.a(ffz.a(wx.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(ffz.a(ww.e, $$0x -> this.C()).a());
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
         fkf $$1 = new fkf(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fdz $$0, wx $$1) {
      $$0.d(new fle($$1));
   }

   private void D() {
      fqw $$0 = this.B.k();
      dxo.b $$1 = $$0.d().a($$0.c());
      je<akv> $$2 = $$0.e().a(akv.c, $$1.b());
      Lifecycle $$3 = col.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fqy.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eoz.a $$0, je<akv> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<eov.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == eoz.a.c;
         fqw $$5 = this.B.k();
         dbb $$6 = this.c($$4);
         epb $$7 = new eoz($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dbb c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dat $$2 = new dat();
         $$2.a(dat.l).a(false, null);
         return new dbb($$1, dau.d, false, bpr.a, true, $$2, dbr.c);
      } else {
         return new dbb($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fly.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(ffm $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fhv & fjt> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fhv & fhc & fjt> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fih.c(this.m, this.B.c());
            this.C();
         }
      }

      return this.G;
   }

   void a(dbr $$0) {
      Pair<Path, ath> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fqr(this, (ath)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dbr $$0) {
      Pair<Path, ath> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fpf((ath)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wx.c("dataPack.title")));
      }
   }

   private void a(ath $$0, boolean $$1, Consumer<dbr> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dbr $$5 = new dbr(new dal($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         coj $$6 = $$0.e();
         if (col.a($$6) && $$1) {
            this.m.a(new fqn($$0.f(), $$3x -> {
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

   private void a(ath $$0, dbr $$1, Consumer<dbr> $$2) {
      this.m.d(new fle(wx.c("dataPack.validation.working")));
      ali.c $$3 = a($$0, $$1);
      ali.<fqo.a, fqw>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lf.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lf.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fqw $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dxp.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dxp $$5 = (dxp)$$3x.flatMap($$1xx -> dxp.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new ali.b<>(new fqo.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fqw($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
            this.m
         )
         .thenAcceptAsync(this.B::a, this.m)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new fkq($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dbr.c);
                  }
               }, wx.c("dataPack.validation.failed"), ww.a, wx.c("dataPack.validation.back"), wx.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         });
   }

   private static ali.c a(ath $$0, dbr $$1) {
      ali.d $$2 = new ali.d($$0, $$1, false, true);
      return new ali.c($$2, ef.a.c, 2);
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

   private Optional<eov.c> I() {
      String $$0 = this.B.c();

      try {
         eov.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(eot.j);
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

      fih.c(this.m, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fdz $$1) {
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
         fih.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, ath> c(dbr $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atk.a($$1, this.E);
            this.H.a();
         }

         this.H.a($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dxp a, dbr b) {
   }

   class b extends fia {
      private static final wx c = wx.c("createWorld.tab.game.title");
      private static final wx d = wx.c("selectWorld.allowCommands.new");
      private final fgi e;

      b() {
         super(c);
         fjl.b $$0 = this.a.b(8).d(1);
         fjp $$1 = $$0.b();
         this.e = new fgi(fqo.this.p, 208, 20, wx.c("selectWorld.enterName"));
         this.e.a(fqo.this.B.b());
         this.e.b(fqo.this.B::a);
         fqo.this.B.a($$0x -> this.e.a(fhk.a(wx.a("selectWorld.targetFolder", wx.b($$0x.c()).a(n.u)))));
         fqo.this.b(this.e);
         $$0.a(fji.a(fqo.this.p, this.e, fqo.u), $$0.b().b());
         fgg<fqx.a> $$2 = $$0.a(fgg.<fqx.a>a($$0x -> $$0x.f).a(fqx.a.a, fqx.a.b, fqx.a.c).a(0, 0, 210, 20, fqo.s, ($$0x, $$1x) -> fqo.this.B.a($$1x)), $$1);
         fqo.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fhk.a($$1x.d().a()));
         });
         fgg<bpr> $$3 = $$0.a(fgg.a(bpr::b).a(bpr.values()).a(0, 0, 210, 20, wx.c("options.difficulty"), ($$0x, $$1x) -> fqo.this.B.a($$1x)), $$1);
         fqo.this.B.a($$1x -> {
            $$3.a(fqo.this.B.e());
            $$3.j = !fqo.this.B.f();
            $$3.a(fhk.a(fqo.this.B.e().d()));
         });
         fgg<Boolean> $$4 = $$0.a(fgg.e().a($$0x -> fhk.a(fqo.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fqo.this.B.a($$1x)));
         fqo.this.B.a($$1x -> {
            $$4.a(fqo.this.B.g());
            $$4.j = !fqo.this.B.l() && !fqo.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(ffz.a(fqo.v, $$0x -> fqo.this.a(fqo.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fia {
      private static final wx c = wx.c("createWorld.tab.more.title");
      private static final wx d = wx.c("selectWorld.gameRules");
      private static final wx e = wx.c("selectWorld.dataPacks");

      c() {
         super(c);
         fjl.b $$0 = this.a.b(8).d(1);
         $$0.a(ffz.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ffz.a(fqo.v, $$0x -> fqo.this.a(fqo.this.B.k().g())).a(210).a());
         $$0.a(ffz.a(e, $$0x -> fqo.this.b(fqo.this.B.k().g())).a(210).a());
      }

      private void b() {
         fqo.this.m.a(new fqp(fqo.this.B.q().b(), $$0 -> {
            fqo.this.m.a(fqo.this);
            $$0.ifPresent(fqo.this.B::a);
         }));
      }
   }

   class d extends fia {
      private static final wx c = wx.c("createWorld.tab.world.title");
      private static final wx d = wx.c("generator.minecraft.amplified.info");
      private static final wx e = wx.c("selectWorld.mapFeatures");
      private static final wx f = wx.c("selectWorld.mapFeatures.info");
      private static final wx g = wx.c("selectWorld.bonusItems");
      private static final wx h = wx.c("selectWorld.enterSeed");
      static final wx i = wx.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fgi k;
      private final ffz l;

      d() {
         super(c);
         fjl.b $$0 = this.a.a(10).b(8).d(2);
         fgg<fqx.b> $$1 = $$0.a(
            fgg.<fqx.b>a(fqx.b::a).a(this.c()).a(fqo.d::a).a(0, 0, 150, 20, wx.c("selectWorld.mapType"), ($$0x, $$1x) -> fqo.this.B.a($$1x))
         );
         $$1.a(fqo.this.B.m());
         fqo.this.B.a($$1x -> {
            fqx.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fhk.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fqo.this.B.m().c() != null;
         });
         this.l = $$0.a(ffz.a(wx.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fqo.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fgi(fqo.this.p, 308, 20, wx.c("selectWorld.enterSeed")) {
            @Override
            protected xl aK_() {
               return super.aK_().b(ww.t).b(fqo.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fqo.this.B.h());
         this.k.b($$0x -> fqo.this.B.b(this.k.a()));
         $$0.a(fji.a(fqo.this.p, this.k, h), 2);
         fqv.a $$2 = fqv.a(310);
         $$2.a(e, fqo.this.B::i, fqo.this.B::b).a(() -> !fqo.this.B.l()).a(f);
         $$2.a(g, fqo.this.B::j, fqo.this.B::c).a(() -> !fqo.this.B.f() && !fqo.this.B.l());
         fqv $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fqo.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         fqt $$0 = fqo.this.B.n();
         if ($$0 != null) {
            fqo.this.m.a($$0.createEditScreen(fqo.this, fqo.this.B.k()));
         }
      }

      private fgg.c<fqx.b> c() {
         return new fgg.c<fqx.b>() {
            @Override
            public List<fqx.b> a() {
               return fgg.a.getAsBoolean() ? fqo.this.B.p() : fqo.this.B.o();
            }

            @Override
            public List<fqx.b> b() {
               return fqo.this.B.o();
            }
         };
      }

      private static xl a(fgg<fqx.b> $$0) {
         return $$0.a().b() ? ww.a($$0.d(), d) : $$0.d();
      }
   }
}
