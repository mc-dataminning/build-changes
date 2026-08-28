import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cha extends bvh<cgy> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avo l;
   private final avo m;
   private exa n;
   private cha.a o = cha.a.d;

   public cha(avo $$0, avo $$1) {
      super(ImmutableMap.of(ccs.m, cct.b, ccs.n, cct.c, ccs.o, cct.a, ccs.Z, cct.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqu $$0, cgy $$1) {
      btn $$2 = $$1.dU().c(ccs.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dU().b(ccs.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.at() != bua.i && cgy.j($$2);
   }

   protected boolean a(aqu $$0, cgy $$1, long $$2) {
      return $$1.dU().a(ccs.o) && this.o != cha.a.d && !$$1.dU().a(ccs.Z);
   }

   protected void b(aqu $$0, cgy $$1, long $$2) {
      btn $$3 = $$1.dU().c(ccs.o).get();
      bvj.a($$1, $$3);
      $$1.c($$3);
      $$1.dU().a(ccs.m, new ccv($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = cha.a.a;
   }

   protected void c(aqu $$0, cgy $$1, long $$2) {
      $$1.dU().b(ccs.o);
      $$1.s();
      $$1.b(bua.a);
   }

   private void b(aqu $$0, cgy $$1) {
      $$0.a(null, $$1, this.m, avq.g, 2.0F, 1.0F);
      Optional<bsr> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bsr $$3 = $$2.get();
         if ($$3.bE()) {
            $$1.D($$3);
            if (!$$3.bE()) {
               $$3.a(bsr.c.a);
            }
         }
      }
   }

   protected void d(aqu $$0, cgy $$1, long $$2) {
      btn $$3 = $$1.dU().c(ccs.o).get();
      $$1.c($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avq.g, 2.0F, 1.0F);
               $$1.b(bua.j);
               $$3.i($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = cha.a.b;
            } else if (this.k <= 0) {
               $$1.dU().a(ccs.m, new ccv($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cha.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cha.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgy $$0, btn $$1) {
      epq $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgy $$0, btn $$1) {
      List<UUID> $$2 = $$0.dU().c(ccs.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cA());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cA());
      }

      $$0.dU().a(ccs.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
