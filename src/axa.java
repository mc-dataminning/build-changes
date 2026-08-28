import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axa(List<awz> b, boolean c) {
   public static final Codec<axa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awz.a.listOf().fieldOf("values").forGetter(axa::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axa::b)).apply($$0, axa::new)
   );

   public List<awz> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
