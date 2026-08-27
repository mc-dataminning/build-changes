import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyy extends cut implements dbt {
   public static final MapCodec<cyy> a = b(cyy::new);
   public static final dhq b = cyo.aE;
   public static final dhn c = dhm.C;
   protected static final float d = 3.0F;
   protected static final ekb e = cut.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ekb f = cut.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ekb g = cut.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ekb h = cut.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   protected cyy(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      switch ((hx)$$0.c(b)) {
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

   private boolean a(cqy $$0, ht $$1, hx $$2) {
      dgw $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cuv.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ech.c, ech.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      if (!$$0.c()) {
         dgw $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dgw $$2 = this.o();
      crv $$3 = $$0.q();
      ht $$4 = $$0.a();
      ecg $$5 = $$0.q().b_($$0.a());

      for (hx $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == ech.c));
            }
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }
}
