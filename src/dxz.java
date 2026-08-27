import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dxz extends dyp {
   public static final Codec<dxz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkj.a.g.fieldOf("heightmap").orElse(dkj.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dxz::new)
   );
   private final dkj.a b;
   private final int c;

   public dxz(dkj.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      dkj.a $$6;
      if ($$0 instanceof akk) {
         if (this.b == dkj.a.a) {
            $$6 = dkj.a.b;
         } else if (this.b == dkj.a.c) {
            $$6 = dkj.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gu $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dys.c(new gu($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dyr<?> a() {
      return dyr.g;
   }
}
