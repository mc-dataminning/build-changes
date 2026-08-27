import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnm extends dmf implements dtu.b<dub.b>, dub {
   private static final Logger b = LogUtils.getLogger();
   private dub.a c;
   private final dub.b d;
   private final dub.d e = this.b();
   private int h;

   protected dnm(dmh<?> $$0, ib $$1, doz $$2) {
      super($$0, $$1, $$2);
      this.c = new dub.a();
      this.d = new dub.b(this);
   }

   public dnm(ib $$0, doz $$1) {
      this(dmh.I, $$0, $$1);
   }

   public dub.d b() {
      return new dnm.a(this.aA_());
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dub.a.a.parse(new Dynamic(ua.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dub.a.a.encodeStart(ua.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dub.a gp() {
      return this.c;
   }

   @Override
   public dub.d gq() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dub.b f() {
      return this.d;
   }

   protected class a implements dub.d {
      public static final int b = 8;
      protected final ib c;
      private final dtw a;

      public a(ib $$1) {
         this.c = $$1;
         this.a = new dto($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dtw b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aps $$0, ib $$1, il<dts> $$2, @Nullable dts.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dts.f) && !$$2.a(dts.i) ? diq.n(dnm.this.n()) : false;
      }

      @Override
      public void a(aps $$0, ib $$1, il<dts> $$2, @Nullable bpv $$3, @Nullable bpv $$4, float $$5) {
         doz $$6 = dnm.this.n();
         if (diq.n($$6)) {
            dnm.this.a(dub.a_($$2));
            int $$7 = dub.a_($$5, this.a());
            if ($$6.b() instanceof diq $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dnm.this.d());
            }
         }
      }

      @Override
      public void e() {
         dnm.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
