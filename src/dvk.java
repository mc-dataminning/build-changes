import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvk extends dtz implements ebv.b<ecc.b>, ecc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avz> k = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awa.CG);
      $$0.put(2, awa.CH);
      $$0.put(3, awa.CI);
      $$0.put(4, awa.CF);
   });
   private int l;
   private final ecc.d m = new dvk.a();
   private ecc.a n = new ecc.a();
   private final ecc.b r = new ecc.b(this);

   public dvk(ji $$0, dwx $$1) {
      super(dub.M, $$0, $$1);
   }

   @Override
   public ecc.a gq() {
      return this.n;
   }

   @Override
   public ecc.d gr() {
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
         ecc.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      aks<un> $$2 = $$1.a(ue.a);
      ecc.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static ard a(@Nullable buk $$0) {
      if ($$0 instanceof ard) {
         return (ard)$$0;
      } else {
         if ($$0 != null) {
            bvg $$6 = $$0.cX();
            if ($$6 instanceof ard) {
               return (ard)$$6;
            }
         }

         if ($$0 instanceof cpq $$3) {
            buk var3 = $$3.p();
            if (var3 instanceof ard) {
               return (ard)var3;
            }
         }

         if ($$0 instanceof clb $$5) {
            buk var9 = $$5.p();
            if (var9 instanceof ard) {
               return (ard)var9;
            }
         }

         return null;
      }
   }

   public void a(arc $$0, @Nullable ard $$1) {
      if ($$1 != null) {
         dwx $$2 = this.m();
         if (!$$2.c(dql.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (buk)$$1);
            }
         }
      }
   }

   private boolean b(arc $$0, ard $$1) {
      OptionalInt $$2 = cob.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arc $$0, @Nullable buk $$1) {
      ji $$2 = this.aA_();
      dwx $$3 = this.m();
      $$0.a($$2, $$3.b(dql.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ebt.N, $$2, ebt.a.a($$1));
   }

   private boolean b(arc $$0) {
      return this.m().c(dql.d) && $$0.am() != bsg.a && $$0.O().b(dge.N);
   }

   public void a(arc $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dgi)$$0);
         }

         cnz.a($$0, fba.b(this.aA_()), null, 40);
      }
   }

   private void b(dgi $$0) {
      avz $$1 = (avz)k.get(this.l);
      if ($$1 != null) {
         ji $$2 = this.aA_();
         int $$3 = $$2.u() + ayz.b($$0.A, -10, 10);
         int $$4 = $$2.v() + ayz.b($$0.A, -10, 10);
         int $$5 = $$2.w() + ayz.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awb.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arc $$0) {
      return this.l < 4 ? false : azs.a(bur.bG, buq.k, $$0, this.aA_(), 20, 5, 6, azs.a.b, false).isPresent();
   }

   public ecc.b b() {
      return this.r;
   }

   class a implements ecc.d {
      private static final int b = 8;
      private final ebx c = new ebp(dvk.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ebx b() {
         return this.c;
      }

      @Override
      public axf<ebt> c() {
         return aww.c;
      }

      @Override
      public boolean a(arc $$0, ji $$1, jr<ebt> $$2, ebt.a $$3) {
         return !dvk.this.m().c(dql.b) && dvk.a($$3.a()) != null;
      }

      @Override
      public void a(arc $$0, ji $$1, jr<ebt> $$2, @Nullable buk $$3, @Nullable buk $$4, float $$5) {
         dvk.this.a($$0, dvk.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dvk.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
