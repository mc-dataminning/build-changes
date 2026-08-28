import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqn extends dpg implements dww.b<dxd.b>, dxd {
   private static final Logger b = LogUtils.getLogger();
   private dxd.a c;
   private final dxd.b d;
   private final dxd.d e = this.b();
   private int h;

   protected dqn(dpi<?> $$0, iz $$1, dsb $$2) {
      super($$0, $$1, $$2);
      this.c = new dxd.a();
      this.d = new dxd.b(this);
   }

   public dqn(iz $$0, dsb $$1) {
      this(dpi.I, $$0, $$1);
   }

   public dxd.d b() {
      return new dqn.a(this.ay_());
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxd.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxd.a.a.encodeStart(vf.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxd.a gs() {
      return this.c;
   }

   @Override
   public dxd.d gt() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxd.b f() {
      return this.d;
   }

   protected class a implements dxd.d {
      public static final int b = 8;
      protected final iz c;
      private final dwy a;

      public a(final iz $$1) {
         this.c = $$1;
         this.a = new dwq($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwy b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwu> $$2, @Nullable dwu.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dwu.f) && !$$2.a(dwu.i) ? dlr.n(dqn.this.n()) : false;
      }

      @Override
      public void a(are $$0, iz $$1, ji<dwu> $$2, @Nullable bst $$3, @Nullable bst $$4, float $$5) {
         dsb $$6 = dqn.this.n();
         if (dlr.n($$6)) {
            dqn.this.a(dxd.a_($$2));
            int $$7 = dxd.a_($$5, this.a());
            if ($$6.b() instanceof dlr $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqn.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqn.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
