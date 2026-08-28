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
         dwa.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqs.a(a(bus.r))).a(),
         dwa.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqs.a(a(bus.r))).b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a()
      );
      a($$0, b, c().a(bqs.a(a(bus.am))).a(), c().a(bqs.a(a(bus.am, evn.ak))).b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a());
      a($$0, c, c().a(bqs.a(a(bus.bn))).a(), a().a(bqs.a(a(bus.bn))).b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a());
      a($$0, d, c().a(bqs.a(a(bus.bN))).a(), c().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.bN, evn.ak))).a());
      a($$0, e, c().a(bqs.a(a(bus.q))).a(), c().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.q, evn.aj))).a());
      a($$0, f, c().a(bqs.a(a(bus.be))).a(), c().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.be, evn.aj))).a());
      a($$0, g, c().a(bqs.a(a(bus.br))).a(), c().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.br, evn.aj))).a());
      a($$0, h, b().a(bqs.a(a(bus.q))).a(), b().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.q, evn.aj))).a());
      a($$0, i, b().a(bqs.a(a(bus.be))).a(), b().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.be, evn.aj))).a());
      a($$0, j, b().a(bqs.a(a(bus.br))).a(), b().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.br, evn.aj))).a());
      a(
         $$0,
         k,
         dwa.b().d(0.5F).b(20).a(bqs.a(a(bus.bN, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwa.b().d(0.5F).b(20).b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.bN, $$0x -> $$0x.a("IsBaby", true), evn.ak))).a()
      );
      a($$0, l, c().a(bqs.a(a(bus.v))).a(), a().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.v))).a());
      a($$0, m, c().a(bqs.a(a(bus.bd))).a(), a().b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a()).a(bqs.a(a(bus.bd))).a());
      a(
         $$0,
         n,
         c().a(bqs.<dhc>a().a(a(bus.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bus.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqs.<aku<evw>>a().a(evn.aN, 3).a(evn.aO, 7).a())
            .a(bqs.<dhc>a().a(a(bus.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(bus.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bul> dhc a(bus<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bul> dhc a(bus<T> $$0, Consumer<tq> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bul> dhc a(bus<T> $$0, aku<evw> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bul> dhc a(bus<T> $$0, Consumer<tq> $$1, @Nullable aku<evw> $$2) {
      tq $$3 = new tq();
      $$3.a("id", mb.f.b($$0).toString());
      $$1.accept($$3);
      Optional<buv> $$4 = Optional.ofNullable($$2).map($$0x -> new buv($$0x, 0.0F));
      return new dhc($$3, Optional.empty(), $$4);
   }

   private static void a(qe<dwa> $$0, dwb.a $$1, dwa $$2, dwa $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static aku<dwa> a(String $$0) {
      return aku.a(mc.bd, akv.b($$0));
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

   static record a(aku<dwa> a, aku<dwa> b) {

      public static dwb.a a(String $$0) {
         return new dwb.a(dwb.a($$0 + "/normal"), dwb.a($$0 + "/ominous"));
      }
   }
}
