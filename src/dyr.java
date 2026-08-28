import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dyr extends dxf implements efj.b<efq.b>, efq {
   private static final int a = 10;
   private static final int b = 20;
   private static final int c = 5;
   private static final int d = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<awm> j = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awn.CV);
      $$0.put(2, awn.CW);
      $$0.put(3, awn.CX);
      $$0.put(4, awn.CU);
   });
   private int k;
   private final efq.d l = new dyr.a();
   private efq.a m = new efq.a();
   private final efq.b q = new efq.b(this);

   public dyr(iu $$0, eah $$1) {
      super(dxh.M, $$0, $$1);
   }

   @Override
   public efq.a x() {
      return this.m;
   }

   @Override
   public efq.d gr() {
      return this.l;
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      ale<uw> $$2 = $$1.a(un.a);
      this.m = $$0.<efq.a>a("listener", efq.a.a, $$2).orElseGet(efq.a::new);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.k);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", efq.a.a, $$2, this.m);
   }

   @Nullable
   public static arr a(@Nullable bwf $$0) {
      if ($$0 instanceof arr) {
         return (arr)$$0;
      } else {
         if ($$0 != null) {
            bxe $$6 = $$0.cW();
            if ($$6 instanceof arr) {
               return (arr)$$6;
            }
         }

         if ($$0 instanceof crx $$3) {
            bwf var3 = $$3.q();
            if (var3 instanceof arr) {
               return (arr)var3;
            }
         }

         if ($$0 instanceof cnh $$5) {
            bwf var9 = $$5.q();
            if (var9 instanceof arr) {
               return (arr)var9;
            }
         }

         return null;
      }
   }

   public void a(arq $$0, @Nullable arr $$1) {
      if ($$1 != null) {
         eah $$2 = this.m();
         if (!$$2.c(dth.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bwf)$$1);
            }
         }
      }
   }

   private boolean b(arq $$0, arr $$1) {
      OptionalInt $$2 = cqh.a($$0, this.ax_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(arq $$0, @Nullable bwf $$1) {
      iu $$2 = this.ax_();
      eah $$3 = this.m();
      $$0.a($$2, $$3.b(dth.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(efh.N, $$2, efh.a.a($$1));
   }

   private boolean b(arq $$0) {
      return this.m().c(dth.d) && $$0.an() != bua.a && $$0.O().c(diw.O);
   }

   @Override
   public void a(iu $$0, eah $$1) {
      if ($$1.c(dth.b) && this.n instanceof arq $$2) {
         this.a($$2);
      }
   }

   public void a(arq $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((dja)$$0);
         }

         cqf.a($$0, feq.b(this.ax_()), null, 40);
      }
   }

   private void b(dja $$0) {
      awm $$1 = (awm)j.get(this.k);
      if ($$1 != null) {
         iu $$2 = this.ax_();
         int $$3 = $$2.u() + azm.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azm.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azm.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awo.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arq $$0) {
      return this.k < 4 ? false : bah.a(bwo.bG, bwn.k, $$0, this.ax_(), 20, 5, 6, bah.a.b, false).isPresent();
   }

   public efq.b a() {
      return this.q;
   }

   class a implements efq.d {
      private static final int b = 8;
      private final efl c = new efd(dyr.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efl b() {
         return this.c;
      }

      @Override
      public axr<efh> c() {
         return axi.c;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<efh> $$2, efh.a $$3) {
         return !dyr.this.m().c(dth.b) && dyr.a($$3.a()) != null;
      }

      @Override
      public void a(arq $$0, iu $$1, je<efh> $$2, @Nullable bwf $$3, @Nullable bwf $$4, float $$5) {
         dyr.this.a($$0, dyr.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dyr.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
