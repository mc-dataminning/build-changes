import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqk implements dpx {
   public static final Codec<dqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", jb.g).forGetter($$0x -> $$0x.e), djh.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dqk::new)
   );
   private final jb e;
   private final djh f;

   protected dqk(jb $$0, djh $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cuk $$0, hx $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dpy<?> a() {
      return dpy.g;
   }
}
