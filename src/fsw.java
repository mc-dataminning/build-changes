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

public class fsw extends fnx {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger q = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final wy s = wy.c("selectWorld.gameMode");
   static final wy u = wy.c("selectWorld.enterName");
   static final wy v = wy.c("selectWorld.experiments");
   static final wy w = wy.c("selectWorld.allowCommands.info");
   private static final wy x = wy.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final akq a = akq.b("textures/gui/tab_header_background.png");
   private final flt A = new flt(this);
   final ftf B;
   private final fkj C = new fkj(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final ewm E;
   @Nullable
   private final fnx F;
   @Nullable
   private Path G;
   @Nullable
   private ato H;
   @Nullable
   private fkk I;

   public static void a(fgi $$0, @Nullable fnx $$1) {
      a($$0, x);
      ato $$2 = new ato(new atr($$0.bb()));
      aln.c $$3 = a($$2, ddp.c);
      CompletableFuture<fte> $$4 = aln.a(
         $$3, $$0x -> new aln.b<>(new fsw.a(new dzr(dzt.a(), ejc.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fte($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ad.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fsw($$0, $$1, $$4.join(), Optional.of(ejc.a), OptionalLong.empty()));
   }

   public static fsw a(fgi $$0, @Nullable fnx $$1, dcy $$2, fte $$3, @Nullable Path $$4) {
      fsw $$5 = new fsw($$0, $$1, $$3, ejc.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(ftf.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(ftf.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(ftf.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fsw(fgi $$0, @Nullable fnx $$1, fte $$2, Optional<akp<ejb>> $$3, OptionalLong $$4) {
      super(wy.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bb();
      this.B = new ftf($$0.m().c(), $$2, $$3, $$4);
   }

   public ftf m() {
      return this.B;
   }

   @Override
   protected void aP_() {
      this.I = fkk.a(this.C, this.m).a(new fsw.b(), new fsw.d(), new fsw.c()).a();
      this.c(this.I);
      flx $$0 = this.A.b(flx.e().a(8));
      $$0.a(fig.a(wy.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(fig.a(wx.e, $$0x -> this.D()).a());
      this.A.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.I.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aE_() {
   }

   @Override
   public void c() {
      if (this.I != null) {
         this.I.a(this.m);
         this.I.b();
         int $$0 = this.I.H().c();
         fmm $$1 = new fmm(0, $$0, this.m, this.n - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fgi $$0, wy $$1) {
      $$0.d(new fni($$1));
   }

   private void E() {
      fte $$0 = this.B.k();
      dzq.b $$1 = $$0.e().a($$0.d());
      jt<akz> $$2 = $$0.f().a(akz.c, $$1.b());
      Lifecycle $$3 = cpl.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      ftg.a(this.l, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(erd.a $$0, jt<akz> $$1, Lifecycle $$2) {
      a(this.l, x);
      Optional<eqz.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == erd.a.c;
         fte $$5 = this.B.k();
         dcy $$6 = this.c($$4);
         erf $$7 = new erd($$6, $$5.c(), $$0, $$2);
         this.l.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dcy c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dcq $$2 = new dcq();
         $$2.a(dcq.l).a(false, null);
         return new dcy($$1, dcr.d, false, bqn.a, true, $$2, ddp.c);
      } else {
         return new dcy($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().h());
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
         this.E();
         return true;
      }
   }

   @Override
   public void d() {
      this.D();
   }

   public void D() {
      this.l.a(this.F);
      this.G();
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnx.h, 0, this.n - this.A.b() - 2, 0.0F, 0.0F, this.m, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fht $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.m, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.m, this.n);
   }

   @Override
   protected <T extends fkc & fma> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fkc & fjj & fma> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            q.warn("Failed to create temporary dir", var2);
            fko.c(this.l, this.B.c());
            this.D();
         }
      }

      return this.G;
   }

   void a(ddp $$0) {
      Pair<Path, ato> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new fsz(this, (ato)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(ddp $$0) {
      Pair<Path, ato> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new frn((ato)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wy.c("dataPack.title")));
      }
   }

   private void a(ato $$0, boolean $$1, Consumer<ddp> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      ddp $$5 = new ddp(new dci($$3, $$4), this.B.k().h().b());
      if (this.B.a($$5)) {
         this.l.a(this);
      } else {
         cpj $$6 = $$0.e();
         if (cpl.a($$6) && $$1) {
            this.l.a(new fsv($$0.f(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.B.k().h());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(ato $$0, ddp $$1, Consumer<ddp> $$2) {
      this.l.d(new fni(wy.c("dataPack.validation.working")));
      aln.c $$3 = a($$0, $$1);
      aln.<fsw.a, fte>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lu.aY).c() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lu.aF).c() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fte $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dzr.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dzr $$5 = (dzr)$$3x.flatMap($$1xx -> dzr.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new aln.b<>(new fsw.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fte($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ad.g(),
            this.l
         )
         .thenApplyAsync($$0x -> {
            $$0x.b();
            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.l)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               q.warn("Failed to validate datapack", $$2x);
               this.l.a(new fmv($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().h());
                  } else {
                     $$2.accept(ddp.c);
                  }
               }, wy.c("dataPack.validation.failed"), wx.a, wy.c("dataPack.validation.back"), wy.c("dataPack.validation.reset")));
            } else {
               this.l.a(this);
            }

            return null;
         }, this.l);
   }

   private static aln.c a(ato $$0, ddp $$1) {
      aln.d $$2 = new aln.d($$0, $$1, false, true);
      return new aln.c($$2, eu.a.c, 2);
   }

   private void G() {
      if (this.G != null) {
         try (Stream<Path> $$0 = Files.walk(this.G)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  q.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            q.warn("Failed to list temporary dir {}", this.G);
         }

         this.G = null;
      }
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ad.b($$0, $$1, $$2);
      } catch (IOException var4) {
         q.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<eqz.c> J() {
      String $$0 = this.B.c();

      try {
         eqz.c $$1 = this.l.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(eqx.j);
               v.c($$3);
               $$2.filter($$0x -> !$$0x.equals(this.G)).forEach($$1x -> a(this.G, $$3, $$1x));
               var5 = Optional.of($$1);
            }

            return var5;
         } catch (UncheckedIOException | IOException var8) {
            q.warn("Failed to copy datapacks to world {}", $$0, var8);
            $$1.close();
         }
      } catch (UncheckedIOException | IOException var9) {
         q.warn("Failed to create access for {}", $$0, var9);
      }

      fko.c(this.l, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fgi $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  q.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         q.warn("Failed to copy datapacks from world {}", $$0, var8);
         fko.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, ato> c(ddp $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atr.a($$1, this.E);
            this.H.a();
         }

         this.H.b($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dzr a, ddp b) {
   }

   class b extends fkh {
      private static final wy c = wy.c("createWorld.tab.game.title");
      private static final wy d = wy.c("selectWorld.allowCommands.new");
      private final fip e;

      b() {
         super(c);
         fls.b $$0 = this.a.b(8).d(1);
         flw $$1 = $$0.b();
         this.e = new fip(fsw.this.o, 208, 20, wy.c("selectWorld.enterName"));
         this.e.a(fsw.this.B.b());
         this.e.b(fsw.this.B::a);
         fsw.this.B.a($$0x -> this.e.a(fjr.a(wy.a("selectWorld.targetFolder", wy.b($$0x.c()).a(n.u)))));
         fsw.this.b(this.e);
         $$0.a(flp.a(fsw.this.o, this.e, fsw.u), $$0.b().b());
         fin<ftf.a> $$2 = $$0.a(fin.<ftf.a>a($$0x -> $$0x.f).a(ftf.a.a, ftf.a.b, ftf.a.c).a(0, 0, 210, 20, fsw.s, ($$0x, $$1x) -> fsw.this.B.a($$1x)), $$1);
         fsw.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fjr.a($$1x.d().a()));
         });
         fin<bqn> $$3 = $$0.a(fin.a(bqn::b).a(bqn.values()).a(0, 0, 210, 20, wy.c("options.difficulty"), ($$0x, $$1x) -> fsw.this.B.a($$1x)), $$1);
         fsw.this.B.a($$1x -> {
            $$3.a(fsw.this.B.e());
            $$3.j = !fsw.this.B.f();
            $$3.a(fjr.a(fsw.this.B.e().d()));
         });
         fin<Boolean> $$4 = $$0.a(fin.e().a($$0x -> fjr.a(fsw.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fsw.this.B.a($$1x)));
         fsw.this.B.a($$1x -> {
            $$4.a(fsw.this.B.g());
            $$4.j = !fsw.this.B.l() && !fsw.this.B.f();
         });
         if (!ab.b().g()) {
            $$0.a(fig.a(fsw.v, $$0x -> fsw.this.a(fsw.this.B.k().h())).a(210).a());
         }
      }
   }

   class c extends fkh {
      private static final wy c = wy.c("createWorld.tab.more.title");
      private static final wy d = wy.c("selectWorld.gameRules");
      private static final wy e = wy.c("selectWorld.dataPacks");

      c() {
         super(c);
         fls.b $$0 = this.a.b(8).d(1);
         $$0.a(fig.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fig.a(fsw.v, $$0x -> fsw.this.a(fsw.this.B.k().h())).a(210).a());
         $$0.a(fig.a(e, $$0x -> fsw.this.b(fsw.this.B.k().h())).a(210).a());
      }

      private void b() {
         fsw.this.l.a(new fsx(fsw.this.B.q().b(), $$0 -> {
            fsw.this.l.a(fsw.this);
            $$0.ifPresent(fsw.this.B::a);
         }));
      }
   }

   class d extends fkh {
      private static final wy c = wy.c("createWorld.tab.world.title");
      private static final wy d = wy.c("generator.minecraft.amplified.info");
      private static final wy e = wy.c("selectWorld.mapFeatures");
      private static final wy f = wy.c("selectWorld.mapFeatures.info");
      private static final wy g = wy.c("selectWorld.bonusItems");
      private static final wy h = wy.c("selectWorld.enterSeed");
      static final wy i = wy.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fip k;
      private final fig l;

      d() {
         super(c);
         fls.b $$0 = this.a.a(10).b(8).d(2);
         fin<ftf.b> $$1 = $$0.a(
            fin.<ftf.b>a(ftf.b::a).a(this.c()).a(fsw.d::a).a(0, 0, 150, 20, wy.c("selectWorld.mapType"), ($$0x, $$1x) -> fsw.this.B.a($$1x))
         );
         $$1.a(fsw.this.B.m());
         fsw.this.B.a($$1x -> {
            ftf.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fjr.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fsw.this.B.m().c() != null;
         });
         this.l = $$0.a(fig.a(wy.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fsw.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fip(fsw.this.o, 308, 20, wy.c("selectWorld.enterSeed")) {
            @Override
            protected xm aM_() {
               return super.aM_().b(wx.t).b(fsw.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fsw.this.B.h());
         this.k.b($$0x -> fsw.this.B.b(this.k.a()));
         $$0.a(flp.a(fsw.this.o, this.k, h), 2);
         ftd.a $$2 = ftd.a(310);
         $$2.a(e, fsw.this.B::i, fsw.this.B::b).a(() -> !fsw.this.B.l()).a(f);
         $$2.a(g, fsw.this.B::j, fsw.this.B::c).a(() -> !fsw.this.B.f() && !fsw.this.B.l());
         ftd $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fsw.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         ftb $$0 = fsw.this.B.n();
         if ($$0 != null) {
            fsw.this.l.a($$0.createEditScreen(fsw.this, fsw.this.B.k()));
         }
      }

      private fin.c<ftf.b> c() {
         return new fin.c<ftf.b>() {
            @Override
            public List<ftf.b> a() {
               return fin.a.getAsBoolean() ? fsw.this.B.p() : fsw.this.B.o();
            }

            @Override
            public List<ftf.b> b() {
               return fsw.this.B.o();
            }
         };
      }

      private static xm a(fin<ftf.b> $$0) {
         return $$0.a().b() ? wx.a($$0.c(), d) : $$0.c();
      }
   }
}
