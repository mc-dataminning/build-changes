import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class byf {
   public static final int a = 20;
   public static final int b = 7;
   private static final bib i = bib.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bib p = bib.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bib q = bib.a(600, 6000);
   private static final bib r = bib.a(100, 300);
   private static final bvk s = bvk.a().a($$0 -> !$$0.ag().equals(bkm.U) && $$0.dL().C_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bye $$0, ato $$1) {
      $$0.dN().a(btz.R, p.a($$1));
      $$0.dN().a(btz.U, q.a($$1));
   }

   protected static bly<?> a(bly<bye> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   private static void b(bly<bye> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bpi(0.8F), new bmk(2.0F), new bnu(45, 90), new bny(), new bmv(btz.O), new bmv(btz.R), new bmv(btz.U)));
   }

   private static void c(bly<bye> $$0) {
      $$0.a(
         cex.b,
         ImmutableList.of(
            Pair.of(0, boo.a(bkm.bt, 6.0F, bib.a(30, 60))),
            Pair.of(0, new bmj(bkm.U, 1.0F)),
            Pair.of(1, new bnc($$0x -> 1.25F)),
            Pair.of(2, bmm.a(i, 1.25F)),
            Pair.of(3, new bol(ImmutableList.of(Pair.of(bog.a(1.0F), 2), Pair.of(bov.a(1.0F, 3), 2), Pair.of(new bmz(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(btz.V, bua.b), Pair.of(btz.S, bua.b))
      );
   }

   private static void d(bly<bye> $$0) {
      $$0.a(
         cex.q,
         ImmutableList.of(Pair.of(0, new bnq(p, aqn.ka)), Pair.of(1, new bns<>(p, 5, 5, 1.5F, $$0x -> $$0x.go() ? aqn.jV : aqn.jL))),
         ImmutableSet.of(Pair.of(btz.N, bua.b), Pair.of(btz.r, bua.b), Pair.of(btz.m, bua.b), Pair.of(btz.R, bua.b))
      );
   }

   private static void e(bly<bye> $$0) {
      $$0.a(
         cex.r,
         ImmutableList.of(
            Pair.of(
               0,
               new boe(
                  $$0x -> $$0x.go() ? r : q, s, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.go() ? aqn.jY : aqn.jO, $$0x -> $$0x.go() ? aqn.jZ : aqn.jP
               )
            ),
            Pair.of(1, new bod<>($$0x -> $$0x.go() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.go() ? aqn.jX : aqn.jN))
         ),
         ImmutableSet.of(Pair.of(btz.N, bua.b), Pair.of(btz.r, bua.b), Pair.of(btz.U, bua.b))
      );
   }

   public static void a(bye $$0) {
      $$0.dN().a(ImmutableList.of(cex.r, cex.q, cex.b));
   }

   public static coc a() {
      return coc.a(cle.oI);
   }
}
