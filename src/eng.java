import com.mojang.serialization.MapCodec;

public class eng extends env {
   public static final MapCodec<eng> a = bso.b(0, 256).fieldOf("count").xmap(eng::new, $$0 -> $$0.c);
   private final bso c;

   private eng(bso $$0) {
      this.c = $$0;
   }

   public static eng a(bso $$0) {
      return new eng($$0);
   }

   public static eng a(int $$0) {
      return a(bsl.a($$0));
   }

   @Override
   protected int a(bam $$0, jh $$1) {
      return this.c.a($$0);
   }

   @Override
   public ens<?> b() {
      return ens.f;
   }
}
