import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtb extends drs implements dzn.b<dzu.b>, dzu {
   private static final Logger b = LogUtils.getLogger();
   private dzu.a c;
   private final dzu.b d;
   private final dzu.d e = this.b();
   private int h;

   protected dtb(dru<?> $$0, je $$1, duo $$2) {
      super($$0, $$1, $$2);
      this.c = new dzu.a();
      this.d = new dzu.b(this);
   }

   public dtb(je $$0, duo $$1) {
      this(dru.I, $$0, $$1);
   }

   public dzu.d b() {
      return new dtb.a(this.aB_());
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      ala<vc> $$2 = $$1.a(ut.a);
      if ($$0.b("listener", 10)) {
         dzu.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      ala<vc> $$2 = $$1.a(ut.a);
      dzu.a.a
         .encodeStart($$2, this.c)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dzu.a gr() {
      return this.c;
   }

   @Override
   public dzu.d gs() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dzu.b f() {
      return this.d;
   }

   protected class a implements dzu.d {
      public static final int b = 8;
      protected final je c;
      private final dzp a;

      public a(final je $$1) {
         this.c = $$1;
         this.a = new dzh($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dzp b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arh $$0, je $$1, jn<dzl> $$2, @Nullable dzl.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dzl.f) && !$$2.a(dzl.i) ? dod.q(dtb.this.m()) : false;
      }

      @Override
      public void a(arh $$0, je $$1, jn<dzl> $$2, @Nullable bto $$3, @Nullable bto $$4, float $$5) {
         duo $$6 = dtb.this.m();
         if (dod.q($$6)) {
            dtb.this.a(dzu.a_($$2));
            int $$7 = dzu.a_($$5, this.a());
            if ($$6.b() instanceof dod $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dtb.this.d());
            }
         }
      }

      @Override
      public void e() {
         dtb.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
