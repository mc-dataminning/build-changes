import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efg(efj b) implements efj {
   public static final Codec<efg> a = RecordCodecBuilder.create($$0 -> $$0.group(efl.a.fieldOf("term").forGetter(efg::c)).apply($$0, efg::new));

   @Override
   public efk b() {
      return efl.b;
   }

   public boolean a(eck $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ect $$0) {
      efj.super.a($$0);
      this.b.a($$0);
   }

   public static efj.a a(efj.a $$0) {
      efg $$1 = new efg($$0.build());
      return () -> $$1;
   }

   public efj c() {
      return this.b;
   }
}
