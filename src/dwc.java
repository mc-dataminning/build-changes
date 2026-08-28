import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwc {
   private static final dwc.a a = dwc.a.a("trial_chamber/breeze");
   private static final dwc.a b = dwc.a.a("trial_chamber/melee/husk");
   private static final dwc.a c = dwc.a.a("trial_chamber/melee/spider");
   private static final dwc.a d = dwc.a.a("trial_chamber/melee/zombie");
   private static final dwc.a e = dwc.a.a("trial_chamber/ranged/poison_skeleton");
   private static final dwc.a f = dwc.a.a("trial_chamber/ranged/skeleton");
   private static final dwc.a g = dwc.a.a("trial_chamber/ranged/stray");
   private static final dwc.a h = dwc.a.a("trial_chamber/slow_ranged/poison_skeleton");
   private static final dwc.a i = dwc.a.a("trial_chamber/slow_ranged/skeleton");
   private static final dwc.a j = dwc.a.a("trial_chamber/slow_ranged/stray");
   private static final dwc.a k = dwc.a.a("trial_chamber/small_melee/baby_zombie");
   private static final dwc.a l = dwc.a.a("trial_chamber/small_melee/cave_spider");
   private static final dwc.a m = dwc.a.a("trial_chamber/small_melee/silverfish");
   private static final dwc.a n = dwc.a.a("trial_chamber/small_melee/slime");

   public static void a(qe<dwb> $$0) {
      a(
         $$0,
         a,
         dwb.b().b(1.0F).d(0.5F).b(20).a(2.0F).c(1.0F).a(bqt.a(a(but.r))).a(),
         dwb.b().d(0.5F).b(20).a(4.0F).c(1.0F).a(bqt.a(a(but.r))).b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a()
      );
      a($$0, b, c().a(bqt.a(a(but.am))).a(), c().a(bqt.a(a(but.am, evo.ak))).b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a());
      a($$0, c, c().a(bqt.a(a(but.bn))).a(), a().a(bqt.a(a(but.bn))).b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a());
      a($$0, d, c().a(bqt.a(a(but.bN))).a(), c().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.bN, evo.ak))).a());
      a($$0, e, c().a(bqt.a(a(but.q))).a(), c().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.q, evo.aj))).a());
      a($$0, f, c().a(bqt.a(a(but.be))).a(), c().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.be, evo.aj))).a());
      a($$0, g, c().a(bqt.a(a(but.br))).a(), c().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.br, evo.aj))).a());
      a($$0, h, b().a(bqt.a(a(but.q))).a(), b().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.q, evo.aj))).a());
      a($$0, i, b().a(bqt.a(a(but.be))).a(), b().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.be, evo.aj))).a());
      a($$0, j, b().a(bqt.a(a(but.br))).a(), b().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.br, evo.aj))).a());
      a(
         $$0,
         k,
         dwb.b().d(0.5F).b(20).a(bqt.a(a(but.bN, $$0x -> $$0x.a("IsBaby", true), null))).a(),
         dwb.b().d(0.5F).b(20).b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.bN, $$0x -> $$0x.a("IsBaby", true), evo.ak))).a()
      );
      a($$0, l, c().a(bqt.a(a(but.v))).a(), a().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.v))).a());
      a($$0, m, c().a(bqt.a(a(but.bd))).a(), a().b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a()).a(bqt.a(a(but.bd))).a());
      a(
         $$0,
         n,
         c().a(bqt.<dhd>a().a(a(but.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(but.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a()).a(),
         a()
            .b(bqt.<aku<evx>>a().a(evo.aN, 3).a(evo.aO, 7).a())
            .a(bqt.<dhd>a().a(a(but.bg, $$0x -> $$0x.a("Size", (byte)1)), 3).a(a(but.bg, $$0x -> $$0x.a("Size", (byte)2)), 1).a())
            .a()
      );
   }

   private static <T extends bum> dhd a(but<T> $$0) {
      return a($$0, $$0x -> {
      }, null);
   }

   private static <T extends bum> dhd a(but<T> $$0, Consumer<tq> $$1) {
      return a($$0, $$1, null);
   }

   private static <T extends bum> dhd a(but<T> $$0, aku<evx> $$1) {
      return a($$0, $$0x -> {
      }, $$1);
   }

   private static <T extends bum> dhd a(but<T> $$0, Consumer<tq> $$1, @Nullable aku<evx> $$2) {
      tq $$3 = new tq();
      $$3.a("id", mb.f.b($$0).toString());
      $$1.accept($$3);
      Optional<buw> $$4 = Optional.ofNullable($$2).map($$0x -> new buw($$0x, 0.0F));
      return new dhd($$3, Optional.empty(), $$4);
   }

   private static void a(qe<dwb> $$0, dwc.a $$1, dwb $$2, dwb $$3) {
      $$0.a($$1.a, $$2);
      $$0.a($$1.b, $$3);
   }

   static aku<dwb> a(String $$0) {
      return aku.a(mc.bd, akv.b($$0));
   }

   private static dwb.a a() {
      return dwb.b().b(4.0F).d(0.5F).b(20).a(12.0F);
   }

   private static dwb.a b() {
      return dwb.b().b(4.0F).d(2.0F).b(160);
   }

   private static dwb.a c() {
      return dwb.b().b(3.0F).d(0.5F).b(20);
   }

   static record a(aku<dwb> a, aku<dwb> b) {

      public static dwc.a a(String $$0) {
         return new dwc.a(dwc.a($$0 + "/normal"), dwc.a($$0 + "/ominous"));
      }
   }
}
