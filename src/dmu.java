import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmu extends dna {
   public static final MapCodec<dmu> a = b(dmu::new);
   public static final eco<jc> b = ecg.R;
   public static final ech c = ecg.y;

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$1 instanceof asb $$5 && $$1.c_($$2) instanceof dyg $$6) {
         $$3.a($$6);
         $$3.a(axi.ar);
         cqy.a($$5, $$3, true);
      }

      return bvc.a;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      dyo $$4 = $$1.c_($$2);
      if ($$4 instanceof dyg) {
         ((dyg)$$4).k();
      }
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dyg($$0, $$1);
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.a($$1.c_($$2));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
