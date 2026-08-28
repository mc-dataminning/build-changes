import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class crg extends evi {
   private static final String a = "raids";
   private final Map<Integer, cre> b = Maps.newHashMap();
   private final ard c;
   private int d;
   private int e;

   public static evi.a<crg> a(ard $$0) {
      return new evi.a<>(() -> new crg($$0), ($$1, $$2) -> a($$0, $$1), bam.l);
   }

   public crg(ard $$0) {
      this.c = $$0;
      this.d = 1;
      this.g();
   }

   public cre a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cre> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cre $$1 = $$0.next();
         if (this.c.O().b(dgv.C)) {
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

      agc.a(this.c, this.b.values());
   }

   public static boolean a(crf $$0, cre $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bJ() && $$0.gC() && $$0.eu() <= 2400 && $$0.dU().B_() == $$1.i().B_() : false;
   }

   @Nullable
   public cre a(are $$0, ji $$1) {
      if ($$0.U_()) {
         return null;
      } else if (this.c.O().b(dgv.C)) {
         return null;
      } else {
         ebm $$2 = $$0.dU().B_();
         if (!$$2.c()) {
            return null;
         } else {
            List<chd> $$3 = this.c.A().c($$0x -> $$0x.a(axa.b), $$1, 64, chc.b.b).toList();
            int $$4 = 0;
            fbx $$5 = fbx.c;

            for (chd $$6 : $$3) {
               ji $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            ji $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = ji.a((kb)$$5);
            } else {
               $$8 = $$1;
            }

            cre $$10 = this.a($$0.y(), $$8);
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

   private cre a(ard $$0, ji $$1) {
      cre $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cre(this.b(), $$0, $$1);
   }

   public static crg a(ard $$0, tq $$1) {
      crg $$2 = new crg($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      tw $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tq $$5 = $$3.a($$4);
         cre $$6 = new cre($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      tw $$2 = new tw();

      for (cre $$3 : this.b.values()) {
         tq $$4 = new tq();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jr<ebm> $$0) {
      return $$0.a(ebk.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cre a(ji $$0, int $$1) {
      cre $$2 = null;
      double $$3 = (double)$$1;

      for (cre $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
