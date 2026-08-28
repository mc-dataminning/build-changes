import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etq(ett b) implements ett {
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etv.a.fieldOf("term").forGetter(etq::c)).apply($$0, etq::new));

   @Override
   public etu b() {
      return etv.c;
   }

   public boolean a(eqj $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eqp $$0) {
      ett.super.a($$0);
      this.b.a($$0);
   }

   public static ett.a a(ett.a $$0) {
      etq $$1 = new etq($$0.build());
      return () -> $$1;
   }

   public ett c() {
      return this.b;
   }
}
