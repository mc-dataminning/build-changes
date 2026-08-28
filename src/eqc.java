import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqc extends enl {
   public static final MapCodec<eqc> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eqc::new)
   );
   public final boolean e;

   public eqc(enl.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      ecr.a $$1 = this.e ? ecr.a.a : ecr.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eod $$0, enl.a $$1) {
      dqd $$2 = dqd.a($$1.f());
      ji $$3 = new ji($$1.h().d(), 90, $$1.h().e());
      eqb.a $$4 = eqb.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         end $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = enl.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = enl.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public enu<?> e() {
      return enu.m;
   }
}
