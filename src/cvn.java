import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvn extends ctm implements daz {
   public static final MapCodec<cvn> a = b(cvn::new);
   public static final dgs b = dgr.C;
   private static final int d = 3;
   protected static final eiy c = cua.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<cvn> a() {
      return a;
   }

   public cvn(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dej($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.z, $$0.B ? dej::a : dej::b);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.b;
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(b) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      if ($$4.A()) {
         ddx $$5 = $$0.c_($$1);
         if ($$5 instanceof dds) {
            ((dds)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(aqx.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
