import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emu(emx b) implements emx {
   public static final Codec<emu> a = RecordCodecBuilder.create($$0 -> $$0.group(emz.a.fieldOf("term").forGetter(emu::c)).apply($$0, emu::new));

   @Override
   public emy b() {
      return emz.b;
   }

   public boolean a(ejy $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ekh $$0) {
      emx.super.a($$0);
      this.b.a($$0);
   }

   public static emx.a a(emx.a $$0) {
      emu $$1 = new emu($$0.build());
      return () -> $$1;
   }

   public emx c() {
      return this.b;
   }
}
