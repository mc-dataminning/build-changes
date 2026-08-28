import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record asy(crs b) {
   private static final Codec<asy> c = RecordCodecBuilder.create($$0 -> $$0.group(cru.f.fieldOf("enabled").forGetter(asy::a)).apply($$0, asy::new));
   public static final atp<asy> a = new atp<>("features", c);

   public crs a() {
      return this.b;
   }
}
