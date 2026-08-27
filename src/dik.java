import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dik extends dhd implements dob.b<doi.b>, doi {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<ars> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, art.AV);
      $$0.put(2, art.AW);
      $$0.put(3, art.AX);
      $$0.put(4, art.AU);
   });
   private int l;
   private final doi.d m = new dik.a();
   private doi.a n = new doi.a();
   private final doi.b r = new doi.b(this);

   public dik(hx $$0, djp $$1) {
      super(dhf.L, $$0, $$1);
   }

   @Override
   public doi.a gh() {
      return this.n;
   }

   @Override
   public doi.d gi() {
      return this.m;
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         doi.a.a.parse(new Dynamic(tc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      $$0.a("warning_level", this.l);
      doi.a.a.encodeStart(tc.a, this.n).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static anf a(@Nullable blw $$0) {
      if ($$0 instanceof anf) {
         return (anf)$$0;
      } else {
         if ($$0 != null) {
            bmo $$6 = $$0.cN();
            if ($$6 instanceof anf) {
               return (anf)$$6;
            }
         }

         if ($$0 instanceof cgi $$3) {
            blw var3 = $$3.w();
            if (var3 instanceof anf) {
               return (anf)var3;
            }
         }

         if ($$0 instanceof ccb $$5) {
            blw var9 = $$5.w();
            if (var9 instanceof anf) {
               return (anf)var9;
            }
         }

         return null;
      }
   }

   public void a(ane $$0, @Nullable anf $$1) {
      if ($$1 != null) {
         djp $$2 = this.r();
         if (!$$2.c(ddr.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (blw)$$1);
            }
         }
      }
   }

   private boolean b(ane $$0, anf $$1) {
      OptionalInt $$2 = cew.a($$0, this.aE_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(ane $$0, @Nullable blw $$1) {
      hx $$2 = this.aE_();
      djp $$3 = this.r();
      $$0.a($$2, $$3.a(ddr.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dnz.N, $$2, dnz.a.a($$1));
   }

   private boolean b(ane $$0) {
      return this.r().c(ddr.d) && $$0.ak() != bjz.a && $$0.Z().b(ctt.M);
   }

   public void a(ane $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((ctx)$$0);
         }

         ceu.a($$0, emc.b(this.aE_()), null, 40);
      }
   }

   private void b(ctx $$0) {
      ars $$1 = (ars)k.get(this.l);
      if ($$1 != null) {
         hx $$2 = this.aE_();
         int $$3 = $$2.u() + aup.b($$0.z, -10, 10);
         int $$4 = $$2.v() + aup.b($$0.z, -10, 10);
         int $$5 = $$2.w() + aup.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aru.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ane $$0) {
      return this.l < 4 ? false : avj.a(bmc.bk, bms.k, $$0, this.aE_(), 20, 5, 6, avj.a.b).isPresent();
   }

   public doi.b c() {
      return this.r;
   }

   class a implements doi.d {
      private static final int b = 8;
      private final dod c = new dnv(dik.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dod b() {
         return this.c;
      }

      @Override
      public asx<dnz> c() {
         return aso.c;
      }

      @Override
      public boolean a(ane $$0, hx $$1, ih<dnz> $$2, dnz.a $$3) {
         return !dik.this.r().c(ddr.b) && dik.a($$3.a()) != null;
      }

      @Override
      public void a(ane $$0, hx $$1, ih<dnz> $$2, @Nullable blw $$3, @Nullable blw $$4, float $$5) {
         dik.this.a($$0, dik.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dik.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
