import com.mojang.serialization.MapCodec;

public class drb extends dkm {
   public static final MapCodec<drb> h = b(drb::new);
   public static final dys<jm.a> i = dyl.J;

   @Override
   public MapCodec<? extends drb> a() {
      return h;
   }

   public drb(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(i, jm.a.b));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return b($$0, $$1);
   }

   public static dxv b(dxv $$0, drc $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(i)) {
               case a:
                  return $$0.b(i, jm.a.c);
               case c:
                  return $$0.b(i, jm.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(i);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(i, $$0.k().o());
   }
}
