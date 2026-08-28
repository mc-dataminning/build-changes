import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends dex implements dly {
   public static final MapCodec<dje> a = b(dje::new);
   public static final dsr b = dsq.j;
   public static final dsr c = dsq.C;
   protected static final ewi d = ewf.a(dex.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dex.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ewi e = ewf.a(dex.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dex.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());

      for (je $$2 : $$0.f()) {
         if ($$2.o() == je.a.b) {
            dsa $$3 = this.o().a(b, Boolean.valueOf($$2 == je.b));
            if ($$3.a((dbz)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == enu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      je $$3 = m($$0).g();
      return dex.a($$1, $$2.a($$3), $$3.g());
   }

   protected static je m(dsa $$0) {
      return $$0.c(b) ? je.a : je.b;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
