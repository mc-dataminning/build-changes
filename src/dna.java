import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dna extends dnu implements dez {
   public static final MapCodec<dna> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csw.q.fieldOf("color").forGetter(dna::b), u()).apply($$0, dna::new));
   private final csw c;

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   public dna(csw $$0, dsk.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public csw b() {
      return this.c;
   }
}
