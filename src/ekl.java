import com.mojang.serialization.MapCodec;

public class ekl extends ekc {
   public static final MapCodec<ekl> b = dww.a.fieldOf("state").xmap(ekl::new, $$0 -> $$0.c);
   private final dww c;

   protected ekl(dww $$0) {
      this.c = $$0;
   }

   @Override
   protected ekd<?> a() {
      return ekd.a;
   }

   @Override
   public dww a(azh $$0, ji $$1) {
      return this.c;
   }
}
