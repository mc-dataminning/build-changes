import com.mojang.serialization.MapCodec;

public class dsj extends dmz {
   public static final MapCodec<dsj> c = b(dsj::new);
   public static final fbs e = djk.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dsj> a() {
      return c;
   }

   public dsj(dwu.d $$0) {
      super($$0, jn.b, e, false);
   }

   @Override
   protected dna c() {
      return (dna)djm.pd;
   }
}
