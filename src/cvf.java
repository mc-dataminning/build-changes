import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import org.slf4j.Logger;

public class cvf extends cso {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<cvf> a = b(cvf::new);
   public static final dfx b = cvd.a;
   public static final dfu c = dft.A;
   private static final Map<cjg, ih> e = ac.a(new Object2ObjectOpenHashMap(), $$0 -> $$0.defaultReturnValue(new ig()));
   private static final int f = 4;

   @Override
   public MapCodec<? extends cvf> a() {
      return a;
   }

   public static void a(cqa $$0, ih $$1) {
      e.put($$0.k(), $$1);
   }

   protected cvf(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         dcz $$6 = $$1.c_($$2);
         if ($$6 instanceof ddq) {
            $$3.a((ddq)$$6);
            if ($$6 instanceof ddr) {
               $$3.a(apq.ac);
            } else {
               $$3.a(apq.ae);
            }
         }

         return bhe.b;
      }
   }

   protected void a(akt $$0, dfd $$1, gw $$2) {
      ddq $$3 = $$0.a($$2, ddb.f).orElse(null);
      if ($$3 == null) {
         d.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", $$2);
      } else {
         id $$4 = new id($$0, $$2, $$1, $$3);
         int $$5 = $$3.a($$0.z);
         if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(djn.a, $$2, djn.a.a($$3.q()));
         } else {
            cjl $$6 = $$3.a($$5);
            ih $$7 = this.a($$6);
            if ($$7 != ih.b) {
               $$3.a($$5, $$7.dispense($$4, $$6));
            }
         }
      }
   }

   protected ih a(cjl $$0) {
      return e.get($$0.d());
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2) || $$1.B($$2.c());
      boolean $$7 = $$0.c(c);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      this.a($$1, $$0, $$2);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddq($$0, $$1);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.d().g());
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof ddq) {
            ((ddq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof ddq) {
            bha.a($$1, $$2, (ddq)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public static ho a(id $$0) {
      ha $$1 = $$0.d().c(b);
      return $$0.a().b(0.7 * (double)$$1.j(), 0.7 * (double)$$1.k(), 0.7 * (double)$$1.l());
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return cer.a($$1.c_($$2));
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }
}
