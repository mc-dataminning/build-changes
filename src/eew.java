import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eew extends ecg {
   public static final Codec<eew> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eew::new)
   );
   public final boolean e;

   public eew(ecg.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      drq.a $$1 = this.e ? drq.a.a : drq.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ecy $$0, ecg.a $$1) {
      dfr $$2 = dfr.a($$1.f());
      ib $$3 = new ib($$1.h().d(), 90, $$1.h().e());
      eev.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public ecp<?> e() {
      return ecp.m;
   }
}
