import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekb extends ehl {
   public static final MapCodec<ekb> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ekb::new)
   );
   public final boolean e;

   public ekb(ehl.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      dwv.a $$1 = this.e ? dwv.a.a : dwv.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eid $$0, ehl.a $$1) {
      dkn $$2 = dkn.a($$1.f());
      io $$3 = new io($$1.h().d(), 90, $$1.h().e());
      eka.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public ehu<?> e() {
      return ehu.m;
   }
}
