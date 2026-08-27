import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edt extends edo {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bmk.b(edo.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, edt::new)
   );
   private final bmk<edo> b;

   public edt(bmk<edo> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(axr $$0, dvo $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public edp<?> a() {
      return edp.f;
   }
}
