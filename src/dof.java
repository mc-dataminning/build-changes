import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dof extends doj {
   private final ig<ecr> e;
   public static final Codec<dof> a = RecordCodecBuilder.create($$0 -> a($$0).and(iq.a(jz.x).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dof::new));

   public dof(iw $$0, ig<ecr> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dhi $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dnz<?> a() {
      return dnz.c;
   }
}
