import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwa {
   private static final dwa.a a = dwa.a.a("trial_chamber/breeze");
   private static final dwa.a b = dwa.a.a("trial_chamber/melee/husk");
   private static final dwa.a c = dwa.a.a("trial_chamber/melee/spider");
   private static final dwa.a d = dwa.a.a("trial_chamber/melee/zombie");
   private static final dwa.a e = dwa.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dwa.a f = dwa.a.a("trial_chamber/ranged/skeleton");
   private static final dwa.a g = dwa.a.a("trial_chamber/ranged/stray");
   private static final dwa.a h = dwa.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dwa.a i = dwa.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dwa.a j = dwa.a.a("trial_chamber/slow_ranged/stray");
   private static final dwa.a k = dwa.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dwa.a l = dwa.a.a("trial_chamber/small_melee/cave_spider");
   private static final dwa.a m = dwa.a.a("trial_chamber/small_melee/silverfish");
   private static final dwa.a n = dwa.a.a("trial_chamber/small_melee/slime");

   public static void a(qe<dvz> $$0) {
      a(
         $$0,
         a,
         dvz.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqr.a(a(bur.r))).a(),
         dvz.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqr.a(a(bur.r))).b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a()
      );
      a($$0, b, c().a(bqr.a(a(bur.am))).a(), c().a(bqr.a(a(bur.am, evm.ak))).b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a());
      a($$0, c, c().a(bqr.a(a(bur.bn))).a(), a().a(bqr.a(a(bur.bn))).b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a());
      a($$0, d, c().a(bqr.a(a(bur.bN))).a(), c().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.bN, evm.ak))).a());
      a($$0, e, c().a(bqr.a(a(bur.q))).a(), c().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.q, evm.aj))).a());
      a($$0, f, c().a(bqr.a(a(bur.be))).a(), c().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.be, evm.aj))).a());
      a($$0, g, c().a(bqr.a(a(bur.br))).a(), c().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.br, evm.aj))).a());
      a($$0, h, b().a(bqr.a(a(bur.q))).a(), b().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.q, evm.aj))).a());
      a($$0, i, b().a(bqr.a(a(bur.be))).a(), b().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.be, evm.aj))).a());
      a($$0, j, b().a(bqr.a(a(bur.br))).a(), b().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.br, evm.aj))).a());
      a(
         $$0,
         k,
         dvz.b().d(0.5F).b(20).a(bqr.a(a(bur.bN, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dvz.b().d(0.5F).b(20).b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.bN, $$0x -> $$0x.a("IsBaby", true), evm.ak))).a()
      );
      a($$0, l, c().a(bqr.a(a(bur.v))).a(), a().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.v))).a());
      a($$0, m, c().a(bqr.a(a(bur.bd))).a(), a().b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a()).a(bqr.a(a(bur.bd))).a());
      a(
         $$0,
         n,
         c().a(bqr.<dhb>a().a(a(bur.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bur.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqr.<aku<evv>>a().a(evm.aN, 3).a(evm.aO, 7).a())
            .a(bqr.<dhb>a().a(a(bur.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bur.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends buk> dhb a(bur<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends buk> dhb a(bur<T> $$0, Consumer<tq> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends buk> dhb a(bur<T> $$0, aku<evv> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends buk> dhb a(bur<T> $$0, Consumer<tq> $$1, @Nullable aku<evv> $$2) {
      tq $$3 = new tq();
      $$3.a("id", mb.f.b($$0).toString());
      $$1.accept($$3);
      Optional<buu> $$4 = Optional.ofNullable($$2).map($$0x -> new buu($$0x, 0.0F));
      return new dhb($$3, Optional.empty(), $$4);
   }

   private static void a(qe<dvz> $$0, dwa.a $$1, dvz $$2, dvz $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static aku<dvz> a(String $$0) {
      return aku.a(mc.bd, akv.b($$0));
   }

   private static dvz.a a() {
      return dvz.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dvz.a b() {
      return dvz.b().b(4.0F).d(2.0F).b(160);
   }

   private static dvz.a c() {
      return dvz.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(aku<dvz> a, aku<dvz> b) {

      public static dwa.a a(String $$0) {
         return new dwa.a(dwa.a($$0 + "/normal"), dwa.a($$0 + "/ominous"));
      }
   }
}
