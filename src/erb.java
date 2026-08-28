import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class erb extends eok {
   public static final MapCodec<erb> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, erb::new)
   );
   public final boolean e;

   public erb(eok.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      edq.a $$1 = this.e ? edq.a.a : edq.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(epc $$0, eok.a $$1) {
      drc $$2 = drc.a($$1.f());
      jh $$3 = new jh($$1.h().d(), 90, $$1.h().e());
      era.a $$4 = era.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
      if ($$4.l()) {
         eoc $$5 = $$4.f();
         int $$7;
         if (this.e) {
            int $$6 = eok.b($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
            $$7 = $$4.a($$6, $$1.f());
         } else {
            $$7 = eok.a($$1, $$5.h(), $$5.d(), $$5.j(), $$5.f());
         }

         $$4.c($$7);
      }
   }

   @Override
   public eot<?> e() {
      return eot.m;
   }
}
