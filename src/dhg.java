import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhg extends deg {
   public static final MapCodec<dhg> a = b(dhg::new);
   protected static final ewf b = deu.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<iz> c = iz.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(iz::i).toList();

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(drw.d $$0) {
      super($$0);
   }

   public static boolean a(dbt $$0, iz $$1, iz $$2) {
      return $$0.a_($$1.a((kd)$$2)).a(awl.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awl.cw);
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (iz $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               lj.s,
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
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return $$0.B ? a($$2, dpe.m, dpw::a) : null;
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bqp.c;
      }
   }

   @Nullable
   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      dpc $$3 = $$1.c_($$2);
      if ($$3 instanceof dpw) {
         xl $$4 = ((bqu)$$3).O_();
         return new bqz(($$2x, $$3x, $$4x) -> new cqj($$2x, $$3x, cqa.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
