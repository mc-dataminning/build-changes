import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ecn extends edd {
   public static final Codec<ecn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(doq.a.g.fieldOf("heightmap").orElse(doq.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ecn::new)
   );
   private final doq.a b;
   private final int c;

   public ecn(doq.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      doq.a $$6;
      if ($$0 instanceof and) {
         if (this.b == doq.a.a) {
            $$6 = doq.a.b;
         } else if (this.b == doq.a.c) {
            $$6 = doq.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hx $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new edg.c(new hx($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected edf<?> a() {
      return edf.g;
   }
}
