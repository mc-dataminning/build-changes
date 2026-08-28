import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class emn implements emq {
   public static final MapCodec<emn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ur.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, emn::new));
   private final ur b;

   public emn(ur $$0) {
      this.b = $$0;
   }

   @Override
   public ur a(azf $$0, @Nullable ur $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public emr<?> a() {
      return emr.c;
   }
}
