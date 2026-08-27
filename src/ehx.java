import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ehx extends efh {
   public static final Codec<ehx> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ehx::new)
   );
   public final boolean e;

   public ehx(efh.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      dur.a $$1 = this.e ? dur.a.a : dur.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(efz $$0, efh.a $$1) {
      dik $$2 = dik.a($$1.f());
      ib $$3 = new ib($$1.h().d(), 90, $$1.h().e());
      ehw.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public efq<?> e() {
      return efq.m;
   }
}
