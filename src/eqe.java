import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eqe implements eqh {
   public static final MapCodec<eqe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(uk.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eqe::new));
   private final uk b;

   public eqe(uk $$0) {
      this.b = $$0;
   }

   @Override
   public uk a(azs $$0, @Nullable uk $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eqi<?> a() {
      return eqi.c;
   }
}
