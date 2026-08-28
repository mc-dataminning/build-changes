import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elb extends eil {
   public static final MapCodec<elb> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, elb::new)
   );
   public final boolean e;

   public elb(eil.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      dxv.a $$1 = this.e ? dxv.a.a : dxv.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ejd $$0, eil.a $$1) {
      dln $$2 = dln.a($$1.f());
      iz $$3 = new iz($$1.h().d(), 90, $$1.h().e());
      ela.a $$4 = ela.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eid $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eil.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eil.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eiu<?> e() {
      return eiu.m;
   }
}
