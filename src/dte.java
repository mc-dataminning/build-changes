import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dte extends dti {
   private final ip<ehq> e;
   public static final Codec<dte> a = RecordCodecBuilder.create($$0 -> a($$0).and(iz.a(ki.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dte::new));

   public dte(jf $$0, ip<ehq> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dme $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dsy<?> a() {
      return dsy.c;
   }
}
