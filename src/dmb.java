import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmb extends dcy {
   public static final MapCodec<dmb> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cql.q.fieldOf("color").forGetter(dmb::b), u()).apply($$0, dmb::new));
   private final cql d;

   @Override
   public MapCodec<dmb> a() {
      return c;
   }

   protected dmb(cql $$0, dph.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cql b() {
      return this.d;
   }
}
