import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eqv extends erm {
   public static final MapCodec<eqv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ect.a.g.fieldOf("heightmap").orElse(ect.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eqv::new)
   );
   private final ect.a b;
   private final int c;

   public eqv(ect.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      ect.a $$6;
      if ($$0 instanceof ard) {
         if (this.b == ect.a.a) {
            $$6 = ect.a.b;
         } else if (this.b == ect.a.c) {
            $$6 = ect.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ji $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new erp.d(new ji($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ero<?> a() {
      return ero.g;
   }
}
