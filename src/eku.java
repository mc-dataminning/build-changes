import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eku extends ekw {
   public static final MapCodec<eku> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eku::new));

   protected eku(Either<akr, enr> $$0, jm<enp> $$1, ekz.a $$2, Optional<enb> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected enn a(dmm $$0, ejh $$1, enb $$2, boolean $$3) {
      enn $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(ems.b);
      $$4.a(ems.d);
      return $$4;
   }

   @Override
   public eky<?> a() {
      return eky.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
