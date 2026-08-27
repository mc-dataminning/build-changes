import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dxx extends dyn {
   public static final Codec<dxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkh.a.g.fieldOf("heightmap").orElse(dkh.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, dxx::new)
   );
   private final dkh.a b;
   private final int c;

   public dxx(dkh.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      dkh.a $$6;
      if ($$0 instanceof aki) {
         if (this.b == dkh.a.a) {
            $$6 = dkh.a.b;
         } else if (this.b == dkh.a.c) {
            $$6 = dkh.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      gv $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new dyq.c(new gv($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected dyp<?> a() {
      return dyp.g;
   }
}
