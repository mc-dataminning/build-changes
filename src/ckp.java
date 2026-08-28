import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ckp extends byq<ckl> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awk l;
   private final awk m;
   private fdw n;
   private ckp.a o = ckp.a.d;

   public ckp(awk $$0, awk $$1) {
      super(ImmutableMap.of(cgb.n, cgc.b, cgb.o, cgc.c, cgb.p, cgc.a, cgb.aa, cgc.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aro $$0, ckl $$1) {
      bwz $$2 = $$1.eb().c(cgb.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cgb.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bxl.i && ckl.i($$2);
   }

   protected boolean a(aro $$0, ckl $$1, long $$2) {
      return $$1.eb().a(cgb.p) && this.o != ckp.a.d && !$$1.eb().a(cgb.aa);
   }

   protected void b(aro $$0, ckl $$1, long $$2) {
      bwz $$3 = $$1.eb().c(cgb.p).get();
      bys.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cgb.n, new cge($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = ckp.a.a;
   }

   protected void c(aro $$0, ckl $$1, long $$2) {
      $$1.eb().b(cgb.p);
      $$1.q();
      $$1.b(bxl.a);
   }

   private void b(aro $$0, ckl $$1) {
      $$0.a(null, $$1, this.m, awm.g, 2.0F, 1.0F);
      Optional<bwa> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bwa $$3 = $$2.get();
         if ($$3.bK()) {
            $$1.c($$0, $$3);
            if (!$$3.bK()) {
               $$3.a(bwa.e.a);
            }
         }
      }
   }

   protected void d(aro $$0, ckl $$1, long $$2) {
      bwz $$3 = $$1.eb().c(cgb.p).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awm.g, 2.0F, 1.0F);
               $$1.b(bxl.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = ckp.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cgb.n, new cge($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = ckp.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = ckp.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(ckl $$0, bwz $$1) {
      ewj $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(ckl $$0, bwz $$1) {
      List<UUID> $$2 = $$0.eb().c(cgb.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.eb().a(cgb.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
