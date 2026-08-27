import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbd extends cwg implements cud, daz {
   public static final MapCodec<dbd> c = b(dbd::new);
   private static final dgs g = dgr.C;
   public static final dgv d = dgr.R;
   protected static final float e = 6.0F;
   protected static final eiy f = cua.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dbd> a() {
      return c;
   }

   public dbd(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dgx.b).a(g, Boolean.valueOf(false)).a(d, hx.c));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return f;
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(aqs.bw) || $$1.b_($$2.c()).a(ebf.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if (!$$0.x_()) {
         ht $$5 = $$1.c();
         dgb $$6 = cwg.c($$0, $$5, this.o().a(b, dgx.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(g) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      if ($$0.c(b) == dgx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ht $$3 = $$2.d();
         dgb $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return true;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      if ($$3.c(cwg.b) == dgx.b) {
         ht $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         ctx.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ht $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float au_() {
      return 0.1F;
   }
}
