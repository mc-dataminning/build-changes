import com.mojang.serialization.MapCodec;

public class ehu extends eii {
   public static final MapCodec<ehu> a = bpm.b(0, 256).fieldOf("count").xmap(ehu::new, $$0 -> $$0.c);
   private final bpm c;

   private ehu(bpm $$0) {
      this.c = $$0;
   }

   public static ehu a(bpm $$0) {
      return new ehu($$0);
   }

   public static ehu a(int $$0) {
      return a(bpj.a($$0));
   }

   @Override
   protected int a(ayo $$0, ja $$1) {
      return this.c.a($$0);
   }

   @Override
   public eif<?> b() {
      return eif.f;
   }
}
