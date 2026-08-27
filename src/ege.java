import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ege(egh b) implements egh {
   public static final Codec<ege> a = RecordCodecBuilder.create($$0 -> $$0.group(egj.a.fieldOf("term").forGetter(ege::c)).apply($$0, ege::new));

   @Override
   public egi b() {
      return egj.b;
   }

   public boolean a(edi $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(edr $$0) {
      egh.super.a($$0);
      this.b.a($$0);
   }

   public static egh.a a(egh.a $$0) {
      ege $$1 = new ege($$0.build());
      return () -> $$1;
   }

   public egh c() {
      return this.b;
   }
}
