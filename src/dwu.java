import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwu {
   private static final dwu.a a = dwu.a.a("trial_chamber/breeze");
   private static final dwu.a b = dwu.a.a("trial_chamber/melee/husk");
   private static final dwu.a c = dwu.a.a("trial_chamber/melee/spider");
   private static final dwu.a d = dwu.a.a("trial_chamber/melee/zombie");
   private static final dwu.a e = dwu.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dwu.a f = dwu.a.a("trial_chamber/ranged/skeleton");
   private static final dwu.a g = dwu.a.a("trial_chamber/ranged/stray");
   private static final dwu.a h = dwu.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dwu.a i = dwu.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dwu.a j = dwu.a.a("trial_chamber/slow_ranged/stray");
   private static final dwu.a k = dwu.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dwu.a l = dwu.a.a("trial_chamber/small_melee/cave_spider");
   private static final dwu.a m = dwu.a.a("trial_chamber/small_melee/silverfish");
   private static final dwu.a n = dwu.a.a("trial_chamber/small_melee/slime");

   public static void a(qe<dwt> $$0) {
      a(
         $$0,
         a,
         dwt.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(brj.a(a(bvi.r))).a(),
         dwt.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(brj.a(a(bvi.r))).b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a()
      );
      a($$0, b, c().a(brj.a(a(bvi.am))).a(), c().a(brj.a(a(bvi.am, ewk.ak))).b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a());
      a($$0, c, c().a(brj.a(a(bvi.bn))).a(), a().a(brj.a(a(bvi.bn))).b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a());
      a($$0, d, c().a(brj.a(a(bvi.bN))).a(), c().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.bN, ewk.ak))).a());
      a($$0, e, c().a(brj.a(a(bvi.q))).a(), c().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.q, ewk.aj))).a());
      a($$0, f, c().a(brj.a(a(bvi.be))).a(), c().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.be, ewk.aj))).a());
      a($$0, g, c().a(brj.a(a(bvi.br))).a(), c().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.br, ewk.aj))).a());
      a($$0, h, b().a(brj.a(a(bvi.q))).a(), b().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.q, ewk.aj))).a());
      a($$0, i, b().a(brj.a(a(bvi.be))).a(), b().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.be, ewk.aj))).a());
      a($$0, j, b().a(brj.a(a(bvi.br))).a(), b().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.br, ewk.aj))).a());
      a(
         $$0,
         k,
         dwt.b().d(0.5F).b(20).a(brj.a(a(bvi.bN, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwt.b().d(0.5F).b(20).b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.bN, $$0x -> $$0x.a("IsBaby", true), ewk.ak))).a()
      );
      a($$0, l, c().a(brj.a(a(bvi.v))).a(), a().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.v))).a());
      a($$0, m, c().a(brj.a(a(bvi.bd))).a(), a().b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a()).a(brj.a(a(bvi.bd))).a());
      a(
         $$0,
         n,
         c().a(brj.<dht>b().a(a(bvi.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvi.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(brj.<akt<ewt>>b().a(ewk.aN, 3).a(ewk.aO, 7).a())
            .a(brj.<dht>b().a(a(bvi.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bvi.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bva> dht a(bvi<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bva> dht a(bvi<T> $$0, Consumer<tq> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bva> dht a(bvi<T> $$0, akt<ewt> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bva> dht a(bvi<T> $$0, Consumer<tq> $$1, @Nullable akt<ewt> $$2) {
      tq $$3 = new tq();
      $$3.a("id", mb.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bvl> $$4 = Optional.ofNullable($$2).map($$0x -> new bvl($$0x, 0.0F));
      return new dht($$3, Optional.empty(), $$4);
   }

   private static void a(qe<dwt> $$0, dwu.a $$1, dwt $$2, dwt $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static akt<dwt> a(String $$0) {
      return akt.a(mc.bf, aku.b($$0));
   }

   private static dwt.a a() {
      return dwt.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dwt.a b() {
      return dwt.b().b(4.0F).d(2.0F).b(160);
   }

   private static dwt.a c() {
      return dwt.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(akt<dwt> a, akt<dwt> b) {

      public static dwu.a a(String $$0) {
         return new dwu.a(dwu.a($$0 + "/normal"), dwu.a($$0 + "/ominous"));
      }
   }
}
