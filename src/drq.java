import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drq extends dqh implements dyb.b<dyi.b>, dyi {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avo> k = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avp.BR);
      $$0.put(2, avp.BS);
      $$0.put(3, avp.BT);
      $$0.put(4, avp.BQ);
   });
   private int l;
   private final dyi.d m = new drq.a();
   private dyi.a q = new dyi.a();
   private final dyi.b r = new dyi.b(this);

   public drq(jd $$0, dtc $$1) {
      super(dqj.L, $$0, $$1);
   }

   @Override
   public dyi.a gm() {
      return this.q;
   }

   @Override
   public dyi.d gn() {
      return this.m;
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      akp<uy> $$2 = $$1.a(up.a);
      if ($$0.b("listener", 10)) {
         dyi.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      akp<uy> $$2 = $$1.a(up.a);
      dyi.a.a
         .encodeStart($$2, this.q)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqv a(@Nullable bsr $$0) {
      if ($$0 instanceof aqv) {
         return (aqv)$$0;
      } else {
         if ($$0 != null) {
            btn $$6 = $$0.cQ();
            if ($$6 instanceof aqv) {
               return (aqv)$$6;
            }
         }

         if ($$0 instanceof cnp $$3) {
            bsr var3 = $$3.s();
            if (var3 instanceof aqv) {
               return (aqv)var3;
            }
         }

         if ($$0 instanceof cjh $$5) {
            bsr var9 = $$5.s();
            if (var9 instanceof aqv) {
               return (aqv)var9;
            }
         }

         return null;
      }
   }

   public void a(aqu $$0, @Nullable aqv $$1) {
      if ($$1 != null) {
         dtc $$2 = this.n();
         if (!$$2.c(dmt.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsr)$$1);
            }
         }
      }
   }

   private boolean b(aqu $$0, aqv $$1) {
      OptionalInt $$2 = cmd.a($$0, this.aD_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqu $$0, @Nullable bsr $$1) {
      jd $$2 = this.aD_();
      dtc $$3 = this.n();
      $$0.a($$2, $$3.a(dmt.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dxz.N, $$2, dxz.a.a($$1));
   }

   private boolean b(aqu $$0) {
      return this.n().c(dmt.d) && $$0.al() != bqo.a && $$0.ab().b(dcs.M);
   }

   public void a(aqu $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dcw)$$0);
         }

         cmb.a($$0, exc.b(this.aD_()), null, 40);
      }
   }

   private void b(dcw $$0) {
      avo $$1 = (avo)k.get(this.l);
      if ($$1 != null) {
         jd $$2 = this.aD_();
         int $$3 = $$2.u() + ayo.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayo.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayo.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avq.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqu $$0) {
      return this.l < 4 ? false : azh.a(bsx.bm, btr.k, $$0, this.aD_(), 20, 5, 6, azh.a.b).isPresent();
   }

   public dyi.b b() {
      return this.r;
   }

   class a implements dyi.d {
      private static final int b = 8;
      private final dyd c = new dxv(drq.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dyd b() {
         return this.c;
      }

      @Override
      public awu<dxz> c() {
         return awl.c;
      }

      @Override
      public boolean a(aqu $$0, jd $$1, jm<dxz> $$2, dxz.a $$3) {
         return !drq.this.n().c(dmt.b) && drq.a($$3.a()) != null;
      }

      @Override
      public void a(aqu $$0, jd $$1, jm<dxz> $$2, @Nullable bsr $$3, @Nullable bsr $$4, float $$5) {
         drq.this.a($$0, drq.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         drq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
