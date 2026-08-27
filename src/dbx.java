import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbx extends cxa implements cuw, dbt {
   public static final MapCodec<dbx> c = b(dbx::new);
   private static final dhn g = dhm.C;
   public static final dhq d = dhm.R;
   protected static final float e = 6.0F;
   protected static final ekb f = cut.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dbx> a() {
      return c;
   }

   public dbx(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dhs.b).a(g, Boolean.valueOf(false)).a(d, hx.c));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return f;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(arc.bw) || $$1.b_($$2.c()).a(ech.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if (!$$0.x_()) {
         ht $$5 = $$1.c();
         dgw $$6 = cxa.c($$0, $$5, this.o().a(b, dhs.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(g) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      if ($$0.c(b) == dhs.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ht $$3 = $$2.d();
         dgw $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return true;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      if ($$3.c(cxa.b) == dhs.b) {
         ht $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         cuq.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ht $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public float au_() {
      return 0.1F;
   }
}
