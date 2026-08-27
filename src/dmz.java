import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmz implements dmr {
   public static final Codec<dmz> a = RecordCodecBuilder.create($$0 -> $$0.group(dmr.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dmz::new));
   private final dmr e;

   public dmz(dmr $$0) {
      this.e = $$0;
   }

   public boolean a(crt $$0, ht $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dms<?> a() {
      return dms.k;
   }
}
