import com.mojang.serialization.MapCodec;

public class duf extends dme implements dlx {
   public static final MapCodec<duf> a = b(duf::new);
   private static final feq b = dlu.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<duf> a() {
      return a;
   }

   protected duf(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      dod.a($$0, o($$3).m(), $$2, 2);
   }

   private static dod o(dzo $$0) {
      return (dod)($$0.a(dlw.bB) ? dlw.jg : dlw.jf);
   }
}
