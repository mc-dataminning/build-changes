import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deh extends cvz {
   public static final MapCodec<deh> a = b(deh::new);
   public static final djg b = djf.B;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   public deh(dio.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      if (!$$0.y_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csy $$0, hv $$1, csq $$2) {
      if (!$$0.B) {
         cbf $$3 = new cbf($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.s();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(csy $$0, hv $$1) {
      a($$0, $$1, null);
   }

   private static void a(csy $$0, hv $$1, @Nullable blv $$2) {
      if (!$$0.B) {
         cbf $$3 = new cbf($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dr(), $$3.dt(), $$3.dx(), arc.yB, ard.e, 1.0F, 1.0F);
         $$0.a($$2, dmz.I, $$1);
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      if (!$$6.a(cmk.op) && !$$6.a(cmk.tS)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, cwb.a.o(), 11);
         cmc $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cmk.op)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(arm.c.b($$7));
         return bjl.a($$1.B);
      }
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      if (!$$0.B) {
         hv $$4 = $$2.a();
         blf $$5 = $$3.w();
         if ($$3.bN() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof blv ? (blv)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(csq $$0) {
      return false;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }
}
