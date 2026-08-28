import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyw(eyz b) implements eyz {
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eyz.e.fieldOf("term").forGetter(eyw::c)).apply($$0, eyw::new));

   @Override
   public eza b() {
      return ezb.a;
   }

   public boolean a(evq $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(evw $$0) {
      eyz.super.a($$0);
      this.b.a($$0);
   }

   public static eyz.a a(eyz.a $$0) {
      eyw $$1 = new eyw($$0.build());
      return () -> $$1;
   }

   public eyz c() {
      return this.b;
   }
}
