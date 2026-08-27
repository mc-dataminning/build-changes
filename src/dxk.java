import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxk implements dwx {
   public static final Codec<dxk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.v(16).optionalFieldOf("offset", jq.g).forGetter($$0x -> $$0x.e), dpy.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dxk::new)
   );
   private final jq e;
   private final dpy f;

   protected dxk(jq $$0, dpy $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dap $$0, im $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dwy<?> a() {
      return dwy.g;
   }
}
