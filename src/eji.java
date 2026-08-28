import com.mojang.serialization.MapCodec;

public class eji extends ejb {
   public static final MapCodec<eji> b = dvv.a.fieldOf("state").xmap(dvu.a::b, diq::m).xmap(eji::new, $$0 -> $$0.c);
   private final diq c;

   public eji(diq $$0) {
      this.c = $$0;
   }

   @Override
   protected ejc<?> a() {
      return ejc.f;
   }

   @Override
   public dvv a(azu $$0, jh $$1) {
      jm.a $$2 = jm.a.a($$0);
      return this.c.m().c(dpc.i, $$2);
   }
}
