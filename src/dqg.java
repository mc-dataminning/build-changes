import java.util.List;
import javax.annotation.Nullable;

public class dqg extends dpq implements bqp, exs.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dqg.a h;
   private dqv k;
   private cud l;
   @Nullable
   protected akj<erb> i;
   protected long j;

   public dqg(ja $$0, dsl $$1) {
      super(dps.O, $$0, $$1);
      this.l = cud.l;
      this.k = dqv.a;
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
      this.k = dqv.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cud.a($$1, (uu)$$0.p("item")).orElse(cud.l);
         } else {
            this.l = cud.l;
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
      return this.n().c(dtb.R);
   }

   public dqv l() {
      return this.k;
   }

   public void c(cud $$0) {
      this.a($$0);
   }

   public cud u() {
      cud $$0 = cug.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cud a(dqv $$0) {
      cud $$1 = cug.eC.w();
      $$1.b(kn.Z, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akj<erb> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akj<erb> $$0) {
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
      $$0.a(kn.aa, cwy.a(List.of(this.l)));
   }

   @Override
   protected void a(dpq.b $$0) {
      super.a($$0);
      this.k = $$0.a(kn.Z, dqv.a);
      this.l = $$0.a(kn.aa, cwy.a).a();
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cud f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cud c(int $$0) {
      this.e_(null);
      cud $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cud.l;
      }

      return $$1;
   }

   @Override
   public void b(cud $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dpq v() {
      return this;
   }

   public void a(dqg.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dqg.a.values().length) {
         this.g = this.n.Z();
         this.h = dqg.a.values()[$$1];
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
