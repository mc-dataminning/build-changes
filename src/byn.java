import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class byn extends bnc<byl> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aqu l;
   private final aqu m;
   private ejz n;
   private byn.a o = byn.a.d;

   public byn(aqu $$0, aqu $$1) {
      super(ImmutableMap.of(bum.m, bun.b, bum.n, bun.c, bum.o, bun.a, bum.Y, bun.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ami $$0, byl $$1) {
      bll $$2 = $$1.dP().c(bum.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dP().b(bum.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != blx.i && byl.j($$2);
   }

   protected boolean a(ami $$0, byl $$1, long $$2) {
      return $$1.dP().a(bum.o) && this.o != byn.a.d && !$$1.dP().a(bum.Y);
   }

   protected void b(ami $$0, byl $$1, long $$2) {
      bll $$3 = $$1.dP().c(bum.o).get();
      bne.a($$1, $$3);
      $$1.a((bkv)$$3);
      $$1.dP().a(bum.m, new bup($$3.dl(), 2.0F, 0));
      this.k = 10;
      this.o = byn.a.a;
   }

   protected void c(ami $$0, byl $$1, long $$2) {
      $$1.dP().b(bum.o);
      $$1.u();
      $$1.b(blx.a);
   }

   private void b(ami $$0, byl $$1) {
      $$0.a(null, $$1, this.m, aqw.g, 2.0F, 1.0F);
      Optional<bkv> $$2 = $$1.w();
      if ($$2.isPresent()) {
         bkv $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.C($$3);
            if (!$$3.bx()) {
               $$3.a(bkv.c.a);
            }
         }
      }
   }

   protected void d(ami $$0, byl $$1, long $$2) {
      bll $$3 = $$1.dP().c(bum.o).get();
      $$1.a((bkv)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aqw.g, 2.0F, 1.0F);
               $$1.b(blx.j);
               $$3.g($$3.dl().a($$1.dl()).d().a(0.75));
               this.n = $$3.dl();
               this.j = 0;
               this.o = byn.a.b;
            } else if (this.k <= 0) {
               $$1.dP().a(bum.m, new bup($$3.dl(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = byn.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = byn.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(byl $$0, bll $$1) {
      edm $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(byl $$0, bll $$1) {
      List<UUID> $$2 = $$0.dP().c(bum.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dP().a(bum.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
