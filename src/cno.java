import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cno extends eql {
   private static final String a = "raids";
   private final Map<Integer, cnm> b = Maps.newHashMap();
   private final aqt c;
   private int d;
   private int e;

   public static eql.a<cno> a(aqt $$0) {
      return new eql.a<>(() -> new cno($$0), ($$1, $$2) -> a($$0, $$1), azs.l);
   }

   public cno(aqt $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cnm a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cnm> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cnm $$1 = $$0.next();
         if (this.c.ab().b(dbw.C)) {
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

      agi.a(this.c, this.b.values());
   }

   public static boolean a(cnn $$0, cnm $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bI() && $$0.gL() && $$0.ey() <= 2400 && $$0.dU().E_() == $$1.i().E_() : false;
   }

   @Nullable
   public cnm a(aqu $$0) {
      if ($$0.O_()) {
         return null;
      } else if (this.c.ab().b(dbw.C)) {
         return null;
      } else {
         dwu $$1 = $$0.dU().E_();
         if (!$$1.c()) {
            return null;
         } else {
            ir $$2 = $$0.du();
            List<cds> $$3 = this.c.y().c($$0x -> $$0x.a(awo.b), $$2, 64, cdr.b.b).toList();
            int $$4 = 0;
            ewu $$5 = ewu.b;

            for (cds $$6 : $$3) {
               ir $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            ir $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = ir.a($$5);
            } else {
               $$8 = $$2;
            }

            cnm $$10 = this.a($$0.B(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.t())) {
                  this.b.put($$10.t(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.e(brj.E);
               $$0.d.b(new adb($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cly)$$0);
               $$0.d.b(new adb($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(avz.aB);
                  an.J.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private cnm a(aqt $$0, ir $$1) {
      cnm $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cnm(this.b(), $$0, $$1);
   }

   public static cno a(aqt $$0, uk $$1) {
      cno $$2 = new cno($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      uq $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         uk $$5 = $$3.a($$4);
         cnm $$6 = new cnm($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public uk a(uk $$0, jc.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      uq $$2 = new uq();

      for (cnm $$3 : this.b.values()) {
         uk $$4 = new uk();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(ja<dwu> $$0) {
      return $$0.a(dws.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cnm a(ir $$0, int $$1) {
      cnm $$2 = null;
      double $$3 = (double)$$1;

      for (cnm $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
