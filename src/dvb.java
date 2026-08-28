import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvb extends dno implements duz {
   public static final MapCodec<dvb> a = b(dvb::new);
   public static final eco<ecy> b = ecg.bk;
   public static final ech c = ecg.I;
   private static final fgw d = dno.b(16.0, 0.0, 8.0);
   private static final fgw e = dno.b(16.0, 8.0, 16.0);

   @Override
   public MapCodec<? extends dvb> a() {
      return a;
   }

   public dvb(ebp.d $$0) {
      super($$0);
      this.l(this.m().b(b, ecy.b).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebq $$0) {
      return $$0.c(b) != ecy.c;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return switch ((ecy)$$0.c(b)) {
         case a -> e;
         case b -> d;
         case c -> fgt.b();
      };
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      iw $$1 = $$0.a();
      ebq $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.b(b, ecy.c).b(c, Boolean.valueOf(false));
      } else {
         eya $$3 = $$0.q().b_($$1);
         ebq $$4 = this.m().b(b, ecy.b).b(c, Boolean.valueOf($$3.a() == eyb.c));
         jc $$5 = $$0.k();
         return $$5 != jc.a && ($$5 == jc.b || !($$0.l().e - (double)$$1.v() > 0.5)) ? $$4 : $$4.b(b, ecy.a);
      }
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      dak $$2 = $$1.n();
      ecy $$3 = $$0.c(b);
      if ($$3 == ecy.c || !$$2.a(this.h())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().e - (double)$$1.a().v() > 0.5;
         jc $$5 = $$1.k();
         return $$3 == ecy.b ? $$5 == jc.b || $$4 && $$5.o().d() : $$5 == jc.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(c) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   public boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      return $$2.c(b) != ecy.c ? duz.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable byf $$0, djn $$1, iw $$2, ebq $$3, exz $$4) {
      return $$3.c(b) != ecy.c ? duz.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      switch ($$1) {
         case a:
            return false;
         case b:
            return $$0.y().a(axs.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
