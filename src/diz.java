import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class diz implements dir {
   public static final Codec<diz> a = RecordCodecBuilder.create($$0 -> $$0.group(dir.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, diz::new));
   private final dir e;

   public diz(dir $$0) {
      this.e = $$0;
   }

   public boolean a(cng $$0, gu $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dis<?> a() {
      return dis.k;
   }
}
