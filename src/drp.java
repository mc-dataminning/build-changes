import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drp extends dqc implements dxx.b<dye.b>, dye {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avn> k = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avo.Cl);
      $$0.put(2, avo.Cm);
      $$0.put(3, avo.Cn);
      $$0.put(4, avo.Ck);
   });
   private int l;
   private final dye.d m = new drp.a();
   private dye.a q = new dye.a();
   private final dye.b r = new dye.b(this);

   public drp(ir $$0, dtc $$1) {
      super(dqe.M, $$0, $$1);
   }

   @Override
   public dye.a gA() {
      return this.q;
   }

   @Override
   public dye.d gB() {
      return this.m;
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dye.a.a.parse(new Dynamic(uy.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dye.a.a.encodeStart(uy.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqu a(@Nullable brv $$0) {
      if ($$0 instanceof aqu) {
         return (aqu)$$0;
      } else {
         if ($$0 != null) {
            bso $$6 = $$0.cV();
            if ($$6 instanceof aqu) {
               return (aqu)$$6;
            }
         }

         if ($$0 instanceof cms $$3) {
            brv var3 = $$3.t();
            if (var3 instanceof aqu) {
               return (aqu)var3;
            }
         }

         if ($$0 instanceof cig $$5) {
            brv var9 = $$5.t();
            if (var9 instanceof aqu) {
               return (aqu)var9;
            }
         }

         return null;
      }
   }

   public void a(aqt $$0, @Nullable aqu $$1) {
      if ($$1 != null) {
         dtc $$2 = this.n();
         if (!$$2.c(dmk.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (brv)$$1);
            }
         }
      }
   }

   private boolean b(aqt $$0, aqu $$1) {
      OptionalInt $$2 = cle.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqt $$0, @Nullable brv $$1) {
      ir $$2 = this.az_();
      dtc $$3 = this.n();
      $$0.a($$2, $$3.a(dmk.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dxv.N, $$2, dxv.a.a($$1));
   }

   private boolean b(aqt $$0) {
      return this.n().c(dmk.d) && $$0.al() != bpx.a && $$0.ab().b(dbw.N);
   }

   public void a(aqt $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dca)$$0);
         }

         clc.a($$0, ewu.b(this.az_()), null, 40);
      }
   }

   private void b(dca $$0) {
      avn $$1 = (avn)k.get(this.l);
      if ($$1 != null) {
         ir $$2 = this.az_();
         int $$3 = $$2.u() + aym.b($$0.A, -10, 10);
         int $$4 = $$2.v() + aym.b($$0.A, -10, 10);
         int $$5 = $$2.w() + aym.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avq.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqt $$0) {
      return this.l < 4 ? false : aze.a(bsb.bq, bss.k, $$0, this.az_(), 20, 5, 6, aze.a.b).isPresent();
   }

   public dye.b b() {
      return this.r;
   }

   class a implements dye.d {
      private static final int b = 8;
      private final dxz c = new dxr(drp.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxz b() {
         return this.c;
      }

      @Override
      public awt<dxv> c() {
         return awk.c;
      }

      @Override
      public boolean a(aqt $$0, ir $$1, ja<dxv> $$2, dxv.a $$3) {
         return !drp.this.n().c(dmk.b) && drp.a($$3.a()) != null;
      }

      @Override
      public void a(aqt $$0, ir $$1, ja<dxv> $$2, @Nullable brv $$3, @Nullable brv $$4, float $$5) {
         drp.this.a($$0, drp.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         drp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
