import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzr {
   private static final dzr.a a = dzr.a.a("trial_chamber/breeze");
   private static final dzr.a b = dzr.a.a("trial_chamber/melee/husk");
   private static final dzr.a c = dzr.a.a("trial_chamber/melee/spider");
   private static final dzr.a d = dzr.a.a("trial_chamber/melee/zombie");
   private static final dzr.a e = dzr.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dzr.a f = dzr.a.a("trial_chamber/ranged/skeleton");
   private static final dzr.a g = dzr.a.a("trial_chamber/ranged/stray");
   private static final dzr.a h = dzr.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dzr.a i = dzr.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dzr.a j = dzr.a.a("trial_chamber/slow_ranged/stray");
   private static final dzr.a k = dzr.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dzr.a l = dzr.a.a("trial_chamber/small_melee/cave_spider");
   private static final dzr.a m = dzr.a.a("trial_chamber/small_melee/silverfish");
   private static final dzr.a n = dzr.a.a("trial_chamber/small_melee/slime");

   public static void a(qh<dzq> $$0) {
      a(
         $$0,
         a,
         dzq.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bsq.a(a(bwr.r))).a(),
         dzq.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bsq.a(a(bwr.r))).b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a()
      );
      a($$0, b, c().a(bsq.a(a(bwr.am))).a(), c().a(bsq.a(a(bwr.am, ezk.ak))).b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a());
      a($$0, c, c().a(bsq.a(a(bwr.bo))).a(), a().a(bsq.a(a(bwr.bo))).b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a());
      a($$0, d, c().a(bsq.a(a(bwr.bO))).a(), c().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.bO, ezk.ak))).a());
      a($$0, e, c().a(bsq.a(a(bwr.q))).a(), c().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.q, ezk.aj))).a());
      a($$0, f, c().a(bsq.a(a(bwr.bf))).a(), c().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.bf, ezk.aj))).a());
      a($$0, g, c().a(bsq.a(a(bwr.bs))).a(), c().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.bs, ezk.aj))).a());
      a($$0, h, b().a(bsq.a(a(bwr.q))).a(), b().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.q, ezk.aj))).a());
      a($$0, i, b().a(bsq.a(a(bwr.bf))).a(), b().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.bf, ezk.aj))).a());
      a($$0, j, b().a(bsq.a(a(bwr.bs))).a(), b().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.bs, ezk.aj))).a());
      a(
         $$0,
         k,
         dzq.b().d(0.5F).b(20).a(bsq.a(a(bwr.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dzq.b().d(0.5F).b(20).b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.bO, $$0x -> $$0x.a("IsBaby", true), ezk.ak))).a()
      );
      a($$0, l, c().a(bsq.a(a(bwr.v))).a(), a().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.v))).a());
      a($$0, m, c().a(bsq.a(a(bwr.be))).a(), a().b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a()).a(bsq.a(a(bwr.be))).a());
      a(
         $$0,
         n,
         c().a(bsq.<dkb>b().a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bsq.<alf<ezt>>b().a(ezk.aN, 3).a(ezk.aO, 7).a())
            .a(bsq.<dkb>b().a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwr.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bwi> dkb a(bwr<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bwi> dkb a(bwr<T> $$0, Consumer<tz> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bwi> dkb a(bwr<T> $$0, alf<ezt> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bwi> dkb a(bwr<T> $$0, Consumer<tz> $$1, @Nullable alf<ezt> $$2) {
      tz $$3 = new tz();
      $$3.a("id", mg.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bwu> $$4 = Optional.ofNullable($$2).map($$0x -> new bwu($$0x, 0.0F));
      return new dkb($$3, Optional.empty(), $$4);
   }

   private static void a(qh<dzq> $$0, dzr.a $$1, dzq $$2, dzq $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alf<dzq> a(String $$0) {
      return alf.a(mh.bi, alg.b($$0));
   }

   private static dzq.a a() {
      return dzq.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dzq.a b() {
      return dzq.b().b(4.0F).d(2.0F).b(160);
   }

   private static dzq.a c() {
      return dzq.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alf<dzq> a, alf<dzq> b) {

      public static dzr.a a(String $$0) {
         return new dzr.a(dzr.a($$0 + "/normal"), dzr.a($$0 + "/ominous"));
      }
   }
}
