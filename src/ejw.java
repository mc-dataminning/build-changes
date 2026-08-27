import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ejw extends ekm {
   public static final Codec<ejw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvz.a.g.fieldOf("heightmap").orElse(dvz.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ejw::new)
   );
   private final dvz.a b;
   private final int c;

   public ejw(dvz.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      dvz.a $$6;
      if ($$0 instanceof aqh) {
         if (this.b == dvz.a.a) {
            $$6 = dvz.a.b;
         } else if (this.b == dvz.a.c) {
            $$6 = dvz.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      in $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ekp.c(new in($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eko<?> a() {
      return eko.g;
   }
}
