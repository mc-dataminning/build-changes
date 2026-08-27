import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dex extends cwp {
   public static final MapCodec<dex> a = b(dex::new);
   public static final djx b = djw.B;

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(djf.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cto $$0, hx $$1, ctg $$2) {
      if (!$$0.B) {
         cbu $$3 = new cbu($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cto $$0, hx $$1) {
      a($$0, $$1, null);
   }

   private static void a(cto $$0, hx $$1, @Nullable bmk $$2) {
      if (!$$0.B) {
         cbu $$3 = new cbu($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), arr.yB, ars.e, 1.0F, 1.0F);
         $$0.a($$2, dnq.I, $$1);
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      if (!$$6.a(cna.op) && !$$6.a(cna.tS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cwr.a.o(), 11);
         cms $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cna.op)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(asb.c.b($$7));
         return bka.a($$1.B);
      }
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         blu $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bmk ? (bmk)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(ctg $$0) {
      return false;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }
}
