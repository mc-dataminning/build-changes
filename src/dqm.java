import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqm extends dpf implements dwv.b<dxc.b>, dxc {
   private static final Logger b = LogUtils.getLogger();
   private dxc.a c;
   private final dxc.b d;
   private final dxc.d e = this.b();
   private int h;

   protected dqm(dph<?> $$0, iz $$1, dsa $$2) {
      super($$0, $$1, $$2);
      this.c = new dxc.a();
      this.d = new dxc.b(this);
   }

   public dqm(iz $$0, dsa $$1) {
      this(dph.I, $$0, $$1);
   }

   public dxc.d b() {
      return new dqm.a(this.az_());
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxc.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxc.a.a.encodeStart(vf.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxc.a gs() {
      return this.c;
   }

   @Override
   public dxc.d gt() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxc.b f() {
      return this.d;
   }

   protected class a implements dxc.d {
      public static final int b = 8;
      protected final iz c;
      private final dwx a;

      public a(final iz $$1) {
         this.c = $$1;
         this.a = new dwp($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwx b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwt> $$2, @Nullable dwt.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dwt.f) && !$$2.a(dwt.i) ? dlq.n(dqm.this.n()) : false;
      }

      @Override
      public void a(are $$0, iz $$1, ji<dwt> $$2, @Nullable bss $$3, @Nullable bss $$4, float $$5) {
         dsa $$6 = dqm.this.n();
         if (dlq.n($$6)) {
            dqm.this.a(dxc.a_($$2));
            int $$7 = dxc.a_($$5, this.a());
            if ($$6.b() instanceof dlq $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqm.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqm.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
