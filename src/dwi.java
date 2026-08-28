import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwi extends dux implements ect.b<eda.b>, eda {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<axe> k = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, axf.Cq);
      $$0.put(2, axf.Cr);
      $$0.put(3, axf.Cs);
      $$0.put(4, axf.Cp);
   });
   private int l;
   private final eda.d m = new dwi.a();
   private eda.a n = new eda.a();
   private final eda.b r = new eda.b(this);

   public dwi(jh $$0, dxv $$1) {
      super(duz.M, $$0, $$1);
   }

   @Override
   public eda.a gp() {
      return this.n;
   }

   @Override
   public eda.d gq() {
      return this.m;
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alx<vu> $$2 = $$1.a(vl.a);
      if ($$0.b("listener", 10)) {
         eda.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alx<vu> $$2 = $$1.a(vl.a);
      eda.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static asi a(@Nullable bvk $$0) {
      if ($$0 instanceof asi) {
         return (asi)$$0;
      } else {
         if ($$0 != null) {
            bwg $$6 = $$0.cX();
            if ($$6 instanceof asi) {
               return (asi)$$6;
            }
         }

         if ($$0 instanceof cqq $$3) {
            bvk var3 = $$3.p();
            if (var3 instanceof asi) {
               return (asi)var3;
            }
         }

         if ($$0 instanceof cmb $$5) {
            bvk var9 = $$5.p();
            if (var9 instanceof asi) {
               return (asi)var9;
            }
         }

         return null;
      }
   }

   public void a(ash $$0, @Nullable asi $$1) {
      if ($$1 != null) {
         dxv $$2 = this.m();
         if (!$$2.c(drj.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bvk)$$1);
            }
         }
      }
   }

   private boolean b(ash $$0, asi $$1) {
      OptionalInt $$2 = cpc.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(ash $$0, @Nullable bvk $$1) {
      jh $$2 = this.aB_();
      dxv $$3 = this.m();
      $$0.a($$2, $$3.b(drj.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ecr.N, $$2, ecr.a.a($$1));
   }

   private boolean b(ash $$0) {
      return this.m().c(drj.d) && $$0.al() != btg.a && $$0.N().b(dhe.N);
   }

   public void a(ash $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dhi)$$0);
         }

         cpa.a($$0, fby.b(this.aB_()), null, 40);
      }
   }

   private void b(dhi $$0) {
      axe $$1 = (axe)k.get(this.l);
      if ($$1 != null) {
         jh $$2 = this.aB_();
         int $$3 = $$2.u() + bae.b($$0.A, -10, 10);
         int $$4 = $$2.v() + bae.b($$0.A, -10, 10);
         int $$5 = $$2.w() + bae.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, axg.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ash $$0) {
      return this.l < 4 ? false : bax.a(bvr.bG, bvq.k, $$0, this.aB_(), 20, 5, 6, bax.a.b).isPresent();
   }

   public eda.b b() {
      return this.r;
   }

   class a implements eda.d {
      private static final int b = 8;
      private final ecv c = new ecn(dwi.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ecv b() {
         return this.c;
      }

      @Override
      public ayk<ecr> c() {
         return ayb.c;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecr> $$2, ecr.a $$3) {
         return !dwi.this.m().c(drj.b) && dwi.a($$3.a()) != null;
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecr> $$2, @Nullable bvk $$3, @Nullable bvk $$4, float $$5) {
         dwi.this.a($$0, dwi.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dwi.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
