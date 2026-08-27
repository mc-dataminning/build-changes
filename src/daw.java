import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daw extends cwq implements ddq {
   public static final MapCodec<daw> a = b(daw::new);
   public static final djy b = djx.j;
   public static final djy c = djx.C;
   protected static final emm d = emj.a(cwq.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cwq.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final emm e = emj.a(cwq.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cwq.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   public daw(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());

      for (ic $$2 : $$0.f()) {
         if ($$2.o() == ic.a.b) {
            djh $$3 = this.o().a(b, Boolean.valueOf($$2 == ic.b));
            if ($$3.a((cts)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == ees.c));
            }
         }
      }

      return null;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      ic $$3 = h($$0).g();
      return cwq.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ic h(djh $$0) {
      return $$0.c(b) ? ic.a : ic.b;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
