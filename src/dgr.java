import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgr extends cxp {
   public static final MapCodec<dgr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clv.q.fieldOf("color").forGetter(dgr::b), u()).apply($$0, dgr::new));
   private final clv d;

   @Override
   public MapCodec<dgr> a() {
      return c;
   }

   protected dgr(clv $$0, djo.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public clv b() {
      return this.d;
   }
}
