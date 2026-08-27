import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxd extends dxi {
   private final iz<dcv> e;
   public static final Codec<dxd> a = RecordCodecBuilder.create($$0 -> a($$0).and(jk.a(ld.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dxd::new));

   public dxd(jq $$0, iz<dcv> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dpy $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dwy<?> a() {
      return dwy.a;
   }
}
