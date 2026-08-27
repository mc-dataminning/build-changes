import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyf extends cua implements daz {
   public static final MapCodec<cyf> a = b(cyf::new);
   public static final dgs b = dgr.j;
   public static final dgs c = dgr.C;
   protected static final eiy d = eiv.a(cua.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cua.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eiy e = eiv.a(cua.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cua.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<cyf> a() {
      return a;
   }

   public cyf(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());

      for (hx $$2 : $$0.f()) {
         if ($$2.o() == hx.a.b) {
            dgb $$3 = this.o().a(b, Boolean.valueOf($$2 == hx.b));
            if ($$3.a((crc)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == ebf.c));
            }
         }
      }

      return null;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      hx $$3 = h($$0).g();
      return cua.a($$1, $$2.a($$3), $$3.g());
   }

   protected static hx h(dgb $$0) {
      return $$0.c(b) ? hx.a : hx.b;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
