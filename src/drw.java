import com.mojang.serialization.MapCodec;

public class drw extends djw implements djp {
   public static final MapCodec<drw> a = b(drw::new);
   protected static final float b = 6.0F;
   protected static final fbu c = djm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   protected drw(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c;
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      dlv.a($$0, o($$3).m(), $$2, 2);
   }

   private static dlv o(dwx $$0) {
      return (dlv)($$0.a(djo.bB) ? djo.jg : djo.jf);
   }
}
