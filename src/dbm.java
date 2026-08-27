import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbm extends cuf implements dbt {
   public static final MapCodec<dbm> a = b(dbm::new);
   public static final dhn b = dhm.F;
   public static final dhn c = dhm.C;
   public static final dhn d = dhm.G;
   protected static final ekb e = cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(hx.a.b);

   @Override
   public MapCodec<dbm> a() {
      return a;
   }

   public dbm(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bki $$3) {
      if ($$0 instanceof ama $$4) {
         amb $$5 = dfy.a($$3);
         if ($$5 != null) {
            $$4.a($$1, det.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if ($$1 instanceof ama $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, det.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, det.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return e;
   }

   @Override
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      return e;
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfy($$0, $$1);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ech.c));
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bhs.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return !$$0.B ? cuf.a($$2, det.L, ($$0x, $$1x, $$2x, $$3) -> dlp.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }
}
