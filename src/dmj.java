import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmj implements dmb {
   public static final Codec<dmj> a = RecordCodecBuilder.create($$0 -> $$0.group(dmb.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dmj::new));
   private final dmb e;

   public dmj(dmb $$0) {
      this.e = $$0;
   }

   public boolean a(cqr $$0, gw $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dmc<?> a() {
      return dmc.k;
   }
}
