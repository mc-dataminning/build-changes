import com.mojang.serialization.MapCodec;

public class eox extends eoq {
   public static final MapCodec<eox> b = ebe.a.fieldOf("state").xmap(ebd.a::b, dnc::m).xmap(eox::new, $$0 -> $$0.c);
   private final dnc c;

   public eox(dnc $$0) {
      this.c = $$0;
   }

   @Override
   protected eor<?> a() {
      return eor.f;
   }

   @Override
   public ebe a(azx $$0, iv $$1) {
      jb.a $$2 = jb.a.a($$0);
      return this.c.m().c(dtv.d, $$2);
   }
}
