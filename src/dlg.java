import com.mojang.serialization.MapCodec;

public class dlg extends deu {
   public static final MapCodec<dlg> h = b(dlg::new);
   public static final dsv<je.a> i = dsn.I;

   @Override
   public MapCodec<? extends dlg> a() {
      return h;
   }

   public dlg(drw.d $$0) {
      super($$0);
      this.k(this.n().a(i, je.a.b));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return b($$0, $$1);
   }

   public static drx b(drx $$0, dlh $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((je.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, je.a.c);
               case c:
                  return $$0.a(i, je.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(i);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(i, $$0.k().o());
   }
}
