import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dro extends dqc implements dxx.b<dye.b>, dye {
   private static final Logger b = LogUtils.getLogger();
   private dye.a c;
   private final dye.b d;
   private final dye.d e = this.b();
   private int h;

   protected dro(dqe<?> $$0, ir $$1, dtc $$2) {
      super($$0, $$1, $$2);
      this.c = new dye.a();
      this.d = new dye.b(this);
   }

   public dro(ir $$0, dtc $$1) {
      this(dqe.J, $$0, $$1);
   }

   public dye.d b() {
      return new dro.a(this.az_());
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dye.a.a.parse(new Dynamic(uy.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dye.a.a.encodeStart(uy.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dye.a gA() {
      return this.c;
   }

   @Override
   public dye.d gB() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dye.b f() {
      return this.d;
   }

   protected class a implements dye.d {
      public static final int b = 8;
      protected final ir c;
      private final dxz a;

      public a(ir $$1) {
         this.c = $$1;
         this.a = new dxr($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxz b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqt $$0, ir $$1, ja<dxv> $$2, @Nullable dxv.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dxv.f) && !$$2.a(dxv.i) ? dmj.n(dro.this.n()) : false;
      }

      @Override
      public void a(aqt $$0, ir $$1, ja<dxv> $$2, @Nullable brv $$3, @Nullable brv $$4, float $$5) {
         dtc $$6 = dro.this.n();
         if (dmj.n($$6)) {
            dro.this.a(dye.a_($$2));
            int $$7 = dye.a_($$5, this.a());
            if ($$6.b() instanceof dmj $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dro.this.d());
            }
         }
      }

      @Override
      public void e() {
         dro.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
