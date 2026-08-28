import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eah {
   private static final eah.a a = eah.a.a("trial_chamber/breeze");
   private static final eah.a b = eah.a.a("trial_chamber/melee/husk");
   private static final eah.a c = eah.a.a("trial_chamber/melee/spider");
   private static final eah.a d = eah.a.a("trial_chamber/melee/zombie");
   private static final eah.a e = eah.a.a("trial_chamber/ranged/poison_skeleton");
   private static final eah.a f = eah.a.a("trial_chamber/ranged/skeleton");
   private static final eah.a g = eah.a.a("trial_chamber/ranged/stray");
   private static final eah.a h = eah.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final eah.a i = eah.a.a("trial_chamber/slow_ranged/skeleton");
   private static final eah.a j = eah.a.a("trial_chamber/slow_ranged/stray");
   private static final eah.a k = eah.a.a("trial_chamber/small_melee/baby_zombie");
   private static final eah.a l = eah.a.a("trial_chamber/small_melee/cave_spider");
   private static final eah.a m = eah.a.a("trial_chamber/small_melee/silverfish");
   private static final eah.a n = eah.a.a("trial_chamber/small_melee/slime");

   public static void a(qh<eag> $$0) {
      a(
         $$0,
         a,
         eag.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(btb.a(a(bxc.s))).a(),
         eag.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(btb.a(a(bxc.s))).b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a()
      );
      a($$0, b, c().a(btb.a(a(bxc.an))).a(), c().a(btb.a(a(bxc.an, fad.ak))).b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a());
      a($$0, c, c().a(btb.a(a(bxc.bp))).a(), a().a(btb.a(a(bxc.bp))).b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a());
      a($$0, d, c().a(btb.a(a(bxc.bP))).a(), c().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.bP, fad.ak))).a());
      a($$0, e, c().a(btb.a(a(bxc.r))).a(), c().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.r, fad.aj))).a());
      a($$0, f, c().a(btb.a(a(bxc.bg))).a(), c().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.bg, fad.aj))).a());
      a($$0, g, c().a(btb.a(a(bxc.bt))).a(), c().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.bt, fad.aj))).a());
      a($$0, h, b().a(btb.a(a(bxc.r))).a(), b().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.r, fad.aj))).a());
      a($$0, i, b().a(btb.a(a(bxc.bg))).a(), b().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.bg, fad.aj))).a());
      a($$0, j, b().a(btb.a(a(bxc.bt))).a(), b().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.bt, fad.aj))).a());
      a(
         $$0,
         k,
         eag.b().d(0.5F).b(20).a(btb.a(a(bxc.bP, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         eag.b().d(0.5F).b(20).b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.bP, $$0x -> $$0x.a("IsBaby", true), fad.ak))).a()
      );
      a($$0, l, c().a(btb.a(a(bxc.w))).a(), a().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.w))).a());
      a($$0, m, c().a(btb.a(a(bxc.bf))).a(), a().b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a()).a(btb.a(a(bxc.bf))).a());
      a(
         $$0,
         n,
         c().a(btb.<dkr>b().a(a(bxc.bi, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bxc.bi, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(btb.<alh<fam>>b().a(fad.aN, 3).a(fad.aO, 7).a())
            .a(btb.<dkr>b().a(a(bxc.bi, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bxc.bi, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bwt> dkr a(bxc<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bwt> dkr a(bxc<T> $$0, Consumer<tz> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bwt> dkr a(bxc<T> $$0, alh<fam> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bwt> dkr a(bxc<T> $$0, Consumer<tz> $$1, @Nullable alh<fam> $$2) {
      tz $$3 = new tz();
      $$3.a("id", mg.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bxf> $$4 = Optional.ofNullable($$2).map($$0x -> new bxf($$0x, 0.0F));
      return new dkr($$3, Optional.empty(), $$4);
   }

   private static void a(qh<eag> $$0, eah.a $$1, eag $$2, eag $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alh<eag> a(String $$0) {
      return alh.a(mh.bi, ali.b($$0));
   }

   private static eag.a a() {
      return eag.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static eag.a b() {
      return eag.b().b(4.0F).d(2.0F).b(160);
   }

   private static eag.a c() {
      return eag.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alh<eag> a, alh<eag> b) {

      public static eah.a a(String $$0) {
         return new eah.a(eah.a($$0 + "/normal"), eah.a($$0 + "/ominous"));
      }
   }
}
