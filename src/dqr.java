import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqr extends dpj implements dwz.b<dxg.b>, dxg {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avz> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awa.BN);
      $$0.put(2, awa.BO);
      $$0.put(3, awa.BP);
      $$0.put(4, awa.BM);
   });
   private int l;
   private final dxg.d m = new dqr.a();
   private dxg.a q = new dxg.a();
   private final dxg.b r = new dxg.b(this);

   public dqr(iz $$0, dse $$1) {
      super(dpl.L, $$0, $$1);
   }

   @Override
   public dxg.a gs() {
      return this.q;
   }

   @Override
   public dxg.d gt() {
      return this.m;
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dxg.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dxg.a.a.encodeStart(vg.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arg a(@Nullable bsw $$0) {
      if ($$0 instanceof arg) {
         return (arg)$$0;
      } else {
         if ($$0 != null) {
            btr $$6 = $$0.cQ();
            if ($$6 instanceof arg) {
               return (arg)$$6;
            }
         }

         if ($$0 instanceof cnr $$3) {
            bsw var3 = $$3.s();
            if (var3 instanceof arg) {
               return (arg)var3;
            }
         }

         if ($$0 instanceof cjj $$5) {
            bsw var9 = $$5.s();
            if (var9 instanceof arg) {
               return (arg)var9;
            }
         }

         return null;
      }
   }

   public void a(arf $$0, @Nullable arg $$1) {
      if ($$1 != null) {
         dse $$2 = this.n();
         if (!$$2.c(dlv.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsw)$$1);
            }
         }
      }
   }

   private boolean b(arf $$0, arg $$1) {
      OptionalInt $$2 = cmf.a($$0, this.ay_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arf $$0, @Nullable bsw $$1) {
      iz $$2 = this.ay_();
      dse $$3 = this.n();
      $$0.a($$2, $$3.a(dlv.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dwx.N, $$2, dwx.a.a($$1));
   }

   private boolean b(arf $$0) {
      return this.n().c(dlv.d) && $$0.al() != bqt.a && $$0.ab().b(dbw.M);
   }

   public void a(arf $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dca)$$0);
         }

         cmd.a($$0, evt.b(this.ay_()), null, 40);
      }
   }

   private void b(dca $$0) {
      avz $$1 = (avz)k.get(this.l);
      if ($$1 != null) {
         iz $$2 = this.ay_();
         int $$3 = $$2.u() + ayz.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayz.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayz.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awb.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arf $$0) {
      return this.l < 4 ? false : azs.a(btc.bm, btv.k, $$0, this.ay_(), 20, 5, 6, azs.a.b).isPresent();
   }

   public dxg.b b() {
      return this.r;
   }

   class a implements dxg.d {
      private static final int b = 8;
      private final dxb c = new dwt(dqr.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxb b() {
         return this.c;
      }

      @Override
      public axf<dwx> c() {
         return aww.c;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dwx> $$2, dwx.a $$3) {
         return !dqr.this.n().c(dlv.b) && dqr.a($$3.a()) != null;
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dwx> $$2, @Nullable bsw $$3, @Nullable bsw $$4, float $$5) {
         dqr.this.a($$0, dqr.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dqr.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
