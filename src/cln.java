import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cln extends emi {
   private static final String a = "raids";
   private final Map<Integer, cll> b = Maps.newHashMap();
   private final apu c;
   private int d;
   private int e;

   public static emi.a<cln> a(apu $$0) {
      return new emi.a<>(() -> new cln($$0), ($$1, $$2) -> a($$0, $$1), ays.l);
   }

   public cln(apu $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cll a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cll> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cll $$1 = $$0.next();
         if (this.c.aa().b(czc.B)) {
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

      afk.a(this.c, this.b.values());
   }

   public static boolean a(clm $$0, cll $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bA() && $$0.gA() && $$0.en() <= 2400 && $$0.dM().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cll a(apv $$0) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.aa().b(czc.B)) {
         return null;
      } else {
         dta $$1 = $$0.dM().D_();
         if (!$$1.c()) {
            return null;
         } else {
            id $$2 = $$0.dm();
            List<cbx> $$3 = this.c.y().c($$0x -> $$0x.a(avo.b), $$2, 64, cbw.b.b).toList();
            int $$4 = 0;
            esj $$5 = esj.b;

            for (cbx $$6 : $$3) {
               id $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            id $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = id.a($$5);
            } else {
               $$8 = $$2;
            }

            cll $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.t())) {
                  this.b.put($$10.t(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bpo.E);
               $$0.d.b(new ace($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cka)$$0);
               $$0.d.b(new ace($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(auz.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cll a(apu $$0, id $$1) {
      cll $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cll(this.b(), $$0, $$1);
   }

   public static cln a(apu $$0, to $$1) {
      cln $$2 = new cln($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      tu $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         to $$5 = $$3.a($$4);
         cll $$6 = new cll($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public to a(to $$0, ip.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      tu $$2 = new tu();

      for (cll $$3 : this.b.values()) {
         to $$4 = new to();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(in<dta> $$0) {
      return $$0.a(dsy.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cll a(id $$0, int $$1) {
      cll $$2 = null;
      double $$3 = (double)$$1;

      for (cll $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
