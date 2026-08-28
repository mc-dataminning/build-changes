import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class crx extends ewf {
   private static final String a = "raids";
   private final Map<Integer, crv> b = Maps.newHashMap();
   private final arn c;
   private int d;
   private int e;

   public static ewf.a<crx> a(arn $$0) {
      return new ewf.a<>(() -> new crx($$0), ($$1, $$2) -> a($$0, $$1), bax.l);
   }

   public crx(arn $$0) {
      this.c = $$0;
      this.d = 1;
      this.g();
   }

   public crv a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<crv> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         crv $$1 = $$0.next();
         if (this.c.O().c(dhl.C)) {
            $$1.n();
         }

         if ($$1.d()) {
            $$0.remove();
            this.g();
         } else {
            $$1.o();
         }
      }

      if (this.e % 200 == 0) {
         this.g();
      }

      agj.a(this.c, this.b.values());
   }

   public static boolean a(crw $$0, crv $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bK() && $$0.gA() && $$0.ev() <= 2400 && $$0.dV().B_() == $$1.i().B_() : false;
   }

   @Nullable
   public crv a(aro $$0, jj $$1) {
      if ($$0.U_()) {
         return null;
      } else if (this.c.O().c(dhl.C)) {
         return null;
      } else {
         ecj $$2 = $$0.dV().B_();
         if (!$$2.c()) {
            return null;
         } else {
            List<chu> $$3 = this.c.A().c($$0x -> $$0x.a(axk.b), $$1, 64, cht.b.b).toList();
            int $$4 = 0;
            fcu $$5 = fcu.c;

            for (chu $$6 : $$3) {
               jj $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            jj $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = jj.a((kc)$$5);
            } else {
               $$8 = $$1;
            }

            crv $$10 = this.a($$0.y(), $$8);
            if (!$$10.j() && !this.b.containsKey($$10.t())) {
               this.b.put($$10.t(), $$10);
            }

            if (!$$10.j() || $$10.m() < $$10.l()) {
               $$10.a($$0);
            }

            this.g();
            return $$10;
         }
      }
   }

   private crv a(arn $$0, jj $$1) {
      crv $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new crv(this.b(), $$0, $$1);
   }

   public static crx a(arn $$0, tw $$1) {
      crx $$2 = new crx($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      uc $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tw $$5 = $$3.a($$4);
         crv $$6 = new crv($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public tw a(tw $$0, ju.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      uc $$2 = new uc();

      for (crv $$3 : this.b.values()) {
         tw $$4 = new tw();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(js<ecj> $$0) {
      return $$0.a(ech.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public crv a(jj $$0, int $$1) {
      crv $$2 = null;
      double $$3 = (double)$$1;

      for (crv $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
