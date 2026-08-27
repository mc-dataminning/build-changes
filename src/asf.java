import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record asf(List<ase> b, boolean c) {
   public static final Codec<asf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ase.a.listOf().fieldOf("values").forGetter(asf::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(asf::b)).apply($$0, asf::new)
   );

   public List<ase> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
