import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctk extends cua implements daz {
   public static final dgs d = dgr.C;
   private static final eiy a = cua.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected ctk(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends ctk> a();

   protected void a(dgb $$0, cra $$1, ht $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dgb $$0, cqf $$1, ht $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (hx $$3 : hx.values()) {
            if ($$1.b_($$2.a($$3)).a(aqx.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(aqx.a) && $$1.e() == 8));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return a;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return $$1 == hx.a && !this.a($$0, (crc)$$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hx.b);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(d);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(d) ? ebf.c.a(false) : super.c_($$0);
   }
}
