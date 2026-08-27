import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxe extends dxi {
   private final iz<elq> e;
   public static final Codec<dxe> a = RecordCodecBuilder.create($$0 -> a($$0).and(jk.a(ld.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dxe::new));

   public dxe(jq $$0, iz<elq> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dpy $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dwy<?> a() {
      return dwy.c;
   }
}
