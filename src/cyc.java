import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class cyc extends cvj implements ddb {
   protected static final MapCodec<List<ddb.a>> a = ddb.a.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<cyc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cyc::b), u()).apply($$0, cyc::new));
   protected static final float c = 3.0F;
   protected static final ekn d = cva.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final List<ddb.a> e;

   @Override
   public MapCodec<? extends cyc> a() {
      return b;
   }

   public cyc(bkb $$0, int $$1, dhh.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public cyc(List<ddb.a> $$0, dhh.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static List<ddb.a> a(bkb $$0, int $$1) {
      int $$2;
      if ($$0.a()) {
         $$2 = $$1;
      } else {
         $$2 = $$1 * 20;
      }

      return List.of(new ddb.a($$0, $$2));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      eju $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public List<ddb.a> b() {
      return this.e;
   }
}
