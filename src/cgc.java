import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cgc extends buj<cga> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avh l;
   private final avh m;
   private eum n;
   private cgc.a o = cgc.a.d;

   public cgc(avh $$0, avh $$1) {
      super(ImmutableMap.of(cbu.m, cbv.b, cbu.n, cbv.c, cbu.o, cbv.a, cbu.Z, cbv.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqn $$0, cga $$1) {
      bsq $$2 = $$1.dS().c(cbu.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dS().b(cbu.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != btc.i && cga.j($$2);
   }

   protected boolean a(aqn $$0, cga $$1, long $$2) {
      return $$1.dS().a(cbu.o) && this.o != cgc.a.d && !$$1.dS().a(cbu.Z);
   }

   protected void b(aqn $$0, cga $$1, long $$2) {
      bsq $$3 = $$1.dS().c(cbu.o).get();
      bul.a($$1, $$3);
      $$1.b($$3);
      $$1.dS().a(cbu.m, new cbx($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = cgc.a.a;
   }

   protected void c(aqn $$0, cga $$1, long $$2) {
      $$1.dS().b(cbu.o);
      $$1.s();
      $$1.b(btc.a);
   }

   private void b(aqn $$0, cga $$1) {
      $$0.a(null, $$1, this.m, avj.g, 2.0F, 1.0F);
      Optional<brw> $$2 = $$1.u();
      if ($$2.isPresent()) {
         brw $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.C($$3);
            if (!$$3.bD()) {
               $$3.a(brw.c.a);
            }
         }
      }
   }

   protected void d(aqn $$0, cga $$1, long $$2) {
      bsq $$3 = $$1.dS().c(cbu.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avj.g, 2.0F, 1.0F);
               $$1.b(btc.j);
               $$3.g($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = cgc.a.b;
            } else if (this.k <= 0) {
               $$1.dS().a(cbu.m, new cbx($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cgc.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cgc.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cga $$0, bsq $$1) {
      enk $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cga $$0, bsq $$1) {
      List<UUID> $$2 = $$0.dS().c(cbu.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dS().a(cbu.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
