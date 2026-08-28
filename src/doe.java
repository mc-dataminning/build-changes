import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doe extends dgv implements dol {
   public static final MapCodec<doe> a = b(doe::new);
   public static final dvf b = dve.F;
   public static final dvf c = dve.C;
   public static final dvf d = dve.G;
   protected static final ezm e = dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jj.a.b);

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, bto $$3) {
      if ($$0 instanceof arh $$4) {
         ari $$5 = dtc.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dru.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if ($$1 instanceof arh $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dru.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dru.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return e;
   }

   @Override
   protected ezm d_(duo $$0) {
      return e;
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new dtc($$0, $$1);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      return this.o().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eqq.c));
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(c) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, cvp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqr.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return !$$0.B ? dgv.a($$2, dru.L, ($$0x, $$1x, $$2x, $$3) -> dzu.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }
}
