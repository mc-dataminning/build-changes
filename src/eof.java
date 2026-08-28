import com.mojang.serialization.MapCodec;

public class eof extends eny {
   public static final MapCodec<eof> b = eao.a.fieldOf("state").xmap(ean.a::b, dmm::m).xmap(eof::new, $$0 -> $$0.c);
   private final dmm c;

   public eof(dmm $$0) {
      this.c = $$0;
   }

   @Override
   protected enz<?> a() {
      return enz.f;
   }

   @Override
   public eao a(azv $$0, iv $$1) {
      jb.a $$2 = jb.a.a($$0);
      return this.c.m().c(dtf.d, $$2);
   }
}
