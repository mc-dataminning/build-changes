import java.util.List;
import javax.annotation.Nullable;

public class dvh extends duq implements btg, fdd.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dvh.a h;
   private dvx k;
   private cxg l = cxg.j;
   @Nullable
   protected alo<ewn> i;
   protected long j;

   public dvh(jh $$0, dxo $$1) {
      super(dus.P, $$0, $$1);
      this.k = dvx.a;
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.k = dvx.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cxg.a($$1, (vj)$$0.p("item")).orElse(cxg.j);
         } else {
            this.l = cxg.j;
         }
      }
   }

   public acn j() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      return this.e($$0);
   }

   public jm k() {
      return this.m().c(dye.U);
   }

   public dvx s() {
      return this.k;
   }

   public void c(cxg $$0) {
      this.a($$0);
   }

   public cxg t() {
      cxg $$0 = cxk.eP.n();
      $$0.b(this.q());
      return $$0;
   }

   public static cxg a(dvx $$0) {
      cxg $$1 = cxk.eP.n();
      $$1.b(ku.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alo<ewn> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alo<ewn> $$0) {
      this.i = $$0;
   }

   @Override
   public long aA_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ak, this.k);
      $$0.a(ku.al, czy.a(List.of(this.l)));
   }

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      this.k = $$0.a(ku.ak, dvx.a);
      this.l = $$0.a(ku.al, czy.a).a();
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cxg f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cxg c(int $$0) {
      this.d_(null);
      cxg $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cxg.j;
      }

      return $$1;
   }

   @Override
   public void b(cxg $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public duq u() {
      return this;
   }

   public void a(dvh.a $$0) {
      if (this.o != null && !this.o.B_()) {
         this.o.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dvh.a.values().length) {
         this.g = this.o.ad();
         this.h = dvh.a.values()[$$1];
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
