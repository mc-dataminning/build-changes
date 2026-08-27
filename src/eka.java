import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eka(float b) implements ejv {
   public static final Codec<eka> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eka::c)).apply($$0, eka::new));

   @Override
   public ejw b() {
      return ejx.e;
   }

   public boolean a(egw $$0) {
      return $$0.b().i() < this.b;
   }

   public static ejv.a a(float $$0) {
      return () -> new eka($$0);
   }

   public float c() {
      return this.b;
   }
}
