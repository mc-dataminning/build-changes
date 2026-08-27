import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ccu extends ebg {
   private static final String a = "raids";
   private final Map<Integer, ccs> b = Maps.newHashMap();
   private final aki c;
   private int d;
   private int e;

   public static ebg.a<ccu> a(aki $$0) {
      return new ebg.a<>(() -> new ccu($$0), $$1 -> a($$0, $$1), asq.l);
   }

   public ccu(aki $$0) {
      this.c = $$0;
      this.d = 1;
      this.c();
   }

   public ccs a(int $$0) {
      return this.b.get($$0);
   }

   public void a() {
      this.e++;
      Iterator<ccs> $$0 = this.b.values().iterator();

      while ($$0.hasNext()) {
         ccs $$1 = $$0.next();
         if (this.c.X().b(cpg.z)) {
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

      aau.a(this.c, this.b.values());
   }

   public static boolean a(cct $$0, ccs $$1) {
      return $$0 != null && $$1 != null && $$1.i() != null ? $$0.bv() && $$0.gm() && $$0.ej() <= 2400 && $$0.dK().x_() == $$1.i().x_() : false;
   }

   @Nullable
   public ccs a(akj $$0) {
      if ($$0.G_()) {
         return null;
      } else if (this.c.X().b(cpg.z)) {
         return null;
      } else {
         dih $$1 = $$0.dK().x_();
         if (!$$1.c()) {
            return null;
         } else {
            gv $$2 = $$0.dk();
            List<btx> $$3 = this.c.w().c($$0x -> $$0x.a(apt.b), $$2, 64, btw.b.b).toList();
            int $$4 = 0;
            ehf $$5 = ehf.b;

            for (btx $$6 : $$3) {
               gv $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               $$4++;
            }

            gv $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = gv.a($$5);
            } else {
               $$8 = $$2;
            }

            ccs $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bhv.E);
               $$0.c.b(new xr($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((cbl)$$0);
               $$0.c.b(new xr($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(ape.aA);
                  ai.I.a($$0);
               }
            }

            this.c();
            return $$10;
         }
      }
   }

   private ccs a(aki $$0, gv $$1) {
      ccs $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new ccs(this.b(), $$0, $$1);
   }

   public static ccu a(aki $$0, qs $$1) {
      ccu $$2 = new ccu($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      qy $$3 = $$1.c("Raids", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         qs $$5 = $$3.a($$4);
         ccs $$6 = new ccs($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public qs a(qs $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      qy $$1 = new qy();

      for (ccs $$2 : this.b.values()) {
         qs $$3 = new qs();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", $$1);
      return $$0;
   }

   public static String a(hf<dih> $$0) {
      return $$0.a(dif.c) ? "raids_end" : "raids";
   }

   private int b() {
      return ++this.d;
   }

   @Nullable
   public ccs a(gv $$0, int $$1) {
      ccs $$2 = null;
      double $$3 = (double)$$1;

      for (ccs $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
