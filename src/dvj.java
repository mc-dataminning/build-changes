import java.util.List;
import javax.annotation.Nullable;

public class dvj extends dus implements bte, fdj.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dvj.a h;
   private dvz k;
   private cxh l = cxh.k;
   @Nullable
   protected akt<ewt> i;
   protected long j;

   public dvj(ji $$0, dxq $$1) {
      super(duu.P, $$0, $$1);
      this.k = dvz.a;
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
      this.k = dvz.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cxh.a($$1, (un)$$0.p("item")).orElse(cxh.k);
         } else {
            this.l = cxh.k;
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
      return this.m().c(dyg.T);
   }

   public dvz s() {
      return this.k;
   }

   public static cxh a(dvz $$0) {
      cxh $$1 = cxl.eR.n();
      $$1.b(kv.am, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akt<ewt> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akt<ewt> $$0) {
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
      $$0.a(kv.am, this.k);
      $$0.a(kv.an, czx.a(List.of(this.l)));
   }

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      this.k = $$0.a(kv.am, dvz.a);
      this.l = $$0.a(kv.an, czx.a).a();
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cxh f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cxh c(int $$0) {
      this.d_(null);
      cxh $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cxh.k;
      }

      return $$1;
   }

   @Override
   public void b(cxh $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dus t() {
      return this;
   }

   public void a(dvj.a $$0) {
      if (this.n != null && !this.n.w_()) {
         this.n.a(this.aA_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dvj.a.values().length) {
         this.g = this.n.ae();
         this.h = dvj.a.values()[$$1];
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
