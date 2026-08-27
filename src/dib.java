import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dib extends dgu implements dns.b<dnz.b>, dnz {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<arq> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, arr.AG);
      $$0.put(2, arr.AH);
      $$0.put(3, arr.AI);
      $$0.put(4, arr.AF);
   });
   private int k;
   private final dnz.d l = new dib.a();
   private dnz.a m = new dnz.a();
   private final dnz.b n = new dnz.b(this);

   public dib(hx $$0, djg $$1) {
      super(dgw.L, $$0, $$1);
   }

   @Override
   public dnz.a gg() {
      return this.m;
   }

   @Override
   public dnz.d gh() {
      return this.l;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dnz.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dnz.a.a.encodeStart(tb.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static ane a(@Nullable blu $$0) {
      if ($$0 instanceof ane) {
         return (ane)$$0;
      } else {
         if ($$0 != null) {
            bmk $$6 = $$0.cN();
            if ($$6 instanceof ane) {
               return (ane)$$6;
            }
         }

         if ($$0 instanceof cfz $$3) {
            blu var3 = $$3.w();
            if (var3 instanceof ane) {
               return (ane)var3;
            }
         }

         if ($$0 instanceof cbt $$5) {
            blu var9 = $$5.w();
            if (var9 instanceof ane) {
               return (ane)var9;
            }
         }

         return null;
      }
   }

   public void a(and $$0, @Nullable ane $$1) {
      if ($$1 != null) {
         djg $$2 = this.r();
         if (!$$2.c(ddi.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (blu)$$1);
            }
         }
      }
   }

   private boolean b(and $$0, ane $$1) {
      OptionalInt $$2 = cen.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(and $$0, @Nullable blu $$1) {
      hx $$2 = this.aB_();
      djg $$3 = this.r();
      $$0.a($$2, $$3.a(ddi.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dnq.N, $$2, dnq.a.a($$1));
   }

   private boolean b(and $$0) {
      return this.r().c(ddi.d) && $$0.ak() != bjx.a && $$0.Z().b(ctk.M);
   }

   public void a(and $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cto)$$0);
         }

         cel.a($$0, els.b(this.aB_()), null, 40);
      }
   }

   private void b(cto $$0) {
      arq $$1 = (arq)j.get(this.k);
      if ($$1 != null) {
         hx $$2 = this.aB_();
         int $$3 = $$2.u() + aun.b($$0.z, -10, 10);
         int $$4 = $$2.v() + aun.b($$0.z, -10, 10);
         int $$5 = $$2.w() + aun.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, ars.f, 5.0F, 1.0F);
      }
   }

   private boolean c(and $$0) {
      return this.k < 4 ? false : avh.a(bly.bj, bmo.k, $$0, this.aB_(), 20, 5, 6, avh.a.b).isPresent();
   }

   public dnz.b c() {
      return this.n;
   }

   class a implements dnz.d {
      private static final int b = 8;
      private final dnu c = new dnm(dib.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dnu b() {
         return this.c;
      }

      @Override
      public asv<dnq> c() {
         return asm.c;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnq $$2, dnq.a $$3) {
         return !dib.this.r().c(ddi.b) && dib.a($$3.a()) != null;
      }

      @Override
      public void a(and $$0, hx $$1, dnq $$2, @Nullable blu $$3, @Nullable blu $$4, float $$5) {
         dib.this.a($$0, dib.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dib.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
