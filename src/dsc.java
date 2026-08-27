import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dsc extends dsg {
   private final in<ego> e;
   public static final Codec<dsc> a = RecordCodecBuilder.create($$0 -> a($$0).and(ix.a(kg.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dsc::new));

   public dsc(jd $$0, in<ego> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dlf $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public drw<?> a() {
      return drw.c;
   }
}
