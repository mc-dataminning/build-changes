import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlm extends dkg implements drp.b<drw.b>, drw {
   private static final Logger b = LogUtils.getLogger();
   private drw.a c;
   private final drw.b d;
   private final drw.d e = this.b();
   private int h;

   protected dlm(dki<?> $$0, ib $$1, dmz $$2) {
      super($$0, $$1, $$2);
      this.c = new drw.a();
      this.d = new drw.b(this);
   }

   public dlm(ib $$0, dmz $$1) {
      this(dki.I, $$0, $$1);
   }

   public drw.d b() {
      return new dlm.a(this.aC_());
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         drw.a.a.parse(new Dynamic(to.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      drw.a.a.encodeStart(to.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public drw.a gp() {
      return this.c;
   }

   @Override
   public drw.d gq() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public drw.b f() {
      return this.d;
   }

   protected class a implements drw.d {
      public static final int b = 8;
      protected final ib c;
      private final drr a;

      public a(ib $$1) {
         this.c = $$1;
         this.a = new drj($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public drr b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drn> $$2, @Nullable drn.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(drn.f) && !$$2.a(drn.i) ? dgs.n(dlm.this.n()) : false;
      }

      @Override
      public void a(apf $$0, ib $$1, il<drn> $$2, @Nullable bow $$3, @Nullable bow $$4, float $$5) {
         dmz $$6 = dlm.this.n();
         if (dgs.n($$6)) {
            dlm.this.a(drw.a_($$2));
            int $$7 = drw.a_($$5, this.a());
            if ($$6.b() instanceof dgs $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dlm.this.d());
            }
         }
      }

      @Override
      public void e() {
         dlm.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
