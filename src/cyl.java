import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyl extends cwk implements ddy {
   public static final MapCodec<cyl> a = b(cyl::new);
   public static final dkg b = dkf.C;
   private static final int d = 3;
   protected static final emv c = cwy.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cyl> a() {
      return a;
   }

   public cyl(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.z, $$0.B ? dhp::a : dhp::b);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.b;
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(b) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dgy) {
            ((dgy)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(asn.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
