import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exv(exy b) implements exy {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(exy.e.fieldOf("term").forGetter(exv::c)).apply($$0, exv::new));

   @Override
   public exz b() {
      return eya.a;
   }

   public boolean a(eun $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eut $$0) {
      exy.super.a($$0);
      this.b.a($$0);
   }

   public static exy.a a(exy.a $$0) {
      exv $$1 = new exv($$0.build());
      return () -> $$1;
   }

   public exy c() {
      return this.b;
   }
}
