import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmr extends dnl implements deq {
   public static final MapCodec<dmr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dmr::b), u()).apply($$0, dmr::new));
   private final cti c;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(cti $$0, dsb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cti b() {
      return this.c;
   }
}
