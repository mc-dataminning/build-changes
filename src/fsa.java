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

public class fsa extends fnd {
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
   private final fkz A = new fkz(this);
   final fsj B;
   private final fjp C = new fjp(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final evp E;
   @Nullable
   private final fnd F;
   @Nullable
   private Path G;
   @Nullable
   private atf H;
   @Nullable
   private fjq I;

   public static void a(ffn $$0, @Nullable fnd $$1) {
      a($$0, x);
      atf $$2 = new atf(new ati($$0.bd()));
      alg.c $$3 = a($$2, dcy.c);
      CompletableFuture<fsi> $$4 = alg.a(
         $$3, $$0x -> new alg.b<>(new fsa.a(new dyv(dyx.a(), eig.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fsi($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.g(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fsa($$0, $$1, $$4.join(), Optional.of(eig.a), OptionalLong.empty()));
   }

   public static fsa a(ffn $$0, @Nullable fnd $$1, dch $$2, fsi $$3, @Nullable Path $$4) {
      fsa $$5 = new fsa($$0, $$1, $$3, eig.a($$3.e()), OptionalLong.of($$3.c().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fsj.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fsj.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fsj.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fsa(ffn $$0, @Nullable fnd $$1, fsi $$2, Optional<akj<eif>> $$3, OptionalLong $$4) {
      super(wu.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bd();
      this.B = new fsj($$0.m().c(), $$2, $$3, $$4);
   }

   public fsj m() {
      return this.B;
   }

   @Override
   protected void aO_() {
      this.I = fjq.a(this.C, this.m).a(new fsa.b(), new fsa.d(), new fsa.c()).a();
      this.c(this.I);
      fld $$0 = this.A.b(fld.e().a(8));
      $$0.a(fhm.a(wu.c("selectWorld.create"), $$0x -> this.F()).a());
      $$0.a(fhm.a(wt.e, $$0x -> this.E()).a());
      this.A.a($$0x -> {
         $$0x.o(1);
         this.c($$0x);
      });
      this.I.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aD_() {
   }

   @Override
   public void c() {
      if (this.I != null) {
         this.I.a(this.m);
         this.I.b();
         int $$0 = this.I.H().c();
         fls $$1 = new fls(0, $$0, this.m, this.n - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(ffn $$0, wu $$1) {
      $$0.d(new fmo($$1));
   }

   private void F() {
      fsi $$0 = this.B.k();
      dyu.b $$1 = $$0.e().a($$0.d());
      jq<akt> $$2 = $$0.f().a(akt.c, $$1.b());
      Lifecycle $$3 = cox.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fsk.a(this.l, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eqg.a $$0, jq<akt> $$1, Lifecycle $$2) {
      a(this.l, x);
      Optional<eqc.c> $$3 = this.K();
      if (!$$3.isEmpty()) {
         this.J();
         boolean $$4 = $$0 == eqg.a.c;
         fsi $$5 = this.B.k();
         dch $$6 = this.c($$4);
         eqi $$7 = new eqg($$6, $$5.c(), $$0, $$2);
         this.l.x().a($$3.get(), $$5.g(), $$1, $$7);
      }
   }

   private dch c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dbz $$2 = new dbz();
         $$2.a(dbz.l).a(false, null);
         return new dch($$1, dca.d, false, bqa.a, true, $$2, dcy.c);
      } else {
         return new dch($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().h());
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
         this.F();
         return true;
      }
   }

   @Override
   public void d() {
      this.E();
   }

   public void E() {
      this.l.a(this.F);
      this.J();
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fnd.h, 0, this.n - this.A.b() - 2, 0.0F, 0.0F, this.m, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fgz $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.m, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.m, this.n);
   }

   @Override
   protected <T extends fji & flg> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fji & fip & flg> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path G() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            q.warn("Failed to create temporary dir", var2);
            fju.c(this.l, this.B.c());
            this.E();
         }
      }

      return this.G;
   }

   void a(dcy $$0) {
      Pair<Path, atf> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new fsd(this, (atf)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dcy $$0) {
      Pair<Path, atf> $$1 = this.c($$0);
      if ($$1 != null) {
         this.l.a(new fqr((atf)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wu.c("dataPack.title")));
      }
   }

   private void a(atf $$0, boolean $$1, Consumer<dcy> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dcy $$5 = new dcy(new dbr($$3, $$4), this.B.k().h().b());
      if (this.B.a($$5)) {
         this.l.a(this);
      } else {
         cov $$6 = $$0.e();
         if (cox.a($$6) && $$1) {
            this.l.a(new frz($$0.f(), $$3x -> {
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

   private void a(atf $$0, dcy $$1, Consumer<dcy> $$2) {
      this.l.d(new fmo(wu.c("dataPack.validation.working")));
      alg.c $$3 = a($$0, $$1);
      alg.<fsa.a, fsi>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(lr.aX).c() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(lr.aE).c() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fsi $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dyv.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dyv $$5 = (dyv)$$3x.flatMap($$1xx -> dyv.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new alg.b<>(new fsa.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fsi($$3x.a(), $$2x, $$1x, $$3x.b());
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
               this.l.a(new fmb($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().h());
                  } else {
                     $$2.accept(dcy.c);
                  }
               }, wu.c("dataPack.validation.failed"), wt.a, wu.c("dataPack.validation.back"), wu.c("dataPack.validation.reset")));
            } else {
               this.l.a(this);
            }

            return null;
         }, this.l);
   }

   private static alg.c a(atf $$0, dcy $$1) {
      alg.d $$2 = new alg.d($$0, $$1, false, true);
      return new alg.c($$2, er.a.c, 2);
   }

   private void J() {
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

   private Optional<eqc.c> K() {
      String $$0 = this.B.c();

      try {
         eqc.c $$1 = this.l.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(eqa.j);
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

      fju.c(this.l, $$0);
      this.E();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, ffn $$1) {
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
         fju.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atf> c(dcy $$0) {
      Path $$1 = this.G();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = ati.a($$1, this.E);
            this.H.a();
         }

         this.H.b($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dyv a, dcy b) {
   }

   class b extends fjn {
      private static final wu c = wu.c("createWorld.tab.game.title");
      private static final wu d = wu.c("selectWorld.allowCommands.new");
      private final fhv e;

      b() {
         super(c);
         fky.b $$0 = this.a.b(8).d(1);
         flc $$1 = $$0.b();
         this.e = new fhv(fsa.this.o, 208, 20, wu.c("selectWorld.enterName"));
         this.e.a(fsa.this.B.b());
         this.e.b(fsa.this.B::a);
         fsa.this.B.a($$0x -> this.e.a(fix.a(wu.a("selectWorld.targetFolder", wu.b($$0x.c()).a(n.u)))));
         fsa.this.b(this.e);
         $$0.a(fkv.a(fsa.this.o, this.e, fsa.u), $$0.b().b());
         fht<fsj.a> $$2 = $$0.a(fht.<fsj.a>a($$0x -> $$0x.f).a(fsj.a.a, fsj.a.b, fsj.a.c).a(0, 0, 210, 20, fsa.s, ($$0x, $$1x) -> fsa.this.B.a($$1x)), $$1);
         fsa.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fix.a($$1x.d().a()));
         });
         fht<bqa> $$3 = $$0.a(fht.a(bqa::b).a(bqa.values()).a(0, 0, 210, 20, wu.c("options.difficulty"), ($$0x, $$1x) -> fsa.this.B.a($$1x)), $$1);
         fsa.this.B.a($$1x -> {
            $$3.a(fsa.this.B.e());
            $$3.j = !fsa.this.B.f();
            $$3.a(fix.a(fsa.this.B.e().d()));
         });
         fht<Boolean> $$4 = $$0.a(fht.e().a($$0x -> fix.a(fsa.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fsa.this.B.a($$1x)));
         fsa.this.B.a($$1x -> {
            $$4.a(fsa.this.B.g());
            $$4.j = !fsa.this.B.l() && !fsa.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(fhm.a(fsa.v, $$0x -> fsa.this.a(fsa.this.B.k().h())).a(210).a());
         }
      }
   }

   class c extends fjn {
      private static final wu c = wu.c("createWorld.tab.more.title");
      private static final wu d = wu.c("selectWorld.gameRules");
      private static final wu e = wu.c("selectWorld.dataPacks");

      c() {
         super(c);
         fky.b $$0 = this.a.b(8).d(1);
         $$0.a(fhm.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(fhm.a(fsa.v, $$0x -> fsa.this.a(fsa.this.B.k().h())).a(210).a());
         $$0.a(fhm.a(e, $$0x -> fsa.this.b(fsa.this.B.k().h())).a(210).a());
      }

      private void b() {
         fsa.this.l.a(new fsb(fsa.this.B.q().b(), $$0 -> {
            fsa.this.l.a(fsa.this);
            $$0.ifPresent(fsa.this.B::a);
         }));
      }
   }

   class d extends fjn {
      private static final wu c = wu.c("createWorld.tab.world.title");
      private static final wu d = wu.c("generator.minecraft.amplified.info");
      private static final wu e = wu.c("selectWorld.mapFeatures");
      private static final wu f = wu.c("selectWorld.mapFeatures.info");
      private static final wu g = wu.c("selectWorld.bonusItems");
      private static final wu h = wu.c("selectWorld.enterSeed");
      static final wu i = wu.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final fhv k;
      private final fhm l;

      d() {
         super(c);
         fky.b $$0 = this.a.a(10).b(8).d(2);
         fht<fsj.b> $$1 = $$0.a(
            fht.<fsj.b>a(fsj.b::a).a(this.c()).a(fsa.d::a).a(0, 0, 150, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> fsa.this.B.a($$1x))
         );
         $$1.a(fsa.this.B.m());
         fsa.this.B.a($$1x -> {
            fsj.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fix.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fsa.this.B.m().c() != null;
         });
         this.l = $$0.a(fhm.a(wu.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fsa.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fhv(fsa.this.o, 308, 20, wu.c("selectWorld.enterSeed")) {
            @Override
            protected xi aL_() {
               return super.aL_().b(wt.t).b(fsa.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fsa.this.B.h());
         this.k.b($$0x -> fsa.this.B.b(this.k.a()));
         $$0.a(fkv.a(fsa.this.o, this.k, h), 2);
         fsh.a $$2 = fsh.a(310);
         $$2.a(e, fsa.this.B::i, fsa.this.B::b).a(() -> !fsa.this.B.l()).a(f);
         $$2.a(g, fsa.this.B::j, fsa.this.B::c).a(() -> !fsa.this.B.f() && !fsa.this.B.l());
         fsh $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fsa.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         fsf $$0 = fsa.this.B.n();
         if ($$0 != null) {
            fsa.this.l.a($$0.createEditScreen(fsa.this, fsa.this.B.k()));
         }
      }

      private fht.c<fsj.b> c() {
         return new fht.c<fsj.b>() {
            @Override
            public List<fsj.b> a() {
               return fht.a.getAsBoolean() ? fsa.this.B.p() : fsa.this.B.o();
            }

            @Override
            public List<fsj.b> b() {
               return fsa.this.B.o();
            }
         };
      }

      private static xi a(fht<fsj.b> $$0) {
         return $$0.a().b() ? wt.a($$0.c(), d) : $$0.c();
      }
   }
}
