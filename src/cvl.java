import com.mojang.serialization.MapCodec;

public class cvl extends cwn {
   public static final MapCodec<cvl> a = b(cvl::new);
   private static final ekb[] b = new ekb[]{
      cut.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cut.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<cvl> a() {
      return a;
   }

   public cvl(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected crr d() {
      return cle.tm;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b[this.g($$0)];
   }
}
