import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dza extends dzq {
   public static final Codec<dza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlk.a.g.fieldOf("heightmap").orElse(dlk.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dza::new)
   );
   private final dlk.a b;
   private final int c;

   public dza(dlk.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      dlk.a $$6;
      if ($$0 instanceof alq) {
         if (this.b == dlk.a.a) {
            $$6 = dlk.a.b;
         } else if (this.b == dlk.a.c) {
            $$6 = dlk.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ht $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dzt.c(new ht($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dzs<?> a() {
      return dzs.g;
   }
}
