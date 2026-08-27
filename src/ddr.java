import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddr extends dcm implements djm.b<djt.b>, djt {
   private static final Logger b = LogUtils.getLogger();
   private djt.a c;
   private final djt.b d;
   private final djt.d e = this.c();
   private int g;

   protected ddr(dco<?> $$0, gu $$1, dfa $$2) {
      super($$0, $$1, $$2);
      this.c = new djt.a();
      this.d = new djt.b(this);
   }

   public ddr(gu $$0, dfa $$1) {
      this(dco.I, $$0, $$1);
   }

   public djt.d c() {
      return new ddr.a(this.p());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         djt.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      djt.a.a.encodeStart(rc.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public djt.a gb() {
      return this.c;
   }

   @Override
   public djt.d gc() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public djt.b g() {
      return this.d;
   }

   protected class a implements djt.d {
      public static final int b = 8;
      protected final gu c;
      private final djo a;

      public a(gu $$1) {
         this.c = $$1;
         this.a = new djg($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djo b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djk $$2, @Nullable djk.a $$3) {
         return !$$1.equals(this.c) || $$2 != djk.f && $$2 != djk.i ? czf.n(ddr.this.q()) : false;
      }

      @Override
      public void a(akk $$0, gu $$1, djk $$2, @Nullable bii $$3, @Nullable bii $$4, float $$5) {
         dfa $$6 = ddr.this.q();
         if (czf.n($$6)) {
            ddr.this.a(djt.a_($$2));
            int $$7 = djt.a_($$5, this.a());
            if ($$6.b() instanceof czf $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, ddr.this.f());
            }
         }
      }

      @Override
      public void e() {
         ddr.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
