import com.mojang.serialization.MapCodec;

public class dga extends dji {
   public static final MapCodec<dga> a = b(dga::new);

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dga(dsa.d $$0) {
      super($$0);
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         iz $$4 = $$2.d();
         dsb $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), je.b)) {
            azc.a($$1, $$2, $$3, li.H);
         }
      }
   }
}
