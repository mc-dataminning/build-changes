import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwr {
   private static final dwr.a a = dwr.a.a("trial_chamber/breeze");
   private static final dwr.a b = dwr.a.a("trial_chamber/melee/husk");
   private static final dwr.a c = dwr.a.a("trial_chamber/melee/spider");
   private static final dwr.a d = dwr.a.a("trial_chamber/melee/zombie");
   private static final dwr.a e = dwr.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dwr.a f = dwr.a.a("trial_chamber/ranged/skeleton");
   private static final dwr.a g = dwr.a.a("trial_chamber/ranged/stray");
   private static final dwr.a h = dwr.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dwr.a i = dwr.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dwr.a j = dwr.a.a("trial_chamber/slow_ranged/stray");
   private static final dwr.a k = dwr.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dwr.a l = dwr.a.a("trial_chamber/small_melee/cave_spider");
   private static final dwr.a m = dwr.a.a("trial_chamber/small_melee/silverfish");
   private static final dwr.a n = dwr.a.a("trial_chamber/small_melee/slime");

   public static void a(rk<dwq> $$0) {
      a(
         $$0,
         a,
         dwq.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(brm.a(a(bvm.r))).a(),
         dwq.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(brm.a(a(bvm.r))).b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a()
      );
      a($$0, b, c().a(brm.a(a(bvm.an))).a(), c().a(brm.a(a(bvm.an, ewd.ak))).b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a());
      a($$0, c, c().a(brm.a(a(bvm.bo))).a(), a().a(brm.a(a(bvm.bo))).b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a());
      a($$0, d, c().a(brm.a(a(bvm.bO))).a(), c().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.bO, ewd.ak))).a());
      a($$0, e, c().a(brm.a(a(bvm.q))).a(), c().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.q, ewd.aj))).a());
      a($$0, f, c().a(brm.a(a(bvm.bf))).a(), c().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.bf, ewd.aj))).a());
      a($$0, g, c().a(brm.a(a(bvm.bs))).a(), c().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.bs, ewd.aj))).a());
      a($$0, h, b().a(brm.a(a(bvm.q))).a(), b().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.q, ewd.aj))).a());
      a($$0, i, b().a(brm.a(a(bvm.bf))).a(), b().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.bf, ewd.aj))).a());
      a($$0, j, b().a(brm.a(a(bvm.bs))).a(), b().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.bs, ewd.aj))).a());
      a(
         $$0,
         k,
         dwq.b().d(0.5F).b(20).a(brm.a(a(bvm.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwq.b().d(0.5F).b(20).b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.bO, $$0x -> $$0x.a("IsBaby", true), ewd.ak))).a()
      );
      a($$0, l, c().a(brm.a(a(bvm.v))).a(), a().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.v))).a());
      a($$0, m, c().a(brm.a(a(bvm.be))).a(), a().b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a()).a(brm.a(a(bvm.be))).a());
      a(
         $$0,
         n,
         c().a(brm.<dhu>a().a(a(bvm.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvm.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(brm.<aly<ewm>>a().a(ewd.aN, 3).a(ewd.aO, 7).a())
            .a(brm.<dhu>a().a(a(bvm.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvm.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bvf> dhu a(bvm<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bvf> dhu a(bvm<T> $$0, Consumer<ux> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bvf> dhu a(bvm<T> $$0, aly<ewm> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bvf> dhu a(bvm<T> $$0, Consumer<ux> $$1, @Nullable aly<ewm> $$2) {
      ux $$3 = new ux();
      $$3.a("id", ma.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bvp> $$4 = Optional.ofNullable($$2).map($$0x -> new bvp($$0x, 0.0F));
      return new dhu($$3, Optional.empty(), $$4);
   }

   private static void a(rk<dwq> $$0, dwr.a $$1, dwq $$2, dwq $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static aly<dwq> a(String $$0) {
      return aly.a(mb.bc, alz.b($$0));
   }

   private static dwq.a a() {
      return dwq.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dwq.a b() {
      return dwq.b().b(4.0F).d(2.0F).b(160);
   }

   private static dwq.a c() {
      return dwq.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(aly<dwq> a, aly<dwq> b) {

      public static dwr.a a(String $$0) {
         return new dwr.a(dwr.a($$0 + "/normal"), dwr.a($$0 + "/ominous"));
      }
   }
}
