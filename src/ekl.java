import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ekl implements eko {
   public static final Codec<ekl> a = RecordCodecBuilder.create($$0 -> $$0.group(ty.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ekl::new));
   private final ty b;

   public ekl(ty $$0) {
      this.b = $$0;
   }

   @Override
   public ty a(ayd $$0, @Nullable ty $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public ekp<?> a() {
      return ekp.c;
   }
}
