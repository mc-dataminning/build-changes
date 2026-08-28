import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfe(js<awj> d, bst e, bst f) implements dey {
   public static final MapCodec<dfe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awj.b.fieldOf("sound").forGetter(dfe::b),
               bst.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dfe::c),
               bst.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dfe::d)
            )
            .apply($$0, dfe::new)
   );

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      azs $$5 = $$3.dY();
      if (!$$3.bb()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   public js<awj> b() {
      return this.d;
   }

   public bst c() {
      return this.e;
   }

   public bst d() {
      return this.f;
   }
}
