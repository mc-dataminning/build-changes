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

public class fex extends fah {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final ur p = ur.c("selectWorld.gameMode");
   static final ur q = ur.c("selectWorld.enterName");
   static final ur r = ur.c("selectWorld.experiments");
   static final ur t = ur.c("selectWorld.allowCommands.info");
   private static final ur u = ur.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final agg a = new agg("textures/gui/header_separator.png");
   public static final agg b = new agg("textures/gui/footer_separator.png");
   public static final agg c = new agg("textures/gui/light_dirt_background.png");
   final ffg x;
   private final ewo y = new ewo(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final eiy A;
   @Nullable
   private final fah B;
   @Nullable
   private Path C;
   @Nullable
   private aoo D;
   @Nullable
   private exv E;
   @Nullable
   private ewp F;

   public static void a(esr $$0, @Nullable fah $$1) {
      a($$0, u);
      aoo $$2 = new aoo(new aor($$0.ba()));
      aha.c $$3 = a($$2, csl.c);
      CompletableFuture<fff> $$4 = aha.a(
         $$3, $$0x -> new aha.b<>(new fex.a(new dnb(dnd.a(), dwl.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fff($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fex($$0, $$1, $$4.join(), Optional.of(dwl.a), OptionalLong.empty()));
   }

   public static fex a(esr $$0, @Nullable fah $$1, crw $$2, fff $$3, @Nullable Path $$4) {
      fex $$5 = new fex($$0, $$1, $$3, dwl.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(ffg.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(ffg.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(ffg.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private fex(esr $$0, @Nullable fah $$1, fff $$2, Optional<agf<dwk>> $$3, OptionalLong $$4) {
      super(ur.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.ba();
      this.x = new ffg($$0.l().c(), $$2, $$3, $$4);
   }

   public ffg l() {
      return this.x;
   }

   @Override
   protected void aO_() {
      this.F = ewp.a(this.y, this.g).a(new fex.b(), new fex.d(), new fex.c()).a();
      this.d(this.F);
      this.E = new exv().a(10);
      exv.b $$0 = this.E.d(2);
      $$0.a(eum.a(ur.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(eum.a(uq.e, $$0x -> this.C()).a());
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
         exu.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         eyp $$1 = new eyp(0, $$0, this.g, this.E.r() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(esr $$0, ur $$1) {
      $$0.d(new ezn($$1));
   }

   private void D() {
      fff $$0 = this.x.k();
      dna.b $$1 = $$0.d().a($$0.c());
      ij<agp> $$2 = $$0.e().a(agp.c, $$1.b());
      Lifecycle $$3 = cfx.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      ffh.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eef.a $$0, ij<agp> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<eeb.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == eef.a.c;
         fff $$5 = this.x.k();
         crw $$6 = this.c($$4);
         eeh $$7 = new eef($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private crw c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         cro $$2 = new cro();
         $$2.a(cro.l).a(false, null);
         return new crw($$1, crp.d, false, bin.a, true, $$2, csl.c);
      } else {
         return new crw($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void aE_() {
      this.C();
   }

   @Override
   public void C() {
      this.f.a(this.B);
      this.F();
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, ati.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(eub $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends ewh & eyd> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends ewh & evp & eyd> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path E() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            ewt.c(this.f, this.x.c());
            this.C();
         }
      }

      return this.C;
   }

   void a(csl $$0) {
      Pair<Path, aoo> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new ffa(this, (aoo)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(csl $$0) {
      Pair<Path, aoo> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new fdo((aoo)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), ur.c("dataPack.title")));
      }
   }

   private void a(aoo $$0, boolean $$1, Consumer<csl> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      csl $$5 = new csl(new crg($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cfv $$6 = $$0.e();
         if (cfx.a($$6) && $$1) {
            this.f.a(new few($$0.f(), $$3x -> {
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

   private void a(aoo $$0, csl $$1, Consumer<csl> $$2) {
      this.f.d(new ezn(ur.c("dataPack.validation.working")));
      aha.c $$3 = a($$0, $$1);
      aha.<fex.a, fff>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(jz.aH).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(jz.ar).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fff $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = age.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dnb.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = age.a(JsonOps.INSTANCE, $$0x.c());
                  dnb $$5 = (dnb)$$3x.flatMap($$1xx -> dnb.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new aha.b<>(new fex.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fff($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new eza($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(csl.c);
                  }
               }, ur.c("dataPack.validation.failed"), uq.a, ur.c("dataPack.validation.back"), ur.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static aha.c a(aoo $$0, csl $$1) {
      aha.d $$2 = new aha.d($$0, $$1, false, true);
      return new aha.c($$2, dv.a.c, 2);
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

   private Optional<eeb.c> G() {
      String $$0 = this.x.c();

      try {
         eeb.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(edz.j);
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

      ewt.c(this.f, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, esr $$1) {
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
         ewt.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aoo> c(csl $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = aor.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dnb a, csl b) {
   }

   class b extends ewm {
      private static final ur c = ur.c("createWorld.tab.game.title");
      private static final ur d = ur.c("selectWorld.allowCommands");
      private final euv e;

      b() {
         super(c);
         exv.b $$0 = this.a.b(8).d(1);
         exz $$1 = $$0.b();
         this.e = new euv(fex.this.i, 208, 20, ur.c("selectWorld.enterName"));
         this.e.a(fex.this.x.b());
         this.e.b(fex.this.x::a);
         fex.this.x.a($$0x -> this.e.a(evx.a(ur.a("selectWorld.targetFolder", ur.b($$0x.c()).a(n.u)))));
         fex.this.c(this.e);
         $$0.a(exs.a(fex.this.i, this.e, fex.q), $$0.b().b());
         eut<ffg.a> $$2 = $$0.a(eut.<ffg.a>a($$0x -> $$0x.f).a(ffg.a.a, ffg.a.b, ffg.a.c).a(0, 0, 210, 20, fex.p, ($$0x, $$1x) -> fex.this.x.a($$1x)), $$1);
         fex.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(evx.a($$1x.d().a()));
         });
         eut<bin> $$3 = $$0.a(eut.a(bin::b).a(bin.values()).a(0, 0, 210, 20, ur.c("options.difficulty"), ($$0x, $$1x) -> fex.this.x.a($$1x)), $$1);
         fex.this.x.a($$1x -> {
            $$3.a(fex.this.x.e());
            $$3.i = !fex.this.x.f();
            $$3.a(evx.a(fex.this.x.e().d()));
         });
         eut<Boolean> $$4 = $$0.a(eut.f().a($$0x -> evx.a(fex.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fex.this.x.a($$1x)));
         fex.this.x.a($$1x -> {
            $$4.a(fex.this.x.g());
            $$4.i = !fex.this.x.l() && !fex.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(eum.a(fex.r, $$0x -> fex.this.a(fex.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends ewm {
      private static final ur c = ur.c("createWorld.tab.more.title");
      private static final ur d = ur.c("selectWorld.gameRules");
      private static final ur e = ur.c("selectWorld.dataPacks");

      c() {
         super(c);
         exv.b $$0 = this.a.b(8).d(1);
         $$0.a(eum.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(eum.a(fex.r, $$0x -> fex.this.a(fex.this.x.k().g())).a(210).a());
         $$0.a(eum.a(e, $$0x -> fex.this.b(fex.this.x.k().g())).a(210).a());
      }

      private void b() {
         fex.this.f.a(new fey(fex.this.x.q().b(), $$0 -> {
            fex.this.f.a(fex.this);
            $$0.ifPresent(fex.this.x::a);
         }));
      }
   }

   class d extends ewm {
      private static final ur c = ur.c("createWorld.tab.world.title");
      private static final ur d = ur.c("generator.minecraft.amplified.info");
      private static final ur e = ur.c("selectWorld.mapFeatures");
      private static final ur f = ur.c("selectWorld.mapFeatures.info");
      private static final ur g = ur.c("selectWorld.bonusItems");
      private static final ur h = ur.c("selectWorld.enterSeed");
      static final ur i = ur.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final euv k;
      private final eum l;

      d() {
         super(c);
         exv.b $$0 = this.a.a(10).b(8).d(2);
         eut<ffg.b> $$1 = $$0.a(
            eut.<ffg.b>a(ffg.b::a).a(this.c()).a(fex.d::a).a(0, 0, 150, 20, ur.c("selectWorld.mapType"), ($$0x, $$1x) -> fex.this.x.a($$1x))
         );
         $$1.a(fex.this.x.m());
         fex.this.x.a($$1x -> {
            ffg.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(evx.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = fex.this.x.m().c() != null;
         });
         this.l = $$0.a(eum.a(ur.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fex.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new euv(fex.this.i, 308, 20, ur.c("selectWorld.enterSeed")) {
            @Override
            protected vf aL_() {
               return super.aL_().b(uq.s).b(fex.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fex.this.x.h());
         this.k.b($$0x -> fex.this.x.b(this.k.a()));
         $$0.a(exs.a(fex.this.i, this.k, h), 2);
         ffe.a $$2 = ffe.a(310);
         $$2.a(e, fex.this.x::i, fex.this.x::b).a(() -> !fex.this.x.l()).a(f);
         $$2.a(g, fex.this.x::j, fex.this.x::c).a(() -> !fex.this.x.f() && !fex.this.x.l());
         ffe $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fex.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         ffc $$0 = fex.this.x.n();
         if ($$0 != null) {
            fex.this.f.a($$0.createEditScreen(fex.this, fex.this.x.k()));
         }
      }

      private eut.c<ffg.b> c() {
         return new eut.c<ffg.b>() {
            @Override
            public List<ffg.b> a() {
               return eut.a.getAsBoolean() ? fex.this.x.p() : fex.this.x.o();
            }

            @Override
            public List<ffg.b> b() {
               return fex.this.x.o();
            }
         };
      }

      private static vf a(eut<ffg.b> $$0) {
         return $$0.a().b() ? uq.a($$0.e(), d) : $$0.e();
      }
   }
}
