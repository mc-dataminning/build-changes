import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class csj extends exh {
   private static final String a = "raids";
   private final Map<Integer, csh> b = Maps.newHashMap();
   private final aro c;
   private int d;
   private int e;

   public static exh.a<csj> a(aro $$0) {
      return new exh.a<>(() -> new csj($$0), ($$1, $$2) -> a($$0, $$1), baz.l);
   }

   public csj(aro $$0) {
      this.c = $$0;
      this.d = 1;
      this.g();
   }

   public csh a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<csh> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         csh $$1 = $$0.next();
         if (this.c.O().c(dil.C)) {
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

      agk.a(this.c, this.b.values());
   }

   public static boolean a(csi $$0, csh $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bK() && $$0.gA() && $$0.ev() <= 2400 && $$0.dV().B_() == $$1.i().B_() : false;
   }

   @Nullable
   public csh a(arp $$0, iu $$1) {
      if ($$0.U_()) {
         return null;
      } else if (this.c.O().c(dil.C)) {
         return null;
      } else {
         edl $$2 = $$0.dV().B_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cic> $$3 = this.c.A().c($$0x -> $$0x.a(axk.b), $$1, 64, cib.b.b).toList();
            int $$4 = 0;
            fdw $$5 = fdw.c;

            for (cic $$6 : $$3) {
               iu $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            iu $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = iu.a((jo)$$5);
            } else {
               $$8 = $$1;
            }

            csh $$10 = this.a($$0.y(), $$8);
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

   private csh a(aro $$0, iu $$1) {
      csh $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new csh(this.b(), $$0, $$1);
   }

   public static csj a(aro $$0, tx $$1) {
      csj $$2 = new csj($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ud $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tx $$5 = $$3.a($$4);
         csh $$6 = new csh($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public tx a(tx $$0, jg.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ud $$2 = new ud();

      for (csh $$3 : this.b.values()) {
         tx $$4 = new tx();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(je<edl> $$0) {
      return $$0.a(edj.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public csh a(iu $$0, int $$1) {
      csh $$2 = null;
      double $$3 = (double)$$1;

      for (csh $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
