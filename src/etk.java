import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class etk extends eqt {
   public static final MapCodec<etk> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, etk::new)
   );
   public final boolean e;

   public etk(eqt.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      efy.a $$1 = this.e ? efy.a.a : efy.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(erl $$0, eqt.a $$1) {
      dst $$2 = dst.a($$1.f());
      iu $$3 = new iu($$1.h().d(), 90, $$1.h().e());
      etj.a $$4 = etj.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eql $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eqt.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eqt.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public erc<?> e() {
      return erc.m;
   }
}
