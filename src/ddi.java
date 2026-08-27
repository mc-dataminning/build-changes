import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddi extends cwb implements ddp {
   public static final MapCodec<ddi> a = b(ddi::new);
   public static final djx b = djw.F;
   public static final djx c = djw.C;
   public static final djx d = djw.G;
   protected static final eml e = cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ic.a.b);

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ddi(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, blu $$3) {
      if ($$0 instanceof and $$4) {
         ane $$5 = dib.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dgw.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if ($$1 instanceof and $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dgw.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dgw.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return e;
   }

   @Override
   public eml f(djg $$0, csu $$1, hx $$2) {
      return e;
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dib($$0, $$1);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eer.c));
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bjc.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return !$$0.B ? cwb.a($$2, dgw.L, ($$0x, $$1x, $$2x, $$3) -> dnz.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }
}
