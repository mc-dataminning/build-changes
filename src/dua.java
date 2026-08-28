import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dua extends dsr implements eam.b<eat.b>, eat {
   private static final Logger b = LogUtils.getLogger();
   private eat.a c;
   private final eat.b d;
   private final eat.d e = this.b();
   private int h;

   protected dua(dst<?> $$0, jh $$1, dvo $$2) {
      super($$0, $$1, $$2);
      this.c = new eat.a();
      this.d = new eat.b(this);
   }

   public dua(jh $$0, dvo $$1) {
      this(dst.I, $$0, $$1);
   }

   public eat.d b() {
      return new dua.a(this.aB_());
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alj<vk> $$2 = $$1.a(vb.a);
      if ($$0.b("listener", 10)) {
         eat.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alj<vk> $$2 = $$1.a(vb.a);
      eat.a.a
         .encodeStart($$2, this.c)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public eat.a gx() {
      return this.c;
   }

   @Override
   public eat.d gy() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public eat.b f() {
      return this.d;
   }

   protected class a implements eat.d {
      public static final int b = 8;
      protected final jh c;
      private final eao a;

      public a(final jh $$1) {
         this.c = $$1;
         this.a = new eag($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eao b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arq $$0, jh $$1, jq<eak> $$2, @Nullable eak.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(eak.f) && !$$2.a(eak.i) ? dpc.q(dua.this.m()) : false;
      }

      @Override
      public void a(arq $$0, jh $$1, jq<eak> $$2, @Nullable bui $$3, @Nullable bui $$4, float $$5) {
         dvo $$6 = dua.this.m();
         if (dpc.q($$6)) {
            dua.this.a(eat.a_($$2));
            int $$7 = eat.a_($$5, this.a());
            if ($$6.b() instanceof dpc $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dua.this.d());
            }
         }
      }

      @Override
      public void e() {
         dua.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
