import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class enf extends eko {
   public static final MapCodec<enf> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, enf::new)
   );
   public final boolean e;

   public enf(eko.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      dzw.a $$1 = this.e ? dzw.a.a : dzw.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(elg $$0, eko.a $$1) {
      dnj $$2 = dnj.a($$1.f());
      je $$3 = new je($$1.h().d(), 90, $$1.h().e());
      ene.a $$4 = ene.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         ekg $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eko.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eko.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public ekx<?> e() {
      return ekx.m;
   }
}
