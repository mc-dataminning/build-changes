import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwd extends dus implements ecr.b<ecy.b>, ecy {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avz> k = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awa.CP);
      $$0.put(2, awa.CQ);
      $$0.put(3, awa.CR);
      $$0.put(4, awa.CO);
   });
   private int l;
   private final ecy.d m = new dwd.a();
   private ecy.a q = new ecy.a();
   private final ecy.b r = new ecy.b(this);

   public dwd(ji $$0, dxq $$1) {
      super(duu.M, $$0, $$1);
   }

   @Override
   public ecy.a x() {
      return this.q;
   }

   @Override
   public ecy.d gs() {
      return this.m;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      aks<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         ecy.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      aks<un> $$2 = $$1.a(ue.a);
      ecy.a.a
         .encodeStart($$2, this.q)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static are a(@Nullable bva $$0) {
      if ($$0 instanceof are) {
         return (are)$$0;
      } else {
         if ($$0 != null) {
            bvy $$6 = $$0.cV();
            if ($$6 instanceof are) {
               return (are)$$6;
            }
         }

         if ($$0 instanceof cqk $$3) {
            bva var3 = $$3.q();
            if (var3 instanceof are) {
               return (are)var3;
            }
         }

         if ($$0 instanceof clw $$5) {
            bva var9 = $$5.q();
            if (var9 instanceof are) {
               return (are)var9;
            }
         }

         return null;
      }
   }

   public void a(ard $$0, @Nullable are $$1) {
      if ($$1 != null) {
         dxq $$2 = this.m();
         if (!$$2.c(drd.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bva)$$1);
            }
         }
      }
   }

   private boolean b(ard $$0, are $$1) {
      OptionalInt $$2 = cow.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(ard $$0, @Nullable bva $$1) {
      ji $$2 = this.aA_();
      dxq $$3 = this.m();
      $$0.a($$2, $$3.b(drd.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ecp.N, $$2, ecp.a.a($$1));
   }

   private boolean b(ard $$0) {
      return this.m().c(drd.d) && $$0.an() != bsv.a && $$0.O().b(dgv.N);
   }

   @Override
   public void a(ji $$0, dxq $$1, boolean $$2) {
      if ($$1.c(drd.b) && this.n instanceof ard $$3) {
         this.a($$3);
      }
   }

   public void a(ard $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dgz)$$0);
         }

         cou.a($$0, fbx.b(this.aA_()), null, 40);
      }
   }

   private void b(dgz $$0) {
      avz $$1 = (avz)k.get(this.l);
      if ($$1 != null) {
         ji $$2 = this.aA_();
         int $$3 = $$2.u() + ayz.b($$0.A, -10, 10);
         int $$4 = $$2.v() + ayz.b($$0.A, -10, 10);
         int $$5 = $$2.w() + ayz.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awb.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ard $$0) {
      return this.l < 4 ? false : azs.a(bvi.bF, bvh.k, $$0, this.aA_(), 20, 5, 6, azs.a.b, false).isPresent();
   }

   public ecy.b b() {
      return this.r;
   }

   class a implements ecy.d {
      private static final int b = 8;
      private final ect c = new ecl(dwd.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ect b() {
         return this.c;
      }

      @Override
      public axf<ecp> c() {
         return aww.c;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ecp> $$2, ecp.a $$3) {
         return !dwd.this.m().c(drd.b) && dwd.a($$3.a()) != null;
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ecp> $$2, @Nullable bva $$3, @Nullable bva $$4, float $$5) {
         dwd.this.a($$0, dwd.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dwd.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
