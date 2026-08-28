import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drn extends dqf implements dxy.b<dyf.b>, dyf {
   private static final Logger b = LogUtils.getLogger();
   private dyf.a c;
   private final dyf.b d;
   private final dyf.d e = this.b();
   private int h;

   protected drn(dqh<?> $$0, jd $$1, dta $$2) {
      super($$0, $$1, $$2);
      this.c = new dyf.a();
      this.d = new dyf.b(this);
   }

   public drn(jd $$0, dta $$1) {
      this(dqh.I, $$0, $$1);
   }

   public dyf.d b() {
      return new drn.a(this.az_());
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dyf.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dyf.a.a.encodeStart(uo.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dyf.a go() {
      return this.c;
   }

   @Override
   public dyf.d gp() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dyf.b f() {
      return this.d;
   }

   protected class a implements dyf.d {
      public static final int b = 8;
      protected final jd c;
      private final dya a;

      public a(final jd $$1) {
         this.c = $$1;
         this.a = new dxs($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dya b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqt $$0, jd $$1, jm<dxw> $$2, @Nullable dxw.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dxw.f) && !$$2.a(dxw.i) ? dmq.n(drn.this.n()) : false;
      }

      @Override
      public void a(aqt $$0, jd $$1, jm<dxw> $$2, @Nullable bsq $$3, @Nullable bsq $$4, float $$5) {
         dta $$6 = drn.this.n();
         if (dmq.n($$6)) {
            drn.this.a(dyf.a_($$2));
            int $$7 = dyf.a_($$5, this.a());
            if ($$6.b() instanceof dmq $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, drn.this.d());
            }
         }
      }

      @Override
      public void e() {
         drn.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
