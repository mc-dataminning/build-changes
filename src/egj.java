import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class egj extends egz {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dsm.a.g.fieldOf("heightmap").orElse(dsm.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, egj::new)
   );
   private final dsm.a b;
   private final int c;

   public egj(dsm.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      dsm.a $$6;
      if ($$0 instanceof apf) {
         if (this.b == dsm.a.a) {
            $$6 = dsm.a.b;
         } else if (this.b == dsm.a.c) {
            $$6 = dsm.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ib $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ehc.c(new ib($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ehb<?> a() {
      return ehb.g;
   }
}
