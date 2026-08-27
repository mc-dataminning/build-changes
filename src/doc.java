import java.util.List;
import javax.annotation.Nullable;

public class doc extends dnm implements bpu, eva.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public doc.a h;
   private doq k;
   private csz l = csz.i;
   @Nullable
   protected akg<eoq> i;
   protected long j;

   public doc(in $$0, dqh $$1) {
      super(dno.O, $$0, $$1);
      this.k = doq.a;
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.b_($$0) && !this.l.d()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.k = doq.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = csz.a($$1, (ux)$$0.p("item")).orElse(csz.i);
         } else {
            this.l = csz.i;
         }
      }
   }

   public abt j() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      return this.d($$0);
   }

   public is k() {
      return this.n().c(dqx.R);
   }

   public doq l() {
      return this.k;
   }

   public void c(csz $$0) {
      this.a($$0.a());
   }

   public csz t() {
      csz $$0 = ctc.eC.v();
      $$0.a(this.s());
      return $$0;
   }

   public static csz a(doq $$0) {
      csz $$1 = ctc.eC.v();
      $$1.b(ka.W, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akg<eoq> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akg<eoq> $$0) {
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
   public void a(jw.a $$0) {
      $$0.a(ka.W, this.k);
      $$0.a(ka.X, cvt.a(List.of(this.l)));
   }

   @Override
   public void a(jw $$0) {
      this.k = $$0.a(ka.W, doq.a);
      this.l = $$0.a(ka.X, cvt.a).a();
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public csz f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public csz c(int $$0) {
      this.e_(null);
      csz $$1 = this.l.a($$0);
      if (this.l.d()) {
         this.l = csz.i;
      }

      return $$1;
   }

   @Override
   public void b(csz $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dnm u() {
      return this;
   }

   public void a(doc.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < doc.a.values().length) {
         this.g = this.n.Y();
         this.h = doc.a.values()[$$1];
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
