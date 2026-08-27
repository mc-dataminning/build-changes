import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqf implements dpx {
   public static final Codec<dqf> a = RecordCodecBuilder.create($$0 -> $$0.group(dpx.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dqf::new));
   private final dpx e;

   public dqf(dpx $$0) {
      this.e = $$0;
   }

   public boolean a(cuk $$0, hx $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dpy<?> a() {
      return dpy.k;
   }
}
