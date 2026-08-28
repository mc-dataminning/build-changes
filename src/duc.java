import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duc extends dmo {
   public static final MapCodec<duc> a = b(duc::new);
   public static final ebv b = ebu.c;
   private final btw c = btt.a(5);

   @Override
   public MapCodec<duc> a() {
      return a;
   }

   public duc(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? null : a($$2, dye.L, dzm::a);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
