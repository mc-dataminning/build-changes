import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dws {
   private static final dws.a a = dws.a.a("trial_chamber/breeze");
   private static final dws.a b = dws.a.a("trial_chamber/melee/husk");
   private static final dws.a c = dws.a.a("trial_chamber/melee/spider");
   private static final dws.a d = dws.a.a("trial_chamber/melee/zombie");
   private static final dws.a e = dws.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dws.a f = dws.a.a("trial_chamber/ranged/skeleton");
   private static final dws.a g = dws.a.a("trial_chamber/ranged/stray");
   private static final dws.a h = dws.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dws.a i = dws.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dws.a j = dws.a.a("trial_chamber/slow_ranged/stray");
   private static final dws.a k = dws.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dws.a l = dws.a.a("trial_chamber/small_melee/cave_spider");
   private static final dws.a m = dws.a.a("trial_chamber/small_melee/silverfish");
   private static final dws.a n = dws.a.a("trial_chamber/small_melee/slime");

   public static void a(ra<dwr> $$0) {
      a(
         $$0,
         a,
         dwr.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bri.a(a(bvi.r))).a(),
         dwr.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bri.a(a(bvi.r))).b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a()
      );
      a($$0, b, c().a(bri.a(a(bvi.an))).a(), c().a(bri.a(a(bvi.an, ewe.ak))).b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a());
      a($$0, c, c().a(bri.a(a(bvi.bo))).a(), a().a(bri.a(a(bvi.bo))).b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a());
      a($$0, d, c().a(bri.a(a(bvi.bO))).a(), c().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.bO, ewe.ak))).a());
      a($$0, e, c().a(bri.a(a(bvi.q))).a(), c().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.q, ewe.aj))).a());
      a($$0, f, c().a(bri.a(a(bvi.bf))).a(), c().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.bf, ewe.aj))).a());
      a($$0, g, c().a(bri.a(a(bvi.bs))).a(), c().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.bs, ewe.aj))).a());
      a($$0, h, b().a(bri.a(a(bvi.q))).a(), b().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.q, ewe.aj))).a());
      a($$0, i, b().a(bri.a(a(bvi.bf))).a(), b().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.bf, ewe.aj))).a());
      a($$0, j, b().a(bri.a(a(bvi.bs))).a(), b().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.bs, ewe.aj))).a());
      a(
         $$0,
         k,
         dwr.b().d(0.5F).b(20).a(bri.a(a(bvi.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwr.b().d(0.5F).b(20).b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.bO, $$0x -> $$0x.a("IsBaby", true), ewe.ak))).a()
      );
      a($$0, l, c().a(bri.a(a(bvi.v))).a(), a().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.v))).a());
      a($$0, m, c().a(bri.a(a(bvi.be))).a(), a().b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a()).a(bri.a(a(bvi.be))).a());
      a(
         $$0,
         n,
         c().a(bri.<dht>a().a(a(bvi.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvi.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bri.<alo<ewn>>a().a(ewe.aN, 3).a(ewe.aO, 7).a())
            .a(bri.<dht>a().a(a(bvi.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvi.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bvb> dht a(bvi<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bvb> dht a(bvi<T> $$0, Consumer<um> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bvb> dht a(bvi<T> $$0, alo<ewn> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bvb> dht a(bvi<T> $$0, Consumer<um> $$1, @Nullable alo<ewn> $$2) {
      um $$3 = new um();
      $$3.a("id", ma.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bvl> $$4 = Optional.ofNullable($$2).map($$0x -> new bvl($$0x, 0.0F));
      return new dht($$3, Optional.empty(), $$4);
   }

   private static void a(ra<dwr> $$0, dws.a $$1, dwr $$2, dwr $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alo<dwr> a(String $$0) {
      return alo.a(mb.bd, alp.b($$0));
   }

   private static dwr.a a() {
      return dwr.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dwr.a b() {
      return dwr.b().b(4.0F).d(2.0F).b(160);
   }

   private static dwr.a c() {
      return dwr.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alo<dwr> a, alo<dwr> b) {

      public static dws.a a(String $$0) {
         return new dws.a(dws.a($$0 + "/normal"), dws.a($$0 + "/ominous"));
      }
   }
}
