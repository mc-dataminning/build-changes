import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dxy extends dyo {
   public static final Codec<dxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dki.a.g.fieldOf("heightmap").orElse(dki.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dxy::new)
   );
   private final dki.a b;
   private final int c;

   public dxy(dki.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      dki.a $$6;
      if ($$0 instanceof akk) {
         if (this.b == dki.a.a) {
            $$6 = dki.a.b;
         } else if (this.b == dki.a.c) {
            $$6 = dki.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gu $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dyr.c(new gu($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dyq<?> a() {
      return dyq.g;
   }
}
