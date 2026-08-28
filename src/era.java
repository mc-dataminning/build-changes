import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class era extends eoj {
   public static final MapCodec<era> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, era::new)
   );
   public final boolean e;

   public era(eoj.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      edp.a $$1 = this.e ? edp.a.a : edp.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(epb $$0, eoj.a $$1) {
      drb $$2 = drb.a($$1.f());
      jh $$3 = new jh($$1.h().d(), 90, $$1.h().e());
      eqz.a $$4 = eqz.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eob $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eoj.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eoj.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eos<?> e() {
      return eos.m;
   }
}
