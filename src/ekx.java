import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekx extends ekz {
   public static final Codec<ekx> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ekx::new));

   protected ekx(Either<akt, ent> $$0, ja<enr> $$1, elc.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected enp a(dmd $$0, ejl $$1, boolean $$2) {
      enp $$3 = super.a($$0, $$1, $$2);
      $$3.b(emv.b);
      $$3.a(emv.d);
      return $$3;
   }

   @Override
   public elb<?> a() {
      return elb.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
