import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpp extends doi implements dvy.b<dwf.b>, dwf {
   private static final Logger b = LogUtils.getLogger();
   private dwf.a c;
   private final dwf.b d;
   private final dwf.d e = this.b();
   private int h;

   protected dpp(dok<?> $$0, io $$1, drd $$2) {
      super($$0, $$1, $$2);
      this.c = new dwf.a();
      this.d = new dwf.b(this);
   }

   public dpp(io $$0, drd $$1) {
      this(dok.I, $$0, $$1);
   }

   public dwf.d b() {
      return new dpp.a(this.aA_());
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dwf.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dwf.a.a.encodeStart(ur.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dwf.a gr() {
      return this.c;
   }

   @Override
   public dwf.d gs() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dwf.b f() {
      return this.d;
   }

   protected class a implements dwf.d {
      public static final int b = 8;
      protected final io c;
      private final dwa a;

      public a(io $$1) {
         this.c = $$1;
         this.a = new dvs($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwa b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqn $$0, io $$1, ix<dvw> $$2, @Nullable dvw.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dvw.f) && !$$2.a(dvw.i) ? dkt.n(dpp.this.n()) : false;
      }

      @Override
      public void a(aqn $$0, io $$1, ix<dvw> $$2, @Nullable brw $$3, @Nullable brw $$4, float $$5) {
         drd $$6 = dpp.this.n();
         if (dkt.n($$6)) {
            dpp.this.a(dwf.a_($$2));
            int $$7 = dwf.a_($$5, this.a());
            if ($$6.b() instanceof dkt $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dpp.this.d());
            }
         }
      }

      @Override
      public void e() {
         dpp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
