import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dea extends dcv implements djv.b<dkc.b>, dkc {
   private static final Logger b = LogUtils.getLogger();
   private dkc.a c;
   private final dkc.b d;
   private final dkc.d e = this.c();
   private int g;

   protected dea(dcx<?> $$0, gw $$1, dfj $$2) {
      super($$0, $$1, $$2);
      this.c = new dkc.a();
      this.d = new dkc.b(this);
   }

   public dea(gw $$0, dfj $$1) {
      this(dcx.I, $$0, $$1);
   }

   public dkc.d c() {
      return new dea.a(this.p());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dkc.a.a.parse(new Dynamic(rj.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dkc.a.a.encodeStart(rj.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dkc.a gf() {
      return this.c;
   }

   @Override
   public dkc.d gg() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dkc.b g() {
      return this.d;
   }

   protected class a implements dkc.d {
      public static final int b = 8;
      protected final gw c;
      private final djx a;

      public a(gw $$1) {
         this.c = $$1;
         this.a = new djp($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djx b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akr $$0, gw $$1, djt $$2, @Nullable djt.a $$3) {
         return !$$1.equals(this.c) || $$2 != djt.f && $$2 != djt.i ? czo.n(dea.this.q()) : false;
      }

      @Override
      public void a(akr $$0, gw $$1, djt $$2, @Nullable biq $$3, @Nullable biq $$4, float $$5) {
         dfj $$6 = dea.this.q();
         if (czo.n($$6)) {
            dea.this.a(dkc.a_($$2));
            int $$7 = dkc.a_($$5, this.a());
            if ($$6.b() instanceof czo $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dea.this.f());
            }
         }
      }

      @Override
      public void e() {
         dea.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
