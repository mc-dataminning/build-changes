import com.mojang.serialization.MapCodec;

public class efw extends efp {
   public static final MapCodec<efw> b = dsk.b.fieldOf("state").xmap(dsj.a::b, dfh::o).xmap(efw::new, $$0 -> $$0.c);
   private final dfh c;

   public efw(dfh $$0) {
      this.c = $$0;
   }

   @Override
   protected efq<?> a() {
      return efq.f;
   }

   @Override
   public dsk a(ayo $$0, ja $$1) {
      jf.a $$2 = jf.a.a($$0);
      return this.c.o().a(dlt.i, $$2);
   }
}
