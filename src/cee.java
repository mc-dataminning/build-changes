import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cee extends bsl<cec> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aun l;
   private final aun m;
   private esj n;
   private cee.a o = cee.a.d;

   public cee(aun $$0, aun $$1) {
      super(ImmutableMap.of(bzw.m, bzx.b, bzw.n, bzx.c, bzw.o, bzx.a, bzw.Z, bzx.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(apu $$0, cec $$1) {
      bqt $$2 = $$1.dP().c(bzw.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dP().b(bzw.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bre.i && cec.j($$2);
   }

   protected boolean a(apu $$0, cec $$1, long $$2) {
      return $$1.dP().a(bzw.o) && this.o != cee.a.d && !$$1.dP().a(bzw.Z);
   }

   protected void b(apu $$0, cec $$1, long $$2) {
      bqt $$3 = $$1.dP().c(bzw.o).get();
      bsn.a($$1, $$3);
      $$1.b($$3);
      $$1.dP().a(bzw.m, new bzz($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = cee.a.a;
   }

   protected void c(apu $$0, cec $$1, long $$2) {
      $$1.dP().b(bzw.o);
      $$1.r();
      $$1.b(bre.a);
   }

   private void b(apu $$0, cec $$1) {
      $$0.a(null, $$1, this.m, aup.g, 2.0F, 1.0F);
      Optional<bqa> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bqa $$3 = $$2.get();
         if ($$3.bA()) {
            $$1.C($$3);
            if (!$$3.bA()) {
               $$3.a(bqa.c.a);
            }
         }
      }
   }

   protected void d(apu $$0, cec $$1, long $$2) {
      bqt $$3 = $$1.dP().c(bzw.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aup.g, 2.0F, 1.0F);
               $$1.b(bre.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = cee.a.b;
            } else if (this.k <= 0) {
               $$1.dP().a(bzw.m, new bzz($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cee.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cee.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cec $$0, bqt $$1) {
      elp $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cec $$0, bqt $$1) {
      List<UUID> $$2 = $$0.dP().c(bzw.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dP().a(bzw.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
