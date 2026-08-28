import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doq extends dmo implements dun {
   public static final MapCodec<doq> a = b(doq::new);
   public static final ebv b = ebu.I;
   private static final fgk c = dnc.a(6.0);

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dyp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.A, $$0.C ? dyp::a : dyp::b);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      exo $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axj.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
