import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dus {
   private static final dus.a a = dus.a.a("trial_chamber/breeze");
   private static final dus.a b = dus.a.a("trial_chamber/melee/husk");
   private static final dus.a c = dus.a.a("trial_chamber/melee/spider");
   private static final dus.a d = dus.a.a("trial_chamber/melee/zombie");
   private static final dus.a e = dus.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dus.a f = dus.a.a("trial_chamber/ranged/skeleton");
   private static final dus.a g = dus.a.a("trial_chamber/ranged/stray");
   private static final dus.a h = dus.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dus.a i = dus.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dus.a j = dus.a.a("trial_chamber/slow_ranged/stray");
   private static final dus.a k = dus.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dus.a l = dus.a.a("trial_chamber/small_melee/cave_spider");
   private static final dus.a m = dus.a.a("trial_chamber/small_melee/silverfish");
   private static final dus.a n = dus.a.a("trial_chamber/small_melee/slime");

   public static void a(rb<dur> $$0) {
      a(
         $$0,
         a,
         dur.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqp.a(a(bup.m))).a(),
         dur.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqp.a(a(bup.m))).b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a()
      );
      a($$0, b, c().a(bqp.a(a(bup.ac))).a(), c().a(bqp.a(a(bup.ac, euc.ak))).b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a());
      a($$0, c, c().a(bqp.a(a(bup.aW))).a(), a().a(bqp.a(a(bup.aW))).b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a());
      a($$0, d, c().a(bqp.a(a(bup.bu))).a(), c().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.bu, euc.ak))).a());
      a($$0, e, c().a(bqp.a(a(bup.l))).a(), c().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.l, euc.aj))).a());
      a($$0, f, c().a(bqp.a(a(bup.aN))).a(), c().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.aN, euc.aj))).a());
      a($$0, g, c().a(bqp.a(a(bup.aY))).a(), c().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.aY, euc.aj))).a());
      a($$0, h, b().a(bqp.a(a(bup.l))).a(), b().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.l, euc.aj))).a());
      a($$0, i, b().a(bqp.a(a(bup.aN))).a(), b().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.aN, euc.aj))).a());
      a($$0, j, b().a(bqp.a(a(bup.aY))).a(), b().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.aY, euc.aj))).a());
      a(
         $$0,
         k,
         dur.b().d(0.5F).b(20).a(bqp.a(a(bup.bu, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dur.b().d(0.5F).b(20).b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.bu, $$0x -> $$0x.a("IsBaby", true), euc.ak))).a()
      );
      a($$0, l, c().a(bqp.a(a(bup.q))).a(), a().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.q))).a());
      a($$0, m, c().a(bqp.a(a(bup.aM))).a(), a().b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a()).a(bqp.a(a(bup.aM))).a());
      a(
         $$0,
         n,
         c().a(bqp.<dfz>a().a(a(bup.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bup.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqp.<alk<eul>>a().a(euc.aN, 3).a(euc.aO, 7).a())
            .a(bqp.<dfz>a().a(a(bup.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bup.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bui> dfz a(bup<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bui> dfz a(bup<T> $$0, Consumer<un> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bui> dfz a(bup<T> $$0, alk<eul> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bui> dfz a(bup<T> $$0, Consumer<un> $$1, @Nullable alk<eul> $$2) {
      un $$3 = new un();
      $$3.a("id", lz.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bus> $$4 = Optional.ofNullable($$2).map($$0x -> new bus($$0x, 0.0F));
      return new dfz($$3, Optional.empty(), $$4);
   }

   private static void a(rb<dur> $$0, dus.a $$1, dur $$2, dur $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alk<dur> a(String $$0) {
      return alk.a(ma.aF, all.b($$0));
   }

   private static dur.a a() {
      return dur.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dur.a b() {
      return dur.b().b(4.0F).d(2.0F).b(160);
   }

   private static dur.a c() {
      return dur.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alk<dur> a, alk<dur> b) {

      public static dus.a a(String $$0) {
         return new dus.a(dus.a($$0 + "/normal"), dus.a($$0 + "/ominous"));
      }
   }
}
