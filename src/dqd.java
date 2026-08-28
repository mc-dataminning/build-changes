import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dqd extends dna implements dtn {
   public static final MapCodec<dqd> a = b(dqd::new);

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   protected dqd(ebp.d $$0) {
      super($$0);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eak($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.w, $$0.C ? eak::a : eak::b);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      dyo $$4 = $$1.c_($$2);
      if ($$4 instanceof eak) {
         int $$5 = ((eak)$$4).f();

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

            $$1.a(lz.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return dak.l;
   }

   @Override
   protected boolean a(ebq $$0, exz $$1) {
      return false;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof eak $$6 && !$$6.c()) {
         $$3.a(this, $$2);
         eak.c($$1, $$2, $$0, $$6);
      }
   }

   @Nullable
   @Override
   public eza a(asb $$0, bxe $$1, iw $$2) {
      if ($$0.c_($$2) instanceof eak $$4) {
         fgc $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof ctn
               ? new eza($$0, $$6, fgc.c, 0.0F, 0.0F, Set.of(), eza.c)
               : new eza($$0, $$6, fgc.c, 0.0F, 0.0F, byt.a(byt.l, byt.k), eza.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }
}
