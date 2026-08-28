import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cjo extends bxr<cjm> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avz l;
   private final avz m;
   private fbx n;
   private cjo.a o = cjo.a.d;

   public cjo(avz $$0, avz $$1) {
      super(ImmutableMap.of(cfc.m, cfd.b, cfc.n, cfd.c, cfc.o, cfd.a, cfc.Z, cfd.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ard $$0, cjm $$1) {
      bvy $$2 = $$1.ea().c(cfc.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ea().b(cfc.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bwk.i && cjm.j($$2);
   }

   protected boolean a(ard $$0, cjm $$1, long $$2) {
      return $$1.ea().a(cfc.o) && this.o != cjo.a.d && !$$1.ea().a(cfc.Z);
   }

   protected void b(ard $$0, cjm $$1, long $$2) {
      bvy $$3 = $$1.ea().c(cfc.o).get();
      bxt.a($$1, $$3);
      $$1.b($$3);
      $$1.ea().a(cfc.m, new cff($$3.ds(), 2.0F, 0));
      this.k = 10;
      this.o = cjo.a.a;
   }

   protected void c(ard $$0, cjm $$1, long $$2) {
      $$1.ea().b(cfc.o);
      $$1.q();
      $$1.b(bwk.a);
   }

   private void b(ard $$0, cjm $$1) {
      $$0.a(null, $$1, this.m, awb.g, 2.0F, 1.0F);
      Optional<bva> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bva $$3 = $$2.get();
         if ($$3.bJ()) {
            $$1.c($$0, $$3);
            if (!$$3.bJ()) {
               $$3.a(bva.d.a);
            }
         }
      }
   }

   protected void d(ard $$0, cjm $$1, long $$2) {
      bvy $$3 = $$1.ea().c(cfc.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awb.g, 2.0F, 1.0F);
               $$1.b(bwk.j);
               $$3.i($$3.ds().a($$1.ds()).d().c(0.75));
               this.n = $$3.ds();
               this.j = 0;
               this.o = cjo.a.b;
            } else if (this.k <= 0) {
               $$1.ea().a(cfc.m, new cff($$3.ds(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cjo.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cjo.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cjm $$0, bvy $$1) {
      euk $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cjm $$0, bvy $$1) {
      List<UUID> $$2 = $$0.ea().c(cfc.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cF());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cF());
      }

      $$0.ea().a(cfc.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
