import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyk extends cut implements dbt {
   public static final MapCodec<cyk> a = b(cyk::new);
   private static final dhn c = dhm.C;
   protected static final ekb b = cut.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<cyk> a() {
      return a;
   }

   protected cyk(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = super.a($$0);
      if ($$1 != null) {
         ecg $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == ech.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.c();
      dgw $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, hx.a);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !this.a($$0, $$3, $$4)) {
         return cuv.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ech.c, ech.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
