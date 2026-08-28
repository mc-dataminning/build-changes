import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dww extends dvl implements edo.b<edv.b>, edv {
   private static final Logger a = LogUtils.getLogger();
   private edv.a b;
   private final edv.b c;
   private final edv.d d = this.a();
   private int h;

   protected dww(dvn<?> $$0, jj $$1, dym $$2) {
      super($$0, $$1, $$2);
      this.b = new edv.a();
      this.c = new edv.b(this);
   }

   public dww(jj $$0, dym $$1) {
      this(dvn.J, $$0, $$1);
   }

   public edv.d a() {
      return new dww.a(this.aw_());
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      alb<ut> $$2 = $$1.a(uk.a);
      if ($$0.b("listener", 10)) {
         edv.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Sensor: '{}'", $$0x))
            .ifPresent($$0x -> this.b = $$0x);
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      alb<ut> $$2 = $$1.a(uk.a);
      edv.a.a
         .encodeStart($$2, this.b)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Sensor: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public edv.a x() {
      return this.b;
   }

   @Override
   public edv.d gq() {
      return this.d;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public edv.b f() {
      return this.c;
   }

   protected class a implements edv.d {
      public static final int b = 8;
      protected final jj c;
      private final edq a;

      public a(final jj $$1) {
         this.c = $$1;
         this.a = new edi($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public edq b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arn $$0, jj $$1, js<edm> $$2, @Nullable edm.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(edm.f) && !$$2.a(edm.i) ? drs.q(dww.this.m()) : false;
      }

      @Override
      public void a(arn $$0, jj $$1, js<edm> $$2, @Nullable bvs $$3, @Nullable bvs $$4, float $$5) {
         dym $$6 = dww.this.m();
         if (drs.q($$6)) {
            dww.this.a(edv.a_($$2));
            int $$7 = edv.a_($$5, this.a());
            if ($$6.b() instanceof drs $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dww.this.d());
            }
         }
      }

      @Override
      public void e() {
         dww.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
