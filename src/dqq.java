import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqq extends dpi implements dwy.b<dxf.b>, dxf {
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
   private final dxf.d m = new dqq.a();
   private dxf.a q = new dxf.a();
   private final dxf.b r = new dxf.b(this);

   public dqq(iz $$0, dsd $$1) {
      super(dpk.L, $$0, $$1);
   }

   @Override
   public dxf.a gs() {
      return this.q;
   }

   @Override
   public dxf.d gt() {
      return this.m;
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dxf.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dxf.a.a.encodeStart(vg.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arg a(@Nullable bsv $$0) {
      if ($$0 instanceof arg) {
         return (arg)$$0;
      } else {
         if ($$0 != null) {
            btq $$6 = $$0.cQ();
            if ($$6 instanceof arg) {
               return (arg)$$6;
            }
         }

         if ($$0 instanceof cnq $$3) {
            bsv var3 = $$3.s();
            if (var3 instanceof arg) {
               return (arg)var3;
            }
         }

         if ($$0 instanceof cji $$5) {
            bsv var9 = $$5.s();
            if (var9 instanceof arg) {
               return (arg)var9;
            }
         }

         return null;
      }
   }

   public void a(arf $$0, @Nullable arg $$1) {
      if ($$1 != null) {
         dsd $$2 = this.n();
         if (!$$2.c(dlu.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsv)$$1);
            }
         }
      }
   }

   private boolean b(arf $$0, arg $$1) {
      OptionalInt $$2 = cme.a($$0, this.ay_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arf $$0, @Nullable bsv $$1) {
      iz $$2 = this.ay_();
      dsd $$3 = this.n();
      $$0.a($$2, $$3.a(dlu.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dww.N, $$2, dww.a.a($$1));
   }

   private boolean b(arf $$0) {
      return this.n().c(dlu.d) && $$0.al() != bqs.a && $$0.ab().b(dbv.M);
   }

   public void a(arf $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dbz)$$0);
         }

         cmc.a($$0, evs.b(this.ay_()), null, 40);
      }
   }

   private void b(dbz $$0) {
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
      return this.l < 4 ? false : azs.a(btb.bm, btu.k, $$0, this.ay_(), 20, 5, 6, azs.a.b).isPresent();
   }

   public dxf.b b() {
      return this.r;
   }

   class a implements dxf.d {
      private static final int b = 8;
      private final dxa c = new dws(dqq.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxa b() {
         return this.c;
      }

      @Override
      public axf<dww> c() {
         return aww.c;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dww> $$2, dww.a $$3) {
         return !dqq.this.n().c(dlu.b) && dqq.a($$3.a()) != null;
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dww> $$2, @Nullable bsv $$3, @Nullable bsv $$4, float $$5) {
         dqq.this.a($$0, dqq.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dqq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
