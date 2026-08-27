import java.util.List;
import javax.annotation.Nullable;

public class dne extends dmo implements bon, etu.a {
   public static final String e = "sherds";
   public static final String f = "item";
   public static final int g = 1;
   public long h;
   @Nullable
   public dne.a i;
   private dns l;
   private crs m = crs.i;
   @Nullable
   protected ajv j;
   protected long k;

   public dne(id $$0, dpi $$1) {
      super(dmq.O, $$0, $$1);
      this.l = dns.a;
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      this.l.a($$0);
      if (!this.b_($$0) && !this.m.d()) {
         $$0.a("item", this.m.a($$1));
      }
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.l = dns.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.m = crs.a($$1, (ul)$$0.p("item")).orElse(crs.i);
         } else {
            this.m = crs.i;
         }
      }
   }

   public abh j() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return this.d($$0);
   }

   public ij k() {
      return this.n().c(dpy.R);
   }

   public dns l() {
      return this.l;
   }

   public void b(crs $$0) {
      this.a($$0.a());
   }

   public crs t() {
      crs $$0 = crv.eB.x();
      $$0.a(this.s());
      return $$0;
   }

   public static crs a(dns $$0) {
      crs $$1 = crv.eB.x();
      $$1.b(jr.P, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ajv ax_() {
      return this.j;
   }

   @Override
   public void a(@Nullable ajv $$0) {
      this.j = $$0;
   }

   @Override
   public long ay_() {
      return this.k;
   }

   @Override
   public void a(long $$0) {
      this.k = $$0;
   }

   @Override
   public void a(jn.a $$0) {
      $$0.a(jr.P, this.l);
      $$0.a(jr.Q, cuj.a(List.of(this.m)));
   }

   @Override
   public void a(jn $$0) {
      this.l = $$0.a(jr.P, dns.a);
      this.m = $$0.a(jr.Q, cuj.a).a();
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public crs f() {
      this.e_(null);
      return this.m;
   }

   @Override
   public crs c(int $$0) {
      this.e_(null);
      crs $$1 = this.m.a($$0);
      if (this.m.d()) {
         this.m = crs.i;
      }

      return $$1;
   }

   @Override
   public void a(crs $$0) {
      this.e_(null);
      this.m = $$0;
   }

   @Override
   public dmo u() {
      return this;
   }

   public void a(dne.a $$0) {
      if (this.o != null && !this.o.x_()) {
         this.o.a(this.az_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dne.a.values().length) {
         this.h = this.o.Y();
         this.i = dne.a.values()[$$1];
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
