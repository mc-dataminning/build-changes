import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fee(ezt.b c) implements feh {
   public static final MapCodec<fee> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezt.b.e.fieldOf("target").forGetter(fee::c)).apply($$0, fee::new));
   public static final Codec<fee> b = ezt.b.e.xmap(fee::new, fee::c);

   public static feh a(ezt.b $$0) {
      return new fee($$0);
   }

   @Override
   public feg a() {
      return fei.c;
   }

   @Nullable
   @Override
   public fgg a(ezt $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of(this.c.a());
   }
}
