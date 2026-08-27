import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkr extends djl implements dqt.b<dra.b>, dra {
   private static final Logger b = LogUtils.getLogger();
   private dra.a c;
   private final dra.b d;
   private final dra.d e = this.b();
   private int h;

   protected dkr(djn<?> $$0, ib $$1, dme $$2) {
      super($$0, $$1, $$2);
      this.c = new dra.a();
      this.d = new dra.b(this);
   }

   public dkr(ib $$0, dme $$1) {
      this(djn.I, $$0, $$1);
   }

   public dra.d b() {
      return new dkr.a(this.aD_());
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dra.a.a.parse(new Dynamic(tm.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dra.a.a.encodeStart(tm.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dra.a gn() {
      return this.c;
   }

   @Override
   public dra.d go() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dra.b f() {
      return this.d;
   }

   protected class a implements dra.d {
      public static final int b = 8;
      protected final ib c;
      private final dqv a;

      public a(ib $$1) {
         this.c = $$1;
         this.a = new dqn($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dqv b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apa $$0, ib $$1, il<dqr> $$2, @Nullable dqr.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dqr.f) && !$$2.a(dqr.i) ? dfx.n(dkr.this.n()) : false;
      }

      @Override
      public void a(apa $$0, ib $$1, il<dqr> $$2, @Nullable bof $$3, @Nullable bof $$4, float $$5) {
         dme $$6 = dkr.this.n();
         if (dfx.n($$6)) {
            dkr.this.a(dra.a_($$2));
            int $$7 = dra.a_($$5, this.a());
            if ($$6.b() instanceof dfx $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dkr.this.d());
            }
         }
      }

      @Override
      public void e() {
         dkr.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
