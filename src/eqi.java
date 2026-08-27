import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eqi(eql b) implements eql {
   public static final Codec<eqi> a = RecordCodecBuilder.create($$0 -> $$0.group(eqn.a.fieldOf("term").forGetter(eqi::c)).apply($$0, eqi::new));

   @Override
   public eqm b() {
      return eqn.b;
   }

   public boolean a(enk $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ent $$0) {
      eql.super.a($$0);
      this.b.a($$0);
   }

   public static eql.a a(eql.a $$0) {
      eqi $$1 = new eqi($$0.build());
      return () -> $$1;
   }

   public eql c() {
      return this.b;
   }
}
