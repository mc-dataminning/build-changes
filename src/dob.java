import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dob extends djd implements dgy, dnx {
   public static final MapCodec<dob> c = b(dob::new);
   private static final dur g = duq.C;
   public static final duu d = duq.R;
   protected static final float e = 6.0F;
   protected static final eyx f = dgv.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dob> a() {
      return c;
   }

   public dob(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, duw.b).b(g, Boolean.valueOf(false)).b(d, jj.c));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return f;
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(aws.by) || $$1.b_($$2.d()).a(eqc.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
      if (!$$0.w_()) {
         je $$5 = $$1.d();
         dua $$6 = djd.c($$0, $$5, this.o().b(b, duw.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(g) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      if ($$0.c(b) == duw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         je $$3 = $$2.e();
         dua $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return true;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      if ($$3.c(djd.b) == duw.b) {
         je $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dgs.a($$0, $$1, $$2, $$3.c(d));
      } else {
         je $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float aw_() {
      return 0.1F;
   }
}
