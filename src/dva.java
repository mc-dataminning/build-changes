import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dva extends dmo {
   public static final MapCodec<dva> a = b(dva::new);

   @Override
   public MapCodec<dva> a() {
      return a;
   }

   protected dva(ebd.d $$0) {
      super($$0);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.j, $$0.C ? dzu::a : dzu::b);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
