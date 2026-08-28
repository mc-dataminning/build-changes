import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlz extends der implements dmg {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dsy b = dsx.F;
   public static final dsy c = dsx.C;
   public static final dsy d = dsx.G;
   protected static final ews e = dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jf.a.b);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsd $$3) {
      if ($$0 instanceof aqk $$4) {
         aql $$5 = dqv.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dpp.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if ($$1 instanceof aqk $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dpp.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dpp.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return e;
   }

   @Override
   protected ews f(dsh $$0, dbj $$1, ja $$2) {
      return e;
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqv($$0, $$1);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eoc.c));
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(c) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, cua $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpf.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return !$$0.B ? der.a($$2, dpp.L, ($$0x, $$1x, $$2x, $$3) -> dxj.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
