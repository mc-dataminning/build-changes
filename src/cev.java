import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cev extends edl {
   private static final String a = "raids";
   private final Map<Integer, cet> b = Maps.newHashMap();
   private final ama c;
   private int d;
   private int e;

   public static edl.a<cev> a(ama $$0) {
      return new edl.a<>(() -> new cev($$0), $$1 -> a($$0, $$1), aun.l);
   }

   public cev(ama $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cet a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cet> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cet $$1 = $$0.next();
         if (this.c.X().b(cro.B)) {
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

      aci.a(this.c, this.b.values());
   }

   public static boolean a(ceu $$0, cet $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bv() && $$0.gr() && $$0.ek() <= 2400 && $$0.dL().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cet a(amb $$0) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.X().b(cro.B)) {
         return null;
      } else {
         dkf $$1 = $$0.dL().D_();
         if (!$$1.c()) {
            return null;
         } else {
            ht $$2 = $$0.dl();
            List<bvy> $$3 = this.c.w().c($$0x -> $$0x.a(arm.b), $$2, 64, bvx.b.b).toList();
            int $$4 = 0;
            eji $$5 = eji.b;

            for (bvy $$6 : $$3) {
               ht $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            ht $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = ht.a($$5);
            } else {
               $$8 = $$2;
            }

            cet $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bjx.E);
               $$0.c.b(new zf($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cdm)$$0);
               $$0.c.b(new zf($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(aqx.aA);
                  al.I.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cet a(ama $$0, ht $$1) {
      cet $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new cet(this.b(), $$0, $$1);
   }

   public static cev a(ama $$0, rz $$1) {
      cev $$2 = new cev($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      sf $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         rz $$5 = $$3.a($$4);
         cet $$6 = new cet($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public rz a(rz $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      sf $$1 = new sf();

      for (cet $$2 : this.b.values()) {
         rz $$3 = new rz();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ib<dkf> $$0) {
      return $$0.a(dkd.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cet a(ht $$0, int $$1) {
      cet $$2 = null;
      double $$3 = (double)$$1;

      for (cet $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
