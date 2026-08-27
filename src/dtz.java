import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dtz extends due {
   private final ip<daa> e;
   public static final Codec<dtz> a = RecordCodecBuilder.create($$0 -> a($$0).and(ja.a(kj.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dtz::new));

   public dtz(jg $$0, ip<daa> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dmz $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dtu<?> a() {
      return dtu.a;
   }
}
