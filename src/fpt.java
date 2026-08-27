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

public class fpt extends fld {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String r = "mcworld-";
   static final wu s = wu.c("selectWorld.gameMode");
   static final wu u = wu.c("selectWorld.enterName");
   static final wu v = wu.c("selectWorld.experiments");
   static final wu w = wu.c("selectWorld.allowCommands.info");
   private static final wu x = wu.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final akh a = new akh("textures/gui/tab_header_background.png");
   private final fir A = new fir(this);
   final fqc B;
   private final fhh C = new fhh(this::c, $$1x -> this.e($$1x));
   private boolean D;
   private final etf E;
   @Nullable
   private final fld F;
   @Nullable
   private Path G;
   @Nullable
   private atc H;
   @Nullable
   private fhi I;

   public static void a(fde $$0, @Nullable fld $$1) {
      a($$0, x);
      atc $$2 = new atc(new atf($$0.bf()));
      ald.c $$3 = a($$2, dax.c);
      CompletableFuture<fqb> $$4 = ald.a(
         $$3, $$0x -> new ald.b<>(new fpt.a(new dwv(dwx.a(), egf.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new fqb($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new fpt($$0, $$1, $$4.join(), Optional.of(egf.a), OptionalLong.empty()));
   }

   public static fpt a(fde $$0, @Nullable fld $$1, dah $$2, fqb $$3, @Nullable Path $$4) {
      fpt $$5 = new fpt($$0, $$1, $$3, egf.a($$3.d()), OptionalLong.of($$3.b().b()));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(fqc.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(fqc.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(fqc.a.c);
      }

      $$5.G = $$4;
      return $$5;
   }

   private fpt(fde $$0, @Nullable fld $$1, fqb $$2, Optional<akg<ege>> $$3, OptionalLong $$4) {
      super(wu.c("selectWorld.create"));
      this.F = $$1;
      this.E = $$0.bf();
      this.B = new fqc($$0.m().c(), $$2, $$3, $$4);
   }

   public fqc m() {
      return this.B;
   }

   @Override
   protected void aM_() {
      this.I = fhi.a(this.C, this.n).a(new fpt.b(), new fpt.d(), new fpt.c()).a();
      this.c(this.I);
      fiv $$0 = this.A.b(fiv.e().a(8));
      $$0.a(ffe.a(wu.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(ffe.a(wt.e, $$0x -> this.C()).a());
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
         fjk $$1 = new fjk(0, $$0, this.n, this.o - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fde $$0, wu $$1) {
      $$0.d(new fkj($$1));
   }

   private void D() {
      fqb $$0 = this.B.k();
      dwu.b $$1 = $$0.d().a($$0.c());
      jd<akq> $$2 = $$0.e().a(akq.c, $$1.b());
      Lifecycle $$3 = cnw.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().e();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      fqd.a(this.m, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eof.a $$0, jd<akq> $$1, Lifecycle $$2) {
      a(this.m, x);
      Optional<eob.c> $$3 = this.I();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == eof.a.c;
         fqb $$5 = this.B.k();
         dah $$6 = this.c($$4);
         eoh $$7 = new eof($$6, $$5.b(), $$0, $$2);
         this.m.x().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private dah c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         czz $$2 = new czz();
         $$2.a(czz.l).a(false, null);
         return new dah($$1, daa.d, false, bpj.a, true, $$2, dax.c);
      } else {
         return new dah($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().g());
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      RenderSystem.enableBlend();
      $$0.a(fld.i, 0, this.o - this.A.b() - 2, 0.0F, 0.0F, this.n, 2, 32, 2);
      RenderSystem.disableBlend();
   }

   @Override
   protected void a(fer $$0) {
      $$0.a(a, 0, 0, 0.0F, 0.0F, this.n, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.n, this.o);
   }

   @Override
   protected <T extends fha & fiy> T d(T $$0) {
      return super.d($$0);
   }

   @Override
   protected <T extends fha & fgh & fiy> T c(T $$0) {
      return super.c($$0);
   }

   @Nullable
   private Path E() {
      if (this.G == null) {
         try {
            this.G = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            fhm.c(this.m, this.B.c());
            this.C();
         }
      }

      return this.G;
   }

   void a(dax $$0) {
      Pair<Path, atc> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new fpw(this, (atc)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dax $$0) {
      Pair<Path, atc> $$1 = this.c($$0);
      if ($$1 != null) {
         this.m.a(new foj((atc)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), wu.c("dataPack.title")));
      }
   }

   private void a(atc $$0, boolean $$1, Consumer<dax> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dax $$5 = new dax(new czr($$3, $$4), this.B.k().g().b());
      if (this.B.a($$5)) {
         this.m.a(this);
      } else {
         cnu $$6 = $$0.e();
         if (cnw.a($$6) && $$1) {
            this.m.a(new fps($$0.f(), $$3x -> {
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

   private void a(atc $$0, dax $$1, Consumer<dax> $$2) {
      this.m.d(new fkj(wu.c("dataPack.validation.working")));
      ald.c $$3 = a($$0, $$1);
      ald.<fpt.a, fqb>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(le.aQ).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(le.az).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  fqb $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = dwv.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  dwv $$5 = (dwv)$$3x.flatMap($$1xx -> dwv.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", d::error));
                  return new ald.b<>(new fpt.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new fqb($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.m
         )
         .thenAcceptAsync(this.B::a, this.m)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.m.a(new fjv($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().g());
                  } else {
                     $$2.accept(dax.c);
                  }
               }, wu.c("dataPack.validation.failed"), wt.a, wu.c("dataPack.validation.back"), wu.c("dataPack.validation.reset")));
            } else {
               this.m.a(this);
            }

            return null;
         });
   }

   private static ald.c a(atc $$0, dax $$1) {
      ald.d $$2 = new ald.d($$0, $$1, false, true);
      return new ald.c($$2, ee.a.c, 2);
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

   private Optional<eob.c> I() {
      String $$0 = this.B.c();

      try {
         eob.c $$1 = this.m.m().e($$0);
         if (this.G == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.G)) {
               Path $$3 = $$1.a(enz.j);
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

      fhm.c(this.m, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fde $$1) {
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
         fhm.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, atc> c(dax $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.H == null) {
            this.H = atf.a($$1, this.E);
            this.H.a();
         }

         this.H.a($$0.a().a());
         return Pair.of($$1, this.H);
      } else {
         return null;
      }
   }

   static record a(dwv a, dax b) {
   }

   class b extends fhf {
      private static final wu c = wu.c("createWorld.tab.game.title");
      private static final wu d = wu.c("selectWorld.allowCommands.new");
      private final ffn e;

      b() {
         super(c);
         fiq.b $$0 = this.a.b(8).d(1);
         fiu $$1 = $$0.b();
         this.e = new ffn(fpt.this.p, 208, 20, wu.c("selectWorld.enterName"));
         this.e.a(fpt.this.B.b());
         this.e.b(fpt.this.B::a);
         fpt.this.B.a($$0x -> this.e.a(fgp.a(wu.a("selectWorld.targetFolder", wu.b($$0x.c()).a(n.u)))));
         fpt.this.b(this.e);
         $$0.a(fin.a(fpt.this.p, this.e, fpt.u), $$0.b().b());
         ffl<fqc.a> $$2 = $$0.a(ffl.<fqc.a>a($$0x -> $$0x.f).a(fqc.a.a, fqc.a.b, fqc.a.c).a(0, 0, 210, 20, fpt.s, ($$0x, $$1x) -> fpt.this.B.a($$1x)), $$1);
         fpt.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fgp.a($$1x.d().a()));
         });
         ffl<bpj> $$3 = $$0.a(ffl.a(bpj::b).a(bpj.values()).a(0, 0, 210, 20, wu.c("options.difficulty"), ($$0x, $$1x) -> fpt.this.B.a($$1x)), $$1);
         fpt.this.B.a($$1x -> {
            $$3.a(fpt.this.B.e());
            $$3.j = !fpt.this.B.f();
            $$3.a(fgp.a(fpt.this.B.e().d()));
         });
         ffl<Boolean> $$4 = $$0.a(ffl.e().a($$0x -> fgp.a(fpt.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> fpt.this.B.a($$1x)));
         fpt.this.B.a($$1x -> {
            $$4.a(fpt.this.B.g());
            $$4.j = !fpt.this.B.l() && !fpt.this.B.f();
         });
         if (!aa.b().g()) {
            $$0.a(ffe.a(fpt.v, $$0x -> fpt.this.a(fpt.this.B.k().g())).a(210).a());
         }
      }
   }

   class c extends fhf {
      private static final wu c = wu.c("createWorld.tab.more.title");
      private static final wu d = wu.c("selectWorld.gameRules");
      private static final wu e = wu.c("selectWorld.dataPacks");

      c() {
         super(c);
         fiq.b $$0 = this.a.b(8).d(1);
         $$0.a(ffe.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(ffe.a(fpt.v, $$0x -> fpt.this.a(fpt.this.B.k().g())).a(210).a());
         $$0.a(ffe.a(e, $$0x -> fpt.this.b(fpt.this.B.k().g())).a(210).a());
      }

      private void b() {
         fpt.this.m.a(new fpu(fpt.this.B.q().b(), $$0 -> {
            fpt.this.m.a(fpt.this);
            $$0.ifPresent(fpt.this.B::a);
         }));
      }
   }

   class d extends fhf {
      private static final wu c = wu.c("createWorld.tab.world.title");
      private static final wu d = wu.c("generator.minecraft.amplified.info");
      private static final wu e = wu.c("selectWorld.mapFeatures");
      private static final wu f = wu.c("selectWorld.mapFeatures.info");
      private static final wu g = wu.c("selectWorld.bonusItems");
      private static final wu h = wu.c("selectWorld.enterSeed");
      static final wu i = wu.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final ffn k;
      private final ffe l;

      d() {
         super(c);
         fiq.b $$0 = this.a.a(10).b(8).d(2);
         ffl<fqc.b> $$1 = $$0.a(
            ffl.<fqc.b>a(fqc.b::a).a(this.c()).a(fpt.d::a).a(0, 0, 150, 20, wu.c("selectWorld.mapType"), ($$0x, $$1x) -> fpt.this.B.a($$1x))
         );
         $$1.a(fpt.this.B.m());
         fpt.this.B.a($$1x -> {
            fqc.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fgp.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = fpt.this.B.m().c() != null;
         });
         this.l = $$0.a(ffe.a(wu.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         fpt.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new ffn(fpt.this.p, 308, 20, wu.c("selectWorld.enterSeed")) {
            @Override
            protected xi aK_() {
               return super.aK_().b(wt.t).b(fpt.d.i);
            }
         };
         this.k.c(i);
         this.k.a(fpt.this.B.h());
         this.k.b($$0x -> fpt.this.B.b(this.k.a()));
         $$0.a(fin.a(fpt.this.p, this.k, h), 2);
         fqa.a $$2 = fqa.a(310);
         $$2.a(e, fpt.this.B::i, fpt.this.B::b).a(() -> !fpt.this.B.l()).a(f);
         $$2.a(g, fpt.this.B::j, fpt.this.B::c).a(() -> !fpt.this.B.f() && !fpt.this.B.l());
         fqa $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         fpt.this.B.a($$1x -> $$3.a());
      }

      private void b() {
         fpy $$0 = fpt.this.B.n();
         if ($$0 != null) {
            fpt.this.m.a($$0.createEditScreen(fpt.this, fpt.this.B.k()));
         }
      }

      private ffl.c<fqc.b> c() {
         return new ffl.c<fqc.b>() {
            @Override
            public List<fqc.b> a() {
               return ffl.a.getAsBoolean() ? fpt.this.B.p() : fpt.this.B.o();
            }

            @Override
            public List<fqc.b> b() {
               return fpt.this.B.o();
            }
         };
      }

      private static xi a(ffl<fqc.b> $$0) {
         return $$0.a().b() ? wt.a($$0.d(), d) : $$0.d();
      }
   }
}
