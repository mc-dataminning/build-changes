import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class doj extends doo {
   private final ik<cvf> e;
   public static final Codec<doj> a = RecordCodecBuilder.create($$0 -> a($$0).and(iu.a(kd.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, doj::new));

   public doj(ja $$0, ik<cvf> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dhn $$0) {
      return $$0.a(this.e);
   }

   @Override
   public doe<?> a() {
      return doe.a;
   }
}
