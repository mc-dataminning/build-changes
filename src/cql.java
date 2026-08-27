import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cql {
   public static final Codec<cql> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aoy.b.fieldOf("sound").forGetter($$0x -> $$0x.b), Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0x -> $$0x.c)).apply($$0, cql::new)
   );
   private final hg<aoy> b;
   private final double c;

   public cql(hg<aoy> $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public hg<aoy> a() {
      return this.b;
   }

   public double b() {
      return this.c;
   }
}
