import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxq {
   private static final dxq.a a = dxq.a.a("trial_chamber/breeze");
   private static final dxq.a b = dxq.a.a("trial_chamber/melee/husk");
   private static final dxq.a c = dxq.a.a("trial_chamber/melee/spider");
   private static final dxq.a d = dxq.a.a("trial_chamber/melee/zombie");
   private static final dxq.a e = dxq.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dxq.a f = dxq.a.a("trial_chamber/ranged/skeleton");
   private static final dxq.a g = dxq.a.a("trial_chamber/ranged/stray");
   private static final dxq.a h = dxq.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dxq.a i = dxq.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dxq.a j = dxq.a.a("trial_chamber/slow_ranged/stray");
   private static final dxq.a k = dxq.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dxq.a l = dxq.a.a("trial_chamber/small_melee/cave_spider");
   private static final dxq.a m = dxq.a.a("trial_chamber/small_melee/silverfish");
   private static final dxq.a n = dxq.a.a("trial_chamber/small_melee/slime");

   public static void a(qg<dxp> $$0) {
      a(
         $$0,
         a,
         dxp.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bsb.a(a(bwb.r))).a(),
         dxp.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bsb.a(a(bwb.r))).b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a()
      );
      a($$0, b, c().a(bsb.a(a(bwb.am))).a(), c().a(bsb.a(a(bwb.am, exh.ak))).b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a());
      a($$0, c, c().a(bsb.a(a(bwb.bn))).a(), a().a(bsb.a(a(bwb.bn))).b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a());
      a($$0, d, c().a(bsb.a(a(bwb.bN))).a(), c().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.bN, exh.ak))).a());
      a($$0, e, c().a(bsb.a(a(bwb.q))).a(), c().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.q, exh.aj))).a());
      a($$0, f, c().a(bsb.a(a(bwb.be))).a(), c().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.be, exh.aj))).a());
      a($$0, g, c().a(bsb.a(a(bwb.br))).a(), c().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.br, exh.aj))).a());
      a($$0, h, b().a(bsb.a(a(bwb.q))).a(), b().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.q, exh.aj))).a());
      a($$0, i, b().a(bsb.a(a(bwb.be))).a(), b().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.be, exh.aj))).a());
      a($$0, j, b().a(bsb.a(a(bwb.br))).a(), b().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.br, exh.aj))).a());
      a(
         $$0,
         k,
         dxp.b().d(0.5F).b(20).a(bsb.a(a(bwb.bN, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dxp.b().d(0.5F).b(20).b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.bN, $$0x -> $$0x.a("IsBaby", true), exh.ak))).a()
      );
      a($$0, l, c().a(bsb.a(a(bwb.v))).a(), a().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.v))).a());
      a($$0, m, c().a(bsb.a(a(bwb.bd))).a(), a().b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a()).a(bsb.a(a(bwb.bd))).a());
      a(
         $$0,
         n,
         c().a(bsb.<dij>b().a(a(bwb.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwb.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bsb.<alc<exq>>b().a(exh.aN, 3).a(exh.aO, 7).a())
            .a(bsb.<dij>b().a(a(bwb.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwb.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bvs> dij a(bwb<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bvs> dij a(bwb<T> $$0, Consumer<tw> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bvs> dij a(bwb<T> $$0, alc<exq> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bvs> dij a(bwb<T> $$0, Consumer<tw> $$1, @Nullable alc<exq> $$2) {
      tw $$3 = new tw();
      $$3.a("id", md.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bwe> $$4 = Optional.ofNullable($$2).map($$0x -> new bwe($$0x, 0.0F));
      return new dij($$3, Optional.empty(), $$4);
   }

   private static void a(qg<dxp> $$0, dxq.a $$1, dxp $$2, dxp $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alc<dxp> a(String $$0) {
      return alc.a(me.bk, ald.b($$0));
   }

   private static dxp.a a() {
      return dxp.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dxp.a b() {
      return dxp.b().b(4.0F).d(2.0F).b(160);
   }

   private static dxp.a c() {
      return dxp.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alc<dxp> a, alc<dxp> b) {

      public static dxq.a a(String $$0) {
         return new dxq.a(dxq.a($$0 + "/normal"), dxq.a($$0 + "/ominous"));
      }
   }
}
