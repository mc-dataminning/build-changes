import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ayj(List<ayi> b, boolean c) {
   public static final Codec<ayj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.a.listOf().fieldOf("values").forGetter(ayj::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(ayj::b)).apply($$0, ayj::new)
   );

   public List<ayi> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
