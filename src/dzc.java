import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzc {
   private static final dzc.a a = dzc.a.a("trial_chamber/breeze");
   private static final dzc.a b = dzc.a.a("trial_chamber/melee/husk");
   private static final dzc.a c = dzc.a.a("trial_chamber/melee/spider");
   private static final dzc.a d = dzc.a.a("trial_chamber/melee/zombie");
   private static final dzc.a e = dzc.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dzc.a f = dzc.a.a("trial_chamber/ranged/skeleton");
   private static final dzc.a g = dzc.a.a("trial_chamber/ranged/stray");
   private static final dzc.a h = dzc.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dzc.a i = dzc.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dzc.a j = dzc.a.a("trial_chamber/slow_ranged/stray");
   private static final dzc.a k = dzc.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dzc.a l = dzc.a.a("trial_chamber/small_melee/cave_spider");
   private static final dzc.a m = dzc.a.a("trial_chamber/small_melee/silverfish");
   private static final dzc.a n = dzc.a.a("trial_chamber/small_melee/slime");

   public static void a(qh<dzb> $$0) {
      a(
         $$0,
         a,
         dzb.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bsm.a(a(bwm.r))).a(),
         dzb.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bsm.a(a(bwm.r))).b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a()
      );
      a($$0, b, c().a(bsm.a(a(bwm.am))).a(), c().a(bsm.a(a(bwm.am, eyv.ak))).b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a());
      a($$0, c, c().a(bsm.a(a(bwm.bo))).a(), a().a(bsm.a(a(bwm.bo))).b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a());
      a($$0, d, c().a(bsm.a(a(bwm.bO))).a(), c().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.bO, eyv.ak))).a());
      a($$0, e, c().a(bsm.a(a(bwm.q))).a(), c().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.q, eyv.aj))).a());
      a($$0, f, c().a(bsm.a(a(bwm.bf))).a(), c().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.bf, eyv.aj))).a());
      a($$0, g, c().a(bsm.a(a(bwm.bs))).a(), c().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.bs, eyv.aj))).a());
      a($$0, h, b().a(bsm.a(a(bwm.q))).a(), b().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.q, eyv.aj))).a());
      a($$0, i, b().a(bsm.a(a(bwm.bf))).a(), b().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.bf, eyv.aj))).a());
      a($$0, j, b().a(bsm.a(a(bwm.bs))).a(), b().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.bs, eyv.aj))).a());
      a(
         $$0,
         k,
         dzb.b().d(0.5F).b(20).a(bsm.a(a(bwm.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dzb.b().d(0.5F).b(20).b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.bO, $$0x -> $$0x.a("IsBaby", true), eyv.ak))).a()
      );
      a($$0, l, c().a(bsm.a(a(bwm.v))).a(), a().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.v))).a());
      a($$0, m, c().a(bsm.a(a(bwm.be))).a(), a().b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a()).a(bsm.a(a(bwm.be))).a());
      a(
         $$0,
         n,
         c().a(bsm.<djp>b().a(a(bwm.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwm.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bsm.<alf<eze>>b().a(eyv.aN, 3).a(eyv.aO, 7).a())
            .a(bsm.<djp>b().a(a(bwm.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwm.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bwd> djp a(bwm<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bwd> djp a(bwm<T> $$0, Consumer<tz> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bwd> djp a(bwm<T> $$0, alf<eze> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bwd> djp a(bwm<T> $$0, Consumer<tz> $$1, @Nullable alf<eze> $$2) {
      tz $$3 = new tz();
      $$3.a("id", mf.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bwp> $$4 = Optional.ofNullable($$2).map($$0x -> new bwp($$0x, 0.0F));
      return new djp($$3, Optional.empty(), $$4);
   }

   private static void a(qh<dzb> $$0, dzc.a $$1, dzb $$2, dzb $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alf<dzb> a(String $$0) {
      return alf.a(mg.bh, alg.b($$0));
   }

   private static dzb.a a() {
      return dzb.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dzb.a b() {
      return dzb.b().b(4.0F).d(2.0F).b(160);
   }

   private static dzb.a c() {
      return dzb.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alf<dzb> a, alf<dzb> b) {

      public static dzc.a a(String $$0) {
         return new dzc.a(dzc.a($$0 + "/normal"), dzc.a($$0 + "/ominous"));
      }
   }
}
