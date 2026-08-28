import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqe extends dgv implements dqb {
   public static final MapCodec<dqe> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqb.a.e.fieldOf("weathering_state").forGetter(dhw::c), u()).apply($$0, dqe::new)
   );
   private final dqb.a e;

   @Override
   public MapCodec<dqe> a() {
      return d;
   }

   public dqe(dqb.a $$0, dtz.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
