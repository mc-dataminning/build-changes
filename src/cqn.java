import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cqn extends eum {
   private static final String a = "raids";
   private final Map<Integer, cql> b = Maps.newHashMap();
   private final ard c;
   private int d;
   private int e;

   public static eum.a<cqn> a(ard $$0) {
      return new eum.a<>(() -> new cqn($$0), ($$1, $$2) -> a($$0, $$1), ban.l);
   }

   public cqn(ard $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cql a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cql> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cql $$1 = $$0.next();
         if (this.c.O().b(dgf.C)) {
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

      agd.a(this.c, this.b.values());
   }

   public static boolean a(cqm $$0, cql $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bL() && $$0.gE() && $$0.et() <= 2400 && $$0.dV().G_() == $$1.i().G_() : false;
   }

   @Nullable
   public cql a(are $$0, ji $$1) {
      if ($$0.Z_()) {
         return null;
      } else if (this.c.O().b(dgf.C)) {
         return null;
      } else {
         eat $$2 = $$0.dV().G_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cgn> $$3 = this.c.A().c($$0x -> $$0x.a(axa.b), $$1, 64, cgm.b.b).toList();
            int $$4 = 0;
            fbb $$5 = fbb.c;

            for (cgn $$6 : $$3) {
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

            cql $$10 = this.a($$0.y(), $$8);
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

   private cql a(ard $$0, ji $$1) {
      cql $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cql(this.b(), $$0, $$1);
   }

   public static cqn a(ard $$0, tq $$1) {
      cqn $$2 = new cqn($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      tw $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tq $$5 = $$3.a($$4);
         cql $$6 = new cql($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      tw $$2 = new tw();

      for (cql $$3 : this.b.values()) {
         tq $$4 = new tq();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jr<eat> $$0) {
      return $$0.a(ear.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cql a(ji $$0, int $$1) {
      cql $$2 = null;
      double $$3 = (double)$$1;

      for (cql $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
