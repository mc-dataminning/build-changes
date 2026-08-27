import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ded extends dcx implements djx.b<dke.b>, dke {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<ape> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, apf.zG);
      $$0.put(2, apf.zH);
      $$0.put(3, apf.zI);
      $$0.put(4, apf.zF);
   });
   private int k;
   private final dke.d l = new ded.a();
   private dke.a m = new dke.a();
   private final dke.b n = new dke.b(this);

   public ded(gw $$0, dfl $$1) {
      super(dcz.L, $$0, $$1);
   }

   @Override
   public dke.a gf() {
      return this.m;
   }

   @Override
   public dke.d gg() {
      return this.l;
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dke.a.a.parse(new Dynamic(rk.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dke.a.a.encodeStart(rk.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static akt a(@Nullable bis $$0) {
      if ($$0 instanceof akt) {
         return (akt)$$0;
      } else {
         if ($$0 != null) {
            bji $$6 = $$0.cN();
            if ($$6 instanceof akt) {
               return (akt)$$6;
            }
         }

         if ($$0 instanceof cco $$3) {
            bis var3 = $$3.v();
            if (var3 instanceof akt) {
               return (akt)var3;
            }
         }

         if ($$0 instanceof byp $$5) {
            bis var9 = $$5.v();
            if (var9 instanceof akt) {
               return (akt)var9;
            }
         }

         return null;
      }
   }

   public void a(aks $$0, @Nullable akt $$1) {
      if ($$1 != null) {
         dfl $$2 = this.q();
         if (!$$2.c(czr.a)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bis)$$1);
            }
         }
      }
   }

   private boolean b(aks $$0, akt $$1) {
      OptionalInt $$2 = cbc.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(aks $$0, @Nullable bis $$1) {
      gw $$2 = this.p();
      dfl $$3 = this.q();
      $$0.a($$2, $$3.a(czr.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(djv.N, $$2, djv.a.a($$1));
   }

   private boolean b(aks $$0) {
      return this.q().c(czr.c) && $$0.ai() != bgx.a && $$0.X().b(cpt.I);
   }

   public void a(aks $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cpx)$$0);
         }

         cba.a($$0, ehp.b(this.p()), null, 40);
      }
   }

   private void b(cpx $$0) {
      ape $$1 = (ape)j.get(this.k);
      if ($$1 != null) {
         gw $$2 = this.p();
         int $$3 = $$2.u() + ary.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ary.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ary.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, apg.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aks $$0) {
      return this.k < 4 ? false : asp.a(biw.bi, bjm.k, $$0, this.p(), 20, 5, 6, asp.a.b).isPresent();
   }

   public dke.b c() {
      return this.n;
   }

   class a implements dke.d {
      private static final int b = 8;
      private final djz c = new djr(ded.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djz b() {
         return this.c;
      }

      @Override
      public aqj<djv> c() {
         return aqa.c;
      }

      @Override
      public boolean a(aks $$0, gw $$1, djv $$2, djv.a $$3) {
         return !ded.this.q().c(czr.a) && ded.a($$3.a()) != null;
      }

      @Override
      public void a(aks $$0, gw $$1, djv $$2, @Nullable bis $$3, @Nullable bis $$4, float $$5) {
         ded.this.a($$0, ded.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         ded.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
