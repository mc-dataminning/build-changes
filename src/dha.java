import com.mojang.serialization.MapCodec;

public class dha extends dki {
   public static final MapCodec<dha> a = b(dha::new);

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jd $$4 = $$2.e();
         dtc $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ji.b)) {
            ays.a($$1, $$2, $$3, lm.H);
         }
      }
   }
}
