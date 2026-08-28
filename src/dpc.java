import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends dna implements duz {
   public static final MapCodec<dpc> a = b(dpc::new);
   public static final ech b = ecg.I;
   private static final fgw c = dno.a(6.0);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   public dpc(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.A, $$0.C ? dzb::a : dzb::b);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axs.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
