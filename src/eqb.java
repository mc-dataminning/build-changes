import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqb extends enk {
   public static final MapCodec<eqb> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eqb::new)
   );
   public final boolean e;

   public eqb(enk.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      ecq.a $$1 = this.e ? ecq.a.a : ecq.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eoc $$0, enk.a $$1) {
      dqc $$2 = dqc.a($$1.f());
      ji $$3 = new ji($$1.h().d(), 90, $$1.h().e());
      eqa.a $$4 = eqa.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         enc $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = enk.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = enk.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public ent<?> e() {
      return ent.m;
   }
}
