import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvi extends dtx implements ebt.b<eca.b>, eca {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avy> k = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avz.CF);
      $$0.put(2, avz.CG);
      $$0.put(3, avz.CH);
      $$0.put(4, avz.CE);
   });
   private int l;
   private final eca.d m = new dvi.a();
   private eca.a n = new eca.a();
   private final eca.b r = new eca.b(this);

   public dvi(ji $$0, dwv $$1) {
      super(dtz.M, $$0, $$1);
   }

   @Override
   public eca.a gq() {
      return this.n;
   }

   @Override
   public eca.d gr() {
      return this.m;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      aks<un> $$2 = $$1.a(ue.a);
      if ($$0.b("listener", 10)) {
         eca.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      aks<un> $$2 = $$1.a(ue.a);
      eca.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static ard a(@Nullable buj $$0) {
      if ($$0 instanceof ard) {
         return (ard)$$0;
      } else {
         if ($$0 != null) {
            bvf $$6 = $$0.cX();
            if ($$6 instanceof ard) {
               return (ard)$$6;
            }
         }

         if ($$0 instanceof cpo $$3) {
            buj var3 = $$3.p();
            if (var3 instanceof ard) {
               return (ard)var3;
            }
         }

         if ($$0 instanceof cla $$5) {
            buj var9 = $$5.p();
            if (var9 instanceof ard) {
               return (ard)var9;
            }
         }

         return null;
      }
   }

   public void a(arc $$0, @Nullable ard $$1) {
      if ($$1 != null) {
         dwv $$2 = this.m();
         if (!$$2.c(dqj.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (buj)$$1);
            }
         }
      }
   }

   private boolean b(arc $$0, ard $$1) {
      OptionalInt $$2 = cnz.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arc $$0, @Nullable buj $$1) {
      ji $$2 = this.aA_();
      dwv $$3 = this.m();
      $$0.a($$2, $$3.b(dqj.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ebr.N, $$2, ebr.a.a($$1));
   }

   private boolean b(arc $$0) {
      return this.m().c(dqj.d) && $$0.am() != bsf.a && $$0.O().b(dgc.N);
   }

   public void a(arc $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dgg)$$0);
         }

         cnx.a($$0, fay.b(this.aA_()), null, 40);
      }
   }

   private void b(dgg $$0) {
      avy $$1 = (avy)k.get(this.l);
      if ($$1 != null) {
         ji $$2 = this.aA_();
         int $$3 = $$2.u() + ayy.b($$0.A, -10, 10);
         int $$4 = $$2.v() + ayy.b($$0.A, -10, 10);
         int $$5 = $$2.w() + ayy.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awa.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arc $$0) {
      return this.l < 4 ? false : azr.a(buq.bF, bup.k, $$0, this.aA_(), 20, 5, 6, azr.a.b, false).isPresent();
   }

   public eca.b b() {
      return this.r;
   }

   class a implements eca.d {
      private static final int b = 8;
      private final ebv c = new ebn(dvi.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ebv b() {
         return this.c;
      }

      @Override
      public axe<ebr> c() {
         return awv.c;
      }

      @Override
      public boolean a(arc $$0, ji $$1, jr<ebr> $$2, ebr.a $$3) {
         return !dvi.this.m().c(dqj.b) && dvi.a($$3.a()) != null;
      }

      @Override
      public void a(arc $$0, ji $$1, jr<ebr> $$2, @Nullable buj $$3, @Nullable buj $$4, float $$5) {
         dvi.this.a($$0, dvi.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dvi.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
