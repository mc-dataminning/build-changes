import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzk {
   private static final dzk.a a = dzk.a.a("trial_chamber/breeze");
   private static final dzk.a b = dzk.a.a("trial_chamber/melee/husk");
   private static final dzk.a c = dzk.a.a("trial_chamber/melee/spider");
   private static final dzk.a d = dzk.a.a("trial_chamber/melee/zombie");
   private static final dzk.a e = dzk.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dzk.a f = dzk.a.a("trial_chamber/ranged/skeleton");
   private static final dzk.a g = dzk.a.a("trial_chamber/ranged/stray");
   private static final dzk.a h = dzk.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dzk.a i = dzk.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dzk.a j = dzk.a.a("trial_chamber/slow_ranged/stray");
   private static final dzk.a k = dzk.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dzk.a l = dzk.a.a("trial_chamber/small_melee/cave_spider");
   private static final dzk.a m = dzk.a.a("trial_chamber/small_melee/silverfish");
   private static final dzk.a n = dzk.a.a("trial_chamber/small_melee/slime");

   public static void a(qh<dzj> $$0) {
      a(
         $$0,
         a,
         dzj.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bso.a(a(bwo.r))).a(),
         dzj.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bso.a(a(bwo.r))).b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a()
      );
      a($$0, b, c().a(bso.a(a(bwo.am))).a(), c().a(bso.a(a(bwo.am, ezd.ak))).b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a());
      a($$0, c, c().a(bso.a(a(bwo.bo))).a(), a().a(bso.a(a(bwo.bo))).b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a());
      a($$0, d, c().a(bso.a(a(bwo.bO))).a(), c().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.bO, ezd.ak))).a());
      a($$0, e, c().a(bso.a(a(bwo.q))).a(), c().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.q, ezd.aj))).a());
      a($$0, f, c().a(bso.a(a(bwo.bf))).a(), c().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.bf, ezd.aj))).a());
      a($$0, g, c().a(bso.a(a(bwo.bs))).a(), c().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.bs, ezd.aj))).a());
      a($$0, h, b().a(bso.a(a(bwo.q))).a(), b().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.q, ezd.aj))).a());
      a($$0, i, b().a(bso.a(a(bwo.bf))).a(), b().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.bf, ezd.aj))).a());
      a($$0, j, b().a(bso.a(a(bwo.bs))).a(), b().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.bs, ezd.aj))).a());
      a(
         $$0,
         k,
         dzj.b().d(0.5F).b(20).a(bso.a(a(bwo.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dzj.b().d(0.5F).b(20).b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.bO, $$0x -> $$0x.a("IsBaby", true), ezd.ak))).a()
      );
      a($$0, l, c().a(bso.a(a(bwo.v))).a(), a().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.v))).a());
      a($$0, m, c().a(bso.a(a(bwo.be))).a(), a().b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a()).a(bso.a(a(bwo.be))).a());
      a(
         $$0,
         n,
         c().a(bso.<dju>b().a(a(bwo.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwo.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bso.<alf<ezm>>b().a(ezd.aN, 3).a(ezd.aO, 7).a())
            .a(bso.<dju>b().a(a(bwo.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bwo.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bwf> dju a(bwo<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bwf> dju a(bwo<T> $$0, Consumer<tz> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bwf> dju a(bwo<T> $$0, alf<ezm> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bwf> dju a(bwo<T> $$0, Consumer<tz> $$1, @Nullable alf<ezm> $$2) {
      tz $$3 = new tz();
      $$3.a("id", mf.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bwr> $$4 = Optional.ofNullable($$2).map($$0x -> new bwr($$0x, 0.0F));
      return new dju($$3, Optional.empty(), $$4);
   }

   private static void a(qh<dzj> $$0, dzk.a $$1, dzj $$2, dzj $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alf<dzj> a(String $$0) {
      return alf.a(mg.bi, alg.b($$0));
   }

   private static dzj.a a() {
      return dzj.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dzj.a b() {
      return dzj.b().b(4.0F).d(2.0F).b(160);
   }

   private static dzj.a c() {
      return dzj.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alf<dzj> a, alf<dzj> b) {

      public static dzk.a a(String $$0) {
         return new dzk.a(dzk.a($$0 + "/normal"), dzk.a($$0 + "/ominous"));
      }
   }
}
