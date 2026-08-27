import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyz extends cut implements dbt {
   public static final MapCodec<cyz> a = b(cyz::new);
   public static final dhn b = dhm.j;
   public static final dhn c = dhm.C;
   protected static final ekb d = ejy.a(cut.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cut.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ekb e = ejy.a(cut.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cut.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<cyz> a() {
      return a;
   }

   public cyz(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());

      for (hx $$2 : $$0.f()) {
         if ($$2.o() == hx.a.b) {
            dgw $$3 = this.o().a(b, Boolean.valueOf($$2 == hx.b));
            if ($$3.a((crv)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == ech.c));
            }
         }
      }

      return null;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = h($$0).g();
      return cut.a($$1, $$2.a($$3), $$3.g());
   }

   protected static hx h(dgw $$0) {
      return $$0.c(b) ? hx.a : hx.b;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
