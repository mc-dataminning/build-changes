import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekw extends eky {
   public static final MapCodec<ekw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, ekw::new));

   protected ekw(Either<akr, ent> $$0, jm<enr> $$1, elb.a $$2, Optional<end> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected enp a(dmm $$0, ejj $$1, end $$2, boolean $$3) {
      enp $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(emu.b);
      $$4.a(emu.d);
      return $$4;
   }

   @Override
   public ela<?> a() {
      return ela.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
