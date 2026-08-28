import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwy {
   private static final dwy.a a = dwy.a.a("trial_chamber/breeze");
   private static final dwy.a b = dwy.a.a("trial_chamber/melee/husk");
   private static final dwy.a c = dwy.a.a("trial_chamber/melee/spider");
   private static final dwy.a d = dwy.a.a("trial_chamber/melee/zombie");
   private static final dwy.a e = dwy.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dwy.a f = dwy.a.a("trial_chamber/ranged/skeleton");
   private static final dwy.a g = dwy.a.a("trial_chamber/ranged/stray");
   private static final dwy.a h = dwy.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dwy.a i = dwy.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dwy.a j = dwy.a.a("trial_chamber/slow_ranged/stray");
   private static final dwy.a k = dwy.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dwy.a l = dwy.a.a("trial_chamber/small_melee/cave_spider");
   private static final dwy.a m = dwy.a.a("trial_chamber/small_melee/silverfish");
   private static final dwy.a n = dwy.a.a("trial_chamber/small_melee/slime");

   public static void a(rk<dwx> $$0) {
      a(
         $$0,
         a,
         dwx.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(brq.a(a(bvq.r))).a(),
         dwx.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(brq.a(a(bvq.r))).b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a()
      );
      a($$0, b, c().a(brq.a(a(bvq.an))).a(), c().a(brq.a(a(bvq.an, ewk.ak))).b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a());
      a($$0, c, c().a(brq.a(a(bvq.bo))).a(), a().a(brq.a(a(bvq.bo))).b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a());
      a($$0, d, c().a(brq.a(a(bvq.bO))).a(), c().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.bO, ewk.ak))).a());
      a($$0, e, c().a(brq.a(a(bvq.q))).a(), c().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.q, ewk.aj))).a());
      a($$0, f, c().a(brq.a(a(bvq.bf))).a(), c().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.bf, ewk.aj))).a());
      a($$0, g, c().a(brq.a(a(bvq.bs))).a(), c().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.bs, ewk.aj))).a());
      a($$0, h, b().a(brq.a(a(bvq.q))).a(), b().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.q, ewk.aj))).a());
      a($$0, i, b().a(brq.a(a(bvq.bf))).a(), b().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.bf, ewk.aj))).a());
      a($$0, j, b().a(brq.a(a(bvq.bs))).a(), b().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.bs, ewk.aj))).a());
      a(
         $$0,
         k,
         dwx.b().d(0.5F).b(20).a(brq.a(a(bvq.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwx.b().d(0.5F).b(20).b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.bO, $$0x -> $$0x.a("IsBaby", true), ewk.ak))).a()
      );
      a($$0, l, c().a(brq.a(a(bvq.v))).a(), a().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.v))).a());
      a($$0, m, c().a(brq.a(a(bvq.be))).a(), a().b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brq.a(a(bvq.be))).a());
      a(
         $$0,
         n,
         c().a(brq.<dib>a().a(a(bvq.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvq.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(brq.<aly<ewt>>a().a(ewk.aN, 3).a(ewk.aO, 7).a())
            .a(brq.<dib>a().a(a(bvq.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvq.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bvj> dib a(bvq<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bvj> dib a(bvq<T> $$0, Consumer<ux> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bvj> dib a(bvq<T> $$0, aly<ewt> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bvj> dib a(bvq<T> $$0, Consumer<ux> $$1, @Nullable aly<ewt> $$2) {
      ux $$3 = new ux();
      $$3.a("id", ma.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bvt> $$4 = Optional.ofNullable($$2).map($$0x -> new bvt($$0x, 0.0F));
      return new dib($$3, Optional.empty(), $$4);
   }

   private static void a(rk<dwx> $$0, dwy.a $$1, dwx $$2, dwx $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static aly<dwx> a(String $$0) {
      return aly.a(mb.bd, alz.b($$0));
   }

   private static dwx.a a() {
      return dwx.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dwx.a b() {
      return dwx.b().b(4.0F).d(2.0F).b(160);
   }

   private static dwx.a c() {
      return dwx.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(aly<dwx> a, aly<dwx> b) {

      public static dwy.a a(String $$0) {
         return new dwy.a(dwy.a($$0 + "/normal"), dwy.a($$0 + "/ominous"));
      }
   }
}
