import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxc extends dxi {
   final awd<dcv> a;
   public static final Codec<dxc> e = RecordCodecBuilder.create($$0 -> a($$0).and(awd.a(ld.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dxc::new));

   protected dxc(jq $$0, awd<dcv> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dpy $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dwy<?> a() {
      return dwy.b;
   }
}
