import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddr extends cwk implements ddy {
   public static final MapCodec<ddr> a = b(ddr::new);
   public static final dkg b = dkf.F;
   public static final dkg c = dkf.C;
   public static final dkg d = dkf.G;
   protected static final emv e = cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ic.a.b);

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   public ddr(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, blw $$3) {
      if ($$0 instanceof ane $$4) {
         anf $$5 = dik.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dhf.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if ($$1 instanceof ane $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dhf.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dhf.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return e;
   }

   @Override
   public emv f(djp $$0, ctd $$1, hx $$2) {
      return e;
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dik($$0, $$1);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == efa.c));
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, cng $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bje.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return !$$0.B ? cwk.a($$2, dhf.L, ($$0x, $$1x, $$2x, $$3) -> doi.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }
}
