import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cha extends ege {
   private static final String a = "raids";
   private final Map<Integer, cgy> b = Maps.newHashMap();
   private final ane c;
   private int d;
   private int e;

   public static ege.a<cha> a(ane $$0) {
      return new ege.a<>(() -> new cha($$0), $$1 -> a($$0, $$1), avx.l);
   }

   public cha(ane $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cgy a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cgy> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cgy $$1 = $$0.next();
         if (this.c.Z().b(ctt.B)) {
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

      adj.a(this.c, this.b.values());
   }

   public static boolean a(cgz $$0, cgy $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gs() && $$0.el() <= 2400 && $$0.dL().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public cgy a(anf $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Z().b(ctt.B)) {
         return null;
      } else {
         dmy $$1 = $$0.dL().E_();
         if (!$$1.c()) {
            return null;
         } else {
            hx $$2 = $$0.dl();
            List<bxr> $$3 = this.c.y().c($$0x -> $$0x.a(ass.b), $$2, 64, bxq.b.b).toList();
            int $$4 = 0;
            emc $$5 = emc.b;

            for (bxr $$6 : $$3) {
               hx $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            hx $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = hx.a($$5);
            } else {
               $$8 = $$2;
            }

            cgy $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bll.E);
               $$0.c.b(new aad($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cfq)$$0);
               $$0.c.b(new aad($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(asd.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cgy a(ane $$0, hx $$1) {
      cgy $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cgy(this.b(), $$0, $$1);
   }

   public static cha a(ane $$0, so $$1) {
      cha $$2 = new cha($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      su $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         so $$5 = $$3.a($$4);
         cgy $$6 = new cgy($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public so a(so $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      su $$1 = new su();

      for (cgy $$2 : this.b.values()) {
         so $$3 = new so();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ih<dmy> $$0) {
      return $$0.a(dmw.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cgy a(hx $$0, int $$1) {
      cgy $$2 = null;
      double $$3 = (double)$$1;

      for (cgy $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
