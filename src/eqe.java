import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqe extends enn {
   public static final MapCodec<eqe> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eqe::new)
   );
   public final boolean e;

   public eqe(enn.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      ect.a $$1 = this.e ? ect.a.a : ect.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eof $$0, enn.a $$1) {
      dqf $$2 = dqf.a($$1.f());
      ji $$3 = new ji($$1.h().d(), 90, $$1.h().e());
      eqd.a $$4 = eqd.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         enf $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = enn.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = enn.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public enw<?> e() {
      return enw.m;
   }
}
