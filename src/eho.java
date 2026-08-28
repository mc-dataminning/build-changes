import com.mojang.serialization.MapCodec;

public class eho extends ehh {
   public static final MapCodec<eho> b = dua.a.fieldOf("state").xmap(dtz.a::b, dgv::o).xmap(eho::new, $$0 -> $$0.c);
   private final dgv c;

   public eho(dgv $$0) {
      this.c = $$0;
   }

   @Override
   protected ehi<?> a() {
      return ehi.f;
   }

   @Override
   public dua a(azk $$0, je $$1) {
      jj.a $$2 = jj.a.a($$0);
      return this.c.o().c(dni.i, $$2);
   }
}
