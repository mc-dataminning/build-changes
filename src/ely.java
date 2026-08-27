import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ely(emb b) implements emb {
   public static final Codec<ely> a = RecordCodecBuilder.create($$0 -> $$0.group(emd.a.fieldOf("term").forGetter(ely::c)).apply($$0, ely::new));

   @Override
   public emc b() {
      return emd.b;
   }

   public boolean a(ejc $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ejl $$0) {
      emb.super.a($$0);
      this.b.a($$0);
   }

   public static emb.a a(emb.a $$0) {
      ely $$1 = new ely($$0.build());
      return () -> $$1;
   }

   public emb c() {
      return this.b;
   }
}
