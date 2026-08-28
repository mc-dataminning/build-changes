import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class elm extends eiw {
   public static final MapCodec<elm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, elm::new)
   );
   public final boolean e;

   public elm(eiw.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      dyf.a $$1 = this.e ? dyf.a.a : dyf.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ejo $$0, eiw.a $$1) {
      dlu $$2 = dlu.a($$1.f());
      ja $$3 = new ja($$1.h().d(), 90, $$1.h().e());
      ell.a $$4 = ell.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eio $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eiw.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eiw.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public ejf<?> e() {
      return ejf.m;
   }
}
