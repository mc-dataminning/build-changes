import com.mojang.serialization.MapCodec;

public class ehn extends eib {
   public static final MapCodec<ehn> a = bpi.b(0, 256).fieldOf("count").xmap(ehn::new, $$0 -> $$0.c);
   private final bpi c;

   private ehn(bpi $$0) {
      this.c = $$0;
   }

   public static ehn a(bpi $$0) {
      return new ehn($$0);
   }

   public static ehn a(int $$0) {
      return a(bpf.a($$0));
   }

   @Override
   protected int a(aym $$0, ja $$1) {
      return this.c.a($$0);
   }

   @Override
   public ehy<?> b() {
      return ehy.f;
   }
}
