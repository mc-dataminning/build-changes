import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcr extends ddl implements cur {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjx.q.fieldOf("color").forGetter(dcr::b), u()).apply($$0, dcr::new));
   private final cjx c;

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public dcr(cjx $$0, dhh.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cjx b() {
      return this.c;
   }
}
