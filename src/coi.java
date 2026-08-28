import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class coi extends eqf {
   private static final String a = "raids";
   private final Map<Integer, cog> b = Maps.newHashMap();
   private final aqt c;
   private int d;
   private int e;

   public static eqf.a<coi> a(aqt $$0) {
      return new eqf.a<>(() -> new coi($$0), ($$1, $$2) -> a($$0, $$1), azv.l);
   }

   public coi(aqt $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cog a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cog> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cog $$1 = $$0.next();
         if (this.c.ab().b(dcq.B)) {
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

      age.a(this.c, this.b.values());
   }

   public static boolean a(coh $$0, cog $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bE() && $$0.gz() && $$0.en() <= 2400 && $$0.dQ().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cog a(aqu $$0, jd $$1) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.ab().b(dcq.B)) {
         return null;
      } else {
         dwv $$2 = $$0.dQ().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cer> $$3 = this.c.y().c($$0x -> $$0x.a(awo.b), $$1, 64, ceq.b.b).toList();
            int $$4 = 0;
            eww $$5 = eww.b;

            for (cer $$6 : $$3) {
               jd $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            jd $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = jd.a((jw)$$5);
            } else {
               $$8 = $$1;
            }

            cog $$10 = this.a($$0.A(), $$8);
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

   private cog a(aqt $$0, jd $$1) {
      cog $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cog(this.b(), $$0, $$1);
   }

   public static coi a(aqt $$0, ua $$1) {
      coi $$2 = new coi($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ug $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ua $$5 = $$3.a($$4);
         cog $$6 = new cog($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ua a(ua $$0, jo.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ug $$2 = new ug();

      for (cog $$3 : this.b.values()) {
         ua $$4 = new ua();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jm<dwv> $$0) {
      return $$0.a(dwt.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cog a(jd $$0, int $$1) {
      cog $$2 = null;
      double $$3 = (double)$$1;

      for (cog $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
