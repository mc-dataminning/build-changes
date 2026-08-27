import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddq extends dck implements djk.b<djr.b>, djr {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aot> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aou.zB);
      $$0.put(2, aou.zC);
      $$0.put(3, aou.zD);
      $$0.put(4, aou.zA);
   });
   private int k;
   private final djr.d l = new ddq.a();
   private djr.a m = new djr.a();
   private final djr.b n = new djr.b(this);

   public ddq(gv $$0, dey $$1) {
      super(dcm.L, $$0, $$1);
   }

   @Override
   public djr.a gb() {
      return this.m;
   }

   @Override
   public djr.d gc() {
      return this.l;
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         djr.a.a.parse(new Dynamic(rd.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      djr.a.a.encodeStart(rd.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static akj a(@Nullable big $$0) {
      if ($$0 instanceof akj) {
         return (akj)$$0;
      } else {
         if ($$0 != null) {
            biw $$6 = $$0.cN();
            if ($$6 instanceof akj) {
               return (akj)$$6;
            }
         }

         if ($$0 instanceof ccd $$3) {
            big var3 = $$3.v();
            if (var3 instanceof akj) {
               return (akj)var3;
            }
         }

         if ($$0 instanceof bye $$5) {
            big var9 = $$5.v();
            if (var9 instanceof akj) {
               return (akj)var9;
            }
         }

         return null;
      }
   }

   public void a(aki $$0, @Nullable akj $$1) {
      if ($$1 != null) {
         dey $$2 = this.q();
         if (!$$2.c(cze.a)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (big)$$1);
            }
         }
      }
   }

   private boolean b(aki $$0, akj $$1) {
      OptionalInt $$2 = car.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(aki $$0, @Nullable big $$1) {
      gv $$2 = this.p();
      dey $$3 = this.q();
      $$0.a($$2, $$3.a(cze.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dji.N, $$2, dji.a.a($$1));
   }

   private boolean b(aki $$0) {
      return this.q().c(cze.c) && $$0.ai() != bgl.a && $$0.X().b(cpg.I);
   }

   public void a(aki $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cpk)$$0);
         }

         cap.a($$0, ehf.b(this.p()), null, 40);
      }
   }

   private void b(cpk $$0) {
      aot $$1 = (aot)j.get(this.k);
      if ($$1 != null) {
         gv $$2 = this.p();
         int $$3 = $$2.u() + aro.b($$0.z, -10, 10);
         int $$4 = $$2.v() + aro.b($$0.z, -10, 10);
         int $$5 = $$2.w() + aro.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aov.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aki $$0) {
      return this.k < 4 ? false : asd.a(bik.bi, bja.k, $$0, this.p(), 20, 5, 6, asd.a.b).isPresent();
   }

   public djr.b c() {
      return this.n;
   }

   class a implements djr.d {
      private static final int b = 8;
      private final djm c = new dje(ddq.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djm b() {
         return this.c;
      }

      @Override
      public apy<dji> c() {
         return app.c;
      }

      @Override
      public boolean a(aki $$0, gv $$1, dji $$2, dji.a $$3) {
         return !ddq.this.q().c(cze.a) && ddq.a($$3.a()) != null;
      }

      @Override
      public void a(aki $$0, gv $$1, dji $$2, @Nullable big $$3, @Nullable big $$4, float $$5) {
         ddq.this.a($$0, ddq.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         ddq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
