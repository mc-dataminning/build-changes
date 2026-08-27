import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cak {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bws<? extends bwr<? super caj>>> a = ImmutableList.of(bws.c, bws.f, bws.d, bws.w);
   static final List<bvm<?>> b = ImmutableList.of(
      bvm.n, bvm.m, bvm.E, bvm.t, bvm.Y, bvm.aQ, bvm.aR, bvm.aS, bvm.aF, bvm.aP, bvm.h, bvm.r, new bvm[]{bvm.N, bvm.O, bvm.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cpy a() {
      return cpy.a(cna.vb);
   }

   protected static bnk<?> a(bnk<caj> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   static caj b(caj $$0) {
      $$0.dO().b(bvm.aR);
      $$0.dO().b(bvm.aQ);
      return $$0.a(caj.a.a);
   }

   private static void b(bnk<caj> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bqv(0.8F), new bnw(2.0F) {
         @Override
         protected void b(and $$0, bmt $$1, long $$2) {
            cak.b((caj)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bpl(500, 700), new boh(bvm.O)));
   }

   private static void c(bnk<caj> $$0) {
      $$0.a(cgt.v, ImmutableList.of(Pair.of(0, new cak.e())), Set.of(Pair.of(bvm.Y, bvn.b), Pair.of(bvm.aQ, bvn.a), Pair.of(bvm.m, bvn.a)));
   }

   private static void d(bnk<caj> $$0) {
      $$0.a(
         cgt.z,
         ImmutableList.of(Pair.of(0, new cak.a(160, 180)), Pair.of(0, new cak.c(40))),
         Set.of(Pair.of(bvm.Y, bvn.b), Pair.of(bvm.m, bvn.b), Pair.of(bvm.aR, bvn.a))
      );
   }

   private static void e(bnk<caj> $$0) {
      $$0.a(
         cgt.b,
         ImmutableList.of(
            Pair.of(0, new bnv(bly.aO, 1.0F) {
               @Override
               protected void a(and $$0, bxx $$1, long $$2) {
                  cak.b((caj)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new boo($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(and $$0, bmt $$1, long $$2) {
                  cak.b((caj)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bph(45, 90)),
            Pair.of(3, new cak.b(40, 100)),
            Pair.of(
               4,
               new bpy(
                  ImmutableList.of(
                     Pair.of(bqi.a(1.0F, 3), 2),
                     Pair.of(new cak.d(40, 80), 1),
                     Pair.of(new cak.f(40, 80), 1),
                     Pair.of(bqa.a(bly.bv, 6.0F), 1),
                     Pair.of(bpt.a(1.0F), 1),
                     Pair.of(new bol(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bvm.aR, bvn.b))
      );
   }

   static void a(caj $$0) {
      $$0.dO().a(ImmutableList.of(cgt.z, cgt.v, cgt.b));
   }

   static class a extends bob<caj> {
      a(int $$0, int $$1) {
         super(Map.of(bvm.Y, bvn.b, bvm.m, bvn.b, bvm.aR, bvn.a, bvm.aF, bvn.b), $$0, $$1);
      }

      protected boolean a(and $$0, caj $$1) {
         return $$1.ge();
      }

      protected boolean a(and $$0, caj $$1, long $$2) {
         return $$1.dO().c(bvm.aR).isPresent() && $$1.gm() && !$$1.gi();
      }

      protected void b(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.f);
      }

      protected void c(and $$0, caj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dO().a(bvm.aF, avr.a, 9600L);
         } else {
            cak.b($$1);
         }
      }
   }

   static class b extends bob<caj> {
      b(int $$0, int $$1) {
         super(Map.of(bvm.aS, bvn.a), $$0, $$1);
      }

      protected boolean a(and $$0, caj $$1, long $$2) {
         return true;
      }

      protected void b(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.b);
      }

      protected void c(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.a);
         $$1.dO().b(bvm.aS);
      }
   }

   static class c extends bob<caj> {
      c(int $$0) {
         super(Map.of(bvm.Y, bvn.b, bvm.m, bvn.b, bvm.aR, bvn.a, bvm.aF, bvn.a), $$0, $$0);
      }

      protected boolean a(and $$0, caj $$1) {
         return true;
      }

      protected boolean a(and $$0, caj $$1, long $$2) {
         return $$1.dO().c(bvm.aR).isPresent();
      }

      protected void b(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.g);
      }

      protected void c(and $$0, caj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(caj.a.a).w($$3);
         $$1.dO().b(bvm.aR);
         $$1.dO().a(bvm.aS, true);
      }
   }

   static class d extends bob<caj> {
      d(int $$0, int $$1) {
         super(Map.of(bvm.Y, bvn.b, bvm.aR, bvn.b, bvm.aQ, bvn.b, bvm.aS, bvn.b, bvm.r, bvn.b), $$0, $$1);
      }

      protected boolean a(and $$0, caj $$1) {
         return !$$1.A();
      }

      protected boolean a(and $$0, caj $$1, long $$2) {
         return true;
      }

      protected void b(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.c);
      }

      protected void c(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.a);
      }
   }

   static class e extends bob<caj> {
      e() {
         super(Map.of(bvm.m, bvn.a, bvm.Y, bvn.b, bvm.aQ, bvn.a), 600);
      }

      protected boolean a(and $$0, caj $$1) {
         return $$1.ge();
      }

      protected boolean a(and $$0, caj $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(caj.a.a);
            return false;
         } else {
            Optional<hx> $$3 = $$1.dO().c(bvm.m).map(bvp::a).map(bpp::b);
            Optional<hx> $$4 = $$1.dO().c(bvm.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.e);
      }

      protected void c(and $$0, caj $$1, long $$2) {
         if ($$1.gm() && $$1.ge()) {
            $$1.dO().a(bvm.aR, true);
         }

         $$1.dO().b(bvm.m);
         $$1.dO().b(bvm.aQ);
      }
   }

   static class f extends bob<caj> {
      f(int $$0, int $$1) {
         super(Map.of(bvm.m, bvn.b, bvm.aQ, bvn.b, bvm.aF, bvn.b), $$0, $$1);
      }

      protected boolean a(and $$0, caj $$1) {
         return !$$1.o_() && $$1.ge();
      }

      protected boolean a(and $$0, caj $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(and $$0, caj $$1, long $$2) {
         $$1.a(caj.a.d);
      }

      protected void c(and $$0, caj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(caj.a.a);
         if ($$3) {
            $$1.gl().ifPresent($$1x -> {
               $$1.dO().a(bvm.aQ, $$1x);
               $$1.dO().a(bvm.m, new bvp($$1x, 1.25F, 0));
            });
         }
      }
   }
}
