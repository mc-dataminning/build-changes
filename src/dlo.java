import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlo extends dki implements drr.b<dry.b>, dry {
   private static final Logger b = LogUtils.getLogger();
   private dry.a c;
   private final dry.b d;
   private final dry.d e = this.b();
   private int h;

   protected dlo(dkk<?> $$0, ib $$1, dnb $$2) {
      super($$0, $$1, $$2);
      this.c = new dry.a();
      this.d = new dry.b(this);
   }

   public dlo(ib $$0, dnb $$1) {
      this(dkk.I, $$0, $$1);
   }

   public dry.d b() {
      return new dlo.a(this.aC_());
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dry.a.a.parse(new Dynamic(to.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dry.a.a.encodeStart(to.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dry.a gp() {
      return this.c;
   }

   @Override
   public dry.d gq() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dry.b f() {
      return this.d;
   }

   protected class a implements dry.d {
      public static final int b = 8;
      protected final ib c;
      private final drt a;

      public a(ib $$1) {
         this.c = $$1;
         this.a = new drl($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public drt b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drp> $$2, @Nullable drp.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(drp.f) && !$$2.a(drp.i) ? dgu.n(dlo.this.n()) : false;
      }

      @Override
      public void a(apf $$0, ib $$1, il<drp> $$2, @Nullable box $$3, @Nullable box $$4, float $$5) {
         dnb $$6 = dlo.this.n();
         if (dgu.n($$6)) {
            dlo.this.a(dry.a_($$2));
            int $$7 = dry.a_($$5, this.a());
            if ($$6.b() instanceof dgu $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dlo.this.d());
            }
         }
      }

      @Override
      public void e() {
         dlo.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
