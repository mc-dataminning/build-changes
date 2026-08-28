import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoo extends elx {
   public static final MapCodec<eoo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eoo::new)
   );
   public final boolean e;

   public eoo(elx.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      ebf.a $$1 = this.e ? ebf.a.a : ebf.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(emp $$0, elx.a $$1) {
      dor $$2 = dor.a($$1.f());
      jh $$3 = new jh($$1.h().d(), 90, $$1.h().e());
      eon.a $$4 = eon.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         elp $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = elx.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = elx.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public emg<?> e() {
      return emg.m;
   }
}
