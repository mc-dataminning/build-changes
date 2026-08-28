import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elc extends eim {
   public static final MapCodec<elc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, elc::new)
   );
   public final boolean e;

   public elc(eim.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      dxw.a $$1 = this.e ? dxw.a.a : dxw.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eje $$0, eim.a $$1) {
      dlo $$2 = dlo.a($$1.f());
      iz $$3 = new iz($$1.h().d(), 90, $$1.h().e());
      elb.a $$4 = elb.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eie $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eim.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eim.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eiv<?> e() {
      return eiv.m;
   }
}
