import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dzo extends dyc implements egg.b<egn.b>, egn {
   private static final int a = 10;
   private static final int b = 20;
   private static final int c = 5;
   private static final int d = 6;
   private static final int e = 40;
   private static final int f = 90;
   private static final Int2ObjectMap<awo> j = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awp.CV);
      $$0.put(2, awp.CW);
      $$0.put(3, awp.CX);
      $$0.put(4, awp.CU);
   });
   private static final int k = 0;
   private int l = 0;
   private final egn.d m = new dzo.a();
   private egn.a q = new egn.a();
   private final egn.b r = new egn.b(this);

   public dzo(iv $$0, ebe $$1) {
      super(dye.M, $$0, $$1);
   }

   @Override
   public egn.a x() {
      return this.q;
   }

   @Override
   public egn.d gu() {
      return this.m;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.l = $$0.b("warning_level", 0);
      alg<uy> $$2 = $$1.a(un.a);
      this.q = $$0.<egn.a>a("listener", egn.a.a, $$2).orElseGet(egn.a::new);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alg<uy> $$2 = $$1.a(un.a);
      $$0.a("listener", egn.a.a, $$2, this.q);
   }

   @Nullable
   public static art a(@Nullable bwt $$0) {
      if ($$0 instanceof art) {
         return (art)$$0;
      } else {
         if ($$0 != null) {
            bxu $$6 = $$0.cW();
            if ($$6 instanceof art) {
               return (art)$$6;
            }
         }

         if ($$0 instanceof css $$3) {
            bwt var3 = $$3.q();
            if (var3 instanceof art) {
               return (art)var3;
            }
         }

         if ($$0 instanceof coc $$5) {
            bwt var9 = $$5.q();
            if (var9 instanceof art) {
               return (art)var9;
            }
         }

         return null;
      }
   }

   public void a(ars $$0, @Nullable art $$1) {
      if ($$1 != null) {
         ebe $$2 = this.m();
         if (!$$2.c(due.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bwt)$$1);
            }
         }
      }
   }

   private boolean b(ars $$0, art $$1) {
      OptionalInt $$2 = crc.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(ars $$0, @Nullable bwt $$1) {
      iv $$2 = this.aB_();
      ebe $$3 = this.m();
      $$0.a($$2, $$3.b(due.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ege.N, $$2, ege.a.a($$1));
   }

   private boolean b(ars $$0) {
      return this.m().c(due.d) && $$0.an() != buo.a && $$0.O().c(djt.O);
   }

   @Override
   public void a(iv $$0, ebe $$1) {
      if ($$1.c(due.b) && this.n instanceof ars $$2) {
         this.a($$2);
      }
   }

   public void a(ars $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((djx)$$0);
         }

         cra.a($$0, ffq.b(this.aB_()), null, 40);
      }
   }

   private void b(djx $$0) {
      awo $$1 = (awo)j.get(this.l);
      if ($$1 != null) {
         iv $$2 = this.aB_();
         int $$3 = $$2.u() + azo.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azo.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azo.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awq.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ars $$0) {
      return this.l < 4 ? false : baj.a(bxc.bH, bxb.k, $$0, this.aB_(), 20, 5, 6, baj.a.b, false).isPresent();
   }

   public egn.b a() {
      return this.r;
   }

   class a implements egn.d {
      private static final int b = 8;
      private final egi c = new ega(dzo.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public egi b() {
         return this.c;
      }

      @Override
      public axt<ege> c() {
         return axk.c;
      }

      @Override
      public boolean a(ars $$0, iv $$1, jf<ege> $$2, ege.a $$3) {
         return !dzo.this.m().c(due.b) && dzo.a($$3.a()) != null;
      }

      @Override
      public void a(ars $$0, iv $$1, jf<ege> $$2, @Nullable bwt $$3, @Nullable bwt $$4, float $$5) {
         dzo.this.a($$0, dzo.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dzo.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
