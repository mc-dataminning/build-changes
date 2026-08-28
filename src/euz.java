import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euz(evc b) implements evc {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evc.e.fieldOf("term").forGetter(euz::c)).apply($$0, euz::new));

   @Override
   public evd b() {
      return eve.a;
   }

   public boolean a(err $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(erx $$0) {
      evc.super.a($$0);
      this.b.a($$0);
   }

   public static evc.a a(evc.a $$0) {
      euz $$1 = new euz($$0.build());
      return () -> $$1;
   }

   public evc c() {
      return this.b;
   }
}
