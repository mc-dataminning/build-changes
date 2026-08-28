import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqf extends dqa implements dqb {
   public static final MapCodec<dqf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqb.a.e.fieldOf("weathering_state").forGetter(dqf::m), u()).apply($$0, dqf::new)
   );
   private final dqb.a f;

   @Override
   protected MapCodec<dqf> a() {
      return e;
   }

   protected dqf(dqb.a $$0, dtz.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dua $$0) {
      return dqb.c($$0.b()).isPresent();
   }

   public dqb.a m() {
      return this.f;
   }
}
