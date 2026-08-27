import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record apx(List<apw> b, boolean c) {
   public static final Codec<apx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(apw.a.listOf().fieldOf("values").forGetter(apx::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(apx::b)).apply($$0, apx::new)
   );

   public List<apw> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
