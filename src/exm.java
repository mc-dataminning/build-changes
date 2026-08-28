import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exm(eyd b) implements exh {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eye.a.fieldOf("chance").forGetter(exm::c)).apply($$0, exm::new));

   @Override
   public exi b() {
      return exj.d;
   }

   public boolean a(etw $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static exh.a a(float $$0) {
      return () -> new exm(eya.a($$0));
   }

   public static exh.a a(eyd $$0) {
      return () -> new exm($$0);
   }

   public eyd c() {
      return this.b;
   }
}
