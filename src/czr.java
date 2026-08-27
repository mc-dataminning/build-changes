import com.mojang.serialization.MapCodec;

public class czr extends cvt {
   public static final MapCodec<czr> a = b(czr::new);
   private static final eiy[] b = new eiy[]{
      cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<czr> a() {
      return a;
   }

   public czr(dga.d $$0) {
      super($$0);
   }

   @Override
   protected cqy d() {
      return ckm.tm;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b[this.g($$0)];
   }
}
