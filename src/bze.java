import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bze {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bvm<? extends bvl<? super bzd>>> a = ImmutableList.of(bvm.c, bvm.f, bvm.d, bvm.w);
   static final List<buh<?>> b = ImmutableList.of(
      buh.n, buh.m, buh.E, buh.t, buh.Y, buh.aQ, buh.aR, buh.aS, buh.aF, buh.aP, buh.h, buh.r, new buh[]{buh.N, buh.O, buh.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cok a() {
      return cok.a(clm.va);
   }

   protected static bmg<?> a(bmg<bzd> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   static bzd b(bzd $$0) {
      $$0.dP().b(buh.aR);
      $$0.dP().b(buh.aQ);
      return $$0.a(bzd.a.a);
   }

   private static void b(bmg<bzd> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new bpq(0.8F), new bms(2.0F) {
         @Override
         protected void b(ame $$0, blp $$1, long $$2) {
            bze.b((bzd)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bog(500, 700), new bnd(buh.O)));
   }

   private static void c(bmg<bzd> $$0) {
      $$0.a(cff.v, ImmutableList.of(Pair.of(0, new bze.e())), Set.of(Pair.of(buh.Y, bui.b), Pair.of(buh.aQ, bui.a), Pair.of(buh.m, bui.a)));
   }

   private static void d(bmg<bzd> $$0) {
      $$0.a(
         cff.z,
         ImmutableList.of(Pair.of(0, new bze.a(160, 180)), Pair.of(0, new bze.c(40))),
         Set.of(Pair.of(buh.Y, bui.b), Pair.of(buh.m, bui.b), Pair.of(buh.aR, bui.a))
      );
   }

   private static void e(bmg<bzd> $$0) {
      $$0.a(
         cff.b,
         ImmutableList.of(
            Pair.of(0, new bmr(bku.aN, 1.0F) {
               @Override
               protected void a(ame $$0, bwr $$1, long $$2) {
                  bze.b((bzd)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bnk($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(ame $$0, blp $$1, long $$2) {
                  bze.b((bzd)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new boc(45, 90)),
            Pair.of(3, new bze.b(40, 100)),
            Pair.of(
               4,
               new bot(
                  ImmutableList.of(
                     Pair.of(bpd.a(1.0F, 3), 2),
                     Pair.of(new bze.d(40, 80), 1),
                     Pair.of(new bze.f(40, 80), 1),
                     Pair.of(bov.a(bku.bt, 6.0F), 1),
                     Pair.of(boo.a(1.0F), 1),
                     Pair.of(new bnh(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(buh.aR, bui.b))
      );
   }

   static void a(bzd $$0) {
      $$0.dP().a(ImmutableList.of(cff.z, cff.v, cff.b));
   }

   static class a extends bmx<bzd> {
      a(int $$0, int $$1) {
         super(Map.of(buh.Y, bui.b, buh.m, bui.b, buh.aR, bui.a, buh.aF, bui.b), $$0, $$1);
      }

      protected boolean a(ame $$0, bzd $$1) {
         return $$1.gf();
      }

      protected boolean a(ame $$0, bzd $$1, long $$2) {
         return $$1.dP().c(buh.aR).isPresent() && $$1.gn() && !$$1.gj();
      }

      protected void b(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.f);
      }

      protected void c(ame $$0, bzd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dP().a(buh.aF, auo.a, 9600L);
         } else {
            bze.b($$1);
         }
      }
   }

   static class b extends bmx<bzd> {
      b(int $$0, int $$1) {
         super(Map.of(buh.aS, bui.a), $$0, $$1);
      }

      protected boolean a(ame $$0, bzd $$1, long $$2) {
         return true;
      }

      protected void b(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.b);
      }

      protected void c(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.a);
         $$1.dP().b(buh.aS);
      }
   }

   static class c extends bmx<bzd> {
      c(int $$0) {
         super(Map.of(buh.Y, bui.b, buh.m, bui.b, buh.aR, bui.a, buh.aF, bui.a), $$0, $$0);
      }

      protected boolean a(ame $$0, bzd $$1) {
         return true;
      }

      protected boolean a(ame $$0, bzd $$1, long $$2) {
         return $$1.dP().c(buh.aR).isPresent();
      }

      protected void b(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.g);
      }

      protected void c(ame $$0, bzd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bzd.a.a).w($$3);
         $$1.dP().b(buh.aR);
         $$1.dP().a(buh.aS, true);
      }
   }

   static class d extends bmx<bzd> {
      d(int $$0, int $$1) {
         super(Map.of(buh.Y, bui.b, buh.aR, bui.b, buh.aQ, bui.b, buh.aS, bui.b, buh.r, bui.b), $$0, $$1);
      }

      protected boolean a(ame $$0, bzd $$1) {
         return !$$1.A();
      }

      protected boolean a(ame $$0, bzd $$1, long $$2) {
         return true;
      }

      protected void b(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.c);
      }

      protected void c(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.a);
      }
   }

   static class e extends bmx<bzd> {
      e() {
         super(Map.of(buh.m, bui.a, buh.Y, bui.b, buh.aQ, bui.a), 600);
      }

      protected boolean a(ame $$0, bzd $$1) {
         return $$1.gf();
      }

      protected boolean a(ame $$0, bzd $$1, long $$2) {
         if (!$$1.gf()) {
            $$1.a(bzd.a.a);
            return false;
         } else {
            Optional<ht> $$3 = $$1.dP().c(buh.m).map(buk::a).map(bok::b);
            Optional<ht> $$4 = $$1.dP().c(buh.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.e);
      }

      protected void c(ame $$0, bzd $$1, long $$2) {
         if ($$1.gn() && $$1.gf()) {
            $$1.dP().a(buh.aR, true);
         }

         $$1.dP().b(buh.m);
         $$1.dP().b(buh.aQ);
      }
   }

   static class f extends bmx<bzd> {
      f(int $$0, int $$1) {
         super(Map.of(buh.m, bui.b, buh.aQ, bui.b, buh.aF, bui.b), $$0, $$1);
      }

      protected boolean a(ame $$0, bzd $$1) {
         return !$$1.n_() && $$1.gf();
      }

      protected boolean a(ame $$0, bzd $$1, long $$2) {
         return $$1.gf();
      }

      protected void b(ame $$0, bzd $$1, long $$2) {
         $$1.a(bzd.a.d);
      }

      protected void c(ame $$0, bzd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bzd.a.a);
         if ($$3) {
            $$1.gm().ifPresent($$1x -> {
               $$1.dP().a(buh.aQ, $$1x);
               $$1.dP().a(buh.m, new buk($$1x, 1.25F, 0));
            });
         }
      }
   }
}
