import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cin {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final brs f = brs.a(5, 16);
   private static final ImmutableList<cfp<? extends cfo<? super cim>>> g = ImmutableList.of(cfp.c, cfp.f, cfp.t, cfp.o);
   private static final ImmutableList<cei<?>> h = ImmutableList.of(
      cei.Z, cei.x, cei.y, cei.m, cei.n, cei.E, cei.t, cei.h, cei.O, cei.P, cei.Q, cei.R, new cei[]{cei.r, cei.K}
   );

   protected static void a(cim $$0, azv $$1) {
   }

   public static bwg.b<cim> a() {
      return bwg.a(h, g);
   }

   protected static bwg<?> a(bwg<cim> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwg<cim> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bzr(0.8F), new cin.a(4.0F), new byd(45, 90), new byh(), new bxd(cei.P), new bxd(cei.Q)));
   }

   private static void c(bwg<cim> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, byx.a(bup.by, 6.0F, brs.a(30, 60))),
            Pair.of(1, new bwr(bup.o)),
            Pair.of(
               2,
               new byu(
                  ImmutableList.of(Pair.of(new bxk($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(cak.a(Predicate.not(cim::t), bwu.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new byo(brs.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byu(
                  ImmutableMap.of(cei.m, cej.b),
                  ImmutableList.of(
                     Pair.of(cak.a(Predicate.not(cim::t), byp.a(2.0F)), 1),
                     Pair.of(cak.a(Predicate.not(cim::t), bze.a(2.0F, 3)), 1),
                     Pair.of(new cin.b(20), 1),
                     Pair.of(new bxh(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cim $$0) {
      $$0.ee().a(ImmutableList.of(cqi.b));
   }

   public static Predicate<cwf> b() {
      return $$0 -> $$0.a(axm.al);
   }

   public static class a extends bws<cim> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arq $$0, cim $$1, long $$2) {
         $$1.gK();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bwx<cim> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arq $$0, cim $$1) {
         return !$$1.bl() && $$1.gL() >= (long)this.c && !$$1.M_() && $$1.aL() && !$$1.da() && $$1.gv();
      }

      protected void a(arq $$0, cim $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gJ();
         } else if (!$$1.gs()) {
            $$1.gI();
         }
      }
   }
}
