import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eqi implements eql {
   public static final MapCodec<eqi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(un.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eqi::new));
   private final un b;

   public eqi(un $$0) {
      this.b = $$0;
   }

   @Override
   public un a(azv $$0, @Nullable un $$1) {
      return $$1 == null ? this.b.i() : $$1.a(this.b);
   }

   @Override
   public eqm<?> a() {
      return eqm.c;
   }
}
