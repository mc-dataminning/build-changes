import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eqp implements eqs {
   public static final MapCodec<eqp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ul.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eqp::new));
   private final ul b;

   public eqp(ul $$0) {
      this.b = $$0;
   }

   @Override
   public ul a(azu $$0, @Nullable ul $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eqt<?> a() {
      return eqt.c;
   }
}
