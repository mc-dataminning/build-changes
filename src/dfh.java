import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfh extends cya implements dfo {
   public static final MapCodec<dfh> a = b(dfh::new);
   public static final dlw b = dlv.F;
   public static final dlw c = dlv.C;
   public static final dlw d = dlv.G;
   protected static final eol e = cyo.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ie.a.b);

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bno $$3) {
      if ($$0 instanceof aov $$4) {
         aow $$5 = dka.a($$3);
         if ($$5 != null) {
            $$4.a($$1, div.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if ($$1 instanceof aov $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, div.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, div.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return e;
   }

   @Override
   protected eol f(dlf $$0, cut $$1, hz $$2) {
      return e;
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dka($$0, $$1);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == egq.c));
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(c) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bkw.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return !$$0.B ? cya.a($$2, div.L, ($$0x, $$1x, $$2x, $$3) -> dpy.c.a($$0x, $$3.gi(), $$3.gj())) : null;
   }
}
