import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxy extends dwn implements eeq.b<eex.b>, eex {
   private static final Logger a = LogUtils.getLogger();
   private eex.a b;
   private final eex.b c;
   private final eex.d d = this.a();
   private int h;

   protected dxy(dwp<?> $$0, iu $$1, dzo $$2) {
      super($$0, $$1, $$2);
      this.b = new eex.a();
      this.c = new eex.b(this);
   }

   public dxy(iu $$0, dzo $$1) {
      this(dwp.J, $$0, $$1);
   }

   public eex.d a() {
      return new dxy.a(this.aw_());
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alc<uu> $$2 = $$1.a(ul.a);
      if ($$0.b("listener", 10)) {
         eex.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.b = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alc<uu> $$2 = $$1.a(ul.a);
      eex.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public eex.a x() {
      return this.b;
   }

   @Override
   public eex.d gq() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public eex.b f() {
      return this.c;
   }

   protected class a implements eex.d {
      public static final int b = 8;
      protected final iu c;
      private final ees a;

      public a(final iu $$1) {
         this.c = $$1;
         this.a = new eek($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public ees b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aro $$0, iu $$1, je<eeo> $$2, @Nullable eeo.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(eeo.f) && !$$2.a(eeo.i) ? dss.q(dxy.this.m()) : false;
      }

      @Override
      public void a(aro $$0, iu $$1, je<eeo> $$2, @Nullable bwa $$3, @Nullable bwa $$4, float $$5) {
         dzo $$6 = dxy.this.m();
         if (dss.q($$6)) {
            dxy.this.a(eex.a_($$2));
            int $$7 = eex.a_($$5, this.a());
            if ($$6.b() instanceof dss $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dxy.this.d());
            }
         }
      }

      @Override
      public void e() {
         dxy.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
