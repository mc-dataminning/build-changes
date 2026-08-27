import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record avc(List<avb> b, boolean c) {
   public static final Codec<avc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avb.a.listOf().fieldOf("values").forGetter(avc::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(avc::b)).apply($$0, avc::new)
   );

   public List<avb> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
