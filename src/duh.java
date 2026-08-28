import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class duh {
   private static final duh.a a = duh.a.a("trial_chamber/breeze");
   private static final duh.a b = duh.a.a("trial_chamber/melee/husk");
   private static final duh.a c = duh.a.a("trial_chamber/melee/spider");
   private static final duh.a d = duh.a.a("trial_chamber/melee/zombie");
   private static final duh.a e = duh.a.a("trial_chamber/ranged/poison_skeleton");
   private static final duh.a f = duh.a.a("trial_chamber/ranged/skeleton");
   private static final duh.a g = duh.a.a("trial_chamber/ranged/stray");
   private static final duh.a h = duh.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final duh.a i = duh.a.a("trial_chamber/slow_ranged/skeleton");
   private static final duh.a j = duh.a.a("trial_chamber/slow_ranged/stray");
   private static final duh.a k = duh.a.a("trial_chamber/small_melee/baby_zombie");
   private static final duh.a l = duh.a.a("trial_chamber/small_melee/cave_spider");
   private static final duh.a m = duh.a.a("trial_chamber/small_melee/silverfish");
   private static final duh.a n = duh.a.a("trial_chamber/small_melee/slime");

   public static void a(qx<dug> $$0) {
      a(
         $$0,
         a,
         dug.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqg.a(a(bug.m))).a(),
         dug.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqg.a(a(bug.m))).b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a()
      );
      a($$0, b, c().a(bqg.a(a(bug.ac))).a(), c().a(bqg.a(a(bug.ac, ets.ak))).b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a());
      a($$0, c, c().a(bqg.a(a(bug.aW))).a(), a().a(bqg.a(a(bug.aW))).b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a());
      a($$0, d, c().a(bqg.a(a(bug.bu))).a(), c().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.bu, ets.ak))).a());
      a($$0, e, c().a(bqg.a(a(bug.l))).a(), c().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.l, ets.aj))).a());
      a($$0, f, c().a(bqg.a(a(bug.aN))).a(), c().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.aN, ets.aj))).a());
      a($$0, g, c().a(bqg.a(a(bug.aY))).a(), c().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.aY, ets.aj))).a());
      a($$0, h, b().a(bqg.a(a(bug.l))).a(), b().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.l, ets.aj))).a());
      a($$0, i, b().a(bqg.a(a(bug.aN))).a(), b().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.aN, ets.aj))).a());
      a($$0, j, b().a(bqg.a(a(bug.aY))).a(), b().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.aY, ets.aj))).a());
      a(
         $$0,
         k,
         dug.b().d(0.5F).b(20).a(bqg.a(a(bug.bu, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dug.b().d(0.5F).b(20).b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.bu, $$0x -> $$0x.a("IsBaby", true), ets.ak))).a()
      );
      a($$0, l, c().a(bqg.a(a(bug.q))).a(), a().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.q))).a());
      a($$0, m, c().a(bqg.a(a(bug.aM))).a(), a().b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a()).a(bqg.a(a(bug.aM))).a());
      a(
         $$0,
         n,
         c().a(bqg.<dfo>a().a(a(bug.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bug.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqg.<alg<eub>>a().a(ets.aJ, 3).a(ets.aK, 7).a())
            .a(bqg.<dfo>a().a(a(bug.aP, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bug.aP, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends btz> dfo a(bug<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends btz> dfo a(bug<T> $$0, Consumer<uj> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends btz> dfo a(bug<T> $$0, alg<eub> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends btz> dfo a(bug<T> $$0, Consumer<uj> $$1, @Nullable alg<eub> $$2) {
      uj $$3 = new uj();
      $$3.a("id", lx.f.b($$0).toString());
      $$1.accept($$3);
      Optional<buj> $$4 = Optional.ofNullable($$2).map($$0x -> new buj($$0x, 0.0F));
      return new dfo($$3, Optional.empty(), $$4);
   }

   private static void a(qx<dug> $$0, duh.a $$1, dug $$2, dug $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static alg<dug> a(String $$0) {
      return alg.a(ly.aF, alh.b($$0));
   }

   private static dug.a a() {
      return dug.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dug.a b() {
      return dug.b().b(4.0F).d(2.0F).b(160);
   }

   private static dug.a c() {
      return dug.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(alg<dug> a, alg<dug> b) {

      public static duh.a a(String $$0) {
         return new duh.a(duh.a($$0 + "/normal"), duh.a($$0 + "/ominous"));
      }
   }
}
