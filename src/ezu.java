import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezu(ezx b) implements ezx {
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezx.e.fieldOf("term").forGetter(ezu::c)).apply($$0, ezu::new));

   @Override
   public ezy b() {
      return ezz.a;
   }

   public boolean a(ewo $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ewu $$0) {
      ezx.super.a($$0);
      this.b.a($$0);
   }

   public static ezx.a a(ezx.a $$0) {
      ezu $$1 = new ezu($$0.build());
      return () -> $$1;
   }

   public ezx c() {
      return this.b;
   }
}
