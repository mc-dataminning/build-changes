import com.mojang.serialization.MapCodec;

public class czd extends cuj {
   public static final MapCodec<czd> a = b(czd::new);
   protected static final eiy b = cua.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<czd> a() {
      return a;
   }

   public czd(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(aqs.aK) || $$0.a(cuc.dX) || super.d($$0, $$1, $$2);
   }
}
