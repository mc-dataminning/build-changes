import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record awl(List<awk> b, boolean c) {
   public static final Codec<awl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awk.a.listOf().fieldOf("values").forGetter(awl::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(awl::b)).apply($$0, awl::new)
   );

   public List<awk> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
