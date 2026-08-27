import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eat extends ebj {
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmw.a.g.fieldOf("heightmap").orElse(dmw.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eat::new)
   );
   private final dmw.a b;
   private final int c;

   public eat(dmw.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      dmw.a $$6;
      if ($$0 instanceof ami) {
         if (this.b == dmw.a.a) {
            $$6 = dmw.a.b;
         } else if (this.b == dmw.a.c) {
            $$6 = dmw.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hx $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ebm.c(new hx($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ebl<?> a() {
      return ebl.g;
   }
}
