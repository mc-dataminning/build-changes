import java.util.List;
import javax.annotation.Nullable;

public class dps extends dpc implements bqx, ewx.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dps.a h;
   private dqg k;
   private cuk l;
   @Nullable
   protected ala<eqi> i;
   protected long j;

   public dps(iz $$0, drx $$1) {
      super(dpe.O, $$0, $$1);
      this.l = cuk.l;
      this.k = dqg.a;
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
      this.k = dqg.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cuk.a($$1, (vo)$$0.p("item")).orElse(cuk.l);
         } else {
            this.l = cuk.l;
         }
      }
   }

   public acl j() {
      return acl.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.e($$0);
   }

   public je k() {
      return this.n().c(dsn.R);
   }

   public dqg l() {
      return this.k;
   }

   public void c(cuk $$0) {
      this.a($$0);
   }

   public cuk u() {
      cuk $$0 = cun.eC.w();
      $$0.b(this.s());
      return $$0;
   }

   public static cuk a(dqg $$0) {
      cuk $$1 = cun.eC.w();
      $$1.b(km.Y, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ala<eqi> ay_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ala<eqi> $$0) {
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
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.Y, this.k);
      $$0.a(km.Z, cxg.a(List.of(this.l)));
   }

   @Override
   protected void a(dpc.b $$0) {
      super.a($$0);
      this.k = $$0.a(km.Y, dqg.a);
      this.l = $$0.a(km.Z, cxg.a).a();
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cuk f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public cuk c(int $$0) {
      this.e_(null);
      cuk $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = cuk.l;
      }

      return $$1;
   }

   @Override
   public void b(cuk $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public dpc v() {
      return this;
   }

   public void a(dps.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.aA_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dps.a.values().length) {
         this.g = this.n.Z();
         this.h = dps.a.values()[$$1];
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
