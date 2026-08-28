import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyx(eza b) implements eza {
   public static final MapCodec<eyx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eza.e.fieldOf("term").forGetter(eyx::c)).apply($$0, eyx::new));

   @Override
   public ezb b() {
      return ezc.a;
   }

   public boolean a(evr $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(evx $$0) {
      eza.super.a($$0);
      this.b.a($$0);
   }

   public static eza.a a(eza.a $$0) {
      eyx $$1 = new eyx($$0.build());
      return () -> $$1;
   }

   public eza c() {
      return this.b;
   }
}
