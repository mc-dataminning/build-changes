import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dgj extends dfd implements dlu.b<dmb.b>, dmb {
   private static final Logger b = LogUtils.getLogger();
   private dmb.a c;
   private final dmb.b d;
   private final dmb.d e = this.c();
   private int g;

   protected dgj(dff<?> $$0, ht $$1, dhi $$2) {
      super($$0, $$1, $$2);
      this.c = new dmb.a();
      this.d = new dmb.b(this);
   }

   public dgj(ht $$0, dhi $$1) {
      this(dff.I, $$0, $$1);
   }

   public dmb.d c() {
      return new dgj.a(this.p());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dmb.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dmb.a.a.encodeStart(sn.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dmb.a gh() {
      return this.c;
   }

   @Override
   public dmb.d gi() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dmb.b g() {
      return this.d;
   }

   protected class a implements dmb.d {
      public static final int b = 8;
      protected final ht c;
      private final dlw a;

      public a(ht $$1) {
         this.c = $$1;
         this.a = new dlo($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dlw b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ame $$0, ht $$1, dls $$2, @Nullable dls.a $$3) {
         return !$$1.equals(this.c) || $$2 != dls.f && $$2 != dls.i ? dbs.n(dgj.this.q()) : false;
      }

      @Override
      public void a(ame $$0, ht $$1, dls $$2, @Nullable bkq $$3, @Nullable bkq $$4, float $$5) {
         dhi $$6 = dgj.this.q();
         if (dbs.n($$6)) {
            dgj.this.a(dmb.a_($$2));
            int $$7 = dmb.a_($$5, this.a());
            if ($$6.b() instanceof dbs $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dgj.this.f());
            }
         }
      }

      @Override
      public void e() {
         dgj.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
