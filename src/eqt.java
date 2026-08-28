import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eqt extends erk {
   public static final MapCodec<eqt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecr.a.g.fieldOf("heightmap").orElse(ecr.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eqt::new)
   );
   private final ecr.a b;
   private final int c;

   public eqt(ecr.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      ecr.a $$6;
      if ($$0 instanceof ard) {
         if (this.b == ecr.a.a) {
            $$6 = ecr.a.b;
         } else if (this.b == ecr.a.c) {
            $$6 = ecr.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ji $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ern.d(new ji($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected erm<?> a() {
      return erm.g;
   }
}
