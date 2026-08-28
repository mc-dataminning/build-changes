import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekr extends ekt {
   public static final MapCodec<ekr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ekr::new));

   protected ekr(Either<akq, enn> $$0, jm<enl> $$1, ekw.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected enj a(dmk $$0, eje $$1, boolean $$2) {
      enj $$3 = super.a($$0, $$1, $$2);
      $$3.b(emp.b);
      $$3.a(emp.d);
      return $$3;
   }

   @Override
   public ekv<?> a() {
      return ekv.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
