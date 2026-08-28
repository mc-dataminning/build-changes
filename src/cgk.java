import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cgk extends bur<cgi> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final ave l;
   private final ave m;
   private evz n;
   private cgk.a o = cgk.a.d;

   public cgk(ave $$0, ave $$1) {
      super(ImmutableMap.of(ccc.m, ccd.b, ccc.n, ccd.c, ccc.o, ccd.a, ccc.Z, ccd.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqk $$0, cgi $$1) {
      bsy $$2 = $$1.dT().c(ccc.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dT().b(ccc.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != btk.i && cgi.j($$2);
   }

   protected boolean a(aqk $$0, cgi $$1, long $$2) {
      return $$1.dT().a(ccc.o) && this.o != cgk.a.d && !$$1.dT().a(ccc.Z);
   }

   protected void b(aqk $$0, cgi $$1, long $$2) {
      bsy $$3 = $$1.dT().c(ccc.o).get();
      but.a($$1, $$3);
      $$1.b($$3);
      $$1.dT().a(ccc.m, new ccf($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = cgk.a.a;
   }

   protected void c(aqk $$0, cgi $$1, long $$2) {
      $$1.dT().b(ccc.o);
      $$1.s();
      $$1.b(btk.a);
   }

   private void b(aqk $$0, cgi $$1) {
      $$0.a(null, $$1, this.m, avg.g, 2.0F, 1.0F);
      Optional<bsd> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bsd $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.D($$3);
            if (!$$3.bD()) {
               $$3.a(bsd.c.a);
            }
         }
      }
   }

   protected void d(aqk $$0, cgi $$1, long $$2) {
      bsy $$3 = $$1.dT().c(ccc.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avg.g, 2.0F, 1.0F);
               $$1.b(btk.j);
               $$3.h($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = cgk.a.b;
            } else if (this.k <= 0) {
               $$1.dT().a(ccc.m, new ccf($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cgk.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cgk.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgi $$0, bsy $$1) {
      eop $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgi $$0, bsy $$1) {
      List<UUID> $$2 = $$0.dT().c(ccc.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dT().a(ccc.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
