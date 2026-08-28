import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class equ extends erl {
   public static final MapCodec<equ> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecs.a.g.fieldOf("heightmap").orElse(ecs.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, equ::new)
   );
   private final ecs.a b;
   private final int c;

   public equ(ecs.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      ecs.a $$6;
      if ($$0 instanceof arc) {
         if (this.b == ecs.a.a) {
            $$6 = ecs.a.b;
         } else if (this.b == ecs.a.c) {
            $$6 = ecs.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ji $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ero.d(new ji($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ern<?> a() {
      return ern.g;
   }
}
