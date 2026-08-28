import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fbw(exl.b c) implements fbz {
   public static final MapCodec<fbw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(exl.b.e.fieldOf("target").forGetter(fbw::c)).apply($$0, fbw::new));
   public static final Codec<fbw> b = exl.b.e.xmap(fbw::new, fbw::c);

   public static fbz a(exl.b $$0) {
      return new fbw($$0);
   }

   @Override
   public fby a() {
      return fca.c;
   }

   @Nullable
   @Override
   public fdy a(exl $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bat<?>> b() {
      return Set.of(this.c.a());
   }
}
