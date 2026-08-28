import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqz extends dpq implements dxj.b<dxq.b>, dxq {
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
   private final dxq.d m = new dqz.a();
   private dxq.a q = new dxq.a();
   private final dxq.b r = new dxq.b(this);

   public dqz(ja $$0, dsl $$1) {
      super(dps.L, $$0, $$1);
   }

   @Override
   public dxq.a gp() {
      return this.q;
   }

   @Override
   public dxq.d gq() {
      return this.m;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dxq.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dxq.a.a.encodeStart(ul.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqn a(@Nullable bsh $$0) {
      if ($$0 instanceof aqn) {
         return (aqn)$$0;
      } else {
         if ($$0 != null) {
            btc $$6 = $$0.cS();
            if ($$6 instanceof aqn) {
               return (aqn)$$6;
            }
         }

         if ($$0 instanceof cnd $$3) {
            bsh var3 = $$3.s();
            if (var3 instanceof aqn) {
               return (aqn)var3;
            }
         }

         if ($$0 instanceof civ $$5) {
            bsh var9 = $$5.s();
            if (var9 instanceof aqn) {
               return (aqn)var9;
            }
         }

         return null;
      }
   }

   public void a(aqm $$0, @Nullable aqn $$1) {
      if ($$1 != null) {
         dsl $$2 = this.n();
         if (!$$2.c(dmc.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsh)$$1);
            }
         }
      }
   }

   private boolean b(aqm $$0, aqn $$1) {
      OptionalInt $$2 = clr.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqm $$0, @Nullable bsh $$1) {
      ja $$2 = this.az_();
      dsl $$3 = this.n();
      $$0.a($$2, $$3.a(dmc.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dxh.N, $$2, dxh.a.a($$1));
   }

   private boolean b(aqm $$0) {
      return this.n().c(dmc.d) && $$0.al() != bqe.a && $$0.ab().b(dcc.M);
   }

   public void a(aqm $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dcg)$$0);
         }

         clp.a($$0, ewh.b(this.az_()), null, 40);
      }
   }

   private void b(dcg $$0) {
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
      return this.l < 4 ? false : ayz.a(bsn.bm, btg.k, $$0, this.az_(), 20, 5, 6, ayz.a.b).isPresent();
   }

   public dxq.b b() {
      return this.r;
   }

   class a implements dxq.d {
      private static final int b = 8;
      private final dxl c = new dxd(dqz.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxl b() {
         return this.c;
      }

      @Override
      public awm<dxh> c() {
         return awd.c;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxh> $$2, dxh.a $$3) {
         return !dqz.this.n().c(dmc.b) && dqz.a($$3.a()) != null;
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxh> $$2, @Nullable bsh $$3, @Nullable bsh $$4, float $$5) {
         dqz.this.a($$0, dqz.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dqz.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
