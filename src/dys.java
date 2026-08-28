import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dys {
   private static final dys.a a = dys.a.a("trial_chamber/breeze");
   private static final dys.a b = dys.a.a("trial_chamber/melee/husk");
   private static final dys.a c = dys.a.a("trial_chamber/melee/spider");
   private static final dys.a d = dys.a.a("trial_chamber/melee/zombie");
   private static final dys.a e = dys.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dys.a f = dys.a.a("trial_chamber/ranged/skeleton");
   private static final dys.a g = dys.a.a("trial_chamber/ranged/stray");
   private static final dys.a h = dys.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dys.a i = dys.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dys.a j = dys.a.a("trial_chamber/slow_ranged/stray");
   private static final dys.a k = dys.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dys.a l = dys.a.a("trial_chamber/small_melee/cave_spider");
   private static final dys.a m = dys.a.a("trial_chamber/small_melee/silverfish");
   private static final dys.a n = dys.a.a("trial_chamber/small_melee/slime");

   public static void a(qh<dyr> $$0) {
      a(
         $$0,
         a,
         dyr.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bsj.a(a(bwj.r))).a(),
         dyr.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bsj.a(a(bwj.r))).b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a()
      );
      a($$0, b, c().a(bsj.a(a(bwj.am))).a(), c().a(bsj.a(a(bwj.am, eyj.ak))).b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a());
      a($$0, c, c().a(bsj.a(a(bwj.bo))).a(), a().a(bsj.a(a(bwj.bo))).b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a());
      a($$0, d, c().a(bsj.a(a(bwj.bO))).a(), c().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.bO, eyj.ak))).a());
      a($$0, e, c().a(bsj.a(a(bwj.q))).a(), c().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.q, eyj.aj))).a());
      a($$0, f, c().a(bsj.a(a(bwj.bf))).a(), c().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.bf, eyj.aj))).a());
      a($$0, g, c().a(bsj.a(a(bwj.bs))).a(), c().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.bs, eyj.aj))).a());
      a($$0, h, b().a(bsj.a(a(bwj.q))).a(), b().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.q, eyj.aj))).a());
      a($$0, i, b().a(bsj.a(a(bwj.bf))).a(), b().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.bf, eyj.aj))).a());
      a($$0, j, b().a(bsj.a(a(bwj.bs))).a(), b().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.bs, eyj.aj))).a());
      a(
         $$0,
         k,
         dyr.b().d(0.5F).b(20).a(bsj.a(a(bwj.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dyr.b().d(0.5F).b(20).b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.bO, $$0x -> $$0x.a("IsBaby", true), eyj.ak))).a()
      );
      a($$0, l, c().a(bsj.a(a(bwj.v))).a(), a().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.v))).a());
      a($$0, m, c().a(bsj.a(a(bwj.be))).a(), a().b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a()).a(bsj.a(a(bwj.be))).a());
      a(
         $$0,
         n,
         c().a(bsj.<djj>b().a(a(bwj.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwj.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bsj.<ald<eys>>b().a(eyj.aN, 3).a(eyj.aO, 7).a())
            .a(bsj.<djj>b().a(a(bwj.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwj.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bwa> djj a(bwj<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bwa> djj a(bwj<T> $$0, Consumer<tx> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bwa> djj a(bwj<T> $$0, ald<eys> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bwa> djj a(bwj<T> $$0, Consumer<tx> $$1, @Nullable ald<eys> $$2) {
      tx $$3 = new tx();
      $$3.a("id", mf.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bwm> $$4 = Optional.ofNullable($$2).map($$0x -> new bwm($$0x, 0.0F));
      return new djj($$3, Optional.empty(), $$4);
   }

   private static void a(qh<dyr> $$0, dys.a $$1, dyr $$2, dyr $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static ald<dyr> a(String $$0) {
      return ald.a(mg.bg, ale.b($$0));
   }

   private static dyr.a a() {
      return dyr.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dyr.a b() {
      return dyr.b().b(4.0F).d(2.0F).b(160);
   }

   private static dyr.a c() {
      return dyr.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(ald<dyr> a, ald<dyr> b) {

      public static dys.a a(String $$0) {
         return new dys.a(dys.a($$0 + "/normal"), dys.a($$0 + "/ominous"));
      }
   }
}
