import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzw {
   private static final dzw.a a = dzw.a.a("trial_chamber/breeze");
   private static final dzw.a b = dzw.a.a("trial_chamber/melee/husk");
   private static final dzw.a c = dzw.a.a("trial_chamber/melee/spider");
   private static final dzw.a d = dzw.a.a("trial_chamber/melee/zombie");
   private static final dzw.a e = dzw.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dzw.a f = dzw.a.a("trial_chamber/ranged/skeleton");
   private static final dzw.a g = dzw.a.a("trial_chamber/ranged/stray");
   private static final dzw.a h = dzw.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dzw.a i = dzw.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dzw.a j = dzw.a.a("trial_chamber/slow_ranged/stray");
   private static final dzw.a k = dzw.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dzw.a l = dzw.a.a("trial_chamber/small_melee/cave_spider");
   private static final dzw.a m = dzw.a.a("trial_chamber/small_melee/silverfish");
   private static final dzw.a n = dzw.a.a("trial_chamber/small_melee/slime");

   public static void a(qh<dzv> $$0) {
      a(
         $$0,
         a,
         dzv.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bsq.a(a(bwr.r))).a(),
         dzv.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bsq.a(a(bwr.r))).b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a()
      );
      a($$0, b, c().a(bsq.a(a(bwr.am))).a(), c().a(bsq.a(a(bwr.am, ezp.ak))).b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a());
      a($$0, c, c().a(bsq.a(a(bwr.bo))).a(), a().a(bsq.a(a(bwr.bo))).b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a());
      a($$0, d, c().a(bsq.a(a(bwr.bO))).a(), c().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.bO, ezp.ak))).a());
      a($$0, e, c().a(bsq.a(a(bwr.q))).a(), c().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.q, ezp.aj))).a());
      a($$0, f, c().a(bsq.a(a(bwr.bf))).a(), c().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.bf, ezp.aj))).a());
      a($$0, g, c().a(bsq.a(a(bwr.bs))).a(), c().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.bs, ezp.aj))).a());
      a($$0, h, b().a(bsq.a(a(bwr.q))).a(), b().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.q, ezp.aj))).a());
      a($$0, i, b().a(bsq.a(a(bwr.bf))).a(), b().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.bf, ezp.aj))).a());
      a($$0, j, b().a(bsq.a(a(bwr.bs))).a(), b().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.bs, ezp.aj))).a());
      a(
         $$0,
         k,
         dzv.b().d(0.5F).b(20).a(bsq.a(a(bwr.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dzv.b().d(0.5F).b(20).b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.bO, $$0x -> $$0x.a("IsBaby", true), ezp.ak))).a()
      );
      a($$0, l, c().a(bsq.a(a(bwr.v))).a(), a().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.v))).a());
      a($$0, m, c().a(bsq.a(a(bwr.be))).a(), a().b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a()).a(bsq.a(a(bwr.be))).a());
      a(
         $$0,
         n,
         c().a(bsq.<dkg>b().a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bsq.<alf<ezy>>b().a(ezp.aN, 3).a(ezp.aO, 7).a())
            .a(bsq.<dkg>b().a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bwi> dkg a(bwr<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bwi> dkg a(bwr<T> $$0, Consumer<tz> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bwi> dkg a(bwr<T> $$0, alf<ezy> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bwi> dkg a(bwr<T> $$0, Consumer<tz> $$1, @Nullable alf<ezy> $$2) {
      tz $$3 = new tz();
      $$3.a("id", mg.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bwu> $$4 = Optional.ofNullable($$2).map($$0x -> new bwu($$0x, 0.0F));
      return new dkg($$3, Optional.empty(), $$4);
   }

   private static void a(qh<dzv> $$0, dzw.a $$1, dzv $$2, dzv $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alf<dzv> a(String $$0) {
      return alf.a(mh.bi, alg.b($$0));
   }

   private static dzv.a a() {
      return dzv.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dzv.a b() {
      return dzv.b().b(4.0F).d(2.0F).b(160);
   }

   private static dzv.a c() {
      return dzv.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alf<dzv> a, alf<dzv> b) {

      public static dzw.a a(String $$0) {
         return new dzw.a(dzw.a($$0 + "/normal"), dzw.a($$0 + "/ominous"));
      }
   }
}
