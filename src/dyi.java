import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyi extends dyy {
   public static final Codec<dyi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dks.a.g.fieldOf("heightmap").orElse(dks.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dyi::new)
   );
   private final dks.a b;
   private final int c;

   public dyi(dks.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      dks.a $$6;
      if ($$0 instanceof akq) {
         if (this.b == dks.a.a) {
            $$6 = dks.a.b;
         } else if (this.b == dks.a.c) {
            $$6 = dks.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gw $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dzb.c(new gw($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dza<?> a() {
      return dza.g;
   }
}
