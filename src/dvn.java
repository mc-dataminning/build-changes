import java.util.List;
import javax.annotation.Nullable;

public class dvn extends duw implements bto, fdj.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dvn.a h;
   private dwd k;
   private cxo l = cxo.j;
   @Nullable
   protected aly<ewt> i;
   protected long j;

   public dvn(jh $$0, dxu $$1) {
      super(duy.P, $$0, $$1);
      this.k = dwd.a;
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      this.k.a($$0);
      if (!this.c_($$0) && !this.l.f()) {
         $$0.a("item", this.l.a($$1));
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.k = dwd.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cxo.a($$1, (vu)$$0.p("item")).orElse(cxo.j);
         } else {
            this.l = cxo.j;
         }
      }
   }

   public acy j() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public jm k() {
      return this.m().c(dyk.S);
   }

   public dwd t() {
      return this.k;
   }

   public void c(cxo $$0) {
      this.a($$0);
   }

   public cxo u() {
      cxo $$0 = cxs.eN.n();
      $$0.b(this.r());
      return $$0;
   }

   public static cxo a(dwd $$0) {
      cxo $$1 = cxs.eN.n();
      $$1.b(ku.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public aly<ewt> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable aly<ewt> $$0) {
      this.i = $$0;
   }

   @Override
   public long aA_() {
      return this.j;
   }

   @Override
   public void a(long $$0) {
      this.j = $$0;
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ak, this.k);
      $$0.a(ku.al, dag.a(List.of(this.l)));
   }

   @Override
   protected void a(duw.b $$0) {
      super.a($$0);
      this.k = $$0.a(ku.ak, dwd.a);
      this.l = $$0.a(ku.al, dag.a).a();
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cxo f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cxo c(int $$0) {
      this.d_(null);
      cxo $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cxo.j;
      }

      return $$1;
   }

   @Override
   public void b(cxo $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public duw v() {
      return this;
   }

   public void a(dvn.a $$0) {
      if (this.o != null && !this.o.B_()) {
         this.o.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dvn.a.values().length) {
         this.g = this.o.ac();
         this.h = dvn.a.values()[$$1];
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
