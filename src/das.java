import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class das extends ctm implements daz {
   public static final MapCodec<das> a = b(das::new);
   public static final dgs b = dgr.F;
   public static final dgs c = dgr.C;
   public static final dgs d = dgr.G;
   protected static final eiy e = cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(hx.a.b);

   @Override
   public MapCodec<das> a() {
      return a;
   }

   public das(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bjt $$3) {
      if ($$0 instanceof alq $$4) {
         alr $$5 = dfd.a($$3);
         if ($$5 != null) {
            $$4.a($$1, ddz.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if ($$1 instanceof alq $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, ddz.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, ddz.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return e;
   }

   @Override
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      return e;
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dfd($$0, $$1);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ebf.c));
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ckj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bhd.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return !$$0.B ? ctm.a($$2, ddz.L, ($$0x, $$1x, $$2x, $$3) -> dku.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }
}
