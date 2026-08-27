import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dao extends cwj implements ddj {
   public static final MapCodec<dao> a = b(dao::new);
   public static final dju b = dae.aE;
   public static final djr c = djq.C;
   protected static final float d = 3.0F;
   protected static final emf e = cwj.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final emf f = cwj.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final emf g = cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final emf h = cwj.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   protected dao(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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

   private boolean a(cso $$0, hx $$1, ic $$2) {
      dja $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cwl.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      if (!$$0.c()) {
         dja $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dja $$2 = this.o();
      ctl $$3 = $$0.q();
      hx $$4 = $$0.a();
      eek $$5 = $$0.q().b_($$0.a());

      for (ic $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == eel.c));
            }
         }
      }

      return null;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }
}
