import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eze(ezv b) implements eyz {
   public static final MapCodec<eze> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezw.a.fieldOf("chance").forGetter(eze::c)).apply($$0, eze::new));

   @Override
   public eza b() {
      return ezb.d;
   }

   public boolean a(evq $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static eyz.a a(float $$0) {
      return () -> new eze(ezs.a($$0));
   }

   public static eyz.a a(ezv $$0) {
      return () -> new eze($$0);
   }

   public ezv c() {
      return this.b;
   }
}
