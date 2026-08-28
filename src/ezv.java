import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezv(ezy b) implements ezy {
   public static final MapCodec<ezv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezy.e.fieldOf("term").forGetter(ezv::c)).apply($$0, ezv::new));

   @Override
   public ezz b() {
      return faa.a;
   }

   public boolean a(ewp $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ewv $$0) {
      ezy.super.a($$0);
      this.b.a($$0);
   }

   public static ezy.a a(ezy.a $$0) {
      ezv $$1 = new ezv($$0.build());
      return () -> $$1;
   }

   public ezy c() {
      return this.b;
   }
}
