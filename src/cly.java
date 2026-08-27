import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cly extends emy {
   private static final String a = "raids";
   private final Map<Integer, clw> b = Maps.newHashMap();
   private final aqe c;
   private int d;
   private int e;

   public static emy.a<cly> a(aqe $$0) {
      return new emy.a<>(() -> new cly($$0), ($$1, $$2) -> a($$0, $$1), azc.l);
   }

   public cly(aqe $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public clw a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<clw> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         clw $$1 = $$0.next();
         if (this.c.aa().b(czq.B)) {
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

      afu.a(this.c, this.b.values());
   }

   public static boolean a(clx $$0, clw $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bB() && $$0.gC() && $$0.eo() <= 2400 && $$0.dN().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public clw a(aqf $$0) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.aa().b(czq.B)) {
         return null;
      } else {
         dtq $$1 = $$0.dN().D_();
         if (!$$1.c()) {
            return null;
         } else {
            im $$2 = $$0.dn();
            List<cci> $$3 = this.c.y().c($$0x -> $$0x.a(avy.b), $$2, 64, cch.b.b).toList();
            int $$4 = 0;
            etf $$5 = etf.b;

            for (cci $$6 : $$3) {
               im $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            im $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = im.a($$5);
            } else {
               $$8 = $$2;
            }

            clw $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.t())) {
                  this.b.put($$10.t(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bpz.E);
               $$0.d.b(new aco($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((ckl)$$0);
               $$0.d.b(new aco($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(avj.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private clw a(aqe $$0, im $$1) {
      clw $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new clw(this.b(), $$0, $$1);
   }

   public static cly a(aqe $$0, ty $$1) {
      cly $$2 = new cly($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ue $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ty $$5 = $$3.a($$4);
         clw $$6 = new clw($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ty a(ty $$0, ix.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ue $$2 = new ue();

      for (clw $$3 : this.b.values()) {
         ty $$4 = new ty();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(iv<dtq> $$0) {
      return $$0.a(dto.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public clw a(im $$0, int $$1) {
      clw $$2 = null;
      double $$3 = (double)$$1;

      for (clw $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
