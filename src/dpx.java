import java.util.List;
import javax.annotation.Nullable;

public class dpx extends dph implements brc, exc.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dpx.a h;
   private dql k;
   private cup l;
   @Nullable
   protected ale<eqn> i;
   protected long j;

   public dpx(iz $$0, dsc $$1) {
      super(dpj.O, $$0, $$1);
      this.l = cup.l;
      this.k = dql.a;
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.k = dql.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cup.a($$1, (vp)$$0.p("item")).orElse(cup.l);
         } else {
            this.l = cup.l;
         }
      }
   }

   public acp j() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.e($$0);
   }

   public je k() {
      return this.n().c(dss.R);
   }

   public dql l() {
      return this.k;
   }

   public void c(cup $$0) {
      this.a($$0);
   }

   public cup u() {
      cup $$0 = cus.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cup a(dql $$0) {
      cup $$1 = cus.eC.w();
      $$1.b(km.Z, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ale<eqn> aw_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ale<eqn> $$0) {
      this.i = $$0;
   }

   @Override
   public long ax_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.Z, this.k);
      $$0.a(km.aa, cxl.a(List.of(this.l)));
   }

   @Override
   protected void a(dph.b $$0) {
      super.a($$0);
      this.k = $$0.a(km.Z, dql.a);
      this.l = $$0.a(km.aa, cxl.a).a();
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cup f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cup c(int $$0) {
      this.e_(null);
      cup $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cup.l;
      }

      return $$1;
   }

   @Override
   public void b(cup $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dph v() {
      return this;
   }

   public void a(dpx.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.ay_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dpx.a.values().length) {
         this.g = this.n.Z();
         this.h = dpx.a.values()[$$1];
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
