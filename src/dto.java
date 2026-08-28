import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dto extends dly implements dtx {
   public static final MapCodec<dto> a = b(dto::new);
   public static final ebf b = ebe.C;
   public static final ebf c = ebe.I;
   public static final ebf d = ebe.e;
   private static final ffr f = dmm.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jb.a.b);

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   public dto(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bwi $$3) {
      if ($$0 instanceof arq $$4) {
         arr $$5 = dyy.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dxo.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dxo.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return f;
   }

   @Override
   protected ffr d_(eao $$0) {
      return f;
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Nullable
   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyy($$0, $$1);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eww.c, eww.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eww.c));
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(c) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, czk $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bti.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return !$$0.C ? dly.a($$2, dxo.M, ($$0x, $$1x, $$2x, $$3) -> efx.c.a($$0x, $$3.x(), $$3.gt())) : null;
   }
}
