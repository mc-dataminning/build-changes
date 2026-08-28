import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drn extends dod implements dlx {
   public static final MapCodec<drn> c = b(drn::new);
   public static final int d = 4;
   public static final eao e = eae.aw;
   public static final eam<eak> f = dod.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final feq i = dlu.b(6.0, -1.0, 3.0);
   private static final feq C = dlu.b(10.0, -1.0, 5.0);
   private final Function<dzo, feq> Q = this.b();

   @Override
   public MapCodec<drn> a() {
      return c;
   }

   public drn(dzn.d $$0) {
      super($$0);
   }

   private Function<dzo, feq> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((eak)$$1.c(f)) {
            case b -> dlu.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dlu.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      return this.m();
   }

   @Override
   public feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      if ($$0.c(f) == eak.b) {
         return $$0.c(e) == 0 ? i : C;
      } else {
         return fen.a();
      }
   }

   @Override
   public dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dlw.a.m();
      }
   }

   @Override
   public boolean a(dzo $$0, dis $$1, iu $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(dlw.cK);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$1 instanceof aro $$4 && $$3 instanceof cny && $$4.O().c(dil.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dzo $$0, dcl $$1) {
      return false;
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwz $$3, cys $$4) {
   }

   @Override
   public boolean f(dzo $$0) {
      return $$0.c(f) == eak.b && !this.q($$0);
   }

   @Override
   public void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      float $$4 = dnq.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aro $$0, dzo $$1, iu $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dzo $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, eak.a), 3);
         }
      }
   }

   private static boolean a(dis $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dlw.ld);
   }

   private static boolean b(dis $$0, iu $$1) {
      return dnq.a($$0, $$1);
   }

   private static boolean o(dzo $$0) {
      return $$0.a(dlw.ld) && $$0.c(f) == eak.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dis $$0, iu $$1, dzo $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dzo $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private drn.a c(dis $$0, iu $$1, dzo $$2) {
      if (o($$2)) {
         return new drn.a($$1, $$2);
      } else {
         iu $$3 = $$1.e();
         dzo $$4 = $$0.a_($$3);
         return o($$4) ? new drn.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      drn.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      drn.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iu a, dzo b) {
   }
}
