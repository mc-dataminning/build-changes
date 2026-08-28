import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dsi extends dno implements duz {
   public static final MapCodec<dsi> a = b(dsi::new);
   public static final int b = 15;
   public static final ecq c = ecg.aS;
   public static final ech d = ecg.I;
   public static final ToIntFunction<ebq> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   public dsi(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bvc.b;
      } else {
         return bvc.c;
      }
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$3.a(dao.ig) ? fgt.b() : fgt.a();
   }

   @Override
   protected boolean e_(ebq $$0) {
      return $$0.y().c();
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }

   @Override
   protected float c(ebq $$0, djn $$1, iw $$2) {
      return 1.0F;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(d) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static dak a(dak $$0, int $$1) {
      $$0.b(kl.aq, dck.a.a(c, $$1));
      return $$0;
   }
}
