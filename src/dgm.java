import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgm extends ddm {
   public static final MapCodec<dgm> a = b(dgm::new);
   protected static final evf b = dea.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<io> c = io.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(io::i).toList();

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   protected dgm(drc.d $$0) {
      super($$0);
   }

   public static boolean a(daz $$0, io $$1, io $$2) {
      return $$0.a_($$1.a((js)$$2)).a(avx.cv) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(avx.cw);
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
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
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? a($$2, dok.m, dpc::a) : null;
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bpw.b;
      }
   }

   @Nullable
   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      doi $$3 = $$1.c_($$2);
      if ($$3 instanceof dpc) {
         wx $$4 = ((bqb)$$3).O_();
         return new bqg(($$2x, $$3x, $$4x) -> new cpp($$2x, $$3x, cpg.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
