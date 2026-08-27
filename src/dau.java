import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dau extends cwp implements ddp {
   public static final MapCodec<dau> a = b(dau::new);
   public static final dka b = dak.aE;
   public static final djx c = djw.C;
   protected static final float d = 3.0F;
   protected static final eml e = cwp.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eml f = cwp.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eml g = cwp.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eml h = cwp.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dau> a() {
      return a;
   }

   protected dau(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      switch ((ic)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(csu $$0, hx $$1, ic $$2) {
      djg $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cwr.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      if (!$$0.c()) {
         djg $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      djg $$2 = this.o();
      ctr $$3 = $$0.q();
      hx $$4 = $$0.a();
      eeq $$5 = $$0.q().b_($$0.a());

      for (ic $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eer.c));
            }
         }
      }

      return null;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }
}
