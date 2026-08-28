import java.util.List;
import javax.annotation.Nullable;

public class dxf extends dwn implements bue, ffi.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dxf.a h;
   private dxv k;
   private cys l = cys.k;
   @Nullable
   protected ald<eys> i;
   protected long j;

   public dxf(iu $$0, dzo $$1) {
      super(dwp.P, $$0, $$1);
      this.k = dxv.a;
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.k = dxv.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cys.a($$1, (uu)$$0.p("item")).orElse(cys.k);
         } else {
            this.l = cys.k;
         }
      }
   }

   public aby j() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      return this.e($$0);
   }

   public ja k() {
      return this.m().c(eae.T);
   }

   public dxv s() {
      return this.k;
   }

   public static cys a(dxv $$0) {
      cys $$1 = cyw.eR.m();
      $$1.b(kj.ao, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public ald<eys> as_() {
      return this.i;
   }

   @Override
   public void a(@Nullable ald<eys> $$0) {
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
      $$0.a(kj.ap, dbk.a(List.of(this.l)));
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.k = $$0.a(kj.ao, dxv.a);
      this.l = $$0.a(kj.ap, dbk.a).a();
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cys f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cys c(int $$0) {
      this.d_(null);
      cys $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cys.k;
      }

      return $$1;
   }

   @Override
   public void b(cys $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dwn t() {
      return this;
   }

   public void a(dxf.a $$0) {
      if (this.n != null && !this.n.w_()) {
         this.n.a(this.aw_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < dxf.a.values().length) {
         this.g = this.n.ae();
         this.h = dxf.a.values()[$$1];
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
