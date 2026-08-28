import com.mojang.serialization.MapCodec;

public class ehh extends ehv {
   public static final MapCodec<ehh> a = bpz.b(0, 256).fieldOf("count").xmap(ehh::new, $$0 -> $$0.c);
   private final bpz c;

   private ehh(bpz $$0) {
      this.c = $$0;
   }

   public static ehh a(bpz $$0) {
      return new ehh($$0);
   }

   public static ehh a(int $$0) {
      return a(bpw.a($$0));
   }

   @Override
   protected int a(azh $$0, iz $$1) {
      return this.c.a($$0);
   }

   @Override
   public ehs<?> b() {
      return ehs.f;
   }
}
