import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cln extends bzn<clj> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awq l;
   private final awq m;
   private ffs n;
   private cln.a o = cln.a.d;

   public cln(awq $$0, awq $$1) {
      super(ImmutableMap.of(cgy.n, cgz.b, cgy.o, cgz.c, cgy.p, cgz.a, cgy.aa, cgz.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aru $$0, clj $$1) {
      bxw $$2 = $$1.ec().c(cgy.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ec().b(cgy.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.at() != byi.i && clj.i($$2);
   }

   protected boolean a(aru $$0, clj $$1, long $$2) {
      return $$1.ec().a(cgy.p) && this.o != cln.a.d && !$$1.ec().a(cgy.aa);
   }

   protected void b(aru $$0, clj $$1, long $$2) {
      bxw $$3 = $$1.ec().c(cgy.p).get();
      bzp.a($$1, $$3);
      $$1.b($$3);
      $$1.ec().a(cgy.n, new chb($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = cln.a.a;
   }

   protected void c(aru $$0, clj $$1, long $$2) {
      $$1.ec().b(cgy.p);
      $$1.q();
      $$1.b(byi.a);
   }

   private void b(aru $$0, clj $$1) {
      $$0.a(null, $$1, this.m, aws.g, 2.0F, 1.0F);
      Optional<bwv> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bwv $$3 = $$2.get();
         if ($$3.bJ()) {
            $$1.c($$0, $$3);
            if (!$$3.bJ()) {
               $$3.a(bwv.d.a);
            }
         }
      }
   }

   protected void d(aru $$0, clj $$1, long $$2) {
      bxw $$3 = $$1.ec().c(cgy.p).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aws.g, 2.0F, 1.0F);
               $$1.b(byi.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = cln.a.b;
            } else if (this.k <= 0) {
               $$1.ec().a(cgy.n, new chb($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cln.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cln.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(clj $$0, bxw $$1) {
      eye $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(clj $$0, bxw $$1) {
      List<UUID> $$2 = $$0.ec().c(cgy.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.ec().a(cgy.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
