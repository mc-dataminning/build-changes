import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dol extends dnd implements dut.b<dva.b>, dva {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<auy> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, auz.BB);
      $$0.put(2, auz.BC);
      $$0.put(3, auz.BD);
      $$0.put(4, auz.BA);
   });
   private int l;
   private final dva.d m = new dol.a();
   private dva.a n = new dva.a();
   private final dva.b r = new dva.b(this);

   public dol(im $$0, dpy $$1) {
      super(dnf.L, $$0, $$1);
   }

   @Override
   public dva.a gr() {
      return this.n;
   }

   @Override
   public dva.d gs() {
      return this.m;
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dva.a.a.parse(new Dynamic(um.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dva.a.a.encodeStart(um.a, this.n).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqf a(@Nullable bql $$0) {
      if ($$0 instanceof aqf) {
         return (aqf)$$0;
      } else {
         if ($$0 != null) {
            bre $$6 = $$0.cO();
            if ($$6 instanceof aqf) {
               return (aqf)$$6;
            }
         }

         if ($$0 instanceof cld $$3) {
            bql var3 = $$3.u();
            if (var3 instanceof aqf) {
               return (aqf)var3;
            }
         }

         if ($$0 instanceof cgv $$5) {
            bql var9 = $$5.u();
            if (var9 instanceof aqf) {
               return (aqf)var9;
            }
         }

         return null;
      }
   }

   public void a(aqe $$0, @Nullable aqf $$1) {
      if ($$1 != null) {
         dpy $$2 = this.n();
         if (!$$2.c(djp.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bql)$$1);
            }
         }
      }
   }

   private boolean b(aqe $$0, aqf $$1) {
      OptionalInt $$2 = cjr.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqe $$0, @Nullable bql $$1) {
      im $$2 = this.az_();
      dpy $$3 = this.n();
      $$0.a($$2, $$3.a(djp.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dur.N, $$2, dur.a.a($$1));
   }

   private boolean b(aqe $$0) {
      return this.n().c(djp.d) && $$0.ak() != bon.a && $$0.aa().b(czq.M);
   }

   public void a(aqe $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((czu)$$0);
         }

         cjp.a($$0, etf.b(this.az_()), null, 40);
      }
   }

   private void b(czu $$0) {
      auy $$1 = (auy)k.get(this.l);
      if ($$1 != null) {
         im $$2 = this.az_();
         int $$3 = $$2.u() + axw.b($$0.z, -10, 10);
         int $$4 = $$2.v() + axw.b($$0.z, -10, 10);
         int $$5 = $$2.w() + axw.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, ava.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqe $$0) {
      return this.l < 4 ? false : ayo.a(bqr.bl, bri.k, $$0, this.az_(), 20, 5, 6, ayo.a.b).isPresent();
   }

   public dva.b b() {
      return this.r;
   }

   class a implements dva.d {
      private static final int b = 8;
      private final duv c = new dun(dol.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public duv b() {
         return this.c;
      }

      @Override
      public awd<dur> c() {
         return avu.c;
      }

      @Override
      public boolean a(aqe $$0, im $$1, iv<dur> $$2, dur.a $$3) {
         return !dol.this.n().c(djp.b) && dol.a($$3.a()) != null;
      }

      @Override
      public void a(aqe $$0, im $$1, iv<dur> $$2, @Nullable bql $$3, @Nullable bql $$4, float $$5) {
         dol.this.a($$0, dol.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dol.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
