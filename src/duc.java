import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class duc extends dug {
   private final ip<eio> e;
   public static final Codec<duc> a = RecordCodecBuilder.create($$0 -> a($$0).and(ja.a(kj.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, duc::new));

   public duc(jg $$0, ip<eio> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dnb $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dtw<?> a() {
      return dtw.c;
   }
}
