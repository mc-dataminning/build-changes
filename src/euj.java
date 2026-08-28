import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class euj extends eva {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egg.a.g.fieldOf("heightmap").orElse(egg.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, euj::new)
   );
   private final egg.a b;
   private final int c;

   public euj(egg.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      egg.a $$6;
      if ($$0 instanceof arq) {
         if (this.b == egg.a.a) {
            $$6 = egg.a.b;
         } else if (this.b == egg.a.c) {
            $$6 = egg.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      iu $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new evd.d(new iu($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected evc<?> a() {
      return evc.g;
   }
}
