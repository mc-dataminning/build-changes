import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejz(float b) implements eju {
   public static final Codec<ejz> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ejz::c)).apply($$0, ejz::new));

   @Override
   public ejv b() {
      return ejw.e;
   }

   public boolean a(egv $$0) {
      return $$0.b().i() < this.b;
   }

   public static eju.a a(float $$0) {
      return () -> new ejz($$0);
   }

   public float c() {
      return this.b;
   }
}
