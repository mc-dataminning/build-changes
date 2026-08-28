import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cny extends epq {
   private static final String a = "raids";
   private final Map<Integer, cnw> b = Maps.newHashMap();
   private final aqm c;
   private int d;
   private int e;

   public static epq.a<cny> a(aqm $$0) {
      return new epq.a<>(() -> new cny($$0), ($$1, $$2) -> a($$0, $$1), azo.l);
   }

   public cny(aqm $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cnw a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cnw> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cnw $$1 = $$0.next();
         if (this.c.ab().b(dcc.B)) {
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

      afy.a(this.c, this.b.values());
   }

   public static boolean a(cnx $$0, cnw $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bF() && $$0.gA() && $$0.eo() <= 2400 && $$0.dR().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cnw a(aqn $$0, ja $$1) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.ab().b(dcc.B)) {
         return null;
      } else {
         dwg $$2 = $$0.dR().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<ceh> $$3 = this.c.y().c($$0x -> $$0x.a(awh.b), $$1, 64, ceg.b.b).toList();
            int $$4 = 0;
            ewh $$5 = ewh.b;

            for (ceh $$6 : $$3) {
               ja $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            ja $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = ja.a($$5);
            } else {
               $$8 = $$1;
            }

            cnw $$10 = this.a($$0.A(), $$8);
            if (!$$10.j() && !this.b.containsKey($$10.t())) {
               this.b.put($$10.t(), $$10);
            }

            if (!$$10.j() || $$10.m() < $$10.l()) {
               $$10.a($$0);
            }

            this.c();
            return $$10;
         }
      }
   }

   private cnw a(aqm $$0, ja $$1) {
      cnw $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cnw(this.b(), $$0, $$1);
   }

   public static cny a(aqm $$0, tx $$1) {
      cny $$2 = new cny($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ud $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tx $$5 = $$3.a($$4);
         cnw $$6 = new cnw($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public tx a(tx $$0, jl.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ud $$2 = new ud();

      for (cnw $$3 : this.b.values()) {
         tx $$4 = new tx();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jj<dwg> $$0) {
      return $$0.a(dwe.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cnw a(ja $$0, int $$1) {
      cnw $$2 = null;
      double $$3 = (double)$$1;

      for (cnw $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
