import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exs(eyj b) implements exn {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eyk.a.fieldOf("chance").forGetter(exs::c)).apply($$0, exs::new));

   @Override
   public exo b() {
      return exp.d;
   }

   public boolean a(euc $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static exn.a a(float $$0) {
      return () -> new exs(eyg.a($$0));
   }

   public static exn.a a(eyj $$0) {
      return () -> new exs($$0);
   }

   public eyj c() {
      return this.b;
   }
}
