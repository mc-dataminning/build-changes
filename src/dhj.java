import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhj(jf<dfx> c, btl d) implements dhf {
   public static final MapCodec<dhj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfx.c.fieldOf("enchantment").forGetter(dhj::b), btl.c.fieldOf("level").forGetter(dhj::c)).apply($$0, dhj::new)
   );

   @Override
   public void a(czk $$0, dgd.a $$1, azv $$2, bue $$3) {
      $$1.b(this.c, azm.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dhj> a() {
      return b;
   }

   public jf<dfx> b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }
}
