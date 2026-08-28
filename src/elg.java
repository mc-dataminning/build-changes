import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elg extends eiq {
   public static final MapCodec<elg> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, elg::new)
   );
   public final boolean e;

   public elg(eiq.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      dxz.a $$1 = this.e ? dxz.a.a : dxz.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eji $$0, eiq.a $$1) {
      dls $$2 = dls.a($$1.f());
      ja $$3 = new ja($$1.h().d(), 90, $$1.h().e());
      elf.a $$4 = elf.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eii $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eiq.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eiq.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eiz<?> e() {
      return eiz.m;
   }
}
