import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqu extends dpn implements dxc.b<dxj.b>, dxj {
   private static final Logger b = LogUtils.getLogger();
   private dxj.a c;
   private final dxj.b d;
   private final dxj.d e = this.b();
   private int h;

   protected dqu(dpp<?> $$0, ja $$1, dsh $$2) {
      super($$0, $$1, $$2);
      this.c = new dxj.a();
      this.d = new dxj.b(this);
   }

   public dqu(ja $$0, dsh $$1) {
      this(dpp.I, $$0, $$1);
   }

   public dxj.d b() {
      return new dqu.a(this.az_());
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxj.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxj.a.a.encodeStart(ul.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxj.a gp() {
      return this.c;
   }

   @Override
   public dxj.d gq() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxj.b f() {
      return this.d;
   }

   protected class a implements dxj.d {
      public static final int b = 8;
      protected final ja c;
      private final dxe a;

      public a(final ja $$1) {
         this.c = $$1;
         this.a = new dww($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxe b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqk $$0, ja $$1, jj<dxa> $$2, @Nullable dxa.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dxa.f) && !$$2.a(dxa.i) ? dly.n(dqu.this.n()) : false;
      }

      @Override
      public void a(aqk $$0, ja $$1, jj<dxa> $$2, @Nullable bsd $$3, @Nullable bsd $$4, float $$5) {
         dsh $$6 = dqu.this.n();
         if (dly.n($$6)) {
            dqu.this.a(dxj.a_($$2));
            int $$7 = dxj.a_($$5, this.a());
            if ($$6.b() instanceof dly $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqu.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqu.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
