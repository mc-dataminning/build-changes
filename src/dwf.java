import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwf extends dwj {
   private final ip<ekr> e;
   public static final Codec<dwf> a = RecordCodecBuilder.create($$0 -> a($$0).and(ja.a(ks.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dwf::new));

   public dwf(jg $$0, ip<ekr> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(doz $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dvz<?> a() {
      return dvz.c;
   }
}
