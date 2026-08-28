import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cin extends bwt<cil> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awk l;
   private final awk m;
   private ezn n;
   private cin.a o = cin.a.d;

   public cin(awk $$0, awk $$1) {
      super(ImmutableMap.of(cee.m, cef.b, cee.n, cef.c, cee.o, cef.a, cee.Z, cef.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arn $$0, cil $$1) {
      bva $$2 = $$1.ed().c(cee.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ed().b(cee.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ay() != bvm.i && cil.j($$2);
   }

   protected boolean a(arn $$0, cil $$1, long $$2) {
      return $$1.ed().a(cee.o) && this.o != cin.a.d && !$$1.ed().a(cee.Z);
   }

   protected void b(arn $$0, cil $$1, long $$2) {
      bva $$3 = $$1.ed().c(cee.o).get();
      bwv.a($$1, $$3);
      $$1.c($$3);
      $$1.ed().a(cee.m, new ceh($$3.dv(), 2.0F, 0));
      this.k = 10;
      this.o = cin.a.a;
   }

   protected void c(arn $$0, cil $$1, long $$2) {
      $$1.ed().b(cee.o);
      $$1.q();
      $$1.b(bvm.a);
   }

   private void b(arn $$0, cil $$1) {
      $$0.a(null, $$1, this.m, awm.g, 2.0F, 1.0F);
      Optional<bue> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bue $$3 = $$2.get();
         if ($$3.bM()) {
            $$1.E($$3);
            if (!$$3.bM()) {
               $$3.a(bue.c.a);
            }
         }
      }
   }

   protected void d(arn $$0, cil $$1, long $$2) {
      bva $$3 = $$1.ed().c(cee.o).get();
      $$1.c($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awm.g, 2.0F, 1.0F);
               $$1.b(bvm.j);
               $$3.h($$3.dv().a($$1.dv()).d().c(0.75));
               this.n = $$3.dv();
               this.j = 0;
               this.o = cin.a.b;
            } else if (this.k <= 0) {
               $$1.ed().a(cee.m, new ceh($$3.dv(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cin.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cin.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cil $$0, bva $$1) {
      ery $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cil $$0, bva $$1) {
      List<UUID> $$2 = $$0.ed().c(cee.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cH());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cH());
      }

      $$0.ed().a(cee.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
