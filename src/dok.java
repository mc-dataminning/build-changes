import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dok extends doo {
   private final ik<ecw> e;
   public static final Codec<dok> a = RecordCodecBuilder.create($$0 -> a($$0).and(iu.a(kd.x).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dok::new));

   public dok(ja $$0, ik<ecw> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dhn $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public doe<?> a() {
      return doe.c;
   }
}
