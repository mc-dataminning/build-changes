import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ciw extends eib {
   private static final String a = "raids";
   private final Map<Integer, ciu> b = Maps.newHashMap();
   private final aow c;
   private int d;
   private int e;

   public static eib.a<ciw> a(aow $$0) {
      return new eib.a<>(() -> new ciw($$0), $$1 -> a($$0, $$1), axo.l);
   }

   public ciw(aow $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public ciu a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<ciu> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         ciu $$1 = $$0.next();
         if (this.c.Z().b(cvn.B)) {
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

      aep.a(this.c, this.b.values());
   }

   public static boolean a(civ $$0, ciu $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gt() && $$0.em() <= 2400 && $$0.dM().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public ciu a(aox $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Z().b(cvn.B)) {
         return null;
      } else {
         dov $$1 = $$0.dM().E_();
         if (!$$1.c()) {
            return null;
         } else {
            hz $$2 = $$0.dm();
            List<bzm> $$3 = this.c.y().c($$0x -> $$0x.a(auk.b), $$2, 64, bzl.b.b).toList();
            int $$4 = 0;
            enz $$5 = enz.b;

            for (bzm $$6 : $$3) {
               hz $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            hz $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = hz.a($$5);
            } else {
               $$8 = $$2;
            }

            ciu $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bnf.E);
               $$0.d.b(new abj($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((chl)$$0);
               $$0.d.b(new abj($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(atv.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private ciu a(aow $$0, hz $$1) {
      ciu $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new ciu(this.b(), $$0, $$1);
   }

   public static ciw a(aow $$0, sw $$1) {
      ciw $$2 = new ciw($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      tc $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         sw $$5 = $$3.a($$4);
         ciu $$6 = new ciu($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public sw a(sw $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      tc $$1 = new tc();

      for (ciu $$2 : this.b.values()) {
         sw $$3 = new sw();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ij<dov> $$0) {
      return $$0.a(dot.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public ciu a(hz $$0, int $$1) {
      ciu $$2 = null;
      double $$3 = (double)$$1;

      for (ciu $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
