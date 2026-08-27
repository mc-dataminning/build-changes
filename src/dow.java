import java.util.List;
import javax.annotation.Nullable;

public class dow extends dog implements bqc, evv.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dow.a h;
   private dpk k;
   private cto l = cto.i;
   @Nullable
   protected akl<epk> i;
   protected long j;

   public dow(io $$0, drb $$1) {
      super(doi.O, $$0, $$1);
      this.k = dpk.a;
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.k = dpk.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cto.a($$1, (va)$$0.p("item")).orElse(cto.i);
         } else {
            this.l = cto.i;
         }
      }
   }

   public abx j() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return this.e($$0);
   }

   public it k() {
      return this.n().c(drr.R);
   }

   public dpk l() {
      return this.k;
   }

   public void c(cto $$0) {
      this.a($$0);
   }

   public cto u() {
      cto $$0 = ctr.eC.v();
      $$0.a(this.s());
      return $$0;
   }

   public static cto a(dpk $$0) {
      cto $$1 = ctr.eC.v();
      $$1.b(kb.Y, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akl<epk> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akl<epk> $$0) {
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
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.Y, this.k);
      $$0.a(kb.Z, cwk.a(List.of(this.l)));
   }

   @Override
   protected void a(dog.b $$0) {
      super.a($$0);
      this.k = $$0.a(kb.Y, dpk.a);
      this.l = $$0.a(kb.Z, cwk.a).a();
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cto f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cto c(int $$0) {
      this.e_(null);
      cto $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cto.i;
      }

      return $$1;
   }

   @Override
   public void b(cto $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dog v() {
      return this;
   }

   public void a(dow.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dow.a.values().length) {
         this.g = this.n.Y();
         this.h = dow.a.values()[$$1];
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static enum a {
      a(7),
      b(10);

      public final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }
}
