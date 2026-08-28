import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elo extends eix {
   public static final MapCodec<elo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, elo::new)
   );
   public final boolean e;

   public elo(eix.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      dyg.a $$1 = this.e ? dyg.a.a : dyg.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ejp $$0, eix.a $$1) {
      dlv $$2 = dlv.a($$1.f());
      ja $$3 = new ja($$1.h().d(), 90, $$1.h().e());
      eln.a $$4 = eln.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eip $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eix.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eix.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public ejg<?> e() {
      return ejg.m;
   }
}
