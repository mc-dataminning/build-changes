import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dka extends dit implements dpr.b<dpy.b>, dpy {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<atj> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, atk.AV);
      $$0.put(2, atk.AW);
      $$0.put(3, atk.AX);
      $$0.put(4, atk.AU);
   });
   private int l;
   private final dpy.d m = new dka.a();
   private dpy.a n = new dpy.a();
   private final dpy.b r = new dpy.b(this);

   public dka(hz $$0, dlf $$1) {
      super(div.L, $$0, $$1);
   }

   @Override
   public dpy.a gi() {
      return this.n;
   }

   @Override
   public dpy.d gj() {
      return this.m;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dpy.a.a.parse(new Dynamic(tk.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("warning_level", this.l);
      dpy.a.a.encodeStart(tk.a, this.n).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static aow a(@Nullable bno $$0) {
      if ($$0 instanceof aow) {
         return (aow)$$0;
      } else {
         if ($$0 != null) {
            bog $$6 = $$0.cN();
            if ($$6 instanceof aow) {
               return (aow)$$6;
            }
         }

         if ($$0 instanceof chz $$3) {
            bno var3 = $$3.w();
            if (var3 instanceof aow) {
               return (aow)var3;
            }
         }

         if ($$0 instanceof cds $$5) {
            bno var9 = $$5.w();
            if (var9 instanceof aow) {
               return (aow)var9;
            }
         }

         return null;
      }
   }

   public void a(aov $$0, @Nullable aow $$1) {
      if ($$1 != null) {
         dlf $$2 = this.r();
         if (!$$2.c(dfh.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bno)$$1);
            }
         }
      }
   }

   private boolean b(aov $$0, aow $$1) {
      OptionalInt $$2 = cgn.a($$0, this.aE_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aov $$0, @Nullable bno $$1) {
      hz $$2 = this.aE_();
      dlf $$3 = this.r();
      $$0.a($$2, $$3.a(dfh.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dpp.N, $$2, dpp.a.a($$1));
   }

   private boolean b(aov $$0) {
      return this.r().c(dfh.d) && $$0.ak() != blr.a && $$0.Z().b(cvj.M);
   }

   public void a(aov $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((cvn)$$0);
         }

         cgl.a($$0, ens.b(this.aE_()), null, 40);
      }
   }

   private void b(cvn $$0) {
      atj $$1 = (atj)k.get(this.l);
      if ($$1 != null) {
         hz $$2 = this.aE_();
         int $$3 = $$2.u() + awh.b($$0.z, -10, 10);
         int $$4 = $$2.v() + awh.b($$0.z, -10, 10);
         int $$5 = $$2.w() + awh.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, atl.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aov $$0) {
      return this.l < 4 ? false : axa.a(bnu.bk, bok.k, $$0, this.aE_(), 20, 5, 6, axa.a.b).isPresent();
   }

   public dpy.b c() {
      return this.r;
   }

   class a implements dpy.d {
      private static final int b = 8;
      private final dpt c = new dpl(dka.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dpt b() {
         return this.c;
      }

      @Override
      public auo<dpp> c() {
         return auf.c;
      }

      @Override
      public boolean a(aov $$0, hz $$1, ij<dpp> $$2, dpp.a $$3) {
         return !dka.this.r().c(dfh.b) && dka.a($$3.a()) != null;
      }

      @Override
      public void a(aov $$0, hz $$1, ij<dpp> $$2, @Nullable bno $$3, @Nullable bno $$4, float $$5) {
         dka.this.a($$0, dka.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dka.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
