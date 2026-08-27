import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cnl extends eod {
   private static final String a = "raids";
   private final Map<Integer, cnj> b = Maps.newHashMap();
   private final aqn c;
   private int d;
   private int e;

   public static eod.a<cnl> a(aqn $$0) {
      return new eod.a<>(() -> new cnl($$0), ($$1, $$2) -> a($$0, $$1), azl.l);
   }

   public cnl(aqn $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cnj a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cnj> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cnj $$1 = $$0.next();
         if (this.c.aa().b(dav.B)) {
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

      agb.a(this.c, this.b.values());
   }

   public static boolean a(cnk $$0, cnj $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bD() && $$0.gC() && $$0.eq() <= 2400 && $$0.dP().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cnj a(aqo $$0, io $$1) {
      if ($$0.N_()) {
         return null;
      } else if (this.c.aa().b(dav.B)) {
         return null;
      } else {
         duv $$2 = $$0.dP().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cdv> $$3 = this.c.y().c($$0x -> $$0x.a(awh.b), $$1, 64, cdu.b.b).toList();
            int $$4 = 0;
            eum $$5 = eum.b;

            for (cdv $$6 : $$3) {
               io $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            io $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = io.a($$5);
            } else {
               $$8 = $$1;
            }

            cnj $$10 = this.a($$0.z(), $$8);
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

   private cnj a(aqn $$0, io $$1) {
      cnj $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cnj(this.b(), $$0, $$1);
   }

   public static cnl a(aqn $$0, ud $$1) {
      cnl $$2 = new cnl($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      uj $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ud $$5 = $$3.a($$4);
         cnj $$6 = new cnj($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public ud a(ud $$0, iz.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      uj $$2 = new uj();

      for (cnj $$3 : this.b.values()) {
         ud $$4 = new ud();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(ix<duv> $$0) {
      return $$0.a(dut.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cnj a(io $$0, int $$1) {
      cnj $$2 = null;
      double $$3 = (double)$$1;

      for (cnj $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
