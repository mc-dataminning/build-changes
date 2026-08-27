import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eac extends eas {
   public static final Codec<eac> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmf.a.g.fieldOf("heightmap").orElse(dmf.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eac::new)
   );
   private final dmf.a b;
   private final int c;

   public eac(dmf.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      dmf.a $$6;
      if ($$0 instanceof ama) {
         if (this.b == dmf.a.a) {
            $$6 = dmf.a.b;
         } else if (this.b == dmf.a.c) {
            $$6 = dmf.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ht $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eav.c(new ht($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eau<?> a() {
      return eau.g;
   }
}
