import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqq extends dpj implements dwz.b<dxg.b>, dxg {
   private static final Logger b = LogUtils.getLogger();
   private dxg.a c;
   private final dxg.b d;
   private final dxg.d e = this.b();
   private int h;

   protected dqq(dpl<?> $$0, iz $$1, dse $$2) {
      super($$0, $$1, $$2);
      this.c = new dxg.a();
      this.d = new dxg.b(this);
   }

   public dqq(iz $$0, dse $$1) {
      this(dpl.I, $$0, $$1);
   }

   public dxg.d b() {
      return new dqq.a(this.ay_());
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxg.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxg.a.a.encodeStart(vg.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxg.a gs() {
      return this.c;
   }

   @Override
   public dxg.d gt() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxg.b f() {
      return this.d;
   }

   protected class a implements dxg.d {
      public static final int b = 8;
      protected final iz c;
      private final dxb a;

      public a(final iz $$1) {
         this.c = $$1;
         this.a = new dwt($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxb b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dwx> $$2, @Nullable dwx.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dwx.f) && !$$2.a(dwx.i) ? dlu.n(dqq.this.n()) : false;
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dwx> $$2, @Nullable bsw $$3, @Nullable bsw $$4, float $$5) {
         dse $$6 = dqq.this.n();
         if (dlu.n($$6)) {
            dqq.this.a(dxg.a_($$2));
            int $$7 = dxg.a_($$5, this.a());
            if ($$6.b() instanceof dlu $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqq.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
