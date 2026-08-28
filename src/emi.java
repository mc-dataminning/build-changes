import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emi extends ejr {
   public static final MapCodec<emi> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, emi::new)
   );
   public final boolean e;

   public emi(ejr.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      dyy.a $$1 = this.e ? dyy.a.a : dyy.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ekj $$0, ejr.a $$1) {
      dmm $$2 = dmm.a($$1.f());
      jd $$3 = new jd($$1.h().d(), 90, $$1.h().e());
      emh.a $$4 = emh.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         ejj $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = ejr.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = ejr.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eka<?> e() {
      return eka.m;
   }
}
