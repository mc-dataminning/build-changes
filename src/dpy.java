import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpy implements dpq {
   public static final Codec<dpy> a = RecordCodecBuilder.create($$0 -> $$0.group(dpq.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dpy::new));
   private final dpq e;

   public dpy(dpq $$0) {
      this.e = $$0;
   }

   public boolean a(cud $$0, hx $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dpr<?> a() {
      return dpr.k;
   }
}
