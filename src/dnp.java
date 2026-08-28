import com.mojang.serialization.MapCodec;

public class dnp extends dwo {
   public static final MapCodec<dnp> a = b(dnp::new);
   private static final fgk b = dnc.b(14.0, 0.0, 12.0);

   @Override
   public MapCodec<? extends dnp> a() {
      return a;
   }

   public dnp(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2);
      return $$3.a(dne.eg) || $$3.a($$1, $$2, jb.b, dvn.b);
   }
}
