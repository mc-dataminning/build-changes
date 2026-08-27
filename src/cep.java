import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cep extends bsw<cen> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final auy l;
   private final auy m;
   private etf n;
   private cep.a o = cep.a.d;

   public cep(auy $$0, auy $$1) {
      super(ImmutableMap.of(cah.m, cai.b, cah.n, cai.c, cah.o, cai.a, cah.Z, cai.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqe $$0, cen $$1) {
      bre $$2 = $$1.dQ().c(cah.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dQ().b(cah.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != brp.i && cen.j($$2);
   }

   protected boolean a(aqe $$0, cen $$1, long $$2) {
      return $$1.dQ().a(cah.o) && this.o != cep.a.d && !$$1.dQ().a(cah.Z);
   }

   protected void b(aqe $$0, cen $$1, long $$2) {
      bre $$3 = $$1.dQ().c(cah.o).get();
      bsy.a($$1, $$3);
      $$1.b($$3);
      $$1.dQ().a(cah.m, new cak($$3.dl(), 2.0F, 0));
      this.k = 10;
      this.o = cep.a.a;
   }

   protected void c(aqe $$0, cen $$1, long $$2) {
      $$1.dQ().b(cah.o);
      $$1.r();
      $$1.b(brp.a);
   }

   private void b(aqe $$0, cen $$1) {
      $$0.a(null, $$1, this.m, ava.g, 2.0F, 1.0F);
      Optional<bql> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bql $$3 = $$2.get();
         if ($$3.bB()) {
            $$1.C($$3);
            if (!$$3.bB()) {
               $$3.a(bql.c.a);
            }
         }
      }
   }

   protected void d(aqe $$0, cen $$1, long $$2) {
      bre $$3 = $$1.dQ().c(cah.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, ava.g, 2.0F, 1.0F);
               $$1.b(brp.j);
               $$3.g($$3.dl().a($$1.dl()).d().a(0.75));
               this.n = $$3.dl();
               this.j = 0;
               this.o = cep.a.b;
            } else if (this.k <= 0) {
               $$1.dQ().a(cah.m, new cak($$3.dl(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cep.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cep.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cen $$0, bre $$1) {
      emf $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cen $$0, bre $$1) {
      List<UUID> $$2 = $$0.dQ().c(cah.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cx());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cx());
      }

      $$0.dQ().a(cah.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
