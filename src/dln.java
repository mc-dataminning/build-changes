import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dln extends dkg implements drp.b<drw.b>, drw {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<atx> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aty.Bm);
      $$0.put(2, aty.Bn);
      $$0.put(3, aty.Bo);
      $$0.put(4, aty.Bl);
   });
   private int l;
   private final drw.d m = new dln.a();
   private drw.a n = new drw.a();
   private final drw.b r = new drw.b(this);

   public dln(ib $$0, dmz $$1) {
      super(dki.L, $$0, $$1);
   }

   @Override
   public drw.a gp() {
      return this.n;
   }

   @Override
   public drw.d gq() {
      return this.m;
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         drw.a.a.parse(new Dynamic(to.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      drw.a.a.encodeStart(to.a, this.n).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static apg a(@Nullable bow $$0) {
      if ($$0 instanceof apg) {
         return (apg)$$0;
      } else {
         if ($$0 != null) {
            bpo $$6 = $$0.cN();
            if ($$6 instanceof apg) {
               return (apg)$$6;
            }
         }

         if ($$0 instanceof cjk $$3) {
            bow var3 = $$3.af_();
            if (var3 instanceof apg) {
               return (apg)var3;
            }
         }

         if ($$0 instanceof cfd $$5) {
            bow var9 = $$5.af_();
            if (var9 instanceof apg) {
               return (apg)var9;
            }
         }

         return null;
      }
   }

   public void a(apf $$0, @Nullable apg $$1) {
      if ($$1 != null) {
         dmz $$2 = this.n();
         if (!$$2.c(dgt.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bow)$$1);
            }
         }
      }
   }

   private boolean b(apf $$0, apg $$1) {
      OptionalInt $$2 = chy.a($$0, this.aC_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(apf $$0, @Nullable bow $$1) {
      ib $$2 = this.aC_();
      dmz $$3 = this.n();
      $$0.a($$2, $$3.a(dgt.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(drn.N, $$2, drn.a.a($$1));
   }

   private boolean b(apf $$0) {
      return this.n().c(dgt.d) && $$0.aj() != bmz.a && $$0.Z().b(cwv.M);
   }

   public void a(apf $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((cwz)$$0);
         }

         chw.a($$0, epr.b(this.aC_()), null, 40);
      }
   }

   private void b(cwz $$0) {
      atx $$1 = (atx)k.get(this.l);
      if ($$1 != null) {
         ib $$2 = this.aC_();
         int $$3 = $$2.u() + aww.b($$0.z, -10, 10);
         int $$4 = $$2.v() + aww.b($$0.z, -10, 10);
         int $$5 = $$2.w() + aww.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, atz.f, 5.0F, 1.0F);
      }
   }

   private boolean c(apf $$0) {
      return this.l < 4 ? false : axo.a(bpc.bl, bps.k, $$0, this.aC_(), 20, 5, 6, axo.a.b).isPresent();
   }

   public drw.b b() {
      return this.r;
   }

   class a implements drw.d {
      private static final int b = 8;
      private final drr c = new drj(dln.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public drr b() {
         return this.c;
      }

      @Override
      public avd<drn> c() {
         return aut.c;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drn> $$2, drn.a $$3) {
         return !dln.this.n().c(dgt.b) && dln.a($$3.a()) != null;
      }

      @Override
      public void a(apf $$0, ib $$1, il<drn> $$2, @Nullable bow $$3, @Nullable bow $$4, float $$5) {
         dln.this.a($$0, dln.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dln.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
