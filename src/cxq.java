import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxq extends cua implements daz {
   public static final MapCodec<cxq> a = b(cxq::new);
   private static final dgs c = dgr.C;
   protected static final eiy b = cua.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<cxq> a() {
      return a;
   }

   protected cxq(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = super.a($$0);
      if ($$1 != null) {
         ebe $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == ebf.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.c();
      dgb $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, hx.a);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !this.a($$0, $$3, $$4)) {
         return cuc.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ebf.c, ebf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
