import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqd extends enm {
   public static final MapCodec<eqd> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eqd::new)
   );
   public final boolean e;

   public eqd(enm.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      ecs.a $$1 = this.e ? ecs.a.a : ecs.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eoe $$0, enm.a $$1) {
      dqe $$2 = dqe.a($$1.f());
      ji $$3 = new ji($$1.h().d(), 90, $$1.h().e());
      eqc.a $$4 = eqc.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         ene $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = enm.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = enm.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public env<?> e() {
      return env.m;
   }
}
