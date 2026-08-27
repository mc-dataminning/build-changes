import com.mojang.serialization.MapCodec;

public class eej extends eec {
   public static final MapCodec<eej> b = drb.b.fieldOf("state").xmap(dra.a::b, ddy::n).xmap(eej::new, $$0 -> $$0.c);
   private final ddy c;

   public eej(ddy $$0) {
      this.c = $$0;
   }

   @Override
   protected eed<?> a() {
      return eed.f;
   }

   @Override
   public drb a(ayk $$0, io $$1) {
      it.a $$2 = it.a.a($$0);
      return this.c.n().a(dkk.i, $$2);
   }
}
