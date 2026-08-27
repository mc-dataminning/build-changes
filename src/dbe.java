import com.mojang.serialization.MapCodec;

public class dbe extends cut {
   public static final MapCodec<dbe> h = b(dbe::new);
   public static final dhu<hx.a> i = dhm.I;

   @Override
   public MapCodec<? extends dbe> a() {
      return h;
   }

   public dbe(dgv.d $$0) {
      super($$0);
      this.k(this.o().a(i, hx.a.b));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return b($$0, $$1);
   }

   public static dgw b(dgw $$0, dbf $$1) {
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
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(i);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
