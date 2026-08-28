import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fat(ewi.b c) implements faw {
   public static final MapCodec<fat> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ewi.b.e.fieldOf("target").forGetter(fat::c)).apply($$0, fat::new));
   public static final Codec<fat> b = ewi.b.e.xmap(fat::new, fat::c);

   public static faw a(ewi.b $$0) {
      return new fat($$0);
   }

   @Override
   public fav a() {
      return fax.c;
   }

   @Nullable
   @Override
   public fcv a(ewi $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bbd<?>> b() {
      return Set.of(this.c.a());
   }
}
