import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exk(exn b) implements exn {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(exn.e.fieldOf("term").forGetter(exk::c)).apply($$0, exk::new));

   @Override
   public exo b() {
      return exp.a;
   }

   public boolean a(euc $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eui $$0) {
      exn.super.a($$0);
      this.b.a($$0);
   }

   public static exn.a a(exn.a $$0) {
      exk $$1 = new exk($$0.build());
      return () -> $$1;
   }

   public exn c() {
      return this.b;
   }
}
