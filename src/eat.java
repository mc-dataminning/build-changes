import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eat {
   private static final eat.a a = eat.a.a("trial_chamber/breeze");
   private static final eat.a b = eat.a.a("trial_chamber/melee/husk");
   private static final eat.a c = eat.a.a("trial_chamber/melee/spider");
   private static final eat.a d = eat.a.a("trial_chamber/melee/zombie");
   private static final eat.a e = eat.a.a("trial_chamber/ranged/poison_skeleton");
   private static final eat.a f = eat.a.a("trial_chamber/ranged/skeleton");
   private static final eat.a g = eat.a.a("trial_chamber/ranged/stray");
   private static final eat.a h = eat.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final eat.a i = eat.a.a("trial_chamber/slow_ranged/skeleton");
   private static final eat.a j = eat.a.a("trial_chamber/slow_ranged/stray");
   private static final eat.a k = eat.a.a("trial_chamber/small_melee/baby_zombie");
   private static final eat.a l = eat.a.a("trial_chamber/small_melee/cave_spider");
   private static final eat.a m = eat.a.a("trial_chamber/small_melee/silverfish");
   private static final eat.a n = eat.a.a("trial_chamber/small_melee/slime");

   public static void a(qi<eas> $$0) {
      a(
         $$0,
         a,
         eas.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(btm.a(a(bxn.s))).a(),
         eas.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(btm.a(a(bxn.s))).b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a()
      );
      a($$0, b, c().a(btm.a(a(bxn.an))).a(), c().a(btm.a(a(bxn.an, fap.ak))).b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a());
      a($$0, c, c().a(btm.a(a(bxn.bp))).a(), a().a(btm.a(a(bxn.bp))).b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a());
      a($$0, d, c().a(btm.a(a(bxn.bP))).a(), c().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.bP, fap.ak))).a());
      a($$0, e, c().a(btm.a(a(bxn.r))).a(), c().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.r, fap.aj))).a());
      a($$0, f, c().a(btm.a(a(bxn.bg))).a(), c().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.bg, fap.aj))).a());
      a($$0, g, c().a(btm.a(a(bxn.bt))).a(), c().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.bt, fap.aj))).a());
      a($$0, h, b().a(btm.a(a(bxn.r))).a(), b().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.r, fap.aj))).a());
      a($$0, i, b().a(btm.a(a(bxn.bg))).a(), b().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.bg, fap.aj))).a());
      a($$0, j, b().a(btm.a(a(bxn.bt))).a(), b().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.bt, fap.aj))).a());
      a(
         $$0,
         k,
         eas.b().d(0.5F).b(20).a(btm.a(a(bxn.bP, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         eas.b().d(0.5F).b(20).b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.bP, $$0x -> $$0x.a("IsBaby", true), fap.ak))).a()
      );
      a($$0, l, c().a(btm.a(a(bxn.w))).a(), a().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.w))).a());
      a($$0, m, c().a(btm.a(a(bxn.bf))).a(), a().b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a()).a(btm.a(a(bxn.bf))).a());
      a(
         $$0,
         n,
         c().a(btm.<dld>b().a(a(bxn.bi, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bxn.bi, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(btm.<alq<fay>>b().a(fap.aN, 3).a(fap.aO, 7).a())
            .a(btm.<dld>b().a(a(bxn.bi, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bxn.bi, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bxe> dld a(bxn<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bxe> dld a(bxn<T> $$0, Consumer<ua> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bxe> dld a(bxn<T> $$0, alq<fay> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bxe> dld a(bxn<T> $$0, Consumer<ua> $$1, @Nullable alq<fay> $$2) {
      ua $$3 = new ua();
      $$3.a("id", mh.f.b($$0).toString());
      $$1.accept($$3);
      Optional<bxq> $$4 = Optional.ofNullable($$2).map($$0x -> new bxq($$0x, 0.0F));
      return new dld($$3, Optional.empty(), $$4);
   }

   private static void a(qi<eas> $$0, eat.a $$1, eas $$2, eas $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alq<eas> a(String $$0) {
      return alq.a(mi.bi, alr.b($$0));
   }

   private static eas.a a() {
      return eas.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static eas.a b() {
      return eas.b().b(4.0F).d(2.0F).b(160);
   }

   private static eas.a c() {
      return eas.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alq<eas> a, alq<eas> b) {

      public static eat.a a(String $$0) {
         return new eat.a(eat.a($$0 + "/normal"), eat.a($$0 + "/ominous"));
      }
   }
}
