import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ekz extends eij {
   public static final MapCodec<ekz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, ekz::new)
   );
   public final boolean e;

   public ekz(eij.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      dxt.a $$1 = this.e ? dxt.a.a : dxt.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ejb $$0, eij.a $$1) {
      dll $$2 = dll.a($$1.f());
      iz $$3 = new iz($$1.h().d(), 90, $$1.h().e());
      eky.a $$4 = eky.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eib $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eij.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eij.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eis<?> e() {
      return eis.m;
   }
}
