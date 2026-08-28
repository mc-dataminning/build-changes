import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqi extends dpj implements dqb {
   public static final MapCodec<dqi> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dup.a.fieldOf("block_set_type").forGetter(dpj::m), dqb.a.e.fieldOf("weathering_state").forGetter(dqi::n), u()).apply($$0, dqi::new)
   );
   private final dqb.a n;

   @Override
   public MapCodec<dqi> a() {
      return m;
   }

   protected dqi(dup $$0, dqb.a $$1, dtz.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dua $$0) {
      return dqb.c($$0.b()).isPresent();
   }

   public dqb.a n() {
      return this.n;
   }
}
