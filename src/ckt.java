import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ckt {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bto f = bto.a(5, 16);
   private static final ImmutableList<chn<? extends chm<? super cks>>> g = ImmutableList.of(chn.c, chn.f, chn.t, chn.o);
   private static final ImmutableList<cgg<?>> h = ImmutableList.of(
      cgg.aa, cgg.y, cgg.z, cgg.n, cgg.o, cgg.F, cgg.u, cgg.h, cgg.P, cgg.Q, cgg.R, cgg.S, new cgg[]{cgg.s, cgg.L}
   );

   protected static void a(cks $$0, azv $$1) {
   }

   public static bye.b<cks> a() {
      return bye.a(h, g);
   }

   protected static bye<?> a(bye<cks> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<cks> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp(0.8F), new ckt.a(4.0F), new cab(45, 90), new caf(), new bzb(cgg.Q), new bzb(cgg.R)));
   }

   private static void c(bye<cks> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(1, new byp(bwo.t)),
            Pair.of(
               2,
               new cas(
                  ImmutableList.of(Pair.of(new bzi($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(cci.a(Predicate.not(cks::t), bys.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new cam(bto.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new cas(
                  ImmutableMap.of(cgg.n, cgh.b),
                  ImmutableList.of(
                     Pair.of(cci.a(Predicate.not(cks::t), can.a(2.0F)), 1),
                     Pair.of(cci.a(Predicate.not(cks::t), cbc.a(2.0F, 3)), 1),
                     Pair.of(new ckt.b(20), 1),
                     Pair.of(new bzf(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cks $$0) {
      $$0.ec().a(ImmutableList.of(csw.b));
   }

   public static Predicate<czd> b() {
      return $$0 -> $$0.a(axk.al);
   }

   public static class a extends byq<cks> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arq $$0, cks $$1, long $$2) {
         $$1.gG();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends byv<cks> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arq $$0, cks $$1) {
         return !$$1.bj() && $$1.gH() >= (long)this.c && !$$1.O_() && $$1.aJ() && !$$1.cX() && $$1.gr();
      }

      protected void a(arq $$0, cks $$1, long $$2) {
         if ($$1.gu()) {
            $$1.gF();
         } else if (!$$1.go()) {
            $$1.gE();
         }
      }
   }
}
