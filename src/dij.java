import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dij extends dhd implements dob.b<doi.b>, doi {
   private static final Logger b = LogUtils.getLogger();
   private doi.a c;
   private final doi.b d;
   private final doi.d e = this.c();
   private int h;

   protected dij(dhf<?> $$0, hx $$1, djp $$2) {
      super($$0, $$1, $$2);
      this.c = new doi.a();
      this.d = new doi.b(this);
   }

   public dij(hx $$0, djp $$1) {
      this(dhf.I, $$0, $$1);
   }

   public doi.d c() {
      return new dij.a(this.aE_());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         doi.a.a.parse(new Dynamic(tc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.h);
      doi.a.a.encodeStart(tc.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public doi.a gh() {
      return this.c;
   }

   @Override
   public doi.d gi() {
      return this.e;
   }

   public int f() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public doi.b g() {
      return this.d;
   }

   protected class a implements doi.d {
      public static final int b = 8;
      protected final hx c;
      private final dod a;

      public a(hx $$1) {
         this.c = $$1;
         this.a = new dnv($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dod b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ane $$0, hx $$1, ih<dnz> $$2, @Nullable dnz.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dnz.f) && !$$2.a(dnz.i) ? ddq.n(dij.this.r()) : false;
      }

      @Override
      public void a(ane $$0, hx $$1, ih<dnz> $$2, @Nullable blw $$3, @Nullable blw $$4, float $$5) {
         djp $$6 = dij.this.r();
         if (ddq.n($$6)) {
            dij.this.a(doi.a_($$2));
            int $$7 = doi.a_($$5, this.a());
            if ($$6.b() instanceof ddq $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dij.this.f());
            }
         }
      }

      @Override
      public void e() {
         dij.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
