import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record enq(ent b) implements ent {
   public static final Codec<enq> a = RecordCodecBuilder.create($$0 -> $$0.group(env.a.fieldOf("term").forGetter(enq::c)).apply($$0, enq::new));

   @Override
   public enu b() {
      return env.b;
   }

   public boolean a(eku $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eld $$0) {
      ent.super.a($$0);
      this.b.a($$0);
   }

   public static ent.a a(ent.a $$0) {
      enq $$1 = new enq($$0.build());
      return () -> $$1;
   }

   public ent c() {
      return this.b;
   }
}
