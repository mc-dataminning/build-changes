import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class chw extends bwc<chu> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awd l;
   private final awd m;
   private eys n;
   private chw.a o = chw.a.d;

   public chw(awd $$0, awd $$1) {
      super(ImmutableMap.of(cdn.m, cdo.b, cdn.n, cdo.c, cdn.o, cdo.a, cdn.Z, cdo.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arh $$0, chu $$1) {
      buk $$2 = $$1.dX().c(cdn.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dX().b(cdn.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.av() != buw.i && chu.j($$2);
   }

   protected boolean a(arh $$0, chu $$1, long $$2) {
      return $$1.dX().a(cdn.o) && this.o != chw.a.d && !$$1.dX().a(cdn.Z);
   }

   protected void b(arh $$0, chu $$1, long $$2) {
      buk $$3 = $$1.dX().c(cdn.o).get();
      bwe.a($$1, $$3);
      $$1.c($$3);
      $$1.dX().a(cdn.m, new cdq($$3.dq(), 2.0F, 0));
      this.k = 10;
      this.o = chw.a.a;
   }

   protected void c(arh $$0, chu $$1, long $$2) {
      $$1.dX().b(cdn.o);
      $$1.q();
      $$1.b(buw.a);
   }

   private void b(arh $$0, chu $$1) {
      $$0.a(null, $$1, this.m, awf.g, 2.0F, 1.0F);
      Optional<bto> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bto $$3 = $$2.get();
         if ($$3.bI()) {
            $$1.E($$3);
            if (!$$3.bI()) {
               $$3.a(bto.c.a);
            }
         }
      }
   }

   protected void d(arh $$0, chu $$1, long $$2) {
      buk $$3 = $$1.dX().c(cdn.o).get();
      $$1.c($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awf.g, 2.0F, 1.0F);
               $$1.b(buw.j);
               $$3.h($$3.dq().a($$1.dq()).d().c(0.75));
               this.n = $$3.dq();
               this.j = 0;
               this.o = chw.a.b;
            } else if (this.k <= 0) {
               $$1.dX().a(cdn.m, new cdq($$3.dq(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = chw.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = chw.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(chu $$0, buk $$1) {
      erd $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(chu $$0, buk $$1) {
      List<UUID> $$2 = $$0.dX().c(cdn.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cD());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cD());
      }

      $$0.dX().a(cdn.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
