import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class col extends epd {
   private static final String a = "raids";
   private final Map<Integer, coj> b = Maps.newHashMap();
   private final arf c;
   private int d;
   private int e;

   public static epd.a<col> a(arf $$0) {
      return new epd.a<>(() -> new col($$0), ($$1, $$2) -> a($$0, $$1), bag.l);
   }

   public col(arf $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public coj a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<coj> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         coj $$1 = $$0.next();
         if (this.c.ab().b(dbv.B)) {
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

      agt.a(this.c, this.b.values());
   }

   public static boolean a(cok $$0, coj $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bD() && $$0.gD() && $$0.eq() <= 2400 && $$0.dP().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public coj a(arg $$0, iz $$1) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.ab().b(dbv.B)) {
         return null;
      } else {
         dvv $$2 = $$0.dP().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cev> $$3 = this.c.y().c($$0x -> $$0x.a(axa.b), $$1, 64, ceu.b.b).toList();
            int $$4 = 0;
            evs $$5 = evs.b;

            for (cev $$6 : $$3) {
               iz $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            iz $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = iz.a($$5);
            } else {
               $$8 = $$1;
            }

            coj $$10 = this.a($$0.z(), $$8);
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

   private coj a(arf $$0, iz $$1) {
      coj $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new coj(this.b(), $$0, $$1);
   }

   public static col a(arf $$0, us $$1) {
      col $$2 = new col($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      uy $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         us $$5 = $$3.a($$4);
         coj $$6 = new coj($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public us a(us $$0, jk.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      uy $$2 = new uy();

      for (coj $$3 : this.b.values()) {
         us $$4 = new us();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(ji<dvv> $$0) {
      return $$0.a(dvt.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public coj a(iz $$0, int $$1) {
      coj $$2 = null;
      double $$3 = (double)$$1;

      for (coj $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
