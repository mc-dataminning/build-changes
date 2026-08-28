import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cqg extends eta {
   private static final String a = "raids";
   private final Map<Integer, cqe> b = Maps.newHashMap();
   private final arq c;
   private int d;
   private int e;

   public static eta.a<cqg> a(arq $$0) {
      return new eta.a<>(() -> new cqg($$0), ($$1, $$2) -> a($$0, $$1), bax.l);
   }

   public cqg(arq $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public cqe a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<cqe> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         cqe $$1 = $$0.next();
         if (this.c.ac().b(dfb.B)) {
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

      agv.a(this.c, this.b.values());
   }

   public static boolean a(cqf $$0, cqe $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bN() && $$0.gI() && $$0.ex() <= 2400 && $$0.dY().D_() == $$1.i().D_() : false;
   }

   @Nullable
   public cqe a(arr $$0, jh $$1) {
      if ($$0.R_()) {
         return null;
      } else if (this.c.ac().b(dfb.B)) {
         return null;
      } else {
         dzj $$2 = $$0.dY().D_();
         if (!$$2.c()) {
            return null;
         } else {
            List<cgj> $$3 = this.c.y().c($$0x -> $$0x.a(axo.b), $$1, 64, cgi.b.b).toList();
            int $$4 = 0;
            ezr $$5 = ezr.c;

            for (cgj $$6 : $$3) {
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

            cqe $$10 = this.a($$0.B(), $$8);
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

   private cqe a(arq $$0, jh $$1) {
      cqe $$2 = $$0.d($$1);
      return $$2 != null ? $$2 : new cqe(this.b(), $$0, $$1);
   }

   public static cqg a(arq $$0, un $$1) {
      cqg $$2 = new cqg($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      ut $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         un $$5 = $$3.a($$4);
         cqe $$6 = new cqe($$0, $$5);
         $$2.b.put($$6.t(), $$6);
      }

      return $$2;
   }

   @Override
   public un a(un $$0, js.a $$1) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      ut $$2 = new ut();

      for (cqe $$3 : this.b.values()) {
         un $$4 = new un();
         $$3.a($$4);
         $$2.add($$4);
      }

      $$0.a("Raids", $$2);
      return $$0;
   }

   public static String a(jq<dzj> $$0) {
      return $$0.a(dzh.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public cqe a(jh $$0, int $$1) {
      cqe $$2 = null;
      double $$3 = (double)$$1;

      for (cqe $$4 : this.b.values()) {
         double $$5 = $$4.s().j($$0);
         if ($$4.u() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
