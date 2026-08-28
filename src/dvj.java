import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvj extends dty implements ebu.b<ecb.b>, ecb {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avz> k = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awa.CF);
      $$0.put(2, awa.CG);
      $$0.put(3, awa.CH);
      $$0.put(4, awa.CE);
   });
   private int l;
   private final ecb.d m = new dvj.a();
   private ecb.a n = new ecb.a();
   private final ecb.b r = new ecb.b(this);

   public dvj(ji $$0, dww $$1) {
      super(dua.M, $$0, $$1);
   }

   @Override
   public ecb.a gt() {
      return this.n;
   }

   @Override
   public ecb.d gu() {
      return this.m;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      akt<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         ecb.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      akt<un> $$2 = $$1.a(ue.a);
      ecb.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static are a(@Nullable buk $$0) {
      if ($$0 instanceof are) {
         return (are)$$0;
      } else {
         if ($$0 != null) {
            bvg $$6 = $$0.cW();
            if ($$6 instanceof are) {
               return (are)$$6;
            }
         }

         if ($$0 instanceof cpp $$3) {
            buk var3 = $$3.p();
            if (var3 instanceof are) {
               return (are)var3;
            }
         }

         if ($$0 instanceof clb $$5) {
            buk var9 = $$5.p();
            if (var9 instanceof are) {
               return (are)var9;
            }
         }

         return null;
      }
   }

   public void a(ard $$0, @Nullable are $$1) {
      if ($$1 != null) {
         dww $$2 = this.m();
         if (!$$2.c(dqk.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (buk)$$1);
            }
         }
      }
   }

   private boolean b(ard $$0, are $$1) {
      OptionalInt $$2 = coa.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(ard $$0, @Nullable buk $$1) {
      ji $$2 = this.aA_();
      dww $$3 = this.m();
      $$0.a($$2, $$3.b(dqk.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ebs.N, $$2, ebs.a.a($$1));
   }

   private boolean b(ard $$0) {
      return this.m().c(dqk.d) && $$0.am() != bsg.a && $$0.O().b(dgd.N);
   }

   public void a(ard $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dgh)$$0);
         }

         cny.a($$0, faz.b(this.aA_()), null, 40);
      }
   }

   private void b(dgh $$0) {
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
      return this.l < 4 ? false : azs.a(bur.bF, buq.k, $$0, this.aA_(), 20, 5, 6, azs.a.b, false).isPresent();
   }

   public ecb.b b() {
      return this.r;
   }

   class a implements ecb.d {
      private static final int b = 8;
      private final ebw c = new ebo(dvj.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ebw b() {
         return this.c;
      }

      @Override
      public axf<ebs> c() {
         return aww.c;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebs> $$2, ebs.a $$3) {
         return !dvj.this.m().c(dqk.b) && dvj.a($$3.a()) != null;
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ebs> $$2, @Nullable buk $$3, @Nullable buk $$4, float $$5) {
         dvj.this.a($$0, dvj.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dvj.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
