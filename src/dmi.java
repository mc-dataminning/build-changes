import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dmo {
   public static final MapCodec<dmi> a = b(dmi::new);
   public static final ecc<jb> b = ebu.R;
   public static final ebv c = ebu.y;

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   public dmi(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1 instanceof ars $$5 && $$1.c_($$2) instanceof dxu $$6) {
         $$3.a($$6);
         $$3.a(awz.ar);
         cqn.a($$5, $$3, true);
      }

      return bur.a;
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      dyc $$4 = $$1.c_($$2);
      if ($$4 instanceof dxu) {
         ((dxu)$$4).k();
      }
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dxu($$0, $$1);
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.a($$1.c_($$2));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
