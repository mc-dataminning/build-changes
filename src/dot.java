import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dot extends dnm implements dvc.b<dvj.b>, dvj {
   private static final Logger b = LogUtils.getLogger();
   private dvj.a c;
   private final dvj.b d;
   private final dvj.d e = this.b();
   private int h;

   protected dot(dno<?> $$0, in $$1, dqh $$2) {
      super($$0, $$1, $$2);
      this.c = new dvj.a();
      this.d = new dvj.b(this);
   }

   public dot(in $$0, dqh $$1) {
      this(dno.I, $$0, $$1);
   }

   public dvj.d b() {
      return new dot.a(this.az_());
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dvj.a.a.parse(new Dynamic(uo.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dvj.a.a.encodeStart(uo.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dvj.a gr() {
      return this.c;
   }

   @Override
   public dvj.d gs() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dvj.b f() {
      return this.d;
   }

   protected class a implements dvj.d {
      public static final int b = 8;
      protected final in c;
      private final dve a;

      public a(in $$1) {
         this.c = $$1;
         this.a = new duw($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dve b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqh $$0, in $$1, iw<dva> $$2, @Nullable dva.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dva.f) && !$$2.a(dva.i) ? djx.n(dot.this.n()) : false;
      }

      @Override
      public void a(aqh $$0, in $$1, iw<dva> $$2, @Nullable brh $$3, @Nullable brh $$4, float $$5) {
         dqh $$6 = dot.this.n();
         if (djx.n($$6)) {
            dot.this.a(dvj.a_($$2));
            int $$7 = dvj.a_($$5, this.a());
            if ($$6.b() instanceof djx $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dot.this.d());
            }
         }
      }

      @Override
      public void e() {
         dot.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
