import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eto(etr b) implements etr {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ett.a.fieldOf("term").forGetter(eto::c)).apply($$0, eto::new));

   @Override
   public ets b() {
      return ett.c;
   }

   public boolean a(eqh $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eqn $$0) {
      etr.super.a($$0);
      this.b.a($$0);
   }

   public static etr.a a(etr.a $$0) {
      eto $$1 = new eto($$0.build());
      return () -> $$1;
   }

   public etr c() {
      return this.b;
   }
}
