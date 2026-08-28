import com.mojang.serialization.MapCodec;

public class eoz extends eos {
   public static final MapCodec<eoz> b = ebg.a.fieldOf("state").xmap(ebf.a::b, dne::m).xmap(eoz::new, $$0 -> $$0.c);
   private final dne c;

   public eoz(dne $$0) {
      this.c = $$0;
   }

   @Override
   protected eot<?> a() {
      return eot.f;
   }

   @Override
   public ebg a(azz $$0, iw $$1) {
      jc.a $$2 = jc.a.a($$0);
      return this.c.m().c(dtx.d, $$2);
   }
}
