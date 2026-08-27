import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daa extends cwj implements ddj {
   public static final MapCodec<daa> a = b(daa::new);
   private static final djr c = djq.C;
   protected static final emf b = cwj.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   protected daa(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = super.a($$0);
      if ($$1 != null) {
         eek $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eel.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.c();
      dja $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ic.a);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !this.a($$0, $$3, $$4)) {
         return cwl.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
