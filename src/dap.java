import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dap extends cwj implements ddj {
   public static final MapCodec<dap> a = b(dap::new);
   public static final djr b = djq.j;
   public static final djr c = djq.C;
   protected static final emf d = emc.a(cwj.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cwj.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final emf e = emc.a(cwj.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cwj.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dap> a() {
      return a;
   }

   public dap(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());

      for (ic $$2 : $$0.f()) {
         if ($$2.o() == ic.a.b) {
            dja $$3 = this.o().a(b, Boolean.valueOf($$2 == ic.b));
            if ($$3.a((ctl)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eel.c));
            }
         }
      }

      return null;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      ic $$3 = h($$0).g();
      return cwj.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ic h(dja $$0) {
      return $$0.c(b) ? ic.a : ic.b;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
