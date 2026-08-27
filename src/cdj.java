import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cdj extends ebl {
   private static final String a = "raids";
   private final Map<Integer, cdh> b = Maps.newHashMap();
   private final akt c;
   private int d;
   private int e;

   public static ebl.a<cdj> a(akt $$0) {
      return new ebl.a<>(() -> new cdj($$0), $$1 -> a($$0, $$1), atg.l);
   }

   public cdj(akt $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cdh a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cdh> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cdh $$1 = $$0.next();
         if (this.c.X().b(cpx.z)) {
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

      abc.a(this.c, this.b.values());
   }

   public static boolean a(cdi $$0, cdh $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bv() && $$0.gr() && $$0.ek() <= 2400 && $$0.dL().C_() == $$1.i().C_() : false;
   }

   @Nullable
   public cdh a(aku $$0) {
      if ($$0.M_()) {
         return null;
      } else if (this.c.X().b(cpx.z)) {
         return null;
      } else {
         dim $$1 = $$0.dL().C_();
         if (!$$1.c()) {
            return null;
         } else {
            gw $$2 = $$0.dl();
            List<bum> $$3 = this.c.w().c($$0x -> $$0x.a(aqf.b), $$2, 64, bul.b.b).toList();
            int $$4 = 0;
            ehh $$5 = ehh.b;

            for (bum $$6 : $$3) {
               gw $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            gw $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = gw.a($$5);
            } else {
               $$8 = $$2;
            }

            cdh $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bil.E);
               $$0.c.b(new xz($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cca)$$0);
               $$0.c.b(new xz($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(apq.aA);
                  al.I.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cdh a(akt $$0, gw $$1) {
      cdh $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new cdh(this.b(), $$0, $$1);
   }

   public static cdj a(akt $$0, qw $$1) {
      cdj $$2 = new cdj($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      rc $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         qw $$5 = $$3.a($$4);
         cdh $$6 = new cdh($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public qw a(qw $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      rc $$1 = new rc();

      for (cdh $$2 : this.b.values()) {
         qw $$3 = new qw();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(he<dim> $$0) {
      return $$0.a(dik.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cdh a(gw $$0, int $$1) {
      cdh $$2 = null;
      double $$3 = (double)$$1;

      for (cdh $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
