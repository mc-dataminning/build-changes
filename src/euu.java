import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class euu extends esd {
   public static final MapCodec<euu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, euu::new)
   );
   public final boolean e;

   public euu(esd.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      ehf.a $$1 = this.e ? ehf.a.a : ehf.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(esv $$0, esd.a $$1) {
      dty $$2 = dty.a($$1.f());
      iw $$3 = new iw($$1.h().d(), 90, $$1.h().e());
      eut.a $$4 = eut.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         erv $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = esd.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = esd.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public esm<?> e() {
      return esm.m;
   }
}
