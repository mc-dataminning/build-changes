import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ecm extends edc {
   public static final Codec<ecm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dop.a.g.fieldOf("heightmap").orElse(dop.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ecm::new)
   );
   private final dop.a b;
   private final int c;

   public ecm(dop.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      dop.a $$6;
      if ($$0 instanceof and) {
         if (this.b == dop.a.a) {
            $$6 = dop.a.b;
         } else if (this.b == dop.a.c) {
            $$6 = dop.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hx $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new edf.c(new hx($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ede<?> a() {
      return ede.g;
   }
}
