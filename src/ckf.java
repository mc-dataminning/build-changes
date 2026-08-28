import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ckf extends byi<ckd> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awj l;
   private final awj m;
   private fcu n;
   private ckf.a o = ckf.a.d;

   public ckf(awj $$0, awj $$1) {
      super(ImmutableMap.of(cft.n, cfu.b, cft.o, cfu.c, cft.p, cfu.a, cft.aa, cfu.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arn $$0, ckd $$1) {
      bwr $$2 = $$1.eb().c(cft.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cft.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bxd.i && ckd.j($$2);
   }

   protected boolean a(arn $$0, ckd $$1, long $$2) {
      return $$1.eb().a(cft.p) && this.o != ckf.a.d && !$$1.eb().a(cft.aa);
   }

   protected void b(arn $$0, ckd $$1, long $$2) {
      bwr $$3 = $$1.eb().c(cft.p).get();
      byk.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cft.n, new cfw($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = ckf.a.a;
   }

   protected void c(arn $$0, ckd $$1, long $$2) {
      $$1.eb().b(cft.p);
      $$1.q();
      $$1.b(bxd.a);
   }

   private void b(arn $$0, ckd $$1) {
      $$0.a(null, $$1, this.m, awl.g, 2.0F, 1.0F);
      Optional<bvs> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bvs $$3 = $$2.get();
         if ($$3.bK()) {
            $$1.c($$0, $$3);
            if (!$$3.bK()) {
               $$3.a(bvs.e.a);
            }
         }
      }
   }

   protected void d(arn $$0, ckd $$1, long $$2) {
      bwr $$3 = $$1.eb().c(cft.p).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awl.g, 2.0F, 1.0F);
               $$1.b(bxd.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = ckf.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cft.n, new cfw($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = ckf.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = ckf.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(ckd $$0, bwr $$1) {
      evh $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(ckd $$0, bwr $$1) {
      List<UUID> $$2 = $$0.eb().c(cft.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.eb().a(cft.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
