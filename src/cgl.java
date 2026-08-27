import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cgl extends efp {
   private static final String a = "raids";
   private final Map<Integer, cgj> b = Maps.newHashMap();
   private final amz c;
   private int d;
   private int e;

   public static efp.a<cgl> a(amz $$0) {
      return new efp.a<>(() -> new cgl($$0), $$1 -> a($$0, $$1), avq.l);
   }

   public cgl(amz $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cgj a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cgj> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cgj $$1 = $$0.next();
         if (this.c.Z().b(cte.B)) {
            $$1.n();
         }

         if ($$1.d()) {
            $$0.remove();
            this.c();
         } else {
            $$1.o();
         }
      }

      if (this.e % 200 == 0) {
         this.c();
      }

      adf.a(this.c, this.b.values());
   }

   public static boolean a(cgk $$0, cgj $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gr() && $$0.el() <= 2400 && $$0.dM().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public cgj a(ana $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Z().b(cte.B)) {
         return null;
      } else {
         dmj $$1 = $$0.dM().E_();
         if (!$$1.c()) {
            return null;
         } else {
            hx $$2 = $$0.dm();
            List<bxh> $$3 = this.c.y().c($$0x -> $$0x.a(asl.b), $$2, 64, bxg.b.b).toList();
            int $$4 = 0;
            elm $$5 = elm.b;

            for (bxh $$6 : $$3) {
               hx $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            hx $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = hx.a($$5);
            } else {
               $$8 = $$2;
            }

            cgj $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(ble.E);
               $$0.c.b(new zz($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cfb)$$0);
               $$0.c.b(new zz($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(arw.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cgj a(amz $$0, hx $$1) {
      cgj $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cgj(this.b(), $$0, $$1);
   }

   public static cgl a(amz $$0, sl $$1) {
      cgl $$2 = new cgl($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      sr $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         sl $$5 = $$3.a($$4);
         cgj $$6 = new cgj($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public sl a(sl $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      sr $$1 = new sr();

      for (cgj $$2 : this.b.values()) {
         sl $$3 = new sl();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ih<dmj> $$0) {
      return $$0.a(dmh.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cgj a(hx $$0, int $$1) {
      cgj $$2 = null;
      double $$3 = (double)$$1;

      for (cgj $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
