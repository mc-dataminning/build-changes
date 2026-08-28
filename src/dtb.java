import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtb extends dlm implements dtj {
   public static final MapCodec<dtb> a = b(dtb::new);
   public static final eaq b = eap.C;
   public static final eaq c = eap.I;
   public static final eaq d = eap.e;
   private static final ffc f = dma.b(16.0, 0.0, 8.0);
   public static final double e = f.c(ja.a.b);

   @Override
   public MapCodec<dtb> a() {
      return a;
   }

   public dtb(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bwd $$3) {
      if ($$0 instanceof arq $$4) {
         arr $$5 = dyj.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dwz.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dwz.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return f;
   }

   @Override
   protected ffc d_(dzz $$0) {
      return f;
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyj($$0, $$1);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ewh.c));
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(c) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, cyy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btd.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return !$$0.C ? dlm.a($$2, dwz.M, ($$0x, $$1x, $$2x, $$3) -> efi.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }
}
