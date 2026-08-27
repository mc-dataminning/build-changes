import com.mojang.serialization.MapCodec;

public class dkk extends ddy {
   public static final MapCodec<dkk> h = b(dkk::new);
   public static final drz<it.a> i = drr.I;

   @Override
   public MapCodec<? extends dkk> a() {
      return h;
   }

   public dkk(dra.d $$0) {
      super($$0);
      this.k(this.n().a(i, it.a.b));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return b($$0, $$1);
   }

   public static drb b(drb $$0, dkl $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((it.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, it.a.c);
               case c:
                  return $$0.a(i, it.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(i);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
