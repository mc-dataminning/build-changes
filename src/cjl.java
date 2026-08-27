import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cjl extends eiw {
   private static final String a = "raids";
   private final Map<Integer, cjj> b = Maps.newHashMap();
   private final apa c;
   private int d;
   private int e;

   public static eiw.a<cjl> a(apa $$0) {
      return new eiw.a<>(() -> new cjl($$0), ($$1, $$2) -> a($$0, $$1), axs.l);
   }

   public cjl(apa $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cjj a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cjj> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cjj $$1 = $$0.next();
         if (this.c.Z().b(cwa.B)) {
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

      aes.a(this.c, this.b.values());
   }

   public static boolean a(cjk $$0, cjj $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gy() && $$0.ek() <= 2400 && $$0.dJ().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public cjj a(apb $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Z().b(cwa.B)) {
         return null;
      } else {
         dpq $$1 = $$0.dJ().E_();
         if (!$$1.c()) {
            return null;
         } else {
            ib $$2 = $$0.dj();
            List<cab> $$3 = this.c.y().c($$0x -> $$0x.a(auo.b), $$2, 64, caa.b.b).toList();
            int $$4 = 0;
            eov $$5 = eov.b;

            for (cab $$6 : $$3) {
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

            cjj $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bnu.E);
               $$0.d.b(new abm($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cia)$$0);
               $$0.d.b(new abm($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(atz.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cjj a(apa $$0, ib $$1) {
      cjj $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cjj(this.b(), $$0, $$1);
   }

   public static cjl a(apa $$0, sy $$1) {
      cjl $$2 = new cjl($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      te $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         sy $$5 = $$3.a($$4);
         cjj $$6 = new cjj($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public sy a(sy $$0, in.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      te $$2 = new te();

      for (cjj $$3 : this.b.values()) {
         sy $$4 = new sy();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(il<dpq> $$0) {
      return $$0.a(dpo.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cjj a(ib $$0, int $$1) {
      cjj $$2 = null;
      double $$3 = (double)$$1;

      for (cjj $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
