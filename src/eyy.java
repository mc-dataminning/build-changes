import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyy(ezb b) implements ezb {
   public static final MapCodec<eyy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezb.e.fieldOf("term").forGetter(eyy::c)).apply($$0, eyy::new));

   @Override
   public ezc b() {
      return ezd.a;
   }

   public boolean a(evs $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(evy $$0) {
      ezb.super.a($$0);
      this.b.a($$0);
   }

   public static ezb.a a(ezb.a $$0) {
      eyy $$1 = new eyy($$0.build());
      return () -> $$1;
   }

   public ezb c() {
      return this.b;
   }
}
