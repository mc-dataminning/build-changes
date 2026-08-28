import com.mojang.serialization.MapCodec;

public class dfw extends dje {
   public static final MapCodec<dfw> a = b(dfw::new);

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   public dfw(drw.d $$0) {
      super($$0);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         iz $$4 = $$2.d();
         drx $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), je.b)) {
            ayy.a($$1, $$2, $$3, lj.H);
         }
      }
   }
}
