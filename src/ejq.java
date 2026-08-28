import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejq extends ejs {
   public static final MapCodec<ejq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejq::new));

   protected ejq(Either<alf, emm> $$0, ji<emk> $$1, ejv.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emi a(dlo $$0, eie $$1, boolean $$2) {
      emi $$3 = super.a($$0, $$1, $$2);
      $$3.b(elo.b);
      $$3.a(elo.d);
      return $$3;
   }

   @Override
   public eju<?> a() {
      return eju.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
