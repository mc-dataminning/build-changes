import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cqj extends eth {
   private static final String a = "raids";
   private final Map<Integer, cqh> b = Maps.newHashMap();
   private final arp c;
   private int d;
   private int e;

   public static eth.a<cqj> a(arp $$0) {
      return new eth.a<>(() -> new cqj($$0), ($$1, $$2) -> a($$0, $$1), baw.l);
   }

   public cqj(arp $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cqh a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cqh> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cqh $$1 = $$0.next();
         if (this.c.N().b(dfi.B)) {
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

      agt.a(this.c, this.b.values());
   }

   public static boolean a(cqi $$0, cqh $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bL() && $$0.gz() && $$0.et() <= 2400 && $$0.dV().F_() == $$1.i().F_() : false;
   }

   @Nullable
   public cqh a(arq $$0, jh $$1) {
      if ($$0.Y_()) {
         return null;
      } else if (this.c.N().b(dfi.B)) {
         return null;
      } else {
         dzq $$2 = $$0.dV().F_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cgm> $$3 = this.c.z().c($$0x -> $$0x.a(axn.b), $$1, 64, cgl.b.b).toList();
            int $$4 = 0;
            ezy $$5 = ezy.c;

            for (cgm $$6 : $$3) {
               jh $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            jh $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = jh.a((ka)$$5);
            } else {
               $$8 = $$1;
            }

            cqh $$10 = this.a($$0.y(), $$8);
            if (!$$10.j() && !this.b.containsKey($$10.t())) {
               this.b.put($$10.t(), $$10);
            }

            if (!$$10.j() || $$10.m() < $$10.l()) {
               $$10.a($$0);
            }

            this.c();
            return $$10;
         }
      }
   }

   private cqh a(arp $$0, jh $$1) {
      cqh $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cqh(this.b(), $$0, $$1);
   }

   public static cqj a(arp $$0, ul $$1) {
      cqj $$2 = new cqj($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ur $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ul $$5 = $$3.a($$4);
         cqh $$6 = new cqh($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ul a(ul $$0, js.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ur $$2 = new ur();

      for (cqh $$3 : this.b.values()) {
         ul $$4 = new ul();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jq<dzq> $$0) {
      return $$0.a(dzo.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cqh a(jh $$0, int $$1) {
      cqh $$2 = null;
      double $$3 = (double)$$1;

      for (cqh $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
