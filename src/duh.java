import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duh extends dsy implements eat.b<eba.b>, eba {
   private static final Logger a = LogUtils.getLogger();
   private eba.a b;
   private final eba.b c;
   private final eba.d d = this.b();
   private int h;

   protected duh(dta<?> $$0, jh $$1, dvv $$2) {
      super($$0, $$1, $$2);
      this.b = new eba.a();
      this.c = new eba.b(this);
   }

   public duh(jh $$0, dvv $$1) {
      this(dta.I, $$0, $$1);
   }

   public eba.d b() {
      return new duh.a(this.aA_());
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alh<vi> $$2 = $$1.a(uz.a);
      if ($$0.b("listener", 10)) {
         eba.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.b = $$0x);
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alh<vi> $$2 = $$1.a(uz.a);
      eba.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public eba.a go() {
      return this.b;
   }

   @Override
   public eba.d gp() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public eba.b f() {
      return this.c;
   }

   protected class a implements eba.d {
      public static final int b = 8;
      protected final jh c;
      private final eav a;

      public a(final jh $$1) {
         this.c = $$1;
         this.a = new ean($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eav b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arp $$0, jh $$1, jq<ear> $$2, @Nullable ear.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(ear.f) && !$$2.a(ear.i) ? dpj.q(duh.this.m()) : false;
      }

      @Override
      public void a(arp $$0, jh $$1, jq<ear> $$2, @Nullable bul $$3, @Nullable bul $$4, float $$5) {
         dvv $$6 = duh.this.m();
         if (dpj.q($$6)) {
            duh.this.a(eba.a_($$2));
            int $$7 = eba.a_($$5, this.a());
            if ($$6.b() instanceof dpj $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, duh.this.d());
            }
         }
      }

      @Override
      public void e() {
         duh.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
