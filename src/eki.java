import com.mojang.serialization.MapCodec;

public class eki extends ekb {
   public static final MapCodec<eki> b = dwv.a.fieldOf("state").xmap(dwu.a::b, djk::m).xmap(eki::new, $$0 -> $$0.c);
   private final djk c;

   public eki(djk $$0) {
      this.c = $$0;
   }

   @Override
   protected ekc<?> a() {
      return ekc.f;
   }

   @Override
   public dwv a(azg $$0, ji $$1) {
      jn.a $$2 = jn.a.a($$0);
      return this.c.m().c(dqb.i, $$2);
   }
}
