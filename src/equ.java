import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class equ extends eod {
   public static final MapCodec<equ> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, equ::new)
   );
   public final boolean e;

   public equ(eod.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      edj.a $$1 = this.e ? edj.a.a : edj.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eov $$0, eod.a $$1) {
      dqv $$2 = dqv.a($$1.f());
      jh $$3 = new jh($$1.h().d(), 90, $$1.h().e());
      eqt.a $$4 = eqt.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         env $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eod.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eod.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eom<?> e() {
      return eom.m;
   }
}
