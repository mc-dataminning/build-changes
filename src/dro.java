import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dro extends dqf implements dxy.b<dyf.b>, dyf {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avn> k = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avo.BR);
      $$0.put(2, avo.BS);
      $$0.put(3, avo.BT);
      $$0.put(4, avo.BQ);
   });
   private int l;
   private final dyf.d m = new dro.a();
   private dyf.a q = new dyf.a();
   private final dyf.b r = new dyf.b(this);

   public dro(jd $$0, dta $$1) {
      super(dqh.L, $$0, $$1);
   }

   @Override
   public dyf.a go() {
      return this.q;
   }

   @Override
   public dyf.d gp() {
      return this.m;
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dyf.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dyf.a.a.encodeStart(uo.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqu a(@Nullable bsq $$0) {
      if ($$0 instanceof aqu) {
         return (aqu)$$0;
      } else {
         if ($$0 != null) {
            btl $$6 = $$0.cR();
            if ($$6 instanceof aqu) {
               return (aqu)$$6;
            }
         }

         if ($$0 instanceof cnn $$3) {
            bsq var3 = $$3.s();
            if (var3 instanceof aqu) {
               return (aqu)var3;
            }
         }

         if ($$0 instanceof cjf $$5) {
            bsq var9 = $$5.s();
            if (var9 instanceof aqu) {
               return (aqu)var9;
            }
         }

         return null;
      }
   }

   public void a(aqt $$0, @Nullable aqu $$1) {
      if ($$1 != null) {
         dta $$2 = this.n();
         if (!$$2.c(dmr.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsq)$$1);
            }
         }
      }
   }

   private boolean b(aqt $$0, aqu $$1) {
      OptionalInt $$2 = cmb.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqt $$0, @Nullable bsq $$1) {
      jd $$2 = this.az_();
      dta $$3 = this.n();
      $$0.a($$2, $$3.a(dmr.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dxw.N, $$2, dxw.a.a($$1));
   }

   private boolean b(aqt $$0) {
      return this.n().c(dmr.d) && $$0.al() != bqn.a && $$0.ab().b(dcq.M);
   }

   public void a(aqt $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dcu)$$0);
         }

         clz.a($$0, eww.b(this.az_()), null, 40);
      }
   }

   private void b(dcu $$0) {
      avn $$1 = (avn)k.get(this.l);
      if ($$1 != null) {
         jd $$2 = this.az_();
         int $$3 = $$2.u() + ayn.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayn.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayn.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avp.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqt $$0) {
      return this.l < 4 ? false : azg.a(bsw.bm, btp.k, $$0, this.az_(), 20, 5, 6, azg.a.b).isPresent();
   }

   public dyf.b b() {
      return this.r;
   }

   class a implements dyf.d {
      private static final int b = 8;
      private final dya c = new dxs(dro.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dya b() {
         return this.c;
      }

      @Override
      public awt<dxw> c() {
         return awk.c;
      }

      @Override
      public boolean a(aqt $$0, jd $$1, jm<dxw> $$2, dxw.a $$3) {
         return !dro.this.n().c(dmr.b) && dro.a($$3.a()) != null;
      }

      @Override
      public void a(aqt $$0, jd $$1, jm<dxw> $$2, @Nullable bsq $$3, @Nullable bsq $$4, float $$5) {
         dro.this.a($$0, dro.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dro.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
