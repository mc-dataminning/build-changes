import java.util.List;
import javax.annotation.Nullable;

public class dwd extends dvl implements btw, feg.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dwd.a h;
   private dwt k;
   private cxy l = cxy.k;
   @Nullable
   protected alc<exq> i;
   protected long j;

   public dwd(jj $$0, dym $$1) {
      super(dvn.P, $$0, $$1);
      this.k = dwt.a;
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.k = dwt.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cxy.a($$1, (ut)$$0.p("item")).orElse(cxy.k);
         } else {
            this.l = cxy.k;
         }
      }
   }

   public abx j() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.e($$0);
   }

   public jo k() {
      return this.m().c(dzc.T);
   }

   public dwt s() {
      return this.k;
   }

   public static cxy a(dwt $$0) {
      cxy $$1 = cyc.eR.n();
      $$1.b(kx.am, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public alc<exq> as_() {
      return this.i;
   }

   @Override
   public void a(@Nullable alc<exq> $$0) {
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
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.am, this.k);
      $$0.a(kx.an, dan.a(List.of(this.l)));
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      this.k = $$0.a(kx.am, dwt.a);
      this.l = $$0.a(kx.an, dan.a).a();
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cxy f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cxy c(int $$0) {
      this.d_(null);
      cxy $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cxy.k;
      }

      return $$1;
   }

   @Override
   public void b(cxy $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dvl t() {
      return this;
   }

   public void a(dwd.a $$0) {
      if (this.n != null && !this.n.w_()) {
         this.n.a(this.aw_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dwd.a.values().length) {
         this.g = this.n.ae();
         this.h = dwd.a.values()[$$1];
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
