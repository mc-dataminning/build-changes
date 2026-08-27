import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cye extends cua implements daz {
   public static final MapCodec<cye> a = b(cye::new);
   public static final dgv b = cxu.aE;
   public static final dgs c = dgr.C;
   protected static final float d = 3.0F;
   protected static final eiy e = cua.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eiy f = cua.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eiy g = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eiy h = cua.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<cye> a() {
      return a;
   }

   protected cye(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      switch ((hx)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(cqf $$0, ht $$1, hx $$2) {
      dgb $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      hx $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cuc.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, ebf.c, ebf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      if (!$$0.c()) {
         dgb $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dgb $$2 = this.o();
      crc $$3 = $$0.q();
      ht $$4 = $$0.a();
      ebe $$5 = $$0.q().b_($$0.a());

      for (hx $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == ebf.c));
            }
         }
      }

      return null;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }
}
