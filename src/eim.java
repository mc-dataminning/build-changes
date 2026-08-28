import com.mojang.serialization.MapCodec;

public class eim extends eja {
   public static final MapCodec<eim> a = bpw.b(0, 256).fieldOf("count").xmap(eim::new, $$0 -> $$0.c);
   private final bpw c;

   private eim(bpw $$0) {
      this.c = $$0;
   }

   public static eim a(bpw $$0) {
      return new eim($$0);
   }

   public static eim a(int $$0) {
      return a(bpt.a($$0));
   }

   @Override
   protected int a(ayw $$0, jd $$1) {
      return this.c.a($$0);
   }

   @Override
   public eix<?> b() {
      return eix.f;
   }
}
