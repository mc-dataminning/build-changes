import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqa implements dpx {
   private final jb e;
   private final ic f;
   public static final Codec<dqa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", jb.g).forGetter($$0x -> $$0x.e), ic.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dqa::new)
   );

   public dqa(jb $$0, ic $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cuk $$0, hx $$1) {
      hx $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dpy<?> a() {
      return dpy.d;
   }
}
