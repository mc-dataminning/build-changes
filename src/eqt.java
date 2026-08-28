import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eqt extends eoc {
   public static final MapCodec<eqt> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eqt::new)
   );
   public final boolean e;

   public eqt(eoc.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      edi.a $$1 = this.e ? edi.a.a : edi.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(eou $$0, eoc.a $$1) {
      dqu $$2 = dqu.a($$1.f());
      jh $$3 = new jh($$1.h().d(), 90, $$1.h().e());
      eqs.a $$4 = eqs.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         enu $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eoc.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eoc.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eol<?> e() {
      return eol.m;
   }
}
