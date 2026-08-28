import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsn extends dre implements dyz.b<dzg.b>, dzg {
   private static final Logger b = LogUtils.getLogger();
   private dzg.a c;
   private final dzg.b d;
   private final dzg.d e = this.b();
   private int h;

   protected dsn(drg<?> $$0, je $$1, dua $$2) {
      super($$0, $$1, $$2);
      this.c = new dzg.a();
      this.d = new dzg.b(this);
   }

   public dsn(je $$0, dua $$1) {
      this(drg.I, $$0, $$1);
   }

   public dzg.d b() {
      return new dsn.a(this.aD_());
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      akz<vc> $$2 = $$1.a(ut.a);
      if ($$0.b("listener", 10)) {
         dzg.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      akz<vc> $$2 = $$1.a(ut.a);
      dzg.a.a
         .encodeStart($$2, this.c)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dzg.a gq() {
      return this.c;
   }

   @Override
   public dzg.d gr() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dzg.b f() {
      return this.d;
   }

   protected class a implements dzg.d {
      public static final int b = 8;
      protected final je c;
      private final dzb a;

      public a(final je $$1) {
         this.c = $$1;
         this.a = new dyt($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dzb b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arg $$0, je $$1, jn<dyx> $$2, @Nullable dyx.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dyx.f) && !$$2.a(dyx.i) ? dnp.q(dsn.this.m()) : false;
      }

      @Override
      public void a(arg $$0, je $$1, jn<dyx> $$2, @Nullable btj $$3, @Nullable btj $$4, float $$5) {
         dua $$6 = dsn.this.m();
         if (dnp.q($$6)) {
            dsn.this.a(dzg.a_($$2));
            int $$7 = dzg.a_($$5, this.a());
            if ($$6.b() instanceof dnp $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dsn.this.d());
            }
         }
      }

      @Override
      public void e() {
         dsn.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
