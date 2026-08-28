import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejj extends ejl {
   public static final MapCodec<ejj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejj::new));

   protected ejj(Either<alb, emf> $$0, ji<emd> $$1, ejo.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emb a(dlh $$0, ehx $$1, boolean $$2) {
      emb $$3 = super.a($$0, $$1, $$2);
      $$3.b(elh.b);
      $$3.a(elh.d);
      return $$3;
   }

   @Override
   public ejn<?> a() {
      return ejn.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
