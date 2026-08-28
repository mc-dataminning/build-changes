import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class crd extends evc {
   private static final String a = "raids";
   private final Map<Integer, crb> b = Maps.newHashMap();
   private final arx c;
   private int d;
   private int e;

   public static evc.a<crd> a(arx $$0) {
      return new evc.a<>(() -> new crd($$0), ($$1, $$2) -> a($$0, $$1), bbi.l);
   }

   public crd(arx $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public crb a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<crb> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         crb $$1 = $$0.next();
         if (this.c.O().b(dgv.C)) {
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

      agy.a(this.c, this.b.values());
   }

   public static boolean a(crc $$0, crb $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bL() && $$0.gA() && $$0.eu() <= 2400 && $$0.dW().G_() == $$1.i().G_() : false;
   }

   @Nullable
   public crb a(ary $$0, jh $$1) {
      if ($$0.aa_()) {
         return null;
      } else if (this.c.O().b(dgv.C)) {
         return null;
      } else {
         ebj $$2 = $$0.dW().G_();
         if (!$$2.c()) {
            return null;
         } else {
            List<chc> $$3 = this.c.A().c($$0x -> $$0x.a(axv.b), $$1, 64, chb.b.b).toList();
            int $$4 = 0;
            fbr $$5 = fbr.c;

            for (chc $$6 : $$3) {
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

            crb $$10 = this.a($$0.y(), $$8);
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

   private crb a(arx $$0, jh $$1) {
      crb $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new crb(this.b(), $$0, $$1);
   }

   public static crd a(arx $$0, um $$1) {
      crd $$2 = new crd($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      us $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         um $$5 = $$3.a($$4);
         crb $$6 = new crb($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public um a(um $$0, js.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      us $$2 = new us();

      for (crb $$3 : this.b.values()) {
         um $$4 = new um();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jq<ebj> $$0) {
      return $$0.a(ebh.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public crb a(jh $$0, int $$1) {
      crb $$2 = null;
      double $$3 = (double)$$1;

      for (crb $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
