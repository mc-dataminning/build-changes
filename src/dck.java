import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dck extends cto implements cuk {
   public static final MapCodec<dck> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjp.q.fieldOf("color").forGetter(dck::b), t()).apply($$0, dck::new));
   private final cjp b;

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   public dck(cjp $$0, dgv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public cjp b() {
      return this.b;
   }
}
