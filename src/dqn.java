import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqn extends dnd implements dkx {
   public static final MapCodec<dqn> c = b(dqn::new);
   public static final int d = 4;
   public static final dzm e = dzc.aw;
   public static final dzk<dzi> f = dnd.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final fdo i = dku.b(6.0, -1.0, 3.0);
   private static final fdo C = dku.b(10.0, -1.0, 5.0);
   private final Function<dym, fdo> Q = this.b();

   @Override
   public MapCodec<dqn> a() {
      return c;
   }

   public dqn(dyl.d $$0) {
      super($$0);
   }

   private Function<dym, fdo> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((dzi)$$1.c(f)) {
            case b -> dku.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dku.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      return this.m();
   }

   @Override
   public fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      if ($$0.c(f) == dzi.b) {
         return $$0.c(e) == 0 ? i : C;
      } else {
         return fdl.a();
      }
   }

   @Override
   public dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dkw.a.m();
      }
   }

   @Override
   public boolean a(dym $$0, dhs $$1, jj $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(dkw.cK);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$1 instanceof arn $$4 && $$3 instanceof cno && $$4.O().c(dhl.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dym $$0, dbn $$1) {
      return false;
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
   }

   @Override
   public boolean f(dym $$0) {
      return $$0.c(f) == dzi.b && !this.q($$0);
   }

   @Override
   public void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      float $$4 = dmq.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arn $$0, dym $$1, jj $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dym $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, dzi.a), 3);
         }
      }
   }

   private static boolean a(dhs $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dkw.ld);
   }

   private static boolean b(dhs $$0, jj $$1) {
      return dmq.a($$0, $$1);
   }

   private static boolean o(dym $$0) {
      return $$0.a(dkw.ld) && $$0.c(f) == dzi.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dhs $$0, jj $$1, dym $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dym $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dqn.a c(dhs $$0, jj $$1, dym $$2) {
      if (o($$2)) {
         return new dqn.a($$1, $$2);
      } else {
         jj $$3 = $$1.e();
         dym $$4 = $$0.a_($$3);
         return o($$4) ? new dqn.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      dqn.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      dqn.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jj a, dym b) {
   }
}
