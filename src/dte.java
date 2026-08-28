import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dte extends drv implements dzr.b<dzy.b>, dzy {
   private static final Logger b = LogUtils.getLogger();
   private dzy.a c;
   private final dzy.b d;
   private final dzy.d e = this.b();
   private int h;

   protected dte(drx<?> $$0, jf $$1, dus $$2) {
      super($$0, $$1, $$2);
      this.c = new dzy.a();
      this.d = new dzy.b(this);
   }

   public dte(jf $$0, dus $$1) {
      this(drx.I, $$0, $$1);
   }

   public dzy.d b() {
      return new dte.a(this.aC_());
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alc<vd> $$2 = $$1.a(uu.a);
      if ($$0.b("listener", 10)) {
         dzy.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alc<vd> $$2 = $$1.a(uu.a);
      dzy.a.a
         .encodeStart($$2, this.c)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dzy.a gq() {
      return this.c;
   }

   @Override
   public dzy.d gr() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dzy.b f() {
      return this.d;
   }

   protected class a implements dzy.d {
      public static final int b = 8;
      protected final jf c;
      private final dzt a;

      public a(final jf $$1) {
         this.c = $$1;
         this.a = new dzl($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dzt b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arj $$0, jf $$1, jo<dzp> $$2, @Nullable dzp.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dzp.f) && !$$2.a(dzp.i) ? dog.q(dte.this.m()) : false;
      }

      @Override
      public void a(arj $$0, jf $$1, jo<dzp> $$2, @Nullable btr $$3, @Nullable btr $$4, float $$5) {
         dus $$6 = dte.this.m();
         if (dog.q($$6)) {
            dte.this.a(dzy.a_($$2));
            int $$7 = dzy.a_($$5, this.a());
            if ($$6.b() instanceof dog $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dte.this.d());
            }
         }
      }

      @Override
      public void e() {
         dte.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
