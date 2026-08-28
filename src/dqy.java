import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqy extends dpp implements dxi.b<dxp.b>, dxp {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avg> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avh.BQ);
      $$0.put(2, avh.BR);
      $$0.put(3, avh.BS);
      $$0.put(4, avh.BP);
   });
   private int l;
   private final dxp.d m = new dqy.a();
   private dxp.a q = new dxp.a();
   private final dxp.b r = new dxp.b(this);

   public dqy(ja $$0, dsk $$1) {
      super(dpr.L, $$0, $$1);
   }

   @Override
   public dxp.a gq() {
      return this.q;
   }

   @Override
   public dxp.d gr() {
      return this.m;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dxp.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dxp.a.a.encodeStart(ul.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqn a(@Nullable bsg $$0) {
      if ($$0 instanceof aqn) {
         return (aqn)$$0;
      } else {
         if ($$0 != null) {
            btb $$6 = $$0.cR();
            if ($$6 instanceof aqn) {
               return (aqn)$$6;
            }
         }

         if ($$0 instanceof cnc $$3) {
            bsg var3 = $$3.s();
            if (var3 instanceof aqn) {
               return (aqn)var3;
            }
         }

         if ($$0 instanceof ciu $$5) {
            bsg var9 = $$5.s();
            if (var9 instanceof aqn) {
               return (aqn)var9;
            }
         }

         return null;
      }
   }

   public void a(aqm $$0, @Nullable aqn $$1) {
      if ($$1 != null) {
         dsk $$2 = this.n();
         if (!$$2.c(dmb.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsg)$$1);
            }
         }
      }
   }

   private boolean b(aqm $$0, aqn $$1) {
      OptionalInt $$2 = clq.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqm $$0, @Nullable bsg $$1) {
      ja $$2 = this.az_();
      dsk $$3 = this.n();
      $$0.a($$2, $$3.a(dmb.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dxg.N, $$2, dxg.a.a($$1));
   }

   private boolean b(aqm $$0) {
      return this.n().c(dmb.d) && $$0.al() != bqd.a && $$0.ab().b(dcb.M);
   }

   public void a(aqm $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dcf)$$0);
         }

         clo.a($$0, ewf.b(this.az_()), null, 40);
      }
   }

   private void b(dcf $$0) {
      avg $$1 = (avg)k.get(this.l);
      if ($$1 != null) {
         ja $$2 = this.az_();
         int $$3 = $$2.u() + ayg.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayg.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayg.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avi.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqm $$0) {
      return this.l < 4 ? false : ayz.a(bsm.bm, btf.k, $$0, this.az_(), 20, 5, 6, ayz.a.b).isPresent();
   }

   public dxp.b b() {
      return this.r;
   }

   class a implements dxp.d {
      private static final int b = 8;
      private final dxk c = new dxc(dqy.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxk b() {
         return this.c;
      }

      @Override
      public awm<dxg> c() {
         return awd.c;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxg> $$2, dxg.a $$3) {
         return !dqy.this.n().c(dmb.b) && dqy.a($$3.a()) != null;
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxg> $$2, @Nullable bsg $$3, @Nullable bsg $$4, float $$5) {
         dqy.this.a($$0, dqy.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dqy.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
