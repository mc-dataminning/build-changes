import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eve extends esn {
   public static final MapCodec<eve> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eve::new)
   );
   public final boolean e;

   public eve(esn.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      ehp.a $$1 = this.e ? ehp.a.a : ehp.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(etf $$0, esn.a $$1) {
      dui $$2 = dui.a($$1.f());
      iw $$3 = new iw($$1.h().d(), 90, $$1.h().e());
      evd.a $$4 = evd.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         esf $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = esn.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = esn.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public esw<?> e() {
      return esw.m;
   }
}
