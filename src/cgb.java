import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cgb extends efe {
   private static final String a = "raids";
   private final Map<Integer, cfz> b = Maps.newHashMap();
   private final amp c;
   private int d;
   private int e;

   public static efe.a<cgb> a(amp $$0) {
      return new efe.a<>(() -> new cgb($$0), $$1 -> a($$0, $$1), avg.l);
   }

   public cgb(amp $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cfz a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cfz> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cfz $$1 = $$0.next();
         if (this.c.Y().b(csu.B)) {
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

      acv.a(this.c, this.b.values());
   }

   public static boolean a(cga $$0, cfz $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bx() && $$0.gr() && $$0.el() <= 2400 && $$0.dM().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public cfz a(amq $$0) {
      if ($$0.P_()) {
         return null;
      } else if (this.c.Y().b(csu.B)) {
         return null;
      } else {
         dly $$1 = $$0.dM().E_();
         if (!$$1.c()) {
            return null;
         } else {
            hv $$2 = $$0.dm();
            List<bwx> $$3 = this.c.x().c($$0x -> $$0x.a(asb.b), $$2, 64, bww.b.b).toList();
            int $$4 = 0;
            elb $$5 = elb.b;

            for (bwx $$6 : $$3) {
               hv $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            hv $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = hv.a($$5);
            } else {
               $$8 = $$2;
            }

            cfz $$10 = this.a($$0.z(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bku.E);
               $$0.c.b(new zq($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cer)$$0);
               $$0.c.b(new zq($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(arm.aA);
                  am.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cfz a(amp $$0, hv $$1) {
      cfz $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new cfz(this.b(), $$0, $$1);
   }

   public static cgb a(amp $$0, sj $$1) {
      cgb $$2 = new cgb($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      sp $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         sj $$5 = $$3.a($$4);
         cfz $$6 = new cfz($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public sj a(sj $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      sp $$1 = new sp();

      for (cfz $$2 : this.b.values()) {
         sj $$3 = new sj();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(ie<dly> $$0) {
      return $$0.a(dlw.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cfz a(hv $$0, int $$1) {
      cfz $$2 = null;
      double $$3 = (double)$$1;

      for (cfz $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
