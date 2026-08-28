import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dvz {
   private static final dvz.a a = dvz.a.a("trial_chamber/breeze");
   private static final dvz.a b = dvz.a.a("trial_chamber/melee/husk");
   private static final dvz.a c = dvz.a.a("trial_chamber/melee/spider");
   private static final dvz.a d = dvz.a.a("trial_chamber/melee/zombie");
   private static final dvz.a e = dvz.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dvz.a f = dvz.a.a("trial_chamber/ranged/skeleton");
   private static final dvz.a g = dvz.a.a("trial_chamber/ranged/stray");
   private static final dvz.a h = dvz.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dvz.a i = dvz.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dvz.a j = dvz.a.a("trial_chamber/slow_ranged/stray");
   private static final dvz.a k = dvz.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dvz.a l = dvz.a.a("trial_chamber/small_melee/cave_spider");
   private static final dvz.a m = dvz.a.a("trial_chamber/small_melee/silverfish");
   private static final dvz.a n = dvz.a.a("trial_chamber/small_melee/slime");

   public static void a(qe<dvy> $$0) {
      a(
         $$0,
         a,
         dvy.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqq.a(a(buq.r))).a(),
         dvy.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqq.a(a(buq.r))).b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a()
      );
      a($$0, b, c().a(bqq.a(a(buq.am))).a(), c().a(bqq.a(a(buq.am, evl.ak))).b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a());
      a($$0, c, c().a(bqq.a(a(buq.bn))).a(), a().a(bqq.a(a(buq.bn))).b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a());
      a($$0, d, c().a(bqq.a(a(buq.bN))).a(), c().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.bN, evl.ak))).a());
      a($$0, e, c().a(bqq.a(a(buq.q))).a(), c().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.q, evl.aj))).a());
      a($$0, f, c().a(bqq.a(a(buq.be))).a(), c().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.be, evl.aj))).a());
      a($$0, g, c().a(bqq.a(a(buq.br))).a(), c().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.br, evl.aj))).a());
      a($$0, h, b().a(bqq.a(a(buq.q))).a(), b().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.q, evl.aj))).a());
      a($$0, i, b().a(bqq.a(a(buq.be))).a(), b().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.be, evl.aj))).a());
      a($$0, j, b().a(bqq.a(a(buq.br))).a(), b().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.br, evl.aj))).a());
      a(
         $$0,
         k,
         dvy.b().d(0.5F).b(20).a(bqq.a(a(buq.bN, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dvy.b().d(0.5F).b(20).b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.bN, $$0x -> $$0x.a("IsBaby", true), evl.ak))).a()
      );
      a($$0, l, c().a(bqq.a(a(buq.v))).a(), a().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.v))).a());
      a($$0, m, c().a(bqq.a(a(buq.bd))).a(), a().b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a()).a(bqq.a(a(buq.bd))).a());
      a(
         $$0,
         n,
         c().a(bqq.<dha>a().a(a(buq.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(buq.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqq.<akt<evu>>a().a(evl.aN, 3).a(evl.aO, 7).a())
            .a(bqq.<dha>a().a(a(buq.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(buq.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends buj> dha a(buq<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends buj> dha a(buq<T> $$0, Consumer<tq> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends buj> dha a(buq<T> $$0, akt<evu> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends buj> dha a(buq<T> $$0, Consumer<tq> $$1, @Nullable akt<evu> $$2) {
      tq $$3 = new tq();
      $$3.a("id", mb.f.b($$0).toString());
      $$1.accept($$3);
      Optional<but> $$4 = Optional.ofNullable($$2).map($$0x -> new but($$0x, 0.0F));
      return new dha($$3, Optional.empty(), $$4);
   }

   private static void a(qe<dvy> $$0, dvz.a $$1, dvy $$2, dvy $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static akt<dvy> a(String $$0) {
      return akt.a(mc.bd, aku.b($$0));
   }

   private static dvy.a a() {
      return dvy.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dvy.a b() {
      return dvy.b().b(4.0F).d(2.0F).b(160);
   }

   private static dvy.a c() {
      return dvy.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(akt<dvy> a, akt<dvy> b) {

      public static dvz.a a(String $$0) {
         return new dvz.a(dvz.a($$0 + "/normal"), dvz.a($$0 + "/ominous"));
      }
   }
}
