import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwb {
   private static final dwb.a a = dwb.a.a("trial_chamber/breeze");
   private static final dwb.a b = dwb.a.a("trial_chamber/melee/husk");
   private static final dwb.a c = dwb.a.a("trial_chamber/melee/spider");
   private static final dwb.a d = dwb.a.a("trial_chamber/melee/zombie");
   private static final dwb.a e = dwb.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dwb.a f = dwb.a.a("trial_chamber/ranged/skeleton");
   private static final dwb.a g = dwb.a.a("trial_chamber/ranged/stray");
   private static final dwb.a h = dwb.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dwb.a i = dwb.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dwb.a j = dwb.a.a("trial_chamber/slow_ranged/stray");
   private static final dwb.a k = dwb.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dwb.a l = dwb.a.a("trial_chamber/small_melee/cave_spider");
   private static final dwb.a m = dwb.a.a("trial_chamber/small_melee/silverfish");
   private static final dwb.a n = dwb.a.a("trial_chamber/small_melee/slime");

   public static void a(qe<dwa> $$0) {
      a(
         $$0,
         a,
         dwa.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqr.a(a(bur.r))).a(),
         dwa.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqr.a(a(bur.r))).b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a()
      );
      a($$0, b, c().a(bqr.a(a(bur.an))).a(), c().a(bqr.a(a(bur.an, evn.ak))).b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a());
      a($$0, c, c().a(bqr.a(a(bur.bo))).a(), a().a(bqr.a(a(bur.bo))).b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a());
      a($$0, d, c().a(bqr.a(a(bur.bO))).a(), c().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.bO, evn.ak))).a());
      a($$0, e, c().a(bqr.a(a(bur.q))).a(), c().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.q, evn.aj))).a());
      a($$0, f, c().a(bqr.a(a(bur.bf))).a(), c().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.bf, evn.aj))).a());
      a($$0, g, c().a(bqr.a(a(bur.bs))).a(), c().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.bs, evn.aj))).a());
      a($$0, h, b().a(bqr.a(a(bur.q))).a(), b().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.q, evn.aj))).a());
      a($$0, i, b().a(bqr.a(a(bur.bf))).a(), b().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.bf, evn.aj))).a());
      a($$0, j, b().a(bqr.a(a(bur.bs))).a(), b().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.bs, evn.aj))).a());
      a(
         $$0,
         k,
         dwa.b().d(0.5F).b(20).a(bqr.a(a(bur.bO, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwa.b().d(0.5F).b(20).b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.bO, $$0x -> $$0x.a("IsBaby", true), evn.ak))).a()
      );
      a($$0, l, c().a(bqr.a(a(bur.v))).a(), a().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.v))).a());
      a($$0, m, c().a(bqr.a(a(bur.be))).a(), a().b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqr.a(a(bur.be))).a());
      a(
         $$0,
         n,
         c().a(bqr.<dhc>a().a(a(bur.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bur.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqr.<akt<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a())
            .a(bqr.<dhc>a().a(a(bur.bh, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bur.bh, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends buk> dhc a(bur<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends buk> dhc a(bur<T> $$0, Consumer<tq> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends buk> dhc a(bur<T> $$0, akt<evw> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends buk> dhc a(bur<T> $$0, Consumer<tq> $$1, @Nullable akt<evw> $$2) {
      tq $$3 = new tq();
      $$3.a("id", mb.f.b($$0).toString());
      $$1.accept($$3);
      Optional<buu> $$4 = Optional.ofNullable($$2).map($$0x -> new buu($$0x, 0.0F));
      return new dhc($$3, Optional.empty(), $$4);
   }

   private static void a(qe<dwa> $$0, dwb.a $$1, dwa $$2, dwa $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static akt<dwa> a(String $$0) {
      return akt.a(mc.bd, aku.b($$0));
   }

   private static dwa.a a() {
      return dwa.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dwa.a b() {
      return dwa.b().b(4.0F).d(2.0F).b(160);
   }

   private static dwa.a c() {
      return dwa.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(akt<dwa> a, akt<dwa> b) {

      public static dwb.a a(String $$0) {
         return new dwb.a(dwb.a($$0 + "/normal"), dwb.a($$0 + "/ominous"));
      }
   }
}
