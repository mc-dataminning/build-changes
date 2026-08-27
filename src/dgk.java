import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgk extends ddk {
   public static final MapCodec<dgk> a = b(dgk::new);
   protected static final evd b = ddy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<io> c = io.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(io::i).toList();

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   protected dgk(dra.d $$0) {
      super($$0);
   }

   public static boolean a(dax $$0, io $$1, io $$2) {
      return $$0.a_($$1.a((js)$$2)).a(avw.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avw.cw);
   }

   @Override
   protected boolean f_(drb $$0) {
      return true;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (io $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ky.s,
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
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? a($$2, doi.m, dpa::a) : null;
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bpu.b;
      }
   }

   @Nullable
   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      dog $$3 = $$1.c_($$2);
      if ($$3 instanceof dpa) {
         wx $$4 = ((bpz)$$3).O_();
         return new bqe(($$2x, $$3x, $$4x) -> new cpn($$2x, $$3x, cpe.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
