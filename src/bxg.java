import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bxg {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bto<? extends btn<? super bxf>>> a = ImmutableList.of(bto.c, bto.f, bto.d, bto.w);
   static final List<bsj<?>> b = ImmutableList.of(
      bsj.n, bsj.m, bsj.E, bsj.t, bsj.Y, bsj.aQ, bsj.aR, bsj.aS, bsj.aF, bsj.aP, bsj.h, bsj.r, new bsj[]{bsj.N, bsj.O, bsj.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cmi a() {
      return cmi.a(cjk.uo);
   }

   protected static bki<?> a(bki<bxf> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   static bxf b(bxf $$0) {
      $$0.dN().b(bsj.aR);
      $$0.dN().b(bsj.aQ);
      return $$0.a(bxf.a.a);
   }

   private static void b(bki<bxf> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bns(0.8F), new bku(2.0F) {
         @Override
         protected void b(aks $$0, bjr $$1, long $$2) {
            bxg.b((bxf)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bmi(500, 700), new blf(bsj.O)));
   }

   private static void c(bki<bxf> $$0) {
      $$0.a(cdh.v, ImmutableList.of(Pair.of(0, new bxg.e())), Set.of(Pair.of(bsj.Y, bsk.b), Pair.of(bsj.aQ, bsk.a), Pair.of(bsj.m, bsk.a)));
   }

   private static void d(bki<bxf> $$0) {
      $$0.a(
         cdh.z,
         ImmutableList.of(Pair.of(0, new bxg.a(160, 180)), Pair.of(0, new bxg.c(40))),
         Set.of(Pair.of(bsj.Y, bsk.b), Pair.of(bsj.m, bsk.b), Pair.of(bsj.aR, bsk.a))
      );
   }

   private static void e(bki<bxf> $$0) {
      $$0.a(
         cdh.b,
         ImmutableList.of(
            Pair.of(0, new bkt(biw.aN, 1.0F) {
               @Override
               protected void a(aks $$0, but $$1, long $$2) {
                  bxg.b((bxf)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new blm($$0x -> 1.25F, $$0x -> $$0x.m_() ? 2.5 : 3.5) {
               @Override
               protected void b(aks $$0, bjr $$1, long $$2) {
                  bxg.b((bxf)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bme(45, 90)),
            Pair.of(3, new bxg.b(40, 100)),
            Pair.of(
               4,
               new bmv(
                  ImmutableList.of(
                     Pair.of(bnf.a(1.0F, 3), 2),
                     Pair.of(new bxg.d(40, 80), 1),
                     Pair.of(new bxg.f(40, 80), 1),
                     Pair.of(bmx.a(biw.bt, 6.0F), 1),
                     Pair.of(bmq.a(1.0F), 1),
                     Pair.of(new blj(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bsj.aR, bsk.b))
      );
   }

   static void a(bxf $$0) {
      $$0.dN().a(ImmutableList.of(cdh.z, cdh.v, cdh.b));
   }

   static class a extends bkz<bxf> {
      a(int $$0, int $$1) {
         super(Map.of(bsj.Y, bsk.b, bsj.m, bsk.b, bsj.aR, bsk.a, bsj.aF, bsk.b), $$0, $$1);
      }

      protected boolean a(aks $$0, bxf $$1) {
         return $$1.gd();
      }

      protected boolean a(aks $$0, bxf $$1, long $$2) {
         return $$1.dN().c(bsj.aR).isPresent() && $$1.gl() && !$$1.gh();
      }

      protected void b(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.f);
      }

      protected void c(aks $$0, bxf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dN().a(bsj.aF, asz.a, 9600L);
         } else {
            bxg.b($$1);
         }
      }
   }

   static class b extends bkz<bxf> {
      b(int $$0, int $$1) {
         super(Map.of(bsj.aS, bsk.a), $$0, $$1);
      }

      protected boolean a(aks $$0, bxf $$1, long $$2) {
         return true;
      }

      protected void b(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.b);
      }

      protected void c(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.a);
         $$1.dN().b(bsj.aS);
      }
   }

   static class c extends bkz<bxf> {
      c(int $$0) {
         super(Map.of(bsj.Y, bsk.b, bsj.m, bsk.b, bsj.aR, bsk.a, bsj.aF, bsk.a), $$0, $$0);
      }

      protected boolean a(aks $$0, bxf $$1) {
         return true;
      }

      protected boolean a(aks $$0, bxf $$1, long $$2) {
         return $$1.dN().c(bsj.aR).isPresent();
      }

      protected void b(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.g);
      }

      protected void c(aks $$0, bxf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bxf.a.a).w($$3);
         $$1.dN().b(bsj.aR);
         $$1.dN().a(bsj.aS, true);
      }
   }

   static class d extends bkz<bxf> {
      d(int $$0, int $$1) {
         super(Map.of(bsj.Y, bsk.b, bsj.aR, bsk.b, bsj.aQ, bsk.b, bsj.aS, bsk.b, bsj.r, bsk.b), $$0, $$1);
      }

      protected boolean a(aks $$0, bxf $$1) {
         return !$$1.y();
      }

      protected boolean a(aks $$0, bxf $$1, long $$2) {
         return true;
      }

      protected void b(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.c);
      }

      protected void c(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.a);
      }
   }

   static class e extends bkz<bxf> {
      e() {
         super(Map.of(bsj.m, bsk.a, bsj.Y, bsk.b, bsj.aQ, bsk.a), 600);
      }

      protected boolean a(aks $$0, bxf $$1) {
         return $$1.gd();
      }

      protected boolean a(aks $$0, bxf $$1, long $$2) {
         if (!$$1.gd()) {
            $$1.a(bxf.a.a);
            return false;
         } else {
            Optional<gw> $$3 = $$1.dN().c(bsj.m).map(bsm::a).map(bmm::b);
            Optional<gw> $$4 = $$1.dN().c(bsj.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.e);
      }

      protected void c(aks $$0, bxf $$1, long $$2) {
         if ($$1.gl() && $$1.gd()) {
            $$1.dN().a(bsj.aR, true);
         }

         $$1.dN().b(bsj.m);
         $$1.dN().b(bsj.aQ);
      }
   }

   static class f extends bkz<bxf> {
      f(int $$0, int $$1) {
         super(Map.of(bsj.m, bsk.b, bsj.aQ, bsk.b, bsj.aF, bsk.b), $$0, $$1);
      }

      protected boolean a(aks $$0, bxf $$1) {
         return !$$1.m_() && $$1.gd();
      }

      protected boolean a(aks $$0, bxf $$1, long $$2) {
         return $$1.gd();
      }

      protected void b(aks $$0, bxf $$1, long $$2) {
         $$1.a(bxf.a.d);
      }

      protected void c(aks $$0, bxf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bxf.a.a);
         if ($$3) {
            $$1.gk().ifPresent($$1x -> {
               $$1.dN().a(bsj.aQ, $$1x);
               $$1.dN().a(bsj.m, new bsm($$1x, 1.25F, 0));
            });
         }
      }
   }
}
