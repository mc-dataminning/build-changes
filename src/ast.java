import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ast(cpg b) {
   private static final Codec<ast> c = RecordCodecBuilder.create($$0 -> $$0.group(cpi.f.fieldOf("enabled").forGetter(ast::a)).apply($$0, ast::new));
   public static final atl<ast> a = atl.a("features", c);

   public cpg a() {
      return this.b;
   }
}
