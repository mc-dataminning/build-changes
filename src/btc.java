import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class btc extends bhr<bta> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final amg l;
   private final amg m;
   private eei n;
   private btc.a o = btc.a.d;

   public btc(amg $$0, amg $$1) {
      super(ImmutableMap.of(bpb.m, bpc.b, bpb.n, bpc.c, bpb.o, bpc.a, bpb.Y, bpc.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aif $$0, bta $$1) {
      bfz $$2 = $$1.dK().c(bpb.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dK().b(bpb.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.al() != bgl.i && bta.l($$2);
   }

   protected boolean a(aif $$0, bta $$1, long $$2) {
      return $$1.dK().a(bpb.o) && this.o != btc.a.d && !$$1.dK().a(bpb.Y);
   }

   protected void b(aif $$0, bta $$1, long $$2) {
      bfz $$3 = $$1.dK().c(bpb.o).get();
      bht.a($$1, $$3);
      $$1.a((bfj)$$3);
      $$1.dK().a(bpb.m, new bpe($$3.dg(), 2.0F, 0));
      this.k = 10;
      this.o = btc.a.a;
   }

   protected void c(aif $$0, bta $$1, long $$2) {
      $$1.dK().b(bpb.o);
      $$1.q();
      $$1.b(bgl.a);
   }

   private void b(aif $$0, bta $$1) {
      $$0.a(null, $$1, this.m, ami.g, 2.0F, 1.0F);
      Optional<bfj> $$2 = $$1.r();
      if ($$2.isPresent()) {
         bfj $$3 = $$2.get();
         if ($$3.bs()) {
            $$1.z($$3);
            if (!$$3.bs()) {
               $$3.a(bfj.c.a);
            }
         }
      }
   }

   protected void d(aif $$0, bta $$1, long $$2) {
      bfz $$3 = $$1.dK().c(bpb.o).get();
      $$1.a((bfj)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, ami.g, 2.0F, 1.0F);
               $$1.b(bgl.j);
               $$3.f($$3.dg().a($$1.dg()).d().a(0.75));
               this.n = $$3.dg();
               this.j = 0;
               this.o = btc.a.b;
            } else if (this.k <= 0) {
               $$1.dK().a(bpb.m, new bpe($$3.dg(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = btc.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = btc.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bta $$0, bfz $$1) {
      dxt $$2 = $$0.J().a($$1, 0);
      return $$2 != null && $$2.n() < 1.75F;
   }

   private void b(bta $$0, bfz $$1) {
      List<UUID> $$2 = $$0.dK().c(bpb.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.ct());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.ct());
      }

      $$0.dK().a(bpb.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
