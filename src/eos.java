import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eos extends emb {
   public static final MapCodec<eos> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eos::new)
   );
   public final boolean e;

   public eos(emb.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      ebj.a $$1 = this.e ? ebj.a.a : ebj.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(emt $$0, emb.a $$1) {
      dow $$2 = dow.a($$1.f());
      jh $$3 = new jh($$1.h().d(), 90, $$1.h().e());
      eor.a $$4 = eor.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         elt $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = emb.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = emb.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public emk<?> e() {
      return emk.m;
   }
}
