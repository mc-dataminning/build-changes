import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class egl extends ehb {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dso.a.g.fieldOf("heightmap").orElse(dso.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, egl::new)
   );
   private final dso.a b;
   private final int c;

   public egl(dso.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      dso.a $$6;
      if ($$0 instanceof apf) {
         if (this.b == dso.a.a) {
            $$6 = dso.a.b;
         } else if (this.b == dso.a.c) {
            $$6 = dso.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ib $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ehe.c(new ib($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ehd<?> a() {
      return ehd.g;
   }
}
