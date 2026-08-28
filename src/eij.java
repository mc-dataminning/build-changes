import com.mojang.serialization.MapCodec;

public class eij extends eix {
   public static final MapCodec<eij> a = bpv.b(0, 256).fieldOf("count").xmap(eij::new, $$0 -> $$0.c);
   private final bpv c;

   private eij(bpv $$0) {
      this.c = $$0;
   }

   public static eij a(bpv $$0) {
      return new eij($$0);
   }

   public static eij a(int $$0) {
      return a(bps.a($$0));
   }

   @Override
   protected int a(ayv $$0, jd $$1) {
      return this.c.a($$0);
   }

   @Override
   public eiu<?> b() {
      return eiu.f;
   }
}
