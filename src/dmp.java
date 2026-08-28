import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmp extends dnj implements deo {
   public static final MapCodec<dmp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctg.q.fieldOf("color").forGetter(dmp::b), u()).apply($$0, dmp::new));
   private final ctg c;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(ctg $$0, drz.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public ctg b() {
      return this.c;
   }
}
