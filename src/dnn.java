import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnn extends dlm implements dtj {
   public static final MapCodec<dnn> a = b(dnn::new);
   public static final eaq b = eap.I;
   private static final ffc c = dma.a(6.0);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.A, $$0.C ? dxk::a : dxk::b);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axh.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
