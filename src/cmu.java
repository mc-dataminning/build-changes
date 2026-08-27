import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cmu extends enh {
   private static final String a = "raids";
   private final Map<Integer, cms> b = Maps.newHashMap();
   private final aqh c;
   private int d;
   private int e;

   public static enh.a<cmu> a(aqh $$0) {
      return new enh.a<>(() -> new cmu($$0), ($$1, $$2) -> a($$0, $$1), azf.l);
   }

   public cmu(aqh $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cms a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cms> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cms $$1 = $$0.next();
         if (this.c.aa().b(czz.B)) {
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

      afw.a(this.c, this.b.values());
   }

   public static boolean a(cmt $$0, cms $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bB() && $$0.gC() && $$0.eo() <= 2400 && $$0.dN().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cms a(aqi $$0) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.aa().b(czz.B)) {
         return null;
      } else {
         dtz $$1 = $$0.dN().D_();
         if (!$$1.c()) {
            return null;
         } else {
            in $$2 = $$0.dn();
            List<cde> $$3 = this.c.y().c($$0x -> $$0x.a(awb.b), $$2, 64, cdd.b.b).toList();
            int $$4 = 0;
            etp $$5 = etp.b;

            for (cde $$6 : $$3) {
               in $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            in $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = in.a($$5);
            } else {
               $$8 = $$2;
            }

            cms $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.t())) {
                  this.b.put($$10.t(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(bqv.E);
               $$0.d.b(new acq($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((clh)$$0);
               $$0.d.b(new acq($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(avm.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cms a(aqh $$0, in $$1) {
      cms $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cms(this.b(), $$0, $$1);
   }

   public static cmu a(aqh $$0, ua $$1) {
      cmu $$2 = new cmu($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ug $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ua $$5 = $$3.a($$4);
         cms $$6 = new cms($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ua a(ua $$0, iy.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ug $$2 = new ug();

      for (cms $$3 : this.b.values()) {
         ua $$4 = new ua();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(iw<dtz> $$0) {
      return $$0.a(dtx.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cms a(in $$0, int $$1) {
      cms $$2 = null;
      double $$3 = (double)$$1;

      for (cms $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
