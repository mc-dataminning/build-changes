import java.util.List;
import javax.annotation.Nullable;

public class duq extends dtz implements bsp, fcm.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public duq.a h;
   private dvg k;
   private cwp l = cwp.j;
   @Nullable
   protected akt<evw> i;
   protected long j;

   public duq(ji $$0, dwx $$1) {
      super(dub.P, $$0, $$1);
      this.k = dvg.a;
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.k = dvg.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cwp.a($$1, (un)$$0.p("item")).orElse(cwp.j);
         } else {
            this.l = cwp.j;
         }
      }
   }

   public abr j() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public jn k() {
      return this.m().c(dxn.U);
   }

   public dvg s() {
      return this.k;
   }

   public static cwp a(dvg $$0) {
      cwp $$1 = cwt.eP.n();
      $$1.b(kv.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akt<evw> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akt<evw> $$0) {
      this.i = $$0;
   }

   @Override
   public long az_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.ak, this.k);
      $$0.a(kv.al, czh.a(List.of(this.l)));
   }

   @Override
   protected void a(dtz.b $$0) {
      super.a($$0);
      this.k = $$0.a(kv.ak, dvg.a);
      this.l = $$0.a(kv.al, czh.a).a();
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cwp f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cwp c(int $$0) {
      this.d_(null);
      cwp $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cwp.j;
      }

      return $$1;
   }

   @Override
   public void b(cwp $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dtz t() {
      return this;
   }

   public void a(duq.a $$0) {
      if (this.o != null && !this.o.B_()) {
         this.o.a(this.aA_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < duq.a.values().length) {
         this.g = this.o.ad();
         this.h = duq.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }
}
