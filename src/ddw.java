import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddw extends dcq implements djq.b<djx.b>, djx {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aoy> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aoz.zG);
      $$0.put(2, aoz.zH);
      $$0.put(3, aoz.zI);
      $$0.put(4, aoz.zF);
   });
   private int k;
   private final djx.d l = new ddw.a();
   private djx.a m = new djx.a();
   private final djx.b n = new djx.b(this);

   public ddw(gw $$0, dfe $$1) {
      super(dcs.L, $$0, $$1);
   }

   @Override
   public djx.a gc() {
      return this.m;
   }

   @Override
   public djx.d gd() {
      return this.l;
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         djx.a.a.parse(new Dynamic(rf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      djx.a.a.encodeStart(rf.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static ako a(@Nullable bil $$0) {
      if ($$0 instanceof ako) {
         return (ako)$$0;
      } else {
         if ($$0 != null) {
            bjb $$6 = $$0.cN();
            if ($$6 instanceof ako) {
               return (ako)$$6;
            }
         }

         if ($$0 instanceof cch $$3) {
            bil var3 = $$3.v();
            if (var3 instanceof ako) {
               return (ako)var3;
            }
         }

         if ($$0 instanceof byi $$5) {
            bil var9 = $$5.v();
            if (var9 instanceof ako) {
               return (ako)var9;
            }
         }

         return null;
      }
   }

   public void a(akn $$0, @Nullable ako $$1) {
      if ($$1 != null) {
         dfe $$2 = this.q();
         if (!$$2.c(czk.a)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bil)$$1);
            }
         }
      }
   }

   private boolean b(akn $$0, ako $$1) {
      OptionalInt $$2 = cav.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(akn $$0, @Nullable bil $$1) {
      gw $$2 = this.p();
      dfe $$3 = this.q();
      $$0.a($$2, $$3.a(czk.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(djo.N, $$2, djo.a.a($$1));
   }

   private boolean b(akn $$0) {
      return this.q().c(czk.c) && $$0.ai() != bgq.a && $$0.X().b(cpm.I);
   }

   public void a(akn $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cpq)$$0);
         }

         cat.a($$0, ehi.b(this.p()), null, 40);
      }
   }

   private void b(cpq $$0) {
      aoy $$1 = (aoy)j.get(this.k);
      if ($$1 != null) {
         gw $$2 = this.p();
         int $$3 = $$2.u() + ars.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ars.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ars.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, apa.f, 5.0F, 1.0F);
      }
   }

   private boolean c(akn $$0) {
      return this.k < 4 ? false : asi.a(bip.bi, bjf.k, $$0, this.p(), 20, 5, 6, asi.a.b).isPresent();
   }

   public djx.b c() {
      return this.n;
   }

   class a implements djx.d {
      private static final int b = 8;
      private final djs c = new djk(ddw.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djs b() {
         return this.c;
      }

      @Override
      public aqd<djo> c() {
         return apu.c;
      }

      @Override
      public boolean a(akn $$0, gw $$1, djo $$2, djo.a $$3) {
         return !ddw.this.q().c(czk.a) && ddw.a($$3.a()) != null;
      }

      @Override
      public void a(akn $$0, gw $$1, djo $$2, @Nullable bil $$3, @Nullable bil $$4, float $$5) {
         ddw.this.a($$0, ddw.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         ddw.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
