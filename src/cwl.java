import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwl extends ctm {
   public static final MapCodec<cwl> a = b(cwl::new);

   @Override
   public MapCodec<cwl> a() {
      return a;
   }

   protected cwl(dga.d $$0) {
      super($$0);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.v, $$0.B ? dfl::a : dfl::b);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      ddx $$4 = $$1.c_($$2);
      if ($$4 instanceof dfl) {
         int $$5 = ((dfl)$$4).g();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(js.X, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return ckj.b;
   }

   @Override
   public boolean a(dgb $$0, ebd $$1) {
      return false;
   }
}
