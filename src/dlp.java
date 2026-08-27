import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlp extends dki implements drr.b<dry.b>, dry {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<atx> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aty.Br);
      $$0.put(2, aty.Bs);
      $$0.put(3, aty.Bt);
      $$0.put(4, aty.Bq);
   });
   private int l;
   private final dry.d m = new dlp.a();
   private dry.a n = new dry.a();
   private final dry.b r = new dry.b(this);

   public dlp(ib $$0, dnb $$1) {
      super(dkk.L, $$0, $$1);
   }

   @Override
   public dry.a gp() {
      return this.n;
   }

   @Override
   public dry.d gq() {
      return this.m;
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dry.a.a.parse(new Dynamic(to.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dry.a.a.encodeStart(to.a, this.n).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static apg a(@Nullable box $$0) {
      if ($$0 instanceof apg) {
         return (apg)$$0;
      } else {
         if ($$0 != null) {
            bpp $$6 = $$0.cN();
            if ($$6 instanceof apg) {
               return (apg)$$6;
            }
         }

         if ($$0 instanceof cjm $$3) {
            box var3 = $$3.af_();
            if (var3 instanceof apg) {
               return (apg)var3;
            }
         }

         if ($$0 instanceof cfe $$5) {
            box var9 = $$5.af_();
            if (var9 instanceof apg) {
               return (apg)var9;
            }
         }

         return null;
      }
   }

   public void a(apf $$0, @Nullable apg $$1) {
      if ($$1 != null) {
         dnb $$2 = this.n();
         if (!$$2.c(dgv.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (box)$$1);
            }
         }
      }
   }

   private boolean b(apf $$0, apg $$1) {
      OptionalInt $$2 = cia.a($$0, this.aC_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(apf $$0, @Nullable box $$1) {
      ib $$2 = this.aC_();
      dnb $$3 = this.n();
      $$0.a($$2, $$3.a(dgv.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(drp.N, $$2, drp.a.a($$1));
   }

   private boolean b(apf $$0) {
      return this.n().c(dgv.d) && $$0.aj() != bna.a && $$0.Z().b(cwx.M);
   }

   public void a(apf $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((cxb)$$0);
         }

         chy.a($$0, ept.b(this.aC_()), null, 40);
      }
   }

   private void b(cxb $$0) {
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
      return this.l < 4 ? false : axo.a(bpd.bm, bpt.k, $$0, this.aC_(), 20, 5, 6, axo.a.b).isPresent();
   }

   public dry.b b() {
      return this.r;
   }

   class a implements dry.d {
      private static final int b = 8;
      private final drt c = new drl(dlp.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public drt b() {
         return this.c;
      }

      @Override
      public avd<drp> c() {
         return aut.c;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drp> $$2, drp.a $$3) {
         return !dlp.this.n().c(dgv.b) && dlp.a($$3.a()) != null;
      }

      @Override
      public void a(apf $$0, ib $$1, il<drp> $$2, @Nullable box $$3, @Nullable box $$4, float $$5) {
         dlp.this.a($$0, dlp.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dlp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
