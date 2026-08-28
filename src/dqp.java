import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqp extends dpi implements dwy.b<dxf.b>, dxf {
   private static final Logger b = LogUtils.getLogger();
   private dxf.a c;
   private final dxf.b d;
   private final dxf.d e = this.b();
   private int h;

   protected dqp(dpk<?> $$0, iz $$1, dsd $$2) {
      super($$0, $$1, $$2);
      this.c = new dxf.a();
      this.d = new dxf.b(this);
   }

   public dqp(iz $$0, dsd $$1) {
      this(dpk.I, $$0, $$1);
   }

   public dxf.d b() {
      return new dqp.a(this.ay_());
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxf.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxf.a.a.encodeStart(vg.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxf.a gs() {
      return this.c;
   }

   @Override
   public dxf.d gt() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxf.b f() {
      return this.d;
   }

   protected class a implements dxf.d {
      public static final int b = 8;
      protected final iz c;
      private final dxa a;

      public a(final iz $$1) {
         this.c = $$1;
         this.a = new dws($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxa b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dww> $$2, @Nullable dww.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dww.f) && !$$2.a(dww.i) ? dlt.n(dqp.this.n()) : false;
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dww> $$2, @Nullable bsv $$3, @Nullable bsv $$4, float $$5) {
         dsd $$6 = dqp.this.n();
         if (dlt.n($$6)) {
            dqp.this.a(dxf.a_($$2));
            int $$7 = dxf.a_($$5, this.a());
            if ($$6.b() instanceof dlt $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqp.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
