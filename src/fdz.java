import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdz(fec b) implements fec {
   public static final MapCodec<fdz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fec.e.fieldOf("term").forGetter(fdz::c)).apply($$0, fdz::new));

   @Override
   public fed b() {
      return fee.a;
   }

   public boolean a(fat $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bbk<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(faz $$0) {
      fec.super.a($$0);
      this.b.a($$0);
   }

   public static fec.a a(fec.a $$0) {
      fdz $$1 = new fdz($$0.build());
      return () -> $$1;
   }

   public fec c() {
      return this.b;
   }
}
