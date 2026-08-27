import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class deb extends dcv implements djv.b<dkc.b>, dkc {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<apd> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ape.zG);
      $$0.put(2, ape.zH);
      $$0.put(3, ape.zI);
      $$0.put(4, ape.zF);
   });
   private int k;
   private final dkc.d l = new deb.a();
   private dkc.a m = new dkc.a();
   private final dkc.b n = new dkc.b(this);

   public deb(gw $$0, dfj $$1) {
      super(dcx.L, $$0, $$1);
   }

   @Override
   public dkc.a gf() {
      return this.m;
   }

   @Override
   public dkc.d gg() {
      return this.l;
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dkc.a.a.parse(new Dynamic(rj.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dkc.a.a.encodeStart(rj.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static aks a(@Nullable biq $$0) {
      if ($$0 instanceof aks) {
         return (aks)$$0;
      } else {
         if ($$0 != null) {
            bjg $$6 = $$0.cN();
            if ($$6 instanceof aks) {
               return (aks)$$6;
            }
         }

         if ($$0 instanceof ccm $$3) {
            biq var3 = $$3.v();
            if (var3 instanceof aks) {
               return (aks)var3;
            }
         }

         if ($$0 instanceof byn $$5) {
            biq var9 = $$5.v();
            if (var9 instanceof aks) {
               return (aks)var9;
            }
         }

         return null;
      }
   }

   public void a(akr $$0, @Nullable aks $$1) {
      if ($$1 != null) {
         dfj $$2 = this.q();
         if (!$$2.c(czp.a)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (biq)$$1);
            }
         }
      }
   }

   private boolean b(akr $$0, aks $$1) {
      OptionalInt $$2 = cba.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(akr $$0, @Nullable biq $$1) {
      gw $$2 = this.p();
      dfj $$3 = this.q();
      $$0.a($$2, $$3.a(czp.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(djt.N, $$2, djt.a.a($$1));
   }

   private boolean b(akr $$0) {
      return this.q().c(czp.c) && $$0.ai() != bgv.a && $$0.X().b(cpr.I);
   }

   public void a(akr $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cpv)$$0);
         }

         cay.a($$0, ehn.b(this.p()), null, 40);
      }
   }

   private void b(cpv $$0) {
      apd $$1 = (apd)j.get(this.k);
      if ($$1 != null) {
         gw $$2 = this.p();
         int $$3 = $$2.u() + arx.b($$0.z, -10, 10);
         int $$4 = $$2.v() + arx.b($$0.z, -10, 10);
         int $$5 = $$2.w() + arx.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, apf.f, 5.0F, 1.0F);
      }
   }

   private boolean c(akr $$0) {
      return this.k < 4 ? false : asn.a(biu.bi, bjk.k, $$0, this.p(), 20, 5, 6, asn.a.b).isPresent();
   }

   public dkc.b c() {
      return this.n;
   }

   class a implements dkc.d {
      private static final int b = 8;
      private final djx c = new djp(deb.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djx b() {
         return this.c;
      }

      @Override
      public aqi<djt> c() {
         return apz.c;
      }

      @Override
      public boolean a(akr $$0, gw $$1, djt $$2, djt.a $$3) {
         return !deb.this.q().c(czp.a) && deb.a($$3.a()) != null;
      }

      @Override
      public void a(akr $$0, gw $$1, djt $$2, @Nullable biq $$3, @Nullable biq $$4, float $$5) {
         deb.this.a($$0, deb.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         deb.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
