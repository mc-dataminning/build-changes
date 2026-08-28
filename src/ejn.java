import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejn extends ejp {
   public static final MapCodec<ejn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejn::new));

   protected ejn(Either<ale, emj> $$0, ji<emh> $$1, ejs.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emf a(dll $$0, eib $$1, boolean $$2) {
      emf $$3 = super.a($$0, $$1, $$2);
      $$3.b(ell.b);
      $$3.a(ell.d);
      return $$3;
   }

   @Override
   public ejr<?> a() {
      return ejr.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
