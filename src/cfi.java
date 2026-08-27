import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cfi extends eec {
   private static final String a = "raids";
   private final Map<Integer, cfg> b = Maps.newHashMap();
   private final ami c;
   private int d;
   private int e;

   public static eec.a<cfi> a(ami $$0) {
      return new eec.a<>(() -> new cfi($$0), $$1 -> a($$0, $$1), auw.l);
   }

   public cfi(ami $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cfg a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cfg> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cfg $$1 = $$0.next();
         if (this.c.Y().b(csb.B)) {
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

      aco.a(this.c, this.b.values());
   }

   public static boolean a(cfh $$0, cfg $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gs() && $$0.em() <= 2400 && $$0.dN().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public cfg a(amj $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Y().b(csb.B)) {
         return null;
      } else {
         dkw $$1 = $$0.dN().E_();
         if (!$$1.c()) {
            return null;
         } else {
            hx $$2 = $$0.dn();
            List<bwl> $$3 = this.c.x().c($$0x -> $$0x.a(aru.b), $$2, 64, bwk.b.b).toList();
            int $$4 = 0;
            ejz $$5 = ejz.b;

            for (bwl $$6 : $$3) {
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

            cfg $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bkk.E);
               $$0.c.b(new zj($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cdz)$$0);
               $$0.c.b(new zj($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(arf.aA);
                  al.I.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cfg a(ami $$0, hx $$1) {
      cfg $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new cfg(this.b(), $$0, $$1);
   }

   public static cfi a(ami $$0, sd $$1) {
      cfi $$2 = new cfi($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      sj $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         sd $$5 = $$3.a($$4);
         cfg $$6 = new cfg($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public sd a(sd $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      sj $$1 = new sj();

      for (cfg $$2 : this.b.values()) {
         sd $$3 = new sd();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ig<dkw> $$0) {
      return $$0.a(dku.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cfg a(hx $$0, int $$1) {
      cfg $$2 = null;
      double $$3 = (double)$$1;

      for (cfg $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
