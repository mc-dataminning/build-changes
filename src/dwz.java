import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwz {
   private static final dwz.a a = dwz.a.a("trial_chamber/breeze");
   private static final dwz.a b = dwz.a.a("trial_chamber/melee/husk");
   private static final dwz.a c = dwz.a.a("trial_chamber/melee/spider");
   private static final dwz.a d = dwz.a.a("trial_chamber/melee/zombie");
   private static final dwz.a e = dwz.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dwz.a f = dwz.a.a("trial_chamber/ranged/skeleton");
   private static final dwz.a g = dwz.a.a("trial_chamber/ranged/stray");
   private static final dwz.a h = dwz.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dwz.a i = dwz.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dwz.a j = dwz.a.a("trial_chamber/slow_ranged/stray");
   private static final dwz.a k = dwz.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dwz.a l = dwz.a.a("trial_chamber/small_melee/cave_spider");
   private static final dwz.a m = dwz.a.a("trial_chamber/small_melee/silverfish");
   private static final dwz.a n = dwz.a.a("trial_chamber/small_melee/slime");

   public static void a(rk<dwy> $$0) {
      a(
         $$0,
         a,
         dwy.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(brr.a(a(bvr.r))).a(),
         dwy.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(brr.a(a(bvr.r))).b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a()
      );
      a($$0, b, c().a(brr.a(a(bvr.an))).a(), c().a(brr.a(a(bvr.an, ewl.ak))).b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a());
      a($$0, c, c().a(brr.a(a(bvr.bo))).a(), a().a(brr.a(a(bvr.bo))).b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a());
      a($$0, d, c().a(brr.a(a(bvr.bO))).a(), c().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.bO, ewl.ak))).a());
      a($$0, e, c().a(brr.a(a(bvr.q))).a(), c().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.q, ewl.aj))).a());
      a($$0, f, c().a(brr.a(a(bvr.bf))).a(), c().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.bf, ewl.aj))).a());
      a($$0, g, c().a(brr.a(a(bvr.bs))).a(), c().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.bs, ewl.aj))).a());
      a($$0, h, b().a(brr.a(a(bvr.q))).a(), b().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.q, ewl.aj))).a());
      a($$0, i, b().a(brr.a(a(bvr.bf))).a(), b().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.bf, ewl.aj))).a());
      a($$0, j, b().a(brr.a(a(bvr.bs))).a(), b().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.bs, ewl.aj))).a());
      a(
         $$0,
         k,
         dwy.b().d(0.5F).b(20).a(brr.a(a(bvr.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwy.b().d(0.5F).b(20).b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.bO, $$0x -> $$0x.a("IsBaby", true), ewl.ak))).a()
      );
      a($$0, l, c().a(brr.a(a(bvr.v))).a(), a().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.v))).a());
      a($$0, m, c().a(brr.a(a(bvr.be))).a(), a().b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a()).a(brr.a(a(bvr.be))).a());
      a(
         $$0,
         n,
         c().a(brr.<dic>a().a(a(bvr.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvr.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(brr.<aly<ewu>>a().a(ewl.aN, 3).a(ewl.aO, 7).a())
            .a(brr.<dic>a().a(a(bvr.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvr.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bvk> dic a(bvr<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bvk> dic a(bvr<T> $$0, Consumer<ux> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bvk> dic a(bvr<T> $$0, aly<ewu> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bvk> dic a(bvr<T> $$0, Consumer<ux> $$1, @Nullable aly<ewu> $$2) {
      ux $$3 = new ux();
      $$3.a("id", ma.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bvu> $$4 = Optional.ofNullable($$2).map($$0x -> new bvu($$0x, 0.0F));
      return new dic($$3, Optional.empty(), $$4);
   }

   private static void a(rk<dwy> $$0, dwz.a $$1, dwy $$2, dwy $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static aly<dwy> a(String $$0) {
      return aly.a(mb.bd, alz.b($$0));
   }

   private static dwy.a a() {
      return dwy.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dwy.a b() {
      return dwy.b().b(4.0F).d(2.0F).b(160);
   }

   private static dwy.a c() {
      return dwy.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(aly<dwy> a, aly<dwy> b) {

      public static dwz.a a(String $$0) {
         return new dwz.a(dwz.a($$0 + "/normal"), dwz.a($$0 + "/ominous"));
      }
   }
}
