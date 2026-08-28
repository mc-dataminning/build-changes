import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvl extends dua implements ebw.b<ecd.b>, ecd {
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
   private final ecd.d m = new dvl.a();
   private ecd.a q = new ecd.a();
   private final ecd.b r = new ecd.b(this);

   public dvl(ji $$0, dwy $$1) {
      super(duc.M, $$0, $$1);
   }

   @Override
   public ecd.a gt() {
      return this.q;
   }

   @Override
   public ecd.d gu() {
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
         ecd.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      akt<un> $$2 = $$1.a(ue.a);
      ecd.a.a
         .encodeStart($$2, this.q)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static are a(@Nullable bum $$0) {
      if ($$0 instanceof are) {
         return (are)$$0;
      } else {
         if ($$0 != null) {
            bvi $$6 = $$0.cW();
            if ($$6 instanceof are) {
               return (are)$$6;
            }
         }

         if ($$0 instanceof cpr $$3) {
            bum var3 = $$3.p();
            if (var3 instanceof are) {
               return (are)var3;
            }
         }

         if ($$0 instanceof cld $$5) {
            bum var9 = $$5.p();
            if (var9 instanceof are) {
               return (are)var9;
            }
         }

         return null;
      }
   }

   public void a(ard $$0, @Nullable are $$1) {
      if ($$1 != null) {
         dwy $$2 = this.m();
         if (!$$2.c(dqm.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bum)$$1);
            }
         }
      }
   }

   private boolean b(ard $$0, are $$1) {
      OptionalInt $$2 = coc.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(ard $$0, @Nullable bum $$1) {
      ji $$2 = this.aA_();
      dwy $$3 = this.m();
      $$0.a($$2, $$3.b(dqm.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ebu.N, $$2, ebu.a.a($$1));
   }

   private boolean b(ard $$0) {
      return this.m().c(dqm.d) && $$0.am() != bsi.a && $$0.O().b(dgf.N);
   }

   public void a(ard $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dgj)$$0);
         }

         coa.a($$0, fbb.b(this.aA_()), null, 40);
      }
   }

   private void b(dgj $$0) {
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
      return this.l < 4 ? false : azs.a(but.bF, bus.k, $$0, this.aA_(), 20, 5, 6, azs.a.b, false).isPresent();
   }

   public ecd.b b() {
      return this.r;
   }

   class a implements ecd.d {
      private static final int b = 8;
      private final eby c = new ebq(dvl.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eby b() {
         return this.c;
      }

      @Override
      public axf<ebu> c() {
         return aww.c;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebu> $$2, ebu.a $$3) {
         return !dvl.this.m().c(dqm.b) && dvl.a($$3.a()) != null;
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ebu> $$2, @Nullable bum $$3, @Nullable bum $$4, float $$5) {
         dvl.this.a($$0, dvl.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dvl.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
