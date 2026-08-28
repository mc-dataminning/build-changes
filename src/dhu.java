import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhu(jg<awx> d, buf e, buf f) implements dho {
   public static final MapCodec<dhu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awx.b.fieldOf("sound").forGetter(dhu::b),
               buf.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dhu::c),
               buf.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dhu::d)
            )
            .apply($$0, dhu::new)
   );

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      bai $$5 = $$3.dY();
      if (!$$3.ba()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dm(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dhu> a() {
      return a;
   }

   public jg<awx> b() {
      return this.d;
   }

   public buf c() {
      return this.e;
   }

   public buf d() {
      return this.f;
   }
}
