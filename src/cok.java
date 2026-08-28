import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cok extends eqj {
   private static final String a = "raids";
   private final Map<Integer, coi> b = Maps.newHashMap();
   private final aqu c;
   private int d;
   private int e;

   public static eqj.a<cok> a(aqu $$0) {
      return new eqj.a<>(() -> new cok($$0), ($$1, $$2) -> a($$0, $$1), azw.l);
   }

   public cok(aqu $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public coi a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<coi> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         coi $$1 = $$0.next();
         if (this.c.ab().b(dcs.B)) {
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

      agf.a(this.c, this.b.values());
   }

   public static boolean a(coj $$0, coi $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bE() && $$0.gy() && $$0.en() <= 2400 && $$0.dP().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public coi a(aqv $$0, jd $$1) {
      if ($$0.R_()) {
         return null;
      } else if (this.c.ab().b(dcs.B)) {
         return null;
      } else {
         dwy $$2 = $$0.dP().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cet> $$3 = this.c.y().c($$0x -> $$0x.a(awp.b), $$1, 64, ces.b.b).toList();
            int $$4 = 0;
            exa $$5 = exa.b;

            for (cet $$6 : $$3) {
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

            coi $$10 = this.a($$0.A(), $$8);
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

   private coi a(aqu $$0, jd $$1) {
      coi $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new coi(this.b(), $$0, $$1);
   }

   public static cok a(aqu $$0, ub $$1) {
      cok $$2 = new cok($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      uh $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ub $$5 = $$3.a($$4);
         coi $$6 = new coi($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ub a(ub $$0, jo.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      uh $$2 = new uh();

      for (coi $$3 : this.b.values()) {
         ub $$4 = new ub();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jm<dwy> $$0) {
      return $$0.a(dww.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public coi a(jd $$0, int $$1) {
      coi $$2 = null;
      double $$3 = (double)$$1;

      for (coi $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
