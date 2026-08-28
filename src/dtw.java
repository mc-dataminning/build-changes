import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dtw {
   private static final dtw.a a = dtw.a.a("trial_chamber/breeze");
   private static final dtw.a b = dtw.a.a("trial_chamber/melee/husk");
   private static final dtw.a c = dtw.a.a("trial_chamber/melee/spider");
   private static final dtw.a d = dtw.a.a("trial_chamber/melee/zombie");
   private static final dtw.a e = dtw.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dtw.a f = dtw.a.a("trial_chamber/ranged/skeleton");
   private static final dtw.a g = dtw.a.a("trial_chamber/ranged/stray");
   private static final dtw.a h = dtw.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dtw.a i = dtw.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dtw.a j = dtw.a.a("trial_chamber/slow_ranged/stray");
   private static final dtw.a k = dtw.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dtw.a l = dtw.a.a("trial_chamber/small_melee/cave_spider");
   private static final dtw.a m = dtw.a.a("trial_chamber/small_melee/silverfish");
   private static final dtw.a n = dtw.a.a("trial_chamber/small_melee/slime");

   public static void a(qu<dtv> $$0) {
      a(
         $$0,
         a,
         dtv.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqc.a(a(bty.m))).a(),
         dtv.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqc.a(a(bty.m))).b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a()
      );
      a($$0, b, c().a(bqc.a(a(bty.ac))).a(), c().a(bqc.a(a(bty.ac, eth.ak))).b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a());
      a($$0, c, c().a(bqc.a(a(bty.aW))).a(), a().a(bqc.a(a(bty.aW))).b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a());
      a($$0, d, c().a(bqc.a(a(bty.bu))).a(), c().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.bu, eth.ak))).a());
      a($$0, e, c().a(bqc.a(a(bty.l))).a(), c().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.l, eth.aj))).a());
      a($$0, f, c().a(bqc.a(a(bty.aN))).a(), c().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.aN, eth.aj))).a());
      a($$0, g, c().a(bqc.a(a(bty.aY))).a(), c().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.aY, eth.aj))).a());
      a($$0, h, b().a(bqc.a(a(bty.l))).a(), b().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.l, eth.aj))).a());
      a($$0, i, b().a(bqc.a(a(bty.aN))).a(), b().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.aN, eth.aj))).a());
      a($$0, j, b().a(bqc.a(a(bty.aY))).a(), b().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.aY, eth.aj))).a());
      a(
         $$0,
         k,
         dtv.b().d(0.5F).b(20).a(bqc.a(a(bty.bu, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dtv.b().d(0.5F).b(20).b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.bu, $$0x -> $$0x.a("IsBaby", true), eth.ak))).a()
      );
      a($$0, l, c().a(bqc.a(a(bty.q))).a(), a().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.q))).a());
      a($$0, m, c().a(bqc.a(a(bty.aM))).a(), a().b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a()).a(bqc.a(a(bty.aM))).a());
      a(
         $$0,
         n,
         c().a(bqc.<dfc>a().a(a(bty.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bty.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqc.<ald<etq>>a().a(eth.aJ, 3).a(eth.aK, 7).a())
            .a(bqc.<dfc>a().a(a(bty.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bty.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends btr> dfc a(bty<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends btr> dfc a(bty<T> $$0, Consumer<ug> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends btr> dfc a(bty<T> $$0, ald<etq> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends btr> dfc a(bty<T> $$0, Consumer<ug> $$1, @Nullable ald<etq> $$2) {
      ug $$3 = new ug();
      $$3.a("id", lv.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bub> $$4 = Optional.ofNullable($$2).map($$0x -> new bub($$0x, 0.0F));
      return new dfc($$3, Optional.empty(), $$4);
   }

   private static void a(qu<dtv> $$0, dtw.a $$1, dtv $$2, dtv $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static ald<dtv> a(String $$0) {
      return ald.a(lw.aG, ale.b($$0));
   }

   private static dtv.a a() {
      return dtv.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dtv.a b() {
      return dtv.b().b(4.0F).d(2.0F).b(160);
   }

   private static dtv.a c() {
      return dtv.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(ald<dtv> a, ald<dtv> b) {

      public static dtw.a a(String $$0) {
         return new dtw.a(dtw.a($$0 + "/normal"), dtw.a($$0 + "/ominous"));
      }
   }
}
