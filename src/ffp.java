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

public class ffp extends faz {
   private static final int k = 1;
   private static final int l = 210;
   private static final int m = 36;
   private static final Logger n = LogUtils.getLogger();
   private static final String o = "mcworld-";
   static final uv p = uv.c("selectWorld.gameMode");
   static final uv q = uv.c("selectWorld.enterName");
   static final uv r = uv.c("selectWorld.experiments");
   static final uv t = uv.c("selectWorld.allowCommands.info");
   private static final uv u = uv.c("createWorld.preparing");
   private static final int v = 10;
   private static final int w = 8;
   public static final agm a = new agm("textures/gui/header_separator.png");
   public static final agm b = new agm("textures/gui/footer_separator.png");
   public static final agm c = new agm("textures/gui/light_dirt_background.png");
   final ffy x;
   private final exg y = new exg(this::d, $$1x -> this.f($$1x));
   private boolean z;
   private final ejp A;
   @Nullable
   private final faz B;
   @Nullable
   private Path C;
   @Nullable
   private aow D;
   @Nullable
   private eyn E;
   @Nullable
   private exh F;

   public static void a(eti $$0, @Nullable faz $$1) {
      a($$0, u);
      aow $$2 = new aow(new aoz($$0.ba()));
      ahh.c $$3 = a($$2, csy.c);
      CompletableFuture<ffx> $$4 = ahh.a(
         $$3, $$0x -> new ahh.b<>(new ffp.a(new dns(dnu.a(), dxc.a($$0x.c())), $$0x.b()), $$0x.d()), ($$0x, $$1x, $$2x, $$3x) -> {
            $$0x.close();
            return new ffx($$3x.a(), $$2x, $$1x, $$3x.b());
         }, ac.f(), $$0
      );
      $$0.c($$4::isDone);
      $$0.a(new ffp($$0, $$1, $$4.join(), Optional.of(dxc.a), OptionalLong.empty()));
   }

   public static ffp a(eti $$0, @Nullable faz $$1, csj $$2, ffx $$3, @Nullable Path $$4) {
      ffp $$5 = new ffp($$0, $$1, $$3, dxc.a($$3.d().d()), OptionalLong.of($$3.b().b()));
      $$5.z = true;
      $$5.x.a($$2.a());
      $$5.x.a($$2.e());
      $$5.x.a($$2.d());
      $$5.x.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.x.a(ffy.a.b);
      } else if ($$2.b().h()) {
         $$5.x.a(ffy.a.a);
      } else if ($$2.b().g()) {
         $$5.x.a(ffy.a.c);
      }

