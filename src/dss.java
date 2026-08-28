import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dss extends dno implements dnr {
   public static final MapCodec<dss> a = b(dss::new);
   public static final ech b = ecg.d;
   public static final eco<edd> c = ecg.aa;
   public static final eco<edd> d = ecg.Z;
   public static final eco<edd> e = ecg.ab;
   public static final eco<edd> f = ecg.ac;
   public static final Map<jc, eco<edd>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, c, jc.f, d, jc.d, e, jc.e, f)));
   private final Function<ebq, fgw> h;

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, edd.a).b(d, edd.a).b(e, edd.a).b(f, edd.a));
      this.h = this.b();
   }

   @Override
   protected fgw d_(ebq $$0) {
      return fgt.a();
   }

   public Function<ebq, fgw> b() {
      Map<jc, fgw> $$0 = fgt.c(dno.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jc, fgw> $$1 = fgt.d(dno.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         fgw $$3 = $$2.c(b) ? $$1.get(jc.a) : fgt.a();

         for (Entry<jc, eco<edd>> $$4 : g.entrySet()) {
            switch ((edd)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fgt.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fgt.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fgt.b() : $$3;
      });
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fgt.a();
   }

   @Override
   protected boolean e_(ebq $$0) {
      return true;
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(ebq $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (eco<edd> $$1 : g.values()) {
            if ($$0.c($$1) != edd.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(djn $$0, iw $$1, jc $$2) {
      return $$2 == jc.b ? false : dsu.a($$0, $$1, $$2);
   }

   private static ebq a(ebq $$0, djn $$1, iw $$2, boolean $$3) {
      ebq $$4 = null;
      ebq $$5 = null;
      $$3 |= $$0.c(b);

      for (jc $$6 : jc.c.a) {
         eco<edd> $$7 = a($$6);
         edd $$8 = a($$1, $$2, $$6) ? ($$3 ? edd.b : $$0.c($$7)) : edd.a;
         if ($$8 == edd.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dnq.uf) && $$4.c($$7) != edd.a && !$$4.c(b)) {
               $$8 = edd.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dnq.uf) && $$5.c($$7) == edd.a) {
                  $$8 = edd.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dkk $$0, iw $$1, bai $$2, int $$3) {
      ebq $$4 = dnq.uf.m();
      ebq $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      ebq $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         ebq $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, @Nullable byf $$3, dak $$4) {
      if (!$$0.C) {
         bai $$5 = $$0.G_();
         ebq $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static ebq a(djn $$0, iw $$1, BooleanSupplier $$2) {
      iw $$3 = $$1.d();
      ebq $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dnq.uf);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         ebq $$6 = dnq.uf.m().b(b, Boolean.valueOf(false));
         ebq $$7 = a($$6, $$0, $$1.d(), true);

         for (jc $$8 : jc.c.a) {
            eco<edd> $$9 = a($$8);
            if ($$7.c($$9) != edd.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, edd.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dnq.a.m();
      } else {
         return dnq.a.m();
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$0.a($$1, $$3)) {
         return dnq.a.m();
      } else {
         ebq $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dnq.a.m() : $$8;
      }
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return switch ($$1) {
         case c -> (ebq)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (ebq)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (ebq)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return switch ($$1) {
         case b -> (ebq)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (ebq)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static eco<edd> a(jc $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      ebq $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
