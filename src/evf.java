import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evf(evw b) implements eva {
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evx.a.fieldOf("chance").forGetter(evf::c)).apply($$0, evf::new));

   @Override
   public evb b() {
      return evc.d;
   }

   public boolean a(erp $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static eva.a a(float $$0) {
      return () -> new evf(evt.a($$0));
   }

   public static eva.a a(evw $$0) {
      return () -> new evf($$0);
   }

   public evw c() {
      return this.b;
   }
}
