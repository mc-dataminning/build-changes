import com.mojang.serialization.MapCodec;

public class dsl extends dnb {
   public static final MapCodec<dsl> c = b(dsl::new);
   public static final fbu e = djm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dsl> a() {
      return c;
   }

   public dsl(dww.d $$0) {
      super($$0, jn.b, e, false);
   }

   @Override
   protected dnc c() {
      return (dnc)djo.pd;
   }
}
