import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyd extends dyt {
   public static final Codec<dyd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkn.a.g.fieldOf("heightmap").orElse(dkn.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dyd::new)
   );
   private final dkn.a b;
   private final int c;

   public dyd(dkn.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      dkn.a $$6;
      if ($$0 instanceof akn) {
         if (this.b == dkn.a.a) {
            $$6 = dkn.a.b;
         } else if (this.b == dkn.a.c) {
            $$6 = dkn.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gw $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dyw.c(new gw($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dyv<?> a() {
      return dyv.g;
   }
}
