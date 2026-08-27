import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esk(esn b) implements esn {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(esp.a.fieldOf("term").forGetter(esk::c)).apply($$0, esk::new));

   @Override
   public eso b() {
      return esp.c;
   }

   public boolean a(eph $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(epn $$0) {
      esn.super.a($$0);
      this.b.a($$0);
   }

   public static esn.a a(esn.a $$0) {
      esk $$1 = new esk($$0.build());
      return () -> $$1;
   }

   public esn c() {
      return this.b;
   }
}
