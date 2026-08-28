import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cld extends bza<ckz> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awm l;
   private final awm m;
   private fex n;
   private cld.a o = cld.a.d;

   public cld(awm $$0, awm $$1) {
      super(ImmutableMap.of(cgl.n, cgm.b, cgl.o, cgm.c, cgl.p, cgm.a, cgl.aa, cgm.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arq $$0, ckz $$1) {
      bxj $$2 = $$1.eb().c(cgl.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cgl.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.at() != bxv.i && ckz.i($$2);
   }

   protected boolean a(arq $$0, ckz $$1, long $$2) {
      return $$1.eb().a(cgl.p) && this.o != cld.a.d && !$$1.eb().a(cgl.aa);
   }

   protected void b(arq $$0, ckz $$1, long $$2) {
      bxj $$3 = $$1.eb().c(cgl.p).get();
      bzc.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cgl.n, new cgo($$3.ds(), 2.0F, 0));
      this.k = 10;
      this.o = cld.a.a;
   }

   protected void c(arq $$0, ckz $$1, long $$2) {
      $$1.eb().b(cgl.p);
      $$1.q();
      $$1.b(bxv.a);
   }

   private void b(arq $$0, ckz $$1) {
      $$0.a(null, $$1, this.m, awo.g, 2.0F, 1.0F);
      Optional<bwi> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bwi $$3 = $$2.get();
         if ($$3.bI()) {
            $$1.c($$0, $$3);
            if (!$$3.bI()) {
               $$3.a(bwi.d.a);
            }
         }
      }
   }

   protected void d(arq $$0, ckz $$1, long $$2) {
      bxj $$3 = $$1.eb().c(cgl.p).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awo.g, 2.0F, 1.0F);
               $$1.b(bxv.j);
               $$3.i($$3.ds().a($$1.ds()).d().c(0.75));
               this.n = $$3.ds();
               this.j = 0;
               this.o = cld.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cgl.n, new cgo($$3.ds(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cld.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cld.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(ckz $$0, bxj $$1) {
      exj $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(ckz $$0, bxj $$1) {
      List<UUID> $$2 = $$0.eb().c(cgl.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cF());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cF());
      }

      $$0.eb().a(cgl.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
