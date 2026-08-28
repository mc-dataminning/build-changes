import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class eaa extends dyo implements egs.b<egz.b>, egz {
   private static final int a = 10;
   private static final int b = 20;
   private static final int c = 5;
   private static final int d = 6;
   private static final int e = 40;
   private static final int f = 90;
   private static final Int2ObjectMap<awx> j = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awy.CV);
      $$0.put(2, awy.CW);
      $$0.put(3, awy.CX);
      $$0.put(4, awy.CU);
   });
   private static final int k = 0;
   private int l = 0;
   private final egz.d m = new eaa.a();
   private egz.a q = new egz.a();
   private final egz.b r = new egz.b(this);

   public eaa(iw $$0, ebq $$1) {
      super(dyq.M, $$0, $$1);
   }

   @Override
   public egz.a x() {
      return this.q;
   }

   @Override
   public egz.d gu() {
      return this.m;
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.l = $$0.b("warning_level", 0);
      alp<va> $$2 = $$1.a(uo.a);
      this.q = $$0.<egz.a>a("listener", egz.a.a, $$2).orElseGet(egz.a::new);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alp<va> $$2 = $$1.a(uo.a);
      $$0.a("listener", egz.a.a, $$2, this.q);
   }

   @Nullable
   public static asc a(@Nullable bxe $$0) {
      if ($$0 instanceof asc) {
         return (asc)$$0;
      } else {
         if ($$0 != null) {
            byf $$6 = $$0.cW();
            if ($$6 instanceof asc) {
               return (asc)$$6;
            }
         }

         if ($$0 instanceof ctd $$3) {
            bxe var3 = $$3.q();
            if (var3 instanceof asc) {
               return (asc)var3;
            }
         }

         if ($$0 instanceof coo $$5) {
            bxe var9 = $$5.q();
            if (var9 instanceof asc) {
               return (asc)var9;
            }
         }

         return null;
      }
   }

   public void a(asb $$0, @Nullable asc $$1) {
      if ($$1 != null) {
         ebq $$2 = this.m();
         if (!$$2.c(duq.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bxe)$$1);
            }
         }
      }
   }

   private boolean b(asb $$0, asc $$1) {
      OptionalInt $$2 = crn.a($$0, this.aC_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(asb $$0, @Nullable bxe $$1) {
      iw $$2 = this.aC_();
      ebq $$3 = this.m();
      $$0.a($$2, $$3.b(duq.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(egq.N, $$2, egq.a.a($$1));
   }

   private boolean b(asb $$0) {
      return this.m().c(duq.d) && $$0.an() != buz.a && $$0.O().c(dkf.O);
   }

   @Override
   public void a(iw $$0, ebq $$1) {
      if ($$1.c(duq.b) && this.n instanceof asb $$2) {
         this.a($$2);
      }
   }

   public void a(asb $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dkj)$$0);
         }

         crl.a($$0, fgc.b(this.aC_()), null, 40);
      }
   }

   private void b(dkj $$0) {
      awx $$1 = (awx)j.get(this.l);
      if ($$1 != null) {
         iw $$2 = this.aC_();
         int $$3 = $$2.u() + azz.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azz.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azz.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awz.f, 5.0F, 1.0F);
      }
   }

   private boolean c(asb $$0) {
      return this.l < 4 ? false : bau.a(bxn.bH, bxm.k, $$0, this.aC_(), 20, 5, 6, bau.a.b, false).isPresent();
   }

   public egz.b a() {
      return this.r;
   }

   class a implements egz.d {
      private static final int b = 8;
      private final egu c = new egm(eaa.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public egu b() {
         return this.c;
      }

      @Override
      public ayc<egq> c() {
         return axt.c;
      }

      @Override
      public boolean a(asb $$0, iw $$1, jg<egq> $$2, egq.a $$3) {
         return !eaa.this.m().c(duq.b) && eaa.a($$3.a()) != null;
      }

      @Override
      public void a(asb $$0, iw $$1, jg<egq> $$2, @Nullable bxe $$3, @Nullable bxe $$4, float $$5) {
         eaa.this.a($$0, eaa.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         eaa.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
