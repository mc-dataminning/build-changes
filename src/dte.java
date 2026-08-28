import com.mojang.serialization.MapCodec;

public class dte extends dmz {
   public static final MapCodec<dte> c = b(dte::new);
   public static final fbs e = djk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dte> a() {
      return c;
   }

   public dte(dwu.d $$0) {
      super($$0, jn.a, e, false);
   }

   @Override
   protected dna c() {
      return (dna)djm.pb;
   }
}
