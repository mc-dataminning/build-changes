import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ejn extends ekd {
   public static final Codec<ejn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvq.a.g.fieldOf("heightmap").orElse(dvq.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ejn::new)
   );
   private final dvq.a b;
   private final int c;

   public ejn(dvq.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      dvq.a $$6;
      if ($$0 instanceof aqe) {
         if (this.b == dvq.a.a) {
            $$6 = dvq.a.b;
         } else if (this.b == dvq.a.c) {
            $$6 = dvq.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      im $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ekg.c(new im($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ekf<?> a() {
      return ekf.g;
   }
}
