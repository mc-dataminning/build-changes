import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class duz {
   private static final duz.a a = duz.a.a("trial_chamber/breeze");
   private static final duz.a b = duz.a.a("trial_chamber/melee/husk");
   private static final duz.a c = duz.a.a("trial_chamber/melee/spider");
   private static final duz.a d = duz.a.a("trial_chamber/melee/zombie");
   private static final duz.a e = duz.a.a("trial_chamber/ranged/poison_skeleton");
   private static final duz.a f = duz.a.a("trial_chamber/ranged/skeleton");
   private static final duz.a g = duz.a.a("trial_chamber/ranged/stray");
   private static final duz.a h = duz.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final duz.a i = duz.a.a("trial_chamber/slow_ranged/skeleton");
   private static final duz.a j = duz.a.a("trial_chamber/slow_ranged/stray");
   private static final duz.a k = duz.a.a("trial_chamber/small_melee/baby_zombie");
   private static final duz.a l = duz.a.a("trial_chamber/small_melee/cave_spider");
   private static final duz.a m = duz.a.a("trial_chamber/small_melee/silverfish");
   private static final duz.a n = duz.a.a("trial_chamber/small_melee/slime");

   public static void a(qz<duy> $$0) {
      a(
         $$0,
         a,
         duy.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqs.a(a(bus.r))).a(),
         duy.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqs.a(a(bus.r))).b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a()
      );
      a($$0, b, c().a(bqs.a(a(bus.al))).a(), c().a(bqs.a(a(bus.al, euj.ak))).b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a());
      a($$0, c, c().a(bqs.a(a(bus.bk))).a(), a().a(bqs.a(a(bus.bk))).b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a());
      a($$0, d, c().a(bqs.a(a(bus.bK))).a(), c().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.bK, euj.ak))).a());
      a($$0, e, c().a(bqs.a(a(bus.q))).a(), c().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.q, euj.aj))).a());
      a($$0, f, c().a(bqs.a(a(bus.bb))).a(), c().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.bb, euj.aj))).a());
      a($$0, g, c().a(bqs.a(a(bus.bo))).a(), c().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.bo, euj.aj))).a());
      a($$0, h, b().a(bqs.a(a(bus.q))).a(), b().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.q, euj.aj))).a());
      a($$0, i, b().a(bqs.a(a(bus.bb))).a(), b().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.bb, euj.aj))).a());
      a($$0, j, b().a(bqs.a(a(bus.bo))).a(), b().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.bo, euj.aj))).a());
      a(
         $$0,
         k,
         duy.b().d(0.5F).b(20).a(bqs.a(a(bus.bK, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         duy.b().d(0.5F).b(20).b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.bK, $$0x -> $$0x.a("IsBaby", true), euj.ak))).a()
      );
      a($$0, l, c().a(bqs.a(a(bus.v))).a(), a().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.v))).a());
      a($$0, m, c().a(bqs.a(a(bus.ba))).a(), a().b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a()).a(bqs.a(a(bus.ba))).a());
      a(
         $$0,
         n,
         c().a(bqs.<dgg>a().a(a(bus.bd, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bus.bd, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqs.<ali<eus>>a().a(euj.aN, 3).a(euj.aO, 7).a())
            .a(bqs.<dgg>a().a(a(bus.bd, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bus.bd, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bul> dgg a(bus<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bul> dgg a(bus<T> $$0, Consumer<ul> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bul> dgg a(bus<T> $$0, ali<eus> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bul> dgg a(bus<T> $$0, Consumer<ul> $$1, @Nullable ali<eus> $$2) {
      ul $$3 = new ul();
      $$3.a("id", lz.f.b($$0).toString());
      $$1.accept($$3);
      Optional<buv> $$4 = Optional.ofNullable($$2).map($$0x -> new buv($$0x, 0.0F));
      return new dgg($$3, Optional.empty(), $$4);
   }

   private static void a(qz<duy> $$0, duz.a $$1, duy $$2, duy $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static ali<duy> a(String $$0) {
      return ali.a(ma.aF, alj.b($$0));
   }

   private static duy.a a() {
      return duy.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static duy.a b() {
      return duy.b().b(4.0F).d(2.0F).b(160);
   }

   private static duy.a c() {
      return duy.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(ali<duy> a, ali<duy> b) {

      public static duz.a a(String $$0) {
         return new duz.a(duz.a($$0 + "/normal"), duz.a($$0 + "/ominous"));
      }
   }
}
