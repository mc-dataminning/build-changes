import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dun {
   private static final dun.a a = dun.a.a("trial_chamber/breeze");
   private static final dun.a b = dun.a.a("trial_chamber/melee/husk");
   private static final dun.a c = dun.a.a("trial_chamber/melee/spider");
   private static final dun.a d = dun.a.a("trial_chamber/melee/zombie");
   private static final dun.a e = dun.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dun.a f = dun.a.a("trial_chamber/ranged/skeleton");
   private static final dun.a g = dun.a.a("trial_chamber/ranged/stray");
   private static final dun.a h = dun.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dun.a i = dun.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dun.a j = dun.a.a("trial_chamber/slow_ranged/stray");
   private static final dun.a k = dun.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dun.a l = dun.a.a("trial_chamber/small_melee/cave_spider");
   private static final dun.a m = dun.a.a("trial_chamber/small_melee/silverfish");
   private static final dun.a n = dun.a.a("trial_chamber/small_melee/slime");

   public static void a(qy<dum> $$0) {
      a(
         $$0,
         a,
         dum.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bql.a(a(bul.m))).a(),
         dum.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bql.a(a(bul.m))).b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a()
      );
      a($$0, b, c().a(bql.a(a(bul.ac))).a(), c().a(bql.a(a(bul.ac, ety.ak))).b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a());
      a($$0, c, c().a(bql.a(a(bul.aW))).a(), a().a(bql.a(a(bul.aW))).b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a());
      a($$0, d, c().a(bql.a(a(bul.bu))).a(), c().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.bu, ety.ak))).a());
      a($$0, e, c().a(bql.a(a(bul.l))).a(), c().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.l, ety.aj))).a());
      a($$0, f, c().a(bql.a(a(bul.aN))).a(), c().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.aN, ety.aj))).a());
      a($$0, g, c().a(bql.a(a(bul.aY))).a(), c().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.aY, ety.aj))).a());
      a($$0, h, b().a(bql.a(a(bul.l))).a(), b().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.l, ety.aj))).a());
      a($$0, i, b().a(bql.a(a(bul.aN))).a(), b().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.aN, ety.aj))).a());
      a($$0, j, b().a(bql.a(a(bul.aY))).a(), b().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.aY, ety.aj))).a());
      a(
         $$0,
         k,
         dum.b().d(0.5F).b(20).a(bql.a(a(bul.bu, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dum.b().d(0.5F).b(20).b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.bu, $$0x -> $$0x.a("IsBaby", true), ety.ak))).a()
      );
      a($$0, l, c().a(bql.a(a(bul.q))).a(), a().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.q))).a());
      a($$0, m, c().a(bql.a(a(bul.aM))).a(), a().b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a()).a(bql.a(a(bul.aM))).a());
      a(
         $$0,
         n,
         c().a(bql.<dfu>a().a(a(bul.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bul.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bql.<alh<euh>>a().a(ety.aN, 3).a(ety.aO, 7).a())
            .a(bql.<dfu>a().a(a(bul.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bul.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bue> dfu a(bul<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bue> dfu a(bul<T> $$0, Consumer<uk> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bue> dfu a(bul<T> $$0, alh<euh> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bue> dfu a(bul<T> $$0, Consumer<uk> $$1, @Nullable alh<euh> $$2) {
      uk $$3 = new uk();
      $$3.a("id", ly.f.b($$0).toString());
      $$1.accept($$3);
      Optional<buo> $$4 = Optional.ofNullable($$2).map($$0x -> new buo($$0x, 0.0F));
      return new dfu($$3, Optional.empty(), $$4);
   }

   private static void a(qy<dum> $$0, dun.a $$1, dum $$2, dum $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alh<dum> a(String $$0) {
      return alh.a(lz.aF, ali.b($$0));
   }

   private static dum.a a() {
      return dum.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dum.a b() {
      return dum.b().b(4.0F).d(2.0F).b(160);
   }

   private static dum.a c() {
      return dum.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alh<dum> a, alh<dum> b) {

      public static dun.a a(String $$0) {
         return new dun.a(dun.a($$0 + "/normal"), dun.a($$0 + "/ominous"));
      }
   }
}
