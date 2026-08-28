import com.mojang.serialization.MapCodec;

public class eic extends ehv {
   public static final MapCodec<eic> b = duo.a.fieldOf("state").xmap(dun.a::b, dhj::o).xmap(eic::new, $$0 -> $$0.c);
   private final dhj c;

   public eic(dhj $$0) {
      this.c = $$0;
   }

   @Override
   protected ehw<?> a() {
      return ehw.f;
   }

   @Override
   public duo a(azl $$0, je $$1) {
      jj.a $$2 = jj.a.a($$0);
      return this.c.o().c(dnw.i, $$2);
   }
}
