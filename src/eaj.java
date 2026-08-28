import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eaj {
   private static final eaj.a a = eaj.a.a("trial_chamber/breeze");
   private static final eaj.a b = eaj.a.a("trial_chamber/melee/husk");
   private static final eaj.a c = eaj.a.a("trial_chamber/melee/spider");
   private static final eaj.a d = eaj.a.a("trial_chamber/melee/zombie");
   private static final eaj.a e = eaj.a.a("trial_chamber/ranged/poison_skeleton");
   private static final eaj.a f = eaj.a.a("trial_chamber/ranged/skeleton");
   private static final eaj.a g = eaj.a.a("trial_chamber/ranged/stray");
   private static final eaj.a h = eaj.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final eaj.a i = eaj.a.a("trial_chamber/slow_ranged/skeleton");
   private static final eaj.a j = eaj.a.a("trial_chamber/slow_ranged/stray");
   private static final eaj.a k = eaj.a.a("trial_chamber/small_melee/baby_zombie");
   private static final eaj.a l = eaj.a.a("trial_chamber/small_melee/cave_spider");
   private static final eaj.a m = eaj.a.a("trial_chamber/small_melee/silverfish");
   private static final eaj.a n = eaj.a.a("trial_chamber/small_melee/slime");

   public static void a(qi<eai> $$0) {
      a(
         $$0,
         a,
         eai.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(btd.a(a(bxe.s))).a(),
         eai.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(btd.a(a(bxe.s))).b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a()
      );
      a($$0, b, c().a(btd.a(a(bxe.an))).a(), c().a(btd.a(a(bxe.an, faf.ak))).b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a());
      a($$0, c, c().a(btd.a(a(bxe.bp))).a(), a().a(btd.a(a(bxe.bp))).b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a());
      a($$0, d, c().a(btd.a(a(bxe.bP))).a(), c().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.bP, faf.ak))).a());
      a($$0, e, c().a(btd.a(a(bxe.r))).a(), c().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.r, faf.aj))).a());
      a($$0, f, c().a(btd.a(a(bxe.bg))).a(), c().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.bg, faf.aj))).a());
      a($$0, g, c().a(btd.a(a(bxe.bt))).a(), c().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.bt, faf.aj))).a());
      a($$0, h, b().a(btd.a(a(bxe.r))).a(), b().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.r, faf.aj))).a());
      a($$0, i, b().a(btd.a(a(bxe.bg))).a(), b().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.bg, faf.aj))).a());
      a($$0, j, b().a(btd.a(a(bxe.bt))).a(), b().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.bt, faf.aj))).a());
      a(
         $$0,
         k,
         eai.b().d(0.5F).b(20).a(btd.a(a(bxe.bP, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         eai.b().d(0.5F).b(20).b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.bP, $$0x -> $$0x.a("IsBaby", true), faf.ak))).a()
      );
      a($$0, l, c().a(btd.a(a(bxe.w))).a(), a().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.w))).a());
      a($$0, m, c().a(btd.a(a(bxe.bf))).a(), a().b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a()).a(btd.a(a(bxe.bf))).a());
      a(
         $$0,
         n,
         c().a(btd.<dkt>b().a(a(bxe.bi, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bxe.bi, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(btd.<alj<fao>>b().a(faf.aN, 3).a(faf.aO, 7).a())
            .a(btd.<dkt>b().a(a(bxe.bi, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bxe.bi, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bwv> dkt a(bxe<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bwv> dkt a(bxe<T> $$0, Consumer<ua> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bwv> dkt a(bxe<T> $$0, alj<fao> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bwv> dkt a(bxe<T> $$0, Consumer<ua> $$1, @Nullable alj<fao> $$2) {
      ua $$3 = new ua();
      $$3.a("id", mh.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bxh> $$4 = Optional.ofNullable($$2).map($$0x -> new bxh($$0x, 0.0F));
      return new dkt($$3, Optional.empty(), $$4);
   }

   private static void a(qi<eai> $$0, eaj.a $$1, eai $$2, eai $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alj<eai> a(String $$0) {
      return alj.a(mi.bi, alk.b($$0));
   }

   private static eai.a a() {
      return eai.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static eai.a b() {
      return eai.b().b(4.0F).d(2.0F).b(160);
   }

   private static eai.a c() {
      return eai.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alj<eai> a, alj<eai> b) {

      public static eaj.a a(String $$0) {
         return new eaj.a(eaj.a($$0 + "/normal"), eaj.a($$0 + "/ominous"));
      }
   }
}
