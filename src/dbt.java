import com.mojang.serialization.MapCodec;

public class dbt extends dcv {
   public static final MapCodec<dbt> a = b(dbt::new);

   @Override
   public MapCodec<? extends dbt> a() {
      return a;
   }

   public dbt(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      if (!$$0.B) {
         im $$4 = $$2.a();
         $$0.a(null, $$4, auz.G, ava.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, auz.E, ava.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
