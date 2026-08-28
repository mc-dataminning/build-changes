import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eut(euw b) implements euw {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(euw.e.fieldOf("term").forGetter(eut::c)).apply($$0, eut::new));

   @Override
   public eux b() {
      return euy.a;
   }

   public boolean a(erl $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(err $$0) {
      euw.super.a($$0);
      this.b.a($$0);
   }

   public static euw.a a(euw.a $$0) {
      eut $$1 = new eut($$0.build());
      return () -> $$1;
   }

   public euw c() {
      return this.b;
   }
}
