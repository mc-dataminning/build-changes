import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eoz extends emi {
   public static final MapCodec<eoz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eoz::new)
   );
   public final boolean e;

   public eoz(emi.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      ebq.a $$1 = this.e ? ebq.a.a : ebq.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ena $$0, emi.a $$1) {
      dpd $$2 = dpd.a($$1.f());
      jh $$3 = new jh($$1.h().d(), 90, $$1.h().e());
      eoy.a $$4 = eoy.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         ema $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = emi.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = emi.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public emr<?> e() {
      return emr.m;
   }
}
