import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cdx extends bsg<cdv> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aul l;
   private final aul m;
   private esa n;
   private cdx.a o = cdx.a.d;

   public cdx(aul $$0, aul $$1) {
      super(ImmutableMap.of(bzr.m, bzs.b, bzr.n, bzs.c, bzr.o, bzs.a, bzr.Z, bzs.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aps $$0, cdv $$1) {
      bqo $$2 = $$1.dP().c(bzr.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dP().b(bzr.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bqz.i && cdv.j($$2);
   }

   protected boolean a(aps $$0, cdv $$1, long $$2) {
      return $$1.dP().a(bzr.o) && this.o != cdx.a.d && !$$1.dP().a(bzr.Z);
   }

   protected void b(aps $$0, cdv $$1, long $$2) {
      bqo $$3 = $$1.dP().c(bzr.o).get();
      bsi.a($$1, $$3);
      $$1.b($$3);
      $$1.dP().a(bzr.m, new bzu($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = cdx.a.a;
   }

   protected void c(aps $$0, cdv $$1, long $$2) {
      $$1.dP().b(bzr.o);
      $$1.r();
      $$1.b(bqz.a);
   }

   private void b(aps $$0, cdv $$1) {
      $$0.a(null, $$1, this.m, aun.g, 2.0F, 1.0F);
      Optional<bpv> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bpv $$3 = $$2.get();
         if ($$3.bA()) {
            $$1.C($$3);
            if (!$$3.bA()) {
               $$3.a(bpv.c.a);
            }
         }
      }
   }

   protected void d(aps $$0, cdv $$1, long $$2) {
      bqo $$3 = $$1.dP().c(bzr.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aun.g, 2.0F, 1.0F);
               $$1.b(bqz.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = cdx.a.b;
            } else if (this.k <= 0) {
               $$1.dP().a(bzr.m, new bzu($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cdx.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cdx.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cdv $$0, bqo $$1) {
      elg $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cdv $$0, bqo $$1) {
      List<UUID> $$2 = $$0.dP().c(bzr.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dP().a(bzr.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
