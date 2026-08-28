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

public class fsi extends fnl {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger q = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final wu s = wu.c("selectWorld.gameMode");
   static final wu u = wu.c("selectWorld.enterName");
   static final wu v = wu.c("selectWorld.experiments");
   static final wu w = wu.c("selectWorld.allowCommands.info");
   private static final wu x = wu.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final akk a = new akk("textures/gui/tab_header_background.png");
   private final flh A = new flh(this);
   final fsr B;
   private final fjx C = new fjx(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evx E;
   @Nullable
   private final fnl F;
   @Nullable
   private Path G;
   @Nullable
   private ath H;
   @Nullable
   private fjy I;

   public static void a(ffw $$0, @Nullable fnl $$1) {
      a($$0, x);
      ath $$2 = new ath(new atk($$0.bb()));
      alg.c $$3 = a($$2, ddb.c);
      CompletableFuture<fsq> $$4 = alg.a(
         $$3, $$0x -> new alg.b<>(new fsi.a(new dzc(dze.a(), ein.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fsq($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.b($$4::isDone);
      $$0.a(new fsi($$0, $$1, $$4.join(), Optional.of(ein.a), OptionalLong.empty()));
   }

   public static fsi a(ffw $$0, @Nullable fnl $$1, dck $$2, fsq $$3, @Nullable Path $$4) {
      fsi $$5 = new fsi($$0, $$1, $$3, ein.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fsr.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fsr.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fsr.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fsi(ffw $$0, @Nullable fnl $$1, fsq $$2, Optional<akj<eim>> $$3, OptionalLong $$4) {
      super(wu.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bb();
      this.B = new fsr($$0.m().c(), $$2, $$3, $$4);
   }

   public fsr m() {
      return this.B;
   }

   @Override
   protected void aP_() {
      this.I = fjy.a(this.C, this.m).a(new fsi.b(), new fsi.d(), new fsi.c()).a();
      this.c(this.I);
      fll $$0 = this.A.b(fll.e().a(8));
      $$0.a(fhu.a(wu.c("selectWorld.create"), $$0x -> this.E()).a());
      $$0.a(fhu.a(wt.e, $$0x -> this.D()).a());
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
         fma $$1 = new fma(0, $$0, this.m, this.n - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(ffw $$0, wu $$1) {
      $$0.d(new fmw($$1));
   }

   private void E() {
      fsq $$0 = this.B.k();
      dzb.b $$1 = $$0.e().a($$0.d());
      jq<akt> $$2 = $$0.f().a(akt.c, $$1.b());
      Lifecycle $$3 = cpb.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fss.a(this.l, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eqo.a $$0, jq<akt> $$1, Lifecycle $$2) {
      a(this.l, x);
      Optional<eqk.c> $$3 = this.J();
      if (!$$3.isEmpty()) {
         this.G();
         boolean $$4 = $$0 == eqo.a.c;
         fsq $$5 = this.B.k();
         dck $$6 = this.c($$4);
         eqq $$7 = new eqo($$6, $$5.c(), $$0, $$2);
         this.l.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dck c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dcc $$2 = new dcc();
         $$2.a(dcc.l).a(false, null);
         return new dck($$1, dcd.d, false, bqe.a, true, $$2, ddb.c);
      } else {
         return new dck($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().h());
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnl.h, 0, this.n - this.A.b() - 2, 0.0F, 0.0F, this.m, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fhh $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.m, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.m, this.n);
   }

   @Override
   protected <T extends fjq & flo> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fjq & fix & flo> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path F() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            q.warn("Failed to create temporary dir", var2);
            fkc.c(this.l, this.B.c());
            this.D();
         }
      }

      return this.G;
   }

   void a(ddb $$0) {
      Pair<Path, ath> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new fsl(this, (ath)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(ddb $$0) {
      Pair<Path, ath> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new fqz((ath)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wu.c("dataPack.title")));
      }
   }

   private void a(ath $$0, boolean $$1, Consumer<ddb> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      ddb $$5 = new ddb(new dbu($$3, $$4), this.B.k().h().b());
      if (this.B.a($$5)) {
         this.l.a(this);
      } else {
         coz $$6 = $$0.e();
         if (cpb.a($$6) && $$1) {
            this.l.a(new fsh($$0.f(), $$3x -> {
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

   private void a(ath $$0, ddb $$1, Consumer<ddb> $$2) {
      this.l.d(new fmw(wu.c("dataPack.validation.working")));
      alg.c $$3 = a($$0, $$1);
      alg.<fsi.a, fsq>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lr.aX).c() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lr.aE).c() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fsq $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dzc.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dzc $$5 = (dzc)$$3x.flatMap($$1xx -> dzc.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alg.b<>(new fsi.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fsq($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.g(),
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
               this.l.a(new fmj($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().h());
                  } else {
                     $$2.accept(ddb.c);
                  }
               }, wu.c("dataPack.validation.failed"), wt.a, wu.c("dataPack.validation.back"), wu.c("dataPack.validation.reset")));
            } else {
               this.l.a(this);
            }

            return null;
         }, this.l);
   }

   private static alg.c a(ath $$0, ddb $$1) {
      alg.d $$2 = new alg.d($$0, $$1, false, true);
      return new alg.c($$2, er.a.c, 2);
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
         ac.b($$0, $$1, $$2);
      } catch (IOException var4) {
         q.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private Optional<eqk.c> J() {
      String $$0 = this.B.c();

      try {
         eqk.c $$1 = this.l.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(eqi.j);
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

      fkc.c(this.l, $$0);
      this.D();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ffw $$1) {
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
         fkc.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, ath> c(ddb $$0) {
      Path $$1 = this.F();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atk.a($$1, this.E);
            this.H.a();
         }

         this.H.b($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dzc a, ddb b) {
   }

   class b extends fjv {
      private static final wu c = wu.c("createWorld.tab.game.title");
      private static final wu d = wu.c("selectWorld.allowCommands.new");
      private final fid e;

      b() {
         super(c);
         flg.b $$0 = this.a.b(8).d(1);
         flk $$1 = $$0.b();
         this.e = new fid(fsi.this.o, 208, 20, wu.c("selectWorld.enterName"));
         this.e.a(fsi.this.B.b());
         this.e.b(fsi.this.B::a);
         fsi.this.B.a($$0x -> this.e.a(fjf.a(wu.a("selectWorld.targetFolder", wu.b($$0x.c()).a(n.u)))));
         fsi.this.b(this.e);
         $$0.a(fld.a(fsi.this.o, this.e, fsi.u), $$0.b().b());
         fib<fsr.a> $$2 = $$0.a(fib.<fsr.a>a($$0x -> $$0x.f).a(fsr.a.a, fsr.a.b, fsr.a.c).a(0, 0, 210, 20, fsi.s, ($$0x, $$1x) -> fsi.this.B.a($$1x)), $$1);
         fsi.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fjf.a($$1x.d().a()));
         });
         fib<bqe> $$3 = $$0.a(fib.a(bqe::b).a(bqe.values()).a(0, 0, 210, 20, wu.c("options.difficulty"), ($$0x, $$1x) -> fsi.this.B.a($$1x)), $$1);
         fsi.this.B.a($$1x -> {
            $$3.a(fsi.this.B.e());
            $$3.j = !fsi.this.B.f();
            $$3.a(fjf.a(fsi.this.B.e().d()));
         });
         fib<Boolean> $$4 = $$0.a(fib.e().a($$0x -> fjf.a(fsi.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fsi.this.B.a($$1x)));
         fsi.this.B.a($$1x -> {
            $$4.a(fsi.this.B.g());
            $$4.j = !fsi.this.B.l() && !fsi.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhu.a(fsi.v, $$0x -> fsi.this.a(fsi.this.B.k().h())).a(210).a());
         }
      }
   }

   class c extends fjv {
      private static final wu c = wu.c("createWorld.tab.more.title");
      private static final wu d = wu.c("selectWorld.gameRules");
      private static final wu e = wu.c("selectWorld.dataPacks");

      c() {
         super(c);
         flg.b $$0 = this.a.b(8).d(1);
         $$0.a(fhu.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhu.a(fsi.v, $$0x -> fsi.this.a(fsi.this.B.k().h())).a(210).a());
         $$0.a(fhu.a(e, $$0x -> fsi.this.b(fsi.this.B.k().h())).a(210).a());
      }

      private void b() {
         fsi.this.l.a(new fsj(fsi.this.B.q().b(), $$0 -> {
            fsi.this.l.a(fsi.this);
            $$0.ifPresent(fsi.this.B::a);
         }));
      }
   }

   class d extends fjv {
      private static final wu c = wu.c("createWorld.tab.world.title");
      private static final wu d = wu.c("generator.minecraft.amplified.info");
      private static final wu e = wu.c("selectWorld.mapFeatures");
      private static final wu f = wu.c("selectWorld.mapFeatures.info");
      private static final wu g = wu.c("selectWorld.bonusItems");
      private static final wu h = wu.c("selectWorld.enterSeed");
      static final wu i = wu.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fid k;
      private final fhu l;

      d() {
         super(c);
         flg.b $$0 = this.a.a(10).b(8).d(2);
         fib<fsr.b> $$1 = $$0.a(
            fib.<fsr.b>a(fsr.b::a).a(this.c()).a(fsi.d::a).a(0, 0, 150, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> fsi.this.B.a($$1x))
         );
         $$1.a(fsi.this.B.m());
         fsi.this.B.a($$1x -> {
            fsr.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fjf.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fsi.this.B.m().c() != null;
         });
         this.l = $$0.a(fhu.a(wu.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fsi.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fid(fsi.this.o, 308, 20, wu.c("selectWorld.enterSeed")) {
            @Override
            protected xi aM_() {
               return super.aM_().b(wt.t).b(fsi.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fsi.this.B.h());
         this.k.b($$0x -> fsi.this.B.b(this.k.a()));
         $$0.a(fld.a(fsi.this.o, this.k, h), 2);
         fsp.a $$2 = fsp.a(310);
         $$2.a(e, fsi.this.B::i, fsi.this.B::b).a(() -> !fsi.this.B.l()).a(f);
         $$2.a(g, fsi.this.B::j, fsi.this.B::c).a(() -> !fsi.this.B.f() && !fsi.this.B.l());
         fsp $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fsi.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         fsn $$0 = fsi.this.B.n();
         if ($$0 != null) {
            fsi.this.l.a($$0.createEditScreen(fsi.this, fsi.this.B.k()));
         }
      }

      private fib.c<fsr.b> c() {
         return new fib.c<fsr.b>() {
            @Override
            public List<fsr.b> a() {
               return fib.a.getAsBoolean() ? fsi.this.B.p() : fsi.this.B.o();
            }

            @Override
            public List<fsr.b> b() {
               return fsi.this.B.o();
            }
         };
      }

      private static xi a(fib<fsr.b> $$0) {
         return $$0.a().b() ? wt.a($$0.c(), d) : $$0.c();
      }
   }
}
