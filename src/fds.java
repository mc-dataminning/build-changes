import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fds(ezh.b c) implements fdv {
   public static final MapCodec<fds> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezh.b.e.fieldOf("target").forGetter(fds::c)).apply($$0, fds::new));
   public static final Codec<fds> b = ezh.b.e.xmap(fds::new, fds::c);

   public static fdv a(ezh.b $$0) {
      return new fds($$0);
   }

   @Override
   public fdu a() {
      return fdw.c;
   }

   @Nullable
   @Override
   public ffu a(ezh $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of(this.c.a());
   }
}
