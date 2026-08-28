import com.mojang.serialization.MapCodec;

public class dns extends dim {
   public static final MapCodec<dns> c = b(dns::new);
   public static final ewj e = dey.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dns> a() {
      return c;
   }

   public dns(dsa.d $$0) {
      super($$0, je.b, e, false);
   }

   @Override
   protected din c() {
      return (din)dfa.oB;
   }
}
