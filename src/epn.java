import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class epn implements epq {
   public static final MapCodec<epn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ug.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, epn::new));
   private final ug b;

   public epn(ug $$0) {
      this.b = $$0;
   }

   @Override
   public ug a(azn $$0, @Nullable ug $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public epr<?> a() {
      return epr.c;
   }
}
