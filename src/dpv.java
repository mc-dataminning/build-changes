import java.util.List;
import javax.annotation.Nullable;

public class dpv extends dpf implements bra, exa.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dpv.a h;
   private dqj k;
   private cun l;
   @Nullable
   protected ald<eql> i;
   protected long j;

   public dpv(iz $$0, dsa $$1) {
      super(dph.O, $$0, $$1);
      this.l = cun.l;
      this.k = dqj.a;
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.k = dqj.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cun.a($$1, (vo)$$0.p("item")).orElse(cun.l);
         } else {
            this.l = cun.l;
         }
      }
   }

   public aco j() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.e($$0);
   }

   public je k() {
      return this.n().c(dsq.R);
   }

   public dqj l() {
      return this.k;
   }

   public void c(cun $$0) {
      this.a($$0);
   }

   public cun u() {
      cun $$0 = cuq.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cun a(dqj $$0) {
      cun $$1 = cuq.eC.w();
      $$1.b(km.Y, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ald<eql> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ald<eql> $$0) {
      this.i = $$0;
   }

   @Override
   public long ay_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.Y, this.k);
      $$0.a(km.Z, cxj.a(List.of(this.l)));
   }

   @Override
   protected void a(dpf.b $$0) {
      super.a($$0);
      this.k = $$0.a(km.Y, dqj.a);
      this.l = $$0.a(km.Z, cxj.a).a();
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cun f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cun c(int $$0) {
      this.e_(null);
      cun $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cun.l;
      }

      return $$1;
   }

   @Override
   public void b(cun $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dpf v() {
      return this;
   }

   public void a(dpv.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dpv.a.values().length) {
         this.g = this.n.Z();
         this.h = dpv.a.values()[$$1];
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
