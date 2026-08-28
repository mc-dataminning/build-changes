import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwa extends dup implements ecl.b<ecs.b>, ecs {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<axe> k = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, axf.Cp);
      $$0.put(2, axf.Cq);
      $$0.put(3, axf.Cr);
      $$0.put(4, axf.Co);
   });
   private int l;
   private final ecs.d m = new dwa.a();
   private ecs.a n = new ecs.a();
   private final ecs.b r = new ecs.b(this);

   public dwa(jh $$0, dxn $$1) {
      super(dur.M, $$0, $$1);
   }

   @Override
   public ecs.a gn() {
      return this.n;
   }

   @Override
   public ecs.d go() {
      return this.m;
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alx<vu> $$2 = $$1.a(vl.a);
      if ($$0.b("listener", 10)) {
         ecs.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alx<vu> $$2 = $$1.a(vl.a);
      ecs.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static asi a(@Nullable bvf $$0) {
      if ($$0 instanceof asi) {
         return (asi)$$0;
      } else {
         if ($$0 != null) {
            bwb $$6 = $$0.cX();
            if ($$6 instanceof asi) {
               return (asi)$$6;
            }
         }

         if ($$0 instanceof cql $$3) {
            bvf var3 = $$3.p();
            if (var3 instanceof asi) {
               return (asi)var3;
            }
         }

         if ($$0 instanceof clw $$5) {
            bvf var9 = $$5.p();
            if (var9 instanceof asi) {
               return (asi)var9;
            }
         }

         return null;
      }
   }

   public void a(ash $$0, @Nullable asi $$1) {
      if ($$1 != null) {
         dxn $$2 = this.m();
         if (!$$2.c(drb.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bvf)$$1);
            }
         }
      }
   }

   private boolean b(ash $$0, asi $$1) {
      OptionalInt $$2 = cox.a($$0, this.aB_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(ash $$0, @Nullable bvf $$1) {
      jh $$2 = this.aB_();
      dxn $$3 = this.m();
      $$0.a($$2, $$3.b(drb.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ecj.N, $$2, ecj.a.a($$1));
   }

   private boolean b(ash $$0) {
      return this.m().c(drb.d) && $$0.al() != btb.a && $$0.N().b(dgw.M);
   }

   public void a(ash $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dha)$$0);
         }

         cov.a($$0, fbs.b(this.aB_()), null, 40);
      }
   }

   private void b(dha $$0) {
      axe $$1 = (axe)k.get(this.l);
      if ($$1 != null) {
         jh $$2 = this.aB_();
         int $$3 = $$2.u() + bae.b($$0.A, -10, 10);
         int $$4 = $$2.v() + bae.b($$0.A, -10, 10);
         int $$5 = $$2.w() + bae.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, axg.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ash $$0) {
      return this.l < 4 ? false : bax.a(bvm.bG, bvl.k, $$0, this.aB_(), 20, 5, 6, bax.a.b).isPresent();
   }

   public ecs.b b() {
      return this.r;
   }

   class a implements ecs.d {
      private static final int b = 8;
      private final ecn c = new ecf(dwa.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ecn b() {
         return this.c;
      }

      @Override
      public ayk<ecj> c() {
         return ayb.c;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecj> $$2, ecj.a $$3) {
         return !dwa.this.m().c(drb.b) && dwa.a($$3.a()) != null;
      }

      @Override
      public void a(ash $$0, jh $$1, jq<ecj> $$2, @Nullable bvf $$3, @Nullable bvf $$4, float $$5) {
         dwa.this.a($$0, dwa.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dwa.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
