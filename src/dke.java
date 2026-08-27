import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dke extends dix implements dpy.b<dqf.b>, dqf {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<atk> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, atl.AW);
      $$0.put(2, atl.AX);
      $$0.put(3, atl.AY);
      $$0.put(4, atl.AV);
   });
   private int l;
   private final dqf.d m = new dke.a();
   private dqf.a n = new dqf.a();
   private final dqf.b r = new dqf.b(this);

   public dke(hz $$0, dlj $$1) {
      super(diz.L, $$0, $$1);
   }

   @Override
   public dqf.a gi() {
      return this.n;
   }

   @Override
   public dqf.d gj() {
      return this.m;
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dqf.a.a.parse(new Dynamic(tk.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("warning_level", this.l);
      dqf.a.a.encodeStart(tk.a, this.n).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static aox a(@Nullable bnq $$0) {
      if ($$0 instanceof aox) {
         return (aox)$$0;
      } else {
         if ($$0 != null) {
            boi $$6 = $$0.cN();
            if ($$6 instanceof aox) {
               return (aox)$$6;
            }
         }

         if ($$0 instanceof cid $$3) {
            bnq var3 = $$3.w();
            if (var3 instanceof aox) {
               return (aox)var3;
            }
         }

         if ($$0 instanceof cdw $$5) {
            bnq var9 = $$5.w();
            if (var9 instanceof aox) {
               return (aox)var9;
            }
         }

         return null;
      }
   }

   public void a(aow $$0, @Nullable aox $$1) {
      if ($$1 != null) {
         dlj $$2 = this.r();
         if (!$$2.c(dfl.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bnq)$$1);
            }
         }
      }
   }

   private boolean b(aow $$0, aox $$1) {
      OptionalInt $$2 = cgr.a($$0, this.aE_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aow $$0, @Nullable bnq $$1) {
      hz $$2 = this.aE_();
      dlj $$3 = this.r();
      $$0.a($$2, $$3.a(dfl.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dpw.N, $$2, dpw.a.a($$1));
   }

   private boolean b(aow $$0) {
      return this.r().c(dfl.d) && $$0.aj() != blt.a && $$0.Z().b(cvn.M);
   }

   public void a(aow $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((cvr)$$0);
         }

         cgp.a($$0, enz.b(this.aE_()), null, 40);
      }
   }

   private void b(cvr $$0) {
      atk $$1 = (atk)k.get(this.l);
      if ($$1 != null) {
         hz $$2 = this.aE_();
         int $$3 = $$2.u() + awi.b($$0.z, -10, 10);
         int $$4 = $$2.v() + awi.b($$0.z, -10, 10);
         int $$5 = $$2.w() + awi.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, atm.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aow $$0) {
      return this.l < 4 ? false : axa.a(bnw.bk, bom.k, $$0, this.aE_(), 20, 5, 6, axa.a.b).isPresent();
   }

   public dqf.b c() {
      return this.r;
   }

   class a implements dqf.d {
      private static final int b = 8;
      private final dqa c = new dps(dke.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dqa b() {
         return this.c;
      }

      @Override
      public aup<dpw> c() {
         return aug.c;
      }

      @Override
      public boolean a(aow $$0, hz $$1, ij<dpw> $$2, dpw.a $$3) {
         return !dke.this.r().c(dfl.b) && dke.a($$3.a()) != null;
      }

      @Override
      public void a(aow $$0, hz $$1, ij<dpw> $$2, @Nullable bnq $$3, @Nullable bnq $$4, float $$5) {
         dke.this.a($$0, dke.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dke.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
