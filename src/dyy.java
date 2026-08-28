import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dyy extends dxm implements efq.b<efx.b>, efx {
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
   private final efx.d l = new dyy.a();
   private efx.a m = new efx.a();
   private final efx.b q = new efx.b(this);

   public dyy(iv $$0, eao $$1) {
      super(dxo.M, $$0, $$1);
   }

   @Override
   public efx.a x() {
      return this.m;
   }

   @Override
   public efx.d gt() {
      return this.l;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.f("warning_level");
      }

      ale<uw> $$2 = $$1.a(un.a);
      this.m = $$0.<efx.a>a("listener", efx.a.a, $$2).orElseGet(efx.a::new);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.k);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", efx.a.a, $$2, this.m);
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

         if ($$0 instanceof cse $$3) {
            bwi var3 = $$3.q();
            if (var3 instanceof arr) {
               return (arr)var3;
            }
         }

         if ($$0 instanceof cno $$5) {
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
         eao $$2 = this.m();
         if (!$$2.c(dto.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bwi)$$1);
            }
         }
      }
   }

   private boolean b(arq $$0, arr $$1) {
      OptionalInt $$2 = cqo.a($$0, this.ax_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(arq $$0, @Nullable bwi $$1) {
      iv $$2 = this.ax_();
      eao $$3 = this.m();
      $$0.a($$2, $$3.b(dto.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(efo.N, $$2, efo.a.a($$1));
   }

   private boolean b(arq $$0) {
      return this.m().c(dto.d) && $$0.an() != bud.a && $$0.O().c(djd.O);
   }

   @Override
   public void a(iv $$0, eao $$1) {
      if ($$1.c(dto.b) && this.n instanceof arq $$2) {
         this.a($$2);
      }
   }

   public void a(arq $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((djh)$$0);
         }

         cqm.a($$0, fex.b(this.ax_()), null, 40);
      }
   }

   private void b(djh $$0) {
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

   public efx.b a() {
      return this.q;
   }

   class a implements efx.d {
      private static final int b = 8;
      private final efs c = new efk(dyy.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efs b() {
         return this.c;
      }

      @Override
      public axr<efo> c() {
         return axi.c;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<efo> $$2, efo.a $$3) {
         return !dyy.this.m().c(dto.b) && dyy.a($$3.a()) != null;
      }

      @Override
      public void a(arq $$0, iv $$1, jf<efo> $$2, @Nullable bwi $$3, @Nullable bwi $$4, float $$5) {
         dyy.this.a($$0, dyy.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dyy.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