      $$5.C = $$4;
      return $$5;
   }

   private ffp(eti $$0, @Nullable faz $$1, ffx $$2, Optional<agl<dxb>> $$3, OptionalLong $$4) {
      super(uv.c("selectWorld.create"));
      this.B = $$1;
      this.A = $$0.ba();
      this.x = new ffy($$0.l().c(), $$2, $$3, $$4);
   }

   public ffy l() {
      return this.x;
   }

   @Override
   protected void aQ_() {
      this.F = exh.a(this.y, this.g).a(new ffp.b(), new ffp.d(), new ffp.c()).a();
      this.d(this.F);
      this.E = new eyn().a(10);
      eyn.b $$0 = this.E.d(2);
      $$0.a(eve.a(uv.c("selectWorld.create"), $$0x -> this.D()).a());
      $$0.a(eve.a(uu.e, $$0x -> this.C()).a());
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
         eym.a(this.E, 0, this.h - 36, this.g, 36);
         int $$0 = this.F.s().c();
         ezh $$1 = new ezh(0, $$0, this.g, this.E.r() - $$0);
         this.y.a($$1);
      }
   }

   private static void a(eti $$0, uv $$1) {
      $$0.d(new faf($$1));
   }

   private void D() {
      ffx $$0 = this.x.k();
      dnr.b $$1 = $$0.d().a($$0.c());
      in<agv> $$2 = $$0.e().a(agv.c, $$1.b());
      Lifecycle $$3 = cgk.a($$0.g().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.z && $$4 == Lifecycle.stable();
      ffz.a(this.f, this, $$5, () -> this.a($$1.d(), $$2, $$5), $$6);
   }

   private void a(eew.a $$0, in<agv> $$1, Lifecycle $$2) {
      a(this.f, u);
      Optional<ees.c> $$3 = this.G();
      if (!$$3.isEmpty()) {
         this.F();
         boolean $$4 = $$0 == eew.a.c;
         ffx $$5 = this.x.k();
         csj $$6 = this.c($$4);
         eey $$7 = new eew($$6, $$5.b(), $$0, $$2);
         this.f.w().a($$3.get(), $$5.f(), $$1, $$7);
      }
   }

   private csj c(boolean $$0) {
      String $$1 = this.x.b().trim();
      if ($$0) {
         csb $$2 = new csb();
         $$2.a(csb.l).a(false, null);
         return new csj($$1, csc.d, false, biy.a, true, $$2, csy.c);
      } else {
         return new csj($$1, this.x.d().e, this.x.f(), this.x.e(), this.x.g(), this.x.q(), this.x.k().g());
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
   public void aG_() {
      this.C();
   }

   @Override
   public void C() {
      this.f.a(this.B);
      this.F();
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(b, 0, atq.d(this.h - 36 - 2, 2), 0.0F, 0.0F, this.g, 2, 32, 2);
   }

   @Override
   public void b(eut $$0) {
      int $$1 = 32;
      $$0.a(c, 0, 0, 0, 0.0F, 0.0F, this.g, this.h, 32, 32);
   }

   @Override
   protected <T extends ewz & eyv> T e(T $$0) {
      return super.e($$0);
   }

   @Override
   protected <T extends ewz & ewh & eyv> T d(T $$0) {
      return super.d($$0);
   }

   @Nullable
   private Path E() {
      if (this.C == null) {
         try {
            this.C = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            n.warn("Failed to create temporary dir", var2);
            exl.c(this.f, this.x.c());
            this.C();
         }
      }

      return this.C;
   }

   void a(csy $$0) {
      Pair<Path, aow> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new ffs(this, (aow)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(csy $$0) {
      Pair<Path, aow> $$1 = this.c($$0);
      if ($$1 != null) {
         this.f.a(new feg((aow)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), uv.c("dataPack.title")));
      }
   }

   private void a(aow $$0, boolean $$1, Consumer<csy> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.d());
      List<String> $$4 = $$0.b().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      csy $$5 = new csy(new crt($$3, $$4), this.x.k().g().b());
      if (this.x.a($$5)) {
         this.f.a(this);
      } else {
         cgi $$6 = $$0.e();
         if (cgk.a($$6) && $$1) {
            this.f.a(new ffo($$0.f(), $$3x -> {
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

   private void a(aow $$0, csy $$1, Consumer<csy> $$2) {
      this.f.d(new faf(uv.c("dataPack.validation.working")));
      ahh.c $$3 = a($$0, $$1);
      ahh.<ffp.a, ffx>a(
            $$3,
            $$0x -> {
               if ($$0x.c().d(kd.aH).b() == 0) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().d(kd.ar).b() == 0) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  ffx $$1x = this.x.k();
                  DynamicOps<JsonElement> $$2x = agk.a(JsonOps.INSTANCE, $$1x.a());
                  DataResult<JsonElement> $$3x = dns.a($$2x, $$1x.b(), $$1x.d()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = agk.a(JsonOps.INSTANCE, $$0x.c());
                  dns $$5 = (dns)$$3x.flatMap($$1xx -> dns.a.parse($$4, $$1xx))
                     .getOrThrow(false, ac.a("Error parsing worldgen settings after loading data packs: ", n::error));
                  return new ahh.b<>(new ffp.a($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new ffx($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ac.f(),
            this.f
         )
         .thenAcceptAsync(this.x::a, this.f)
         .handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               n.warn("Failed to validate datapack", $$2x);
               this.f.a(new ezs($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.x.k().g());
                  } else {
                     $$2.accept(csy.c);
                  }
               }, uv.c("dataPack.validation.failed"), uu.a, uv.c("dataPack.validation.back"), uv.c("dataPack.validation.reset")));
            } else {
               this.f.a(this);
            }

            return null;
         });
   }

   private static ahh.c a(aow $$0, csy $$1) {
      ahh.d $$2 = new ahh.d($$0, $$1, false, true);
      return new ahh.c($$2, dv.a.c, 2);
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

   private Optional<ees.c> G() {
      String $$0 = this.x.c();

      try {
         ees.c $$1 = this.f.l().e($$0);
         if (this.C == null) {
            return Optional.of($$1);
         }

         try {
            Optional var5;
            try (Stream<Path> $$2 = Files.walk(this.C)) {
               Path $$3 = $$1.a(eeq.j);
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

      exl.c(this.f, $$0);
      this.C();
      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, eti $$1) {
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
         exl.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, aow> c(csy $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.D == null) {
            this.D = aoz.a($$1, this.A);
            this.D.a();
         }

         this.D.a($$0.a().a());
         return Pair.of($$1, this.D);
      } else {
         return null;
      }
   }

   static record a(dns a, csy b) {
   }

   class b extends exe {
      private static final uv c = uv.c("createWorld.tab.game.title");
      private static final uv d = uv.c("selectWorld.allowCommands");
      private final evn e;

      b() {
         super(c);
         eyn.b $$0 = this.a.b(8).d(1);
         eyr $$1 = $$0.b();
         this.e = new evn(ffp.this.i, 208, 20, uv.c("selectWorld.enterName"));
         this.e.a(ffp.this.x.b());
         this.e.b(ffp.this.x::a);
         ffp.this.x.a($$0x -> this.e.a(ewp.a(uv.a("selectWorld.targetFolder", uv.b($$0x.c()).a(n.u)))));
         ffp.this.c(this.e);
         $$0.a(eyk.a(ffp.this.i, this.e, ffp.q), $$0.b().b());
         evl<ffy.a> $$2 = $$0.a(evl.<ffy.a>a($$0x -> $$0x.f).a(ffy.a.a, ffy.a.b, ffy.a.c).a(0, 0, 210, 20, ffp.p, ($$0x, $$1x) -> ffp.this.x.a($$1x)), $$1);
         ffp.this.x.a($$1x -> {
            $$2.a($$1x.d());
            $$2.i = !$$1x.l();
            $$2.a(ewp.a($$1x.d().a()));
         });
         evl<biy> $$3 = $$0.a(evl.a(biy::b).a(biy.values()).a(0, 0, 210, 20, uv.c("options.difficulty"), ($$0x, $$1x) -> ffp.this.x.a($$1x)), $$1);
         ffp.this.x.a($$1x -> {
            $$3.a(ffp.this.x.e());
            $$3.i = !ffp.this.x.f();
            $$3.a(ewp.a(ffp.this.x.e().d()));
         });
         evl<Boolean> $$4 = $$0.a(evl.f().a($$0x -> ewp.a(ffp.t)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> ffp.this.x.a($$1x)));
         ffp.this.x.a($$1x -> {
            $$4.a(ffp.this.x.g());
            $$4.i = !ffp.this.x.l() && !ffp.this.x.f();
         });
         if (!aa.b().g()) {
            $$0.a(eve.a(ffp.r, $$0x -> ffp.this.a(ffp.this.x.k().g())).a(210).a());
         }
      }
   }

   class c extends exe {
      private static final uv c = uv.c("createWorld.tab.more.title");
      private static final uv d = uv.c("selectWorld.gameRules");
      private static final uv e = uv.c("selectWorld.dataPacks");

      c() {
         super(c);
         eyn.b $$0 = this.a.b(8).d(1);
         $$0.a(eve.a(d, $$0x -> this.b()).a(210).a());
         $$0.a(eve.a(ffp.r, $$0x -> ffp.this.a(ffp.this.x.k().g())).a(210).a());
         $$0.a(eve.a(e, $$0x -> ffp.this.b(ffp.this.x.k().g())).a(210).a());
      }

      private void b() {
         ffp.this.f.a(new ffq(ffp.this.x.q().b(), $$0 -> {
            ffp.this.f.a(ffp.this);
            $$0.ifPresent(ffp.this.x::a);
         }));
      }
   }

   class d extends exe {
      private static final uv c = uv.c("createWorld.tab.world.title");
      private static final uv d = uv.c("generator.minecraft.amplified.info");
      private static final uv e = uv.c("selectWorld.mapFeatures");
      private static final uv f = uv.c("selectWorld.mapFeatures.info");
      private static final uv g = uv.c("selectWorld.bonusItems");
      private static final uv h = uv.c("selectWorld.enterSeed");
      static final uv i = uv.c("selectWorld.seedInfo").a(n.i);
      private static final int j = 310;
      private final evn k;
      private final eve l;

      d() {
         super(c);
         eyn.b $$0 = this.a.a(10).b(8).d(2);
         evl<ffy.b> $$1 = $$0.a(
            evl.<ffy.b>a(ffy.b::a).a(this.c()).a(ffp.d::a).a(0, 0, 150, 20, uv.c("selectWorld.mapType"), ($$0x, $$1x) -> ffp.this.x.a($$1x))
         );
         $$1.a(ffp.this.x.m());
         ffp.this.x.a($$1x -> {
            ffy.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(ewp.a(d));
            } else {
               $$1.a(null);
            }

            $$1.i = ffp.this.x.m().c() != null;
         });
         this.l = $$0.a(eve.a(uv.c("selectWorld.customizeType"), $$0x -> this.b()).a());
         ffp.this.x.a($$0x -> this.l.i = !$$0x.l() && $$0x.n() != null);
         this.k = new evn(ffp.this.i, 308, 20, uv.c("selectWorld.enterSeed")) {
            @Override
            protected vj aN_() {
               return super.aN_().b(uu.s).b(ffp.d.i);
            }
         };
         this.k.c(i);
         this.k.a(ffp.this.x.h());
         this.k.b($$0x -> ffp.this.x.b(this.k.a()));
         $$0.a(eyk.a(ffp.this.i, this.k, h), 2);
         ffw.a $$2 = ffw.a(310);
         $$2.a(e, ffp.this.x::i, ffp.this.x::b).a(() -> !ffp.this.x.l()).a(f);
         $$2.a(g, ffp.this.x::j, ffp.this.x::c).a(() -> !ffp.this.x.f() && !ffp.this.x.l());
         ffw $$3 = $$2.a($$1x -> $$0.a($$1x, 2));
         ffp.this.x.a($$1x -> $$3.a());
      }

      private void b() {
         ffu $$0 = ffp.this.x.n();
         if ($$0 != null) {
            ffp.this.f.a($$0.createEditScreen(ffp.this, ffp.this.x.k()));
         }
      }

      private evl.c<ffy.b> c() {
         return new evl.c<ffy.b>() {
            @Override
            public List<ffy.b> a() {
               return evl.a.getAsBoolean() ? ffp.this.x.p() : ffp.this.x.o();
            }

            @Override
            public List<ffy.b> b() {
               return ffp.this.x.o();
            }
         };
      }

      private static vj a(evl<ffy.b> $$0) {
         return $$0.a().b() ? uu.a($$0.e(), d) : $$0.e();
      }
   }
}
