import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ceg extends ecj {
   private static final String a = "raids";
   private final Map<Integer, cee> b = Maps.newHashMap();
   private final alq c;
   private int d;
   private int e;

   public static ecj.a<ceg> a(alq $$0) {
      return new ecj.a<>(() -> new ceg($$0), $$1 -> a($$0, $$1), aud.l);
   }

   public ceg(alq $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cee a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cee> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cee $$1 = $$0.next();
         if (this.c.X().b(cqv.A)) {
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

      abz.a(this.c, this.b.values());
   }

   public static boolean a(cef $$0, cee $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bv() && $$0.gr() && $$0.ek() <= 2400 && $$0.dL().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cee a(alr $$0) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.X().b(cqv.A)) {
         return null;
      } else {
         djk $$1 = $$0.dL().D_();
         if (!$$1.c()) {
            return null;
         } else {
            ht $$2 = $$0.dl();
            List<bvj> $$3 = this.c.w().c($$0x -> $$0x.a(arc.b), $$2, 64, bvi.b.b).toList();
            int $$4 = 0;
            eif $$5 = eif.b;

            for (bvj $$6 : $$3) {
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

            cee $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bji.E);
               $$0.c.b(new yw($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((ccx)$$0);
               $$0.c.b(new yw($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(aqn.aA);
                  al.I.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cee a(alq $$0, ht $$1) {
      cee $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new cee(this.b(), $$0, $$1);
   }

   public static ceg a(alq $$0, rt $$1) {
      ceg $$2 = new ceg($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      rz $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         rt $$5 = $$3.a($$4);
         cee $$6 = new cee($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public rt a(rt $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      rz $$1 = new rz();

      for (cee $$2 : this.b.values()) {
         rt $$3 = new rt();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ib<djk> $$0) {
      return $$0.a(dji.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cee a(ht $$0, int $$1) {
      cee $$2 = null;
      double $$3 = (double)$$1;

      for (cee $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
