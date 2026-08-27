import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cfl extends bts<cfj> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avb l;
   private final avb m;
   private etp n;
   private cfl.a o = cfl.a.d;

   public cfl(avb $$0, avb $$1) {
      super(ImmutableMap.of(cbd.m, cbe.b, cbd.n, cbe.c, cbd.o, cbe.a, cbd.Z, cbe.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqh $$0, cfj $$1) {
      bsa $$2 = $$1.dQ().c(cbd.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dQ().b(cbd.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bsl.i && cfj.j($$2);
   }

   protected boolean a(aqh $$0, cfj $$1, long $$2) {
      return $$1.dQ().a(cbd.o) && this.o != cfl.a.d && !$$1.dQ().a(cbd.Z);
   }

   protected void b(aqh $$0, cfj $$1, long $$2) {
      bsa $$3 = $$1.dQ().c(cbd.o).get();
      btu.a($$1, $$3);
      $$1.b($$3);
      $$1.dQ().a(cbd.m, new cbg($$3.dl(), 2.0F, 0));
      this.k = 10;
      this.o = cfl.a.a;
   }

   protected void c(aqh $$0, cfj $$1, long $$2) {
      $$1.dQ().b(cbd.o);
      $$1.r();
      $$1.b(bsl.a);
   }

   private void b(aqh $$0, cfj $$1) {
      $$0.a(null, $$1, this.m, avd.g, 2.0F, 1.0F);
      Optional<brh> $$2 = $$1.u();
      if ($$2.isPresent()) {
         brh $$3 = $$2.get();
         if ($$3.bB()) {
            $$1.C($$3);
            if (!$$3.bB()) {
               $$3.a(brh.c.a);
            }
         }
      }
   }

   protected void d(aqh $$0, cfj $$1, long $$2) {
      bsa $$3 = $$1.dQ().c(cbd.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avd.g, 2.0F, 1.0F);
               $$1.b(bsl.j);
               $$3.g($$3.dl().a($$1.dl()).d().a(0.75));
               this.n = $$3.dl();
               this.j = 0;
               this.o = cfl.a.b;
            } else if (this.k <= 0) {
               $$1.dQ().a(cbd.m, new cbg($$3.dl(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cfl.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cfl.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cfj $$0, bsa $$1) {
      emo $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cfj $$0, bsa $$1) {
      List<UUID> $$2 = $$0.dQ().c(cbd.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cx());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cx());
      }

      $$0.dQ().a(cbd.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
