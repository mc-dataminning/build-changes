import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpn extends dog implements dvw.b<dwd.b>, dwd {
   private static final Logger b = LogUtils.getLogger();
   private dwd.a c;
   private final dwd.b d;
   private final dwd.d e = this.b();
   private int h;

   protected dpn(doi<?> $$0, io $$1, drb $$2) {
      super($$0, $$1, $$2);
      this.c = new dwd.a();
      this.d = new dwd.b(this);
   }

   public dpn(io $$0, drb $$1) {
      this(doi.I, $$0, $$1);
   }

   public dwd.d b() {
      return new dpn.a(this.az_());
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dwd.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dwd.a.a.encodeStart(ur.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dwd.a gr() {
      return this.c;
   }

   @Override
   public dwd.d gs() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dwd.b f() {
      return this.d;
   }

   protected class a implements dwd.d {
      public static final int b = 8;
      protected final io c;
      private final dvy a;

      public a(io $$1) {
         this.c = $$1;
         this.a = new dvq($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dvy b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqm $$0, io $$1, ix<dvu> $$2, @Nullable dvu.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dvu.f) && !$$2.a(dvu.i) ? dkr.n(dpn.this.n()) : false;
      }

      @Override
      public void a(aqm $$0, io $$1, ix<dvu> $$2, @Nullable bru $$3, @Nullable bru $$4, float $$5) {
         drb $$6 = dpn.this.n();
         if (dkr.n($$6)) {
            dpn.this.a(dwd.a_($$2));
            int $$7 = dwd.a_($$5, this.a());
            if ($$6.b() instanceof dkr $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dpn.this.d());
            }
         }
      }

      @Override
      public void e() {
         dpn.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
