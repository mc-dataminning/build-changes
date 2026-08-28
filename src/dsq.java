import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsq extends dno implements duz {
   public static final MapCodec<dsq> a = b(dsq::new);
   public static final ech b = ecg.I;

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   protected dsq(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(ebq $$0, ebq $$1, jc $$2) {
      return $$1.a(dnq.ag) && $$2.o() == jc.a.b;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eyb.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }
}
