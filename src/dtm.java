import com.mojang.serialization.MapCodec;

public class dtm extends dlu {
   public static final MapCodec<dtm> a = b(dtm::new);
   private static final feq b = dlu.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected feq b_(dzo $$0, dhv $$1, iu $$2) {
      return fen.b();
   }

   @Override
   protected feq c(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.b();
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dmb.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == ja.b && $$6.a(dlw.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected float c(dzo $$0, dhv $$1, iu $$2) {
      return 0.2F;
   }
}
