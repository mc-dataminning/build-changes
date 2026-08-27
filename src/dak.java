import com.mojang.serialization.MapCodec;

public class dak extends cua {
   public static final MapCodec<dak> h = b(dak::new);
   public static final dgz<hx.a> i = dgr.I;

   @Override
   public MapCodec<? extends dak> a() {
      return h;
   }

   public dak(dga.d $$0) {
      super($$0);
      this.k(this.o().a(i, hx.a.b));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return b($$0, $$1);
   }

   public static dgb b(dgb $$0, dal $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((hx.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, hx.a.c);
               case c:
                  return $$0.a(i, hx.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(i);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
