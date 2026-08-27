import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bsy {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bdi f = bdi.a(5, 16);
   private static final ImmutableList<bqg<? extends bqf<? super bsx>>> g = ImmutableList.of(bqg.c, bqg.f, bqg.s, bqg.n);
   private static final ImmutableList<bpb<?>> h = ImmutableList.of(
      bpb.Y, bpb.x, bpb.y, bpb.m, bpb.n, bpb.E, bpb.t, bpb.h, bpb.N, bpb.O, bpb.P, bpb.Q, new bpb[]{bpb.r, bpb.J}
   );

   protected static void a(bsx $$0, apf $$1) {
   }

   public static bha.b<bsx> a() {
      return bha.a(h, g);
   }

   protected static bha<?> a(bha<bsx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(bzz.a));
      $$0.b(bzz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bha<bsx> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new bkk(0.8F), new bsy.a(4.0F), new biw(45, 90), new bja(), new bhx(bpb.O), new bhx(bpb.P)));
   }

   private static void c(bha<bsx> $$0) {
      $$0.a(
         bzz.b,
         ImmutableList.of(
            Pair.of(0, bjq.a(bfn.bt, 6.0F, bdi.a(30, 60))),
            Pair.of(1, new bhl(bfn.l, 1.0F)),
            Pair.of(2, new bie($$0x -> 2.5F)),
            Pair.of(3, bld.a(Predicate.not(bsx::r), bho.a(f, 2.5F))),
            Pair.of(4, new bjh(bdi.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               5,
               new bjn(
                  ImmutableMap.of(bpb.m, bpc.b),
                  ImmutableList.of(
                     Pair.of(bld.a(Predicate.not(bsx::r), bji.a(2.0F)), 1),
                     Pair.of(bld.a(Predicate.not(bsx::r), bjx.a(2.0F, 3)), 1),
                     Pair.of(new bsy.b(20), 1),
                     Pair.of(new bib(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bsx $$0) {
      $$0.dK().a(ImmutableList.of(bzz.b));
   }

   public static ciz b() {
      return bsx.bT;
   }

   public static class a extends bhm {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(aif $$0, bgi $$1, long $$2) {
         if ($$1 instanceof bsx $$3) {
            $$3.gl();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bhr<bsx> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aif $$0, bsx $$1) {
         return !$$1.aV() && $$1.gm() >= (long)this.c && !$$1.fO() && $$1.ay() && !$$1.cM();
      }

      protected void a(aif $$0, bsx $$1, long $$2) {
         if ($$1.gg()) {
            $$1.gk();
         } else if (!$$1.fY()) {
            $$1.gj();
         }
      }
   }
}
