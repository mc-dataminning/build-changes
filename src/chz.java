import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class chz extends bwf<chx> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awf l;
   private final awf m;
   private eyw n;
   private chz.a o = chz.a.d;

   public chz(awf $$0, awf $$1) {
      super(ImmutableMap.of(cdq.m, cdr.b, cdq.n, cdr.c, cdq.o, cdr.a, cdq.Z, cdr.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arj $$0, chx $$1) {
      bun $$2 = $$1.dY().c(cdq.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dY().b(cdq.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.av() != buz.i && chx.j($$2);
   }

   protected boolean a(arj $$0, chx $$1, long $$2) {
      return $$1.dY().a(cdq.o) && this.o != chz.a.d && !$$1.dY().a(cdq.Z);
   }

   protected void b(arj $$0, chx $$1, long $$2) {
      bun $$3 = $$1.dY().c(cdq.o).get();
      bwh.a($$1, $$3);
      $$1.c($$3);
      $$1.dY().a(cdq.m, new cdt($$3.dq(), 2.0F, 0));
      this.k = 10;
      this.o = chz.a.a;
   }

   protected void c(arj $$0, chx $$1, long $$2) {
      $$1.dY().b(cdq.o);
      $$1.q();
      $$1.b(buz.a);
   }

   private void b(arj $$0, chx $$1) {
      $$0.a(null, $$1, this.m, awh.g, 2.0F, 1.0F);
      Optional<btr> $$2 = $$1.t();
      if ($$2.isPresent()) {
         btr $$3 = $$2.get();
         if ($$3.bI()) {
            $$1.E($$3);
            if (!$$3.bI()) {
               $$3.a(btr.c.a);
            }
         }
      }
   }

   protected void d(arj $$0, chx $$1, long $$2) {
      bun $$3 = $$1.dY().c(cdq.o).get();
      $$1.c($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awh.g, 2.0F, 1.0F);
               $$1.b(buz.j);
               $$3.h($$3.dq().a($$1.dq()).d().c(0.75));
               this.n = $$3.dq();
               this.j = 0;
               this.o = chz.a.b;
            } else if (this.k <= 0) {
               $$1.dY().a(cdq.m, new cdt($$3.dq(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = chz.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = chz.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(chx $$0, bun $$1) {
      erh $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(chx $$0, bun $$1) {
      List<UUID> $$2 = $$0.dY().c(cdq.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cD());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cD());
      }

      $$0.dY().a(cdq.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
