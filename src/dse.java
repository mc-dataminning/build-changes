import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dse extends dsg {
   public static final Codec<dse> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dse::new));

   public dse(jd $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlf $$0) {
      return $$0.r();
   }

   @Override
   public drw<?> a() {
      return drw.f;
   }
}
