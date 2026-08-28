import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ckv extends byt<ckr> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awm l;
   private final awm m;
   private fei n;
   private ckv.a o = ckv.a.d;

   public ckv(awm $$0, awm $$1) {
      super(ImmutableMap.of(cge.n, cgf.b, cge.o, cgf.c, cge.p, cgf.a, cge.aa, cgf.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arq $$0, ckr $$1) {
      bxc $$2 = $$1.eb().c(cge.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cge.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bxo.i && ckr.i($$2);
   }

   protected boolean a(arq $$0, ckr $$1, long $$2) {
      return $$1.eb().a(cge.p) && this.o != ckv.a.d && !$$1.eb().a(cge.aa);
   }

   protected void b(arq $$0, ckr $$1, long $$2) {
      bxc $$3 = $$1.eb().c(cge.p).get();
      byv.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cge.n, new cgh($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = ckv.a.a;
   }

   protected void c(arq $$0, ckr $$1, long $$2) {
      $$1.eb().b(cge.p);
      $$1.q();
      $$1.b(bxo.a);
   }

   private void b(arq $$0, ckr $$1) {
      $$0.a(null, $$1, this.m, awo.g, 2.0F, 1.0F);
      Optional<bwd> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bwd $$3 = $$2.get();
         if ($$3.bK()) {
            $$1.c($$0, $$3);
            if (!$$3.bK()) {
               $$3.a(bwd.e.a);
            }
         }
      }
   }

   protected void d(arq $$0, ckr $$1, long $$2) {
      bxc $$3 = $$1.eb().c(cge.p).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awo.g, 2.0F, 1.0F);
               $$1.b(bxo.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = ckv.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cge.n, new cgh($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = ckv.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = ckv.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(ckr $$0, bxc $$1) {
      ewu $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(ckr $$0, bxc $$1) {
      List<UUID> $$2 = $$0.eb().c(cge.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.eb().a(cge.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
