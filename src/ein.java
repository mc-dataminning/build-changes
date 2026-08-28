import com.mojang.serialization.MapCodec;

public class ein extends ejc {
   public static final MapCodec<ein> a = bpw.b(0, 256).fieldOf("count").xmap(ein::new, $$0 -> $$0.c);
   private final bpw c;

   private ein(bpw $$0) {
      this.c = $$0;
   }

   public static ein a(bpw $$0) {
      return new ein($$0);
   }

   public static ein a(int $$0) {
      return a(bpt.a($$0));
   }

   @Override
   protected int a(ayw $$0, jd $$1) {
      return this.c.a($$0);
   }

   @Override
   public eiz<?> b() {
      return eiz.f;
   }
}
