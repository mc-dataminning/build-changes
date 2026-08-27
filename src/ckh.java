import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ckh extends eju {
   private static final String a = "raids";
   private final Map<Integer, ckf> b = Maps.newHashMap();
   private final apf c;
   private int d;
   private int e;

   public static eju.a<ckh> a(apf $$0) {
      return new eju.a<>(() -> new ckh($$0), ($$1, $$2) -> a($$0, $$1), ayc.l);
   }

   public ckh(apf $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public ckf a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<ckf> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         ckf $$1 = $$0.next();
         if (this.c.Z().b(cwx.B)) {
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

      aew.a(this.c, this.b.values());
   }

   public static boolean a(ckg $$0, ckf $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bA() && $$0.gA() && $$0.en() <= 2400 && $$0.dM().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public ckf a(apg $$0) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.Z().b(cwx.B)) {
         return null;
      } else {
         dqo $$1 = $$0.dM().D_();
         if (!$$1.c()) {
            return null;
         } else {
            ib $$2 = $$0.dm();
            List<cat> $$3 = this.c.y().c($$0x -> $$0x.a(auy.b), $$2, 64, cas.b.b).toList();
            int $$4 = 0;
            ept $$5 = ept.b;

            for (cat $$6 : $$3) {
               ib $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            ib $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = ib.a($$5);
            } else {
               $$8 = $$2;
            }

            ckf $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bom.E);
               $$0.d.b(new abq($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((ciu)$$0);
               $$0.d.b(new abq($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(aui.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private ckf a(apf $$0, ib $$1) {
      ckf $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new ckf(this.b(), $$0, $$1);
   }

   public static ckh a(apf $$0, ta $$1) {
      ckh $$2 = new ckh($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      tg $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ta $$5 = $$3.a($$4);
         ckf $$6 = new ckf($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public ta a(ta $$0, in.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      tg $$2 = new tg();

      for (ckf $$3 : this.b.values()) {
         ta $$4 = new ta();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(il<dqo> $$0) {
      return $$0.a(dqm.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public ckf a(ib $$0, int $$1) {
      ckf $$2 = null;
      double $$3 = (double)$$1;

      for (ckf $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
