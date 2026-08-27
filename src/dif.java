import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dif extends ddy implements dkz {
   public static final MapCodec<dif> a = b(dif::new);
   public static final drs b = drr.j;
   public static final drs c = drr.C;
   protected static final evd d = eva.a(ddy.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), ddy.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final evd e = eva.a(ddy.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), ddy.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   public dif(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());

      for (it $$2 : $$0.f()) {
         if ($$2.o() == it.a.b) {
            drb $$3 = this.n().a(b, Boolean.valueOf($$2 == it.b));
            if ($$3.a((dba)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == emv.c));
            }
         }
      }

      return null;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      it $$3 = m($$0).g();
      return ddy.a($$1, $$2.a($$3), $$3.g());
   }

   protected static it m(drb $$0) {
      return $$0.c(b) ? it.a : it.b;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
