import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqj extends dpc implements dws.b<dwz.b>, dwz {
   private static final Logger b = LogUtils.getLogger();
   private dwz.a c;
   private final dwz.b d;
   private final dwz.d e = this.b();
   private int h;

   protected dqj(dpe<?> $$0, iz $$1, drx $$2) {
      super($$0, $$1, $$2);
      this.c = new dwz.a();
      this.d = new dwz.b(this);
   }

   public dqj(iz $$0, drx $$1) {
      this(dpe.I, $$0, $$1);
   }

   public dwz.d b() {
      return new dqj.a(this.aA_());
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dwz.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dwz.a.a.encodeStart(vf.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dwz.a gs() {
      return this.c;
   }

   @Override
   public dwz.d gt() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dwz.b f() {
      return this.d;
   }

   protected class a implements dwz.d {
      public static final int b = 8;
      protected final iz c;
      private final dwu a;

      public a(final iz $$1) {
         this.c = $$1;
         this.a = new dwm($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwu b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arb $$0, iz $$1, ji<dwq> $$2, @Nullable dwq.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dwq.f) && !$$2.a(dwq.i) ? dln.n(dqj.this.n()) : false;
      }

      @Override
      public void a(arb $$0, iz $$1, ji<dwq> $$2, @Nullable bsp $$3, @Nullable bsp $$4, float $$5) {
         drx $$6 = dqj.this.n();
         if (dln.n($$6)) {
            dqj.this.a(dwz.a_($$2));
            int $$7 = dwz.a_($$5, this.a());
            if ($$6.b() instanceof dln $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqj.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqj.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
