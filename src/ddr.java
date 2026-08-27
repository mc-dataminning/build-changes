import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddr extends dcl implements djl.b<djs.b>, djs {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aov> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aow.zG);
      $$0.put(2, aow.zH);
      $$0.put(3, aow.zI);
      $$0.put(4, aow.zF);
   });
   private int k;
   private final djs.d l = new ddr.a();
   private djs.a m = new djs.a();
   private final djs.b n = new djs.b(this);

   public ddr(gu $$0, dez $$1) {
      super(dcn.L, $$0, $$1);
   }

   @Override
   public djs.a gc() {
      return this.m;
   }

   @Override
   public djs.d gd() {
      return this.l;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         djs.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      djs.a.a.encodeStart(rc.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static akl a(@Nullable bii $$0) {
      if ($$0 instanceof akl) {
         return (akl)$$0;
      } else {
         if ($$0 != null) {
            biy $$6 = $$0.cN();
            if ($$6 instanceof akl) {
               return (akl)$$6;
            }
         }

         if ($$0 instanceof cce $$3) {
            bii var3 = $$3.v();
            if (var3 instanceof akl) {
               return (akl)var3;
            }
         }

         if ($$0 instanceof byf $$5) {
            bii var9 = $$5.v();
            if (var9 instanceof akl) {
               return (akl)var9;
            }
         }

         return null;
      }
   }

   public void a(akk $$0, @Nullable akl $$1) {
      if ($$1 != null) {
         dez $$2 = this.q();
         if (!$$2.c(czf.a)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bii)$$1);
            }
         }
      }
   }

   private boolean b(akk $$0, akl $$1) {
      OptionalInt $$2 = cas.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(akk $$0, @Nullable bii $$1) {
      gu $$2 = this.p();
      dez $$3 = this.q();
      $$0.a($$2, $$3.a(czf.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(djj.N, $$2, djj.a.a($$1));
   }

   private boolean b(akk $$0) {
      return this.q().c(czf.c) && $$0.ai() != bgn.a && $$0.X().b(cph.I);
   }

   public void a(akk $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cpl)$$0);
         }

         caq.a($$0, ehd.b(this.p()), null, 40);
      }
   }

   private void b(cpl $$0) {
      aov $$1 = (aov)j.get(this.k);
      if ($$1 != null) {
         gu $$2 = this.p();
         int $$3 = $$2.u() + arp.b($$0.z, -10, 10);
         int $$4 = $$2.v() + arp.b($$0.z, -10, 10);
         int $$5 = $$2.w() + arp.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aox.f, 5.0F, 1.0F);
      }
   }

   private boolean c(akk $$0) {
      return this.k < 4 ? false : asf.a(bim.bi, bjc.k, $$0, this.p(), 20, 5, 6, asf.a.b).isPresent();
   }

   public djs.b c() {
      return this.n;
   }

   class a implements djs.d {
      private static final int b = 8;
      private final djn c = new djf(ddr.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djn b() {
         return this.c;
      }

      @Override
      public aqa<djj> c() {
         return apr.c;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djj $$2, djj.a $$3) {
         return !ddr.this.q().c(czf.a) && ddr.a($$3.a()) != null;
      }

      @Override
      public void a(akk $$0, gu $$1, djj $$2, @Nullable bii $$3, @Nullable bii $$4, float $$5) {
         ddr.this.a($$0, ddr.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         ddr.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
