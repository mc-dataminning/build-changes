import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dds extends dcm implements djm.b<djt.b>, djt {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aov> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aow.zB);
      $$0.put(2, aow.zC);
      $$0.put(3, aow.zD);
      $$0.put(4, aow.zA);
   });
   private int k;
   private final djt.d l = new dds.a();
   private djt.a m = new djt.a();
   private final djt.b n = new djt.b(this);

   public dds(gu $$0, dfa $$1) {
      super(dco.L, $$0, $$1);
   }

   @Override
   public djt.a gb() {
      return this.m;
   }

   @Override
   public djt.d gc() {
      return this.l;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         djt.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      djt.a.a.encodeStart(rc.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
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

         if ($$0 instanceof ccf $$3) {
            bii var3 = $$3.v();
            if (var3 instanceof akl) {
               return (akl)var3;
            }
         }

         if ($$0 instanceof byg $$5) {
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
         dfa $$2 = this.q();
         if (!$$2.c(czg.a)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bii)$$1);
            }
         }
      }
   }

   private boolean b(akk $$0, akl $$1) {
      OptionalInt $$2 = cat.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(akk $$0, @Nullable bii $$1) {
      gu $$2 = this.p();
      dfa $$3 = this.q();
      $$0.a($$2, $$3.a(czg.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(djk.N, $$2, djk.a.a($$1));
   }

   private boolean b(akk $$0) {
      return this.q().c(czg.c) && $$0.ai() != bgn.a && $$0.X().b(cpi.I);
   }

   public void a(akk $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cpm)$$0);
         }

         car.a($$0, ehe.b(this.p()), null, 40);
      }
   }

   private void b(cpm $$0) {
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

   public djt.b c() {
      return this.n;
   }

   class a implements djt.d {
      private static final int b = 8;
      private final djo c = new djg(dds.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djo b() {
         return this.c;
      }

      @Override
      public aqa<djk> c() {
         return apr.c;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djk $$2, djk.a $$3) {
         return !dds.this.q().c(czg.a) && dds.a($$3.a()) != null;
      }

      @Override
      public void a(akk $$0, gu $$1, djk $$2, @Nullable bii $$3, @Nullable bii $$4, float $$5) {
         dds.this.a($$0, dds.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dds.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
