import java.util.List;
import javax.annotation.Nullable;

public class dxp extends dwx implements buh, ffu.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dxp.a h;
   private dyf k;
   private cyy l = cyy.k;
   @Nullable
   protected alf<eze> i;
   protected long j;

   public dxp(iu $$0, dzz $$1) {
      super(dwz.P, $$0, $$1);
      this.k = dyf.a;
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (!this.k.equals(dyf.a)) {
         $$0.a("sherds", dyf.b, this.k);
      }

      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.k = $$0.<dyf>a("sherds", dyf.b).orElse(dyf.a);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cyy.a($$1, (uw)$$0.p("item")).orElse(cyy.k);
         } else {
            this.l = cyy.k;
         }
      }
   }

   public aca j() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return this.e($$0);
   }

   public ja k() {
      return this.m().c(eap.T);
   }

   public dyf s() {
      return this.k;
   }

   public static cyy a(dyf $$0) {
      cyy $$1 = czc.eT.m();
      $$1.b(kj.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alf<eze> as_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alf<eze> $$0) {
      this.i = $$0;
   }

   @Override
   public long av_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.ao, this.k);
      $$0.a(kj.ap, dbq.a(List.of(this.l)));
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.k = $$0.a(kj.ao, dyf.a);
      this.l = $$0.a(kj.ap, dbq.a).a();
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cyy f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cyy c(int $$0) {
      this.d_(null);
      cyy $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cyy.k;
      }

      return $$1;
   }

   @Override
   public void b(cyy $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dwx t() {
      return this;
   }

   public void a(dxp.a $$0) {
      if (this.n != null && !this.n.w_()) {
         this.n.a(this.aw_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dxp.a.values().length) {
         this.g = this.n.ae();
         this.h = dxp.a.values()[$$1];
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
