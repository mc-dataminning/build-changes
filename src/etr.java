import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etr(etu b) implements etu {
   public static final MapCodec<etr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etw.a.fieldOf("term").forGetter(etr::c)).apply($$0, etr::new));

   @Override
   public etv b() {
      return etw.c;
   }

   public boolean a(eqk $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eqq $$0) {
      etu.super.a($$0);
      this.b.a($$0);
   }

   public static etu.a a(etu.a $$0) {
      etr $$1 = new etr($$0.build());
      return () -> $$1;
   }

   public etu c() {
      return this.b;
   }
}
