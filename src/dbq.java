import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbq extends csv implements ctr {
   public static final MapCodec<dbq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cix.q.fieldOf("color").forGetter(dbq::b), t()).apply($$0, dbq::new));
   private final cix b;

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   public dbq(cix $$0, dga.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public cix b() {
      return this.b;
   }
}
