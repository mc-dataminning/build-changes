import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqx extends dpp implements dxi.b<dxp.b>, dxp {
   private static final Logger b = LogUtils.getLogger();
   private dxp.a c;
   private final dxp.b d;
   private final dxp.d e = this.b();
   private int h;

   protected dqx(dpr<?> $$0, ja $$1, dsk $$2) {
      super($$0, $$1, $$2);
      this.c = new dxp.a();
      this.d = new dxp.b(this);
   }

   public dqx(ja $$0, dsk $$1) {
      this(dpr.I, $$0, $$1);
   }

   public dxp.d b() {
      return new dqx.a(this.az_());
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxp.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxp.a.a.encodeStart(ul.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxp.a gq() {
      return this.c;
   }

   @Override
   public dxp.d gr() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxp.b f() {
      return this.d;
   }

   protected class a implements dxp.d {
      public static final int b = 8;
      protected final ja c;
      private final dxk a;

      public a(final ja $$1) {
         this.c = $$1;
         this.a = new dxc($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxk b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxg> $$2, @Nullable dxg.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dxg.f) && !$$2.a(dxg.i) ? dma.n(dqx.this.n()) : false;
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxg> $$2, @Nullable bsg $$3, @Nullable bsg $$4, float $$5) {
         dsk $$6 = dqx.this.n();
         if (dma.n($$6)) {
            dqx.this.a(dxp.a_($$2));
            int $$7 = dxp.a_($$5, this.a());
            if ($$6.b() instanceof dma $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqx.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqx.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
