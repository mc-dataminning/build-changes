import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eqs extends erj {
   public static final MapCodec<eqs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecq.a.g.fieldOf("heightmap").orElse(ecq.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eqs::new)
   );
   private final ecq.a b;
   private final int c;

   public eqs(ecq.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      ecq.a $$6;
      if ($$0 instanceof arc) {
         if (this.b == ecq.a.a) {
            $$6 = ecq.a.b;
         } else if (this.b == ecq.a.c) {
            $$6 = ecq.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ji $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new erm.d(new ji($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected erl<?> a() {
      return erl.g;
   }
}
