import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ela extends eik {
   public static final MapCodec<ela> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ela::new)
   );
   public final boolean e;

   public ela(eik.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      dxu.a $$1 = this.e ? dxu.a.a : dxu.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ejc $$0, eik.a $$1) {
      dlm $$2 = dlm.a($$1.f());
      iz $$3 = new iz($$1.h().d(), 90, $$1.h().e());
      ekz.a $$4 = ekz.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eic $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eik.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eik.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eit<?> e() {
      return eit.m;
   }
}
