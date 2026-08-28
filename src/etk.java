import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etk(etn b) implements etn {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etp.a.fieldOf("term").forGetter(etk::c)).apply($$0, etk::new));

   @Override
   public eto b() {
      return etp.c;
   }

   public boolean a(eqd $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eqj $$0) {
      etn.super.a($$0);
      this.b.a($$0);
   }

   public static etn.a a(etn.a $$0) {
      etk $$1 = new etk($$0.build());
      return () -> $$1;
   }

   public etn c() {
      return this.b;
   }
}
