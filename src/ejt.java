import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejt(float b) implements ejo {
   public static final Codec<ejt> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ejt::c)).apply($$0, ejt::new));

   @Override
   public ejp b() {
      return ejq.e;
   }

   public boolean a(egp $$0) {
      return $$0.b().i() < this.b;
   }

   public static ejo.a a(float $$0) {
      return () -> new ejt($$0);
   }

   public float c() {
      return this.b;
   }
}
