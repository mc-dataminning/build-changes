import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bty {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bqg<? extends bqf<? super btx>>> a = ImmutableList.of(bqg.c, bqg.f, bqg.d, bqg.w);
   static final List<bpb<?>> b = ImmutableList.of(
      bpb.n, bpb.m, bpb.E, bpb.t, bpb.Y, bpb.aQ, bpb.aR, bpb.aS, bpb.aF, bpb.aP, bpb.h, bpb.r, new bpb[]{bpb.N, bpb.O, bpb.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static ciz a() {
      return ciz.a(cgc.uo);
   }

   protected static bha<?> a(bha<btx> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(bzz.a));
      $$0.b(bzz.b);
      $$0.f();
      return $$0;
   }

   static btx b(btx $$0) {
      $$0.dK().b(bpb.aR);
      $$0.dK().b(bpb.aQ);
      return $$0.a(btx.a.a);
   }

   private static void b(bha<btx> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new bkk(0.8F), new bhm(2.0F) {
         @Override
         protected void b(aif $$0, bgi $$1, long $$2) {
            bty.b((btx)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bja(10000, 15000), new bhx(bpb.O)));
   }

   private static void c(bha<btx> $$0) {
      $$0.a(bzz.v, ImmutableList.of(Pair.of(0, new bty.e())), Set.of(Pair.of(bpb.Y, bpc.b), Pair.of(bpb.aQ, bpc.a), Pair.of(bpb.m, bpc.a)));
   }

   private static void d(bha<btx> $$0) {
      $$0.a(
         bzz.z,
         ImmutableList.of(Pair.of(0, new bty.a(160, 180)), Pair.of(0, new bty.c(40))),
         Set.of(Pair.of(bpb.Y, bpc.b), Pair.of(bpb.m, bpc.b), Pair.of(bpb.aR, bpc.a))
      );
   }

   private static void e(bha<btx> $$0) {
      $$0.a(
         bzz.b,
         ImmutableList.of(
            Pair.of(0, new bhl(bfn.aN, 1.0F) {
               @Override
               protected void a(aif $$0, brl $$1, long $$2) {
                  bty.b((btx)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bie($$0x -> 1.25F, $$0x -> $$0x.h_() ? 2.5 : 3.5) {
               @Override
               protected void b(aif $$0, bgi $$1, long $$2) {
                  bty.b((btx)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new biw(45, 90)),
            Pair.of(3, new bty.b(40, 100)),
            Pair.of(
               4,
               new bjn(
                  ImmutableList.of(
                     Pair.of(bjx.a(1.0F, 3), 2),
                     Pair.of(new bty.d(40, 80), 1),
                     Pair.of(new bty.f(40, 80), 1),
                     Pair.of(bjp.a(bfn.bt, 6.0F), 1),
                     Pair.of(bji.a(1.0F), 1),
                     Pair.of(new bib(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bpb.aR, bpc.b))
      );
   }

   static void a(btx $$0) {
      $$0.dK().a(ImmutableList.of(bzz.z, bzz.v, bzz.b));
   }

   static class a extends bhr<btx> {
      a(int $$0, int $$1) {
         super(Map.of(bpb.Y, bpc.b, bpb.m, bpc.b, bpb.aR, bpc.a, bpb.aF, bpc.b), $$0, $$1);
      }

      protected boolean a(aif $$0, btx $$1) {
         return $$1.ge();
      }

      protected boolean a(aif $$0, btx $$1, long $$2) {
         return $$1.dK().c(bpb.aR).isPresent() && $$1.gh() && !$$1.gc();
      }

      protected void b(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.f);
      }

      protected void c(aif $$0, btx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dK().a(bpb.aF, apz.a, 9600L);
         } else {
            bty.b($$1);
         }
      }
   }

   static class b extends bhr<btx> {
      b(int $$0, int $$1) {
         super(Map.of(bpb.aS, bpc.a), $$0, $$1);
      }

      protected boolean a(aif $$0, btx $$1, long $$2) {
         return true;
      }

      protected void b(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.b);
      }

      protected void c(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.a);
         $$1.dK().b(bpb.aS);
      }
   }

   static class c extends bhr<btx> {
      c(int $$0) {
         super(Map.of(bpb.Y, bpc.b, bpb.m, bpc.b, bpb.aR, bpc.a, bpb.aF, bpc.a), $$0, $$0);
      }

      protected boolean a(aif $$0, btx $$1) {
         return true;
      }

      protected boolean a(aif $$0, btx $$1, long $$2) {
         return $$1.dK().c(bpb.aR).isPresent();
      }

      protected void b(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.g);
      }

      protected void c(aif $$0, btx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(btx.a.a).w($$3);
         $$1.dK().b(bpb.aR);
         $$1.dK().a(bpb.aS, true);
      }
   }

   static class d extends bhr<btx> {
      d(int $$0, int $$1) {
         super(Map.of(bpb.Y, bpc.b, bpb.aR, bpc.b, bpb.aQ, bpc.b, bpb.aS, bpc.b, bpb.r, bpc.b), $$0, $$1);
      }

      protected boolean a(aif $$0, btx $$1) {
         return !$$1.fY();
      }

      protected boolean a(aif $$0, btx $$1, long $$2) {
         return true;
      }

      protected void b(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.c);
      }

      protected void c(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.a);
      }
   }

   static class e extends bhr<btx> {
      e() {
         super(Map.of(bpb.m, bpc.a, bpb.Y, bpc.b, bpb.aQ, bpc.a), 600);
      }

      protected boolean a(aif $$0, btx $$1) {
         return $$1.ge();
      }

      protected boolean a(aif $$0, btx $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(btx.a.a);
            return false;
         } else {
            Optional<gu> $$3 = $$1.dK().c(bpb.m).map(bpe::a).map(bje::b);
            Optional<gu> $$4 = $$1.dK().c(bpb.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.e);
      }

      protected void c(aif $$0, btx $$1, long $$2) {
         if ($$1.gh() && $$1.ge()) {
            $$1.dK().a(bpb.aR, true);
         }

         $$1.dK().b(bpb.m);
         $$1.dK().b(bpb.aQ);
      }
   }

   static class f extends bhr<btx> {
      f(int $$0, int $$1) {
         super(Map.of(bpb.m, bpc.b, bpb.aQ, bpc.b, bpb.aF, bpc.b), $$0, $$1);
      }

      protected boolean a(aif $$0, btx $$1) {
         return !$$1.h_() && $$1.ge();
      }

      protected boolean a(aif $$0, btx $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(aif $$0, btx $$1, long $$2) {
         $$1.a(btx.a.d);
      }

      protected void c(aif $$0, btx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(btx.a.a);
         if ($$3) {
            $$1.gg().ifPresent($$1x -> {
               $$1.dK().a(bpb.aQ, $$1x);
               $$1.dK().a(bpb.m, new bpe($$1x, 1.25F, 0));
            });
         }
      }
   }
}
