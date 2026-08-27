import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ccu {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bmo f = bmo.a(5, 16);
   private static final ImmutableList<bzz<? extends bzy<? super cct>>> g = ImmutableList.of(bzz.c, bzz.f, bzz.t, bzz.o);
   private static final ImmutableList<bys<?>> h = ImmutableList.of(
      bys.Z, bys.x, bys.y, bys.m, bys.n, bys.E, bys.t, bys.h, bys.O, bys.P, bys.Q, bys.R, new bys[]{bys.r, bys.K}
   );

   protected static void a(cct $$0, axd $$1) {
   }

   public static bqq.b<cct> a() {
      return bqq.a(h, g);
   }

   protected static bqq<?> a(bqq<cct> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<cct> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bub(0.8F), new ccu.a(4.0F), new bsn(45, 90), new bsr(), new brn(bys.P), new brn(bys.Q)));
   }

   private static void c(bqq<cct> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, bth.a(bpd.by, 6.0F, bmo.a(30, 60))),
            Pair.of(1, new brb(bpd.p)),
            Pair.of(
               2,
               new bte(
                  ImmutableList.of(Pair.of(new bru($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(buu.a(Predicate.not(cct::s), bre.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bsy(bmo.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bte(
                  ImmutableMap.of(bys.m, byt.b),
                  ImmutableList.of(
                     Pair.of(buu.a(Predicate.not(cct::s), bsz.a(2.0F)), 1),
                     Pair.of(buu.a(Predicate.not(cct::s), bto.a(2.0F, 3)), 1),
                     Pair.of(new ccu.b(20), 1),
                     Pair.of(new brr(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cct $$0) {
      $$0.dP().a(ImmutableList.of(ckj.b));
   }

   public static ctm b() {
      return cct.bX;
   }

   public static class a extends brc<cct> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(apf $$0, cct $$1, long $$2) {
         $$1.gA();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends brh<cct> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(apf $$0, cct $$1) {
         return !$$1.bc() && $$1.gB() >= (long)this.c && !$$1.gb() && $$1.aC() && !$$1.cO() && $$1.gn();
      }

      protected void a(apf $$0, cct $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gz();
         } else if (!$$1.gk()) {
            $$1.gy();
         }
      }
   }
}
