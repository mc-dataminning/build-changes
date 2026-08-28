import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class civ extends bxb<cit> {
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
   private fbb n;
   private civ.a o = civ.a.d;

   public civ(avz $$0, avz $$1) {
      super(ImmutableMap.of(cem.m, cen.b, cem.n, cen.c, cem.o, cen.a, cem.Z, cen.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ard $$0, cit $$1) {
      bvi $$2 = $$1.eb().c(cem.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cem.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bvu.i && cit.j($$2);
   }

   protected boolean a(ard $$0, cit $$1, long $$2) {
      return $$1.eb().a(cem.o) && this.o != civ.a.d && !$$1.eb().a(cem.Z);
   }

   protected void b(ard $$0, cit $$1, long $$2) {
      bvi $$3 = $$1.eb().c(cem.o).get();
      bxd.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cem.m, new cep($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = civ.a.a;
   }

   protected void c(ard $$0, cit $$1, long $$2) {
      $$1.eb().b(cem.o);
      $$1.p();
      $$1.b(bvu.a);
   }

   private void b(ard $$0, cit $$1) {
      $$0.a(null, $$1, this.m, awb.g, 2.0F, 1.0F);
      Optional<bum> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bum $$3 = $$2.get();
         if ($$3.bL()) {
            $$1.c($$0, $$3);
            if (!$$3.bL()) {
               $$3.a(bum.d.a);
            }
         }
      }
   }

   protected void d(ard $$0, cit $$1, long $$2) {
      bvi $$3 = $$1.eb().c(cem.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awb.g, 2.0F, 1.0F);
               $$1.b(bvu.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = civ.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cem.m, new cep($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = civ.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = civ.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cit $$0, bvi $$1) {
      eto $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cit $$0, bvi $$1) {
      List<UUID> $$2 = $$0.eb().c(cem.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.eb().a(cem.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
