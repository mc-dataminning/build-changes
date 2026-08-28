import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class due extends dmo implements dun {
   public static final MapCodec<due> a = b(due::new);
   public static final ebv b = ebu.C;
   public static final ebv c = ebu.I;
   public static final ebv d = ebu.e;
   private static final fgk f = dnc.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jb.a.b);

   @Override
   public MapCodec<due> a() {
      return a;
   }

   public due(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bwt $$3) {
      if ($$0 instanceof ars $$4) {
         art $$5 = dzo.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dye.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dye.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return f;
   }

   @Override
   protected fgk d_(ebe $$0) {
      return f;
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzo($$0, $$1);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == exp.c));
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, czy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btt.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return !$$0.C ? dmo.a($$2, dye.M, ($$0x, $$1x, $$2x, $$3) -> egn.c.a($$0x, $$3.x(), $$3.gu())) : null;
   }
}
