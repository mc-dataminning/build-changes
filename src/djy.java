import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class djy extends dgy {
   public static final MapCodec<djy> a = b(djy::new);
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<jf> c = jf.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(jf::j).toList();

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   protected djy(dur.d $$0) {
      super($$0);
   }

   public static boolean a(dej $$0, jf $$1, jf $$2) {
      return $$0.a_($$1.a((kj)$$2)).a(awv.cw) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awv.cx);
   }

   @Override
   protected boolean g_(dus $$0) {
      return true;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (jf $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lo.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? a($$2, drx.m, dsq::a) : null;
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
      }

      return brs.a;
   }

   @Nullable
   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      drv $$3 = $$1.c_($$2);
      if ($$3 instanceof dsq) {
         xe $$4 = ((brv)$$3).R_();
         return new bsa(($$2x, $$3x, $$4x) -> new crv($$2x, $$3x, crm.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
