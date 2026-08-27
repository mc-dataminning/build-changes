import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dav extends cwp implements ddp {
   public static final MapCodec<dav> a = b(dav::new);
   public static final djx b = djw.j;
   public static final djx c = djw.C;
   protected static final eml d = emi.a(cwp.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cwp.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eml e = emi.a(cwp.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cwp.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   public dav(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());

      for (ic $$2 : $$0.f()) {
         if ($$2.o() == ic.a.b) {
            djg $$3 = this.o().a(b, Boolean.valueOf($$2 == ic.b));
            if ($$3.a((ctr)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eer.c));
            }
         }
      }

      return null;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      ic $$3 = h($$0).g();
      return cwp.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ic h(djg $$0) {
      return $$0.c(b) ? ic.a : ic.b;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
