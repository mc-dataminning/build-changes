import com.mojang.serialization.MapCodec;

public class dbs extends cwp {
   public static final MapCodec<dbs> c = b(dbs::new);
   public static final eia e = ctc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dbs> a() {
      return c;
   }

   public dbs(dfc.d $$0) {
      super($$0, ha.b, e, false);
   }

   @Override
   protected cwq c() {
      return (cwq)cte.oB;
   }
}
