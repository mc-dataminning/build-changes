import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends dnk implements dep {
   public static final MapCodec<dmq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cth.q.fieldOf("color").forGetter(dmq::b), u()).apply($$0, dmq::new));
   private final cth c;

   @Override
   public MapCodec<dmq> a() {
      return a;
   }

   public dmq(cth $$0, dsa.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cth b() {
      return this.c;
   }
}
