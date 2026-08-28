import com.mojang.serialization.MapCodec;

public class eok extends eod {
   public static final MapCodec<eok> b = eat.a.fieldOf("state").xmap(eas.a::b, dmr::m).xmap(eok::new, $$0 -> $$0.c);
   private final dmr c;

   public eok(dmr $$0) {
      this.c = $$0;
   }

   @Override
   protected eoe<?> a() {
      return eoe.f;
   }

   @Override
   public eat a(azv $$0, iv $$1) {
      jb.a $$2 = jb.a.a($$0);
      return this.c.m().c(dtk.d, $$2);
   }
}
