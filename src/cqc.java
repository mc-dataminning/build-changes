import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cqc extends esw {
   private static final String a = "raids";
   private final Map<Integer, cqa> b = Maps.newHashMap();
   private final arn c;
   private int d;
   private int e;

   public static esw.a<cqc> a(arn $$0) {
      return new esw.a<>(() -> new cqc($$0), ($$1, $$2) -> a($$0, $$1), bat.l);
   }

   public cqc(arn $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cqa a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cqa> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cqa $$1 = $$0.next();
         if (this.c.ac().b(dex.B)) {
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

      ags.a(this.c, this.b.values());
   }

   public static boolean a(cqb $$0, cqa $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bM() && $$0.gH() && $$0.ew() <= 2400 && $$0.dX().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cqa a(aro $$0, jh $$1) {
      if ($$0.R_()) {
         return null;
      } else if (this.c.ac().b(dex.B)) {
         return null;
      } else {
         dzf $$2 = $$0.dX().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cgf> $$3 = this.c.y().c($$0x -> $$0x.a(axl.b), $$1, 64, cge.b.b).toList();
            int $$4 = 0;
            ezn $$5 = ezn.c;

            for (cgf $$6 : $$3) {
               jh $$7 = $$6.g();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            jh $$8;
            if ($$4 > 0) {
               $$5 = $$5.c(1.0 / (double)$$4);
               $$8 = jh.a((ka)$$5);
            } else {
               $$8 = $$1;
            }

            cqa $$10 = this.a($$0.B(), $$8);
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

   private cqa a(arn $$0, jh $$1) {
      cqa $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cqa(this.b(), $$0, $$1);
   }

   public static cqc a(arn $$0, uk $$1) {
      cqc $$2 = new cqc($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      uq $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         uk $$5 = $$3.a($$4);
         cqa $$6 = new cqa($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public uk a(uk $$0, js.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      uq $$2 = new uq();

      for (cqa $$3 : this.b.values()) {
         uk $$4 = new uk();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jq<dzf> $$0) {
      return $$0.a(dzd.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cqa a(jh $$0, int $$1) {
      cqa $$2 = null;
      double $$3 = (double)$$1;

      for (cqa $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
