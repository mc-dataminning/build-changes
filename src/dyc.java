import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyc extends dys {
   public static final Codec<dyc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkm.a.g.fieldOf("heightmap").orElse(dkm.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dyc::new)
   );
   private final dkm.a b;
   private final int c;

   public dyc(dkm.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      dkm.a $$6;
      if ($$0 instanceof akt) {
         if (this.b == dkm.a.a) {
            $$6 = dkm.a.b;
         } else if (this.b == dkm.a.c) {
            $$6 = dkm.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gw $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dyv.c(new gw($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dyu<?> a() {
      return dyu.g;
   }
}
