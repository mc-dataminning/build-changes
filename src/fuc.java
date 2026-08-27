import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fuc {
   private static final Map<acq, fud> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final acq c = new acq("damaged");
   private static final acq d = new acq("damage");
   private static final fua e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fua f = ($$0x, $$1, $$2, $$3) -> apa.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cfu, Map<acq, fud>> g = Maps.newHashMap();

   private static fua a(acq $$0, fua $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fud $$0) {
      a.put(new acq("custom_model_data"), $$0);
   }

   private static void a(cfu $$0, acq $$1, fua $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fud a(cfu $$0, acq $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fud $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<acq, fud> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new acq("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fh() != bft.b ? 1.0F : 0.0F);
      a(new acq("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof byo ? ((byo)$$2).gi().a($$0x.d(), 0.0F) : 0.0F);
      fua $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(ane.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cib.a($$1.B_(), $$0x).map(cib::b).map(he::a).map(cic::c).orElse(0.0F);
         }
      };
      a(kr.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cgc.nG, new acq("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fk() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fl()) / 20.0F;
         }
      });
      a(cgc.wv, new acq("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fk() == $$0x ? (float)($$2.fl() % 10) / 10.0F : 0.0F);
      a(cgc.nG, new acq("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0x ? 1.0F : 0.0F);
      a(cgc.qg, new acq("filled"), ($$0x, $$1, $$2, $$3) -> ceb.d($$0x));
      a(cgc.qi, new acq("time"), new fua() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cfz $$0, @Nullable few $$1, @Nullable bfz $$2, int $$3) {
            bfj $$4 = (bfj)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dI() instanceof few) {
                  $$1 = (few)$$4.dI();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.x_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(cmm $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = apa.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = apa.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cgc.qe, new acq("angle"), new fub(($$0x, $$1, $$2) -> ced.d($$1) ? ced.a($$1.w()) : ced.a($$0x)));
      a(cgc.qf, new acq("angle"), new fub(($$0x, $$1, $$2) -> $$2 instanceof byo $$3 ? $$3.gm().orElse(null) : null));
      a(cgc.uZ, new acq("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return ceh.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fl()) / (float)ceh.k($$0x);
         }
      });
      a(cgc.uZ, new acq("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0x && !ceh.d($$0x) ? 1.0F : 0.0F);
      a(cgc.uZ, new acq("charged"), ($$0x, $$1, $$2, $$3) -> ceh.d($$0x) ? 1.0F : 0.0F);
      a(cgc.uZ, new acq("firework"), ($$0x, $$1, $$2, $$3) -> ceh.d($$0x) && ceh.a($$0x, cgc.tA) ? 1.0F : 0.0F);
      a(cgc.nh, new acq("broken"), ($$0x, $$1, $$2, $$3) -> cet.d($$0x) ? 0.0F : 1.0F);
      a(cgc.qh, new acq("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eO() == $$0x;
            boolean $$5 = $$2.eP() == $$0x;
            if ($$2.eO().d() instanceof cff) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof byo && ((byo)$$2).cj != null ? 1.0F : 0.0F;
         }
      });
      a(cgc.uy, new acq("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0x ? 1.0F : 0.0F);
      a(cgc.uV, new acq("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0x ? 1.0F : 0.0F);
      a(cgc.hg, new acq("level"), ($$0x, $$1, $$2, $$3) -> {
         qr $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               rk $$5 = $$4.c(cty.b.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.m_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cgc.vi, new acq("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fi() && $$2.fk() == $$0x ? 1.0F : 0.0F);
   }
}
