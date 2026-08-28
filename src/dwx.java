import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwx extends dvl implements edo.b<edv.b>, edv {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awj> k = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awk.CP);
      $$0.put(2, awk.CQ);
      $$0.put(3, awk.CR);
      $$0.put(4, awk.CO);
   });
   private int l;
   private final edv.d m = new dwx.a();
   private edv.a q = new edv.a();
   private final edv.b r = new edv.b(this);

   public dwx(jj $$0, dym $$1) {
      super(dvn.M, $$0, $$1);
   }

   @Override
   public edv.a x() {
      return this.q;
   }

   @Override
   public edv.d gq() {
      return this.m;
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alb<ut> $$2 = $$1.a(uk.a);
      if ($$0.b("listener", 10)) {
         edv.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alb<ut> $$2 = $$1.a(uk.a);
      edv.a.a
         .encodeStart($$2, this.q)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aro a(@Nullable bvs $$0) {
      if ($$0 instanceof aro) {
         return (aro)$$0;
      } else {
         if ($$0 != null) {
            bwr $$6 = $$0.cW();
            if ($$6 instanceof aro) {
               return (aro)$$6;
            }
         }

         if ($$0 instanceof crb $$3) {
            bvs var3 = $$3.q();
            if (var3 instanceof aro) {
               return (aro)var3;
            }
         }

         if ($$0 instanceof cmn $$5) {
            bvs var9 = $$5.q();
            if (var9 instanceof aro) {
               return (aro)var9;
            }
         }

         return null;
      }
   }

   public void a(arn $$0, @Nullable aro $$1) {
      if ($$1 != null) {
         dym $$2 = this.m();
         if (!$$2.c(drt.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bvs)$$1);
            }
         }
      }
   }

   private boolean b(arn $$0, aro $$1) {
      OptionalInt $$2 = cpn.a($$0, this.aw_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arn $$0, @Nullable bvs $$1) {
      jj $$2 = this.aw_();
      dym $$3 = this.m();
      $$0.a($$2, $$3.b(drt.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(edm.N, $$2, edm.a.a($$1));
   }

   private boolean b(arn $$0) {
      return this.m().c(drt.d) && $$0.an() != btn.a && $$0.O().c(dhl.N);
   }

   @Override
   public void a(jj $$0, dym $$1) {
      if ($$1.c(drt.b) && this.n instanceof arn $$2) {
         this.a($$2);
      }
   }

   public void a(arn $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dhp)$$0);
         }

         cpl.a($$0, fcu.b(this.aw_()), null, 40);
      }
   }

   private void b(dhp $$0) {
      awj $$1 = (awj)k.get(this.l);
      if ($$1 != null) {
         jj $$2 = this.aw_();
         int $$3 = $$2.u() + azk.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azk.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azk.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awl.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arn $$0) {
      return this.l < 4 ? false : bad.a(bwb.bF, bwa.k, $$0, this.aw_(), 20, 5, 6, bad.a.b, false).isPresent();
   }

   public edv.b a() {
      return this.r;
   }

   class a implements edv.d {
      private static final int b = 8;
      private final edq c = new edi(dwx.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public edq b() {
         return this.c;
      }

      @Override
      public axp<edm> c() {
         return axg.c;
      }

      @Override
      public boolean a(arn $$0, jj $$1, js<edm> $$2, edm.a $$3) {
         return !dwx.this.m().c(drt.b) && dwx.a($$3.a()) != null;
      }

      @Override
      public void a(arn $$0, jj $$1, js<edm> $$2, @Nullable bvs $$3, @Nullable bvs $$4, float $$5) {
         dwx.this.a($$0, dwx.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dwx.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
