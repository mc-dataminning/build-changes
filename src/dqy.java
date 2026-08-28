import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqy extends dpq implements dxj.b<dxq.b>, dxq {
   private static final Logger b = LogUtils.getLogger();
   private dxq.a c;
   private final dxq.b d;
   private final dxq.d e = this.b();
   private int h;

   protected dqy(dps<?> $$0, ja $$1, dsl $$2) {
      super($$0, $$1, $$2);
      this.c = new dxq.a();
      this.d = new dxq.b(this);
   }

   public dqy(ja $$0, dsl $$1) {
      this(dps.I, $$0, $$1);
   }

   public dxq.d b() {
      return new dqy.a(this.az_());
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxq.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxq.a.a.encodeStart(ul.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxq.a gp() {
      return this.c;
   }

   @Override
   public dxq.d gq() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxq.b f() {
      return this.d;
   }

   protected class a implements dxq.d {
      public static final int b = 8;
      protected final ja c;
      private final dxl a;

      public a(final ja $$1) {
         this.c = $$1;
         this.a = new dxd($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxl b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxh> $$2, @Nullable dxh.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dxh.f) && !$$2.a(dxh.i) ? dmb.n(dqy.this.n()) : false;
      }

      @Override
      public void a(aqm $$0, ja $$1, jj<dxh> $$2, @Nullable bsh $$3, @Nullable bsh $$4, float $$5) {
         dsl $$6 = dqy.this.n();
         if (dmb.n($$6)) {
            dqy.this.a(dxq.a_($$2));
            int $$7 = dxq.a_($$5, this.a());
            if ($$6.b() instanceof dmb $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqy.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqy.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
