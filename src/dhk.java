import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhk extends dgd implements dnb.b<dni.b>, dni {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<arb> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, arc.AG);
      $$0.put(2, arc.AH);
      $$0.put(3, arc.AI);
      $$0.put(4, arc.AF);
   });
   private int k;
   private final dni.d l = new dhk.a();
   private dni.a m = new dni.a();
   private final dni.b n = new dni.b(this);

   public dhk(hv $$0, dip $$1) {
      super(dgf.L, $$0, $$1);
   }

   @Override
   public dni.a gg() {
      return this.m;
   }

   @Override
   public dni.d gh() {
      return this.l;
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dni.a.a.parse(new Dynamic(sx.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dni.a.a.encodeStart(sx.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static amq a(@Nullable blf $$0) {
      if ($$0 instanceof amq) {
         return (amq)$$0;
      } else {
         if ($$0 != null) {
            blv $$6 = $$0.cN();
            if ($$6 instanceof amq) {
               return (amq)$$6;
            }
         }

         if ($$0 instanceof cfj $$3) {
            blf var3 = $$3.w();
            if (var3 instanceof amq) {
               return (amq)var3;
            }
         }

         if ($$0 instanceof cbe $$5) {
            blf var9 = $$5.w();
            if (var9 instanceof amq) {
               return (amq)var9;
            }
         }

         return null;
      }
   }

   public void a(amp $$0, @Nullable amq $$1) {
      if ($$1 != null) {
         dip $$2 = this.r();
         if (!$$2.c(dcs.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (blf)$$1);
            }
         }
      }
   }

   private boolean b(amp $$0, amq $$1) {
      OptionalInt $$2 = cdx.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(amp $$0, @Nullable blf $$1) {
      hv $$2 = this.aB_();
      dip $$3 = this.r();
      $$0.a($$2, $$3.a(dcs.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dmz.N, $$2, dmz.a.a($$1));
   }

   private boolean b(amp $$0) {
      return this.r().c(dcs.d) && $$0.aj() != bji.a && $$0.Y().b(csu.M);
   }

   public void a(amp $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((csy)$$0);
         }

         cdv.a($$0, elb.b(this.aB_()), null, 40);
      }
   }

   private void b(csy $$0) {
      arb $$1 = (arb)j.get(this.k);
      if ($$1 != null) {
         hv $$2 = this.aB_();
         int $$3 = $$2.u() + aty.b($$0.z, -10, 10);
         int $$4 = $$2.v() + aty.b($$0.z, -10, 10);
         int $$5 = $$2.w() + aty.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, ard.f, 5.0F, 1.0F);
      }
   }

   private boolean c(amp $$0) {
      return this.k < 4 ? false : aur.a(blj.bj, blz.k, $$0, this.aB_(), 20, 5, 6, aur.a.b).isPresent();
   }

   public dni.b c() {
      return this.n;
   }

   class a implements dni.d {
      private static final int b = 8;
      private final dnd c = new dmv(dhk.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dnd b() {
         return this.c;
      }

      @Override
      public asg<dmz> c() {
         return arx.c;
      }

      @Override
      public boolean a(amp $$0, hv $$1, dmz $$2, dmz.a $$3) {
         return !dhk.this.r().c(dcs.b) && dhk.a($$3.a()) != null;
      }

      @Override
      public void a(amp $$0, hv $$1, dmz $$2, @Nullable blf $$3, @Nullable blf $$4, float $$5) {
         dhk.this.a($$0, dhk.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dhk.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
