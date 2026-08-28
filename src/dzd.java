import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dzd extends dxr implements efv.b<egc.b>, egc {
   private static final int a = 10;
   private static final int b = 20;
   private static final int c = 5;
   private static final int d = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<awm> j = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awn.CV);
      $$0.put(2, awn.CW);
      $$0.put(3, awn.CX);
      $$0.put(4, awn.CU);
   });
   private int k;
   private final egc.d l = new dzd.a();
   private egc.a m = new egc.a();
   private final egc.b q = new egc.b(this);

   public dzd(iv $$0, eat $$1) {
      super(dxt.M, $$0, $$1);
   }

   @Override
   public egc.a x() {
      return this.m;
   }

   @Override
   public egc.d gt() {
      return this.l;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.f("warning_level");
      }

      ale<uw> $$2 = $$1.a(un.a);
      this.m = $$0.<egc.a>a("listener", egc.a.a, $$2).orElseGet(egc.a::new);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.k);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", egc.a.a, $$2, this.m);
   }

   @Nullable
   public static arr a(@Nullable bwi $$0) {
      if ($$0 instanceof arr) {
         return (arr)$$0;
      } else {
         if ($$0 != null) {
            bxj $$6 = $$0.cV();
            if ($$6 instanceof arr) {
               return (arr)$$6;
            }
         }

         if ($$0 instanceof csh $$3) {
            bwi var3 = $$3.q();
            if (var3 instanceof arr) {
               return (arr)var3;
            }
         }

         if ($$0 instanceof cnr $$5) {
            bwi var9 = $$5.q();
            if (var9 instanceof arr) {
               return (arr)var9;
            }
         }

         return null;
      }
   }

   public void a(arq $$0, @Nullable arr $$1) {
      if ($$1 != null) {
         eat $$2 = this.m();
         if (!$$2.c(dtt.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bwi)$$1);
            }
         }
      }
   }

   private boolean b(arq $$0, arr $$1) {
      OptionalInt $$2 = cqr.a($$0, this.ax_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(arq $$0, @Nullable bwi $$1) {
      iv $$2 = this.ax_();
      eat $$3 = this.m();
      $$0.a($$2, $$3.b(dtt.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(eft.N, $$2, eft.a.a($$1));
   }

   private boolean b(arq $$0) {
      return this.m().c(dtt.d) && $$0.an() != bud.a && $$0.O().c(dji.O);
   }

   @Override
   public void a(iv $$0, eat $$1) {
      if ($$1.c(dtt.b) && this.n instanceof arq $$2) {
         this.a($$2);
      }
   }

   public void a(arq $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((djm)$$0);
         }

         cqp.a($$0, ffc.b(this.ax_()), null, 40);
      }
   }

   private void b(djm $$0) {
      awm $$1 = (awm)j.get(this.k);
      if ($$1 != null) {
         iv $$2 = this.ax_();
         int $$3 = $$2.u() + azm.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azm.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azm.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awo.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arq $$0) {
      return this.k < 4 ? false : bah.a(bwr.bG, bwq.k, $$0, this.ax_(), 20, 5, 6, bah.a.b, false).isPresent();
   }

   public egc.b a() {
      return this.q;
   }

   class a implements egc.d {
      private static final int b = 8;
      private final efx c = new efp(dzd.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efx b() {
         return this.c;
      }

      @Override
      public axr<eft> c() {
         return axi.c;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<eft> $$2, eft.a $$3) {
         return !dzd.this.m().c(dtt.b) && dzd.a($$3.a()) != null;
      }

      @Override
      public void a(arq $$0, iv $$1, jf<eft> $$2, @Nullable bwi $$3, @Nullable bwi $$4, float $$5) {
         dzd.this.a($$0, dzd.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dzd.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
