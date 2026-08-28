import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duq extends dna implements duz {
   public static final MapCodec<duq> a = b(duq::new);
   public static final ech b = ecg.C;
   public static final ech c = ecg.I;
   public static final ech d = ecg.e;
   private static final fgw f = dno.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jc.a.b);

   @Override
   public MapCodec<duq> a() {
      return a;
   }

   public duq(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, bxe $$3) {
      if ($$0 instanceof asb $$4) {
         asc $$5 = eaa.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dyq.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dyq.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return f;
   }

   @Override
   protected fgw d_(ebq $$0) {
      return f;
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new eaa($$0, $$1);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eyb.c));
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(c) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bue.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return !$$0.C ? dna.a($$2, dyq.M, ($$0x, $$1x, $$2x, $$3) -> egz.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }
}
