import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eue(euh b) implements euh {
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(euh.e.fieldOf("term").forGetter(eue::c)).apply($$0, eue::new));

   @Override
   public eui b() {
      return euj.a;
   }

   public boolean a(eqw $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(erc $$0) {
      euh.super.a($$0);
      this.b.a($$0);
   }

   public static euh.a a(euh.a $$0) {
      eue $$1 = new eue($$0.build());
      return () -> $$1;
   }

   public euh c() {
      return this.b;
   }
}
