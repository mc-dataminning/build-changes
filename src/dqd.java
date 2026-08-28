import java.util.List;
import javax.annotation.Nullable;

public class dqd extends dpn implements bql, exk.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dqd.a h;
   private dqr k;
   private cua l;
   @Nullable
   protected akj<eqt> i;
   protected long j;

   public dqd(ja $$0, dsh $$1) {
      super(dpp.O, $$0, $$1);
      this.l = cua.l;
      this.k = dqr.a;
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.e()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.k = dqr.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cua.a($$1, (uu)$$0.p("item")).orElse(cua.l);
         } else {
            this.l = cua.l;
         }
      }
   }

   public abu j() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.e($$0);
   }

   public jf k() {
      return this.n().c(dsx.R);
   }

   public dqr l() {
      return this.k;
   }

   public void c(cua $$0) {
      this.a($$0);
   }

   public cua u() {
      cua $$0 = cud.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cua a(dqr $$0) {
      cua $$1 = cud.eC.w();
      $$1.b(kn.Z, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akj<eqt> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akj<eqt> $$0) {
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
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.Z, this.k);
      $$0.a(kn.aa, cwv.a(List.of(this.l)));
   }

   @Override
   protected void a(dpn.b $$0) {
      super.a($$0);
      this.k = $$0.a(kn.Z, dqr.a);
      this.l = $$0.a(kn.aa, cwv.a).a();
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cua f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cua c(int $$0) {
      this.e_(null);
      cua $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cua.l;
      }

      return $$1;
   }

   @Override
   public void b(cua $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dpn v() {
      return this;
   }

   public void a(dqd.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dqd.a.values().length) {
         this.g = this.n.Z();
         this.h = dqd.a.values()[$$1];
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
