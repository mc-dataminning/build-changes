import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record asu(List<ast> b, boolean c) {
   public static final Codec<asu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ast.a.listOf().fieldOf("values").forGetter(asu::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(asu::b)).apply($$0, asu::new)
   );

   public List<ast> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
