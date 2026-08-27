import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cgr extends efv {
   private static final String a = "raids";
   private final Map<Integer, cgp> b = Maps.newHashMap();
   private final and c;
   private int d;
   private int e;

   public static efv.a<cgr> a(and $$0) {
      return new efv.a<>(() -> new cgr($$0), $$1 -> a($$0, $$1), avv.l);
   }

   public cgr(and $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cgp a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cgp> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cgp $$1 = $$0.next();
         if (this.c.Z().b(ctk.B)) {
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

      adi.a(this.c, this.b.values());
   }

   public static boolean a(cgq $$0, cgp $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gr() && $$0.el() <= 2400 && $$0.dM().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public cgp a(ane $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Z().b(ctk.B)) {
         return null;
      } else {
         dmp $$1 = $$0.dM().E_();
         if (!$$1.c()) {
            return null;
         } else {
            hx $$2 = $$0.dm();
            List<bxm> $$3 = this.c.y().c($$0x -> $$0x.a(asq.b), $$2, 64, bxl.b.b).toList();
            int $$4 = 0;
            els $$5 = els.b;

            for (bxm $$6 : $$3) {
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

            cgp $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(blj.E);
               $$0.c.b(new aac($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cfh)$$0);
               $$0.c.b(new aac($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(asb.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cgp a(and $$0, hx $$1) {
      cgp $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cgp(this.b(), $$0, $$1);
   }

   public static cgr a(and $$0, sn $$1) {
      cgr $$2 = new cgr($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      st $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         sn $$5 = $$3.a($$4);
         cgp $$6 = new cgp($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public sn a(sn $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      st $$1 = new st();

      for (cgp $$2 : this.b.values()) {
         sn $$3 = new sn();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ih<dmp> $$0) {
      return $$0.a(dmn.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cgp a(hx $$0, int $$1) {
      cgp $$2 = null;
      double $$3 = (double)$$1;

      for (cgp $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
