import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duo extends dna {
   public static final MapCodec<duo> a = b(duo::new);
   public static final ech b = ecg.c;
   private final buh c = bue.a(5);

   @Override
   public MapCodec<duo> a() {
      return a;
   }

   public duo(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? null : a($$2, dyq.L, dzy::a);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
