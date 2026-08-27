import java.util.List;
import javax.annotation.Nullable;

public class doy extends doi implements bqe, evx.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public doy.a h;
   private dpm k;
   private ctq l = ctq.i;
   @Nullable
   protected akm<epm> i;
   protected long j;

   public doy(io $$0, drd $$1) {
      super(dok.O, $$0, $$1);
      this.k = dpm.a;
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
      this.k = dpm.b($$0);
      if (!this.a_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = ctq.a($$1, (va)$$0.p("item")).orElse(ctq.i);
         } else {
            this.l = ctq.i;
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
      return this.n().c(drt.R);
   }

   public dpm l() {
      return this.k;
   }

   public void c(ctq $$0) {
      this.a($$0);
   }

   public ctq u() {
      ctq $$0 = ctt.eC.w();
      $$0.a(this.s());
      return $$0;
   }

   public static ctq a(dpm $$0) {
      ctq $$1 = ctt.eC.w();
      $$1.b(kb.Y, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public akm<epm> ay_() {
      return this.i;
   }

   @Override
   public void a(@Nullable akm<epm> $$0) {
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
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.Y, this.k);
      $$0.a(kb.Z, cwm.a(List.of(this.l)));
   }

   @Override
   protected void a(doi.b $$0) {
      super.a($$0);
      this.k = $$0.a(kb.Y, dpm.a);
      this.l = $$0.a(kb.Z, cwm.a).a();
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public ctq f() {
      this.e_(null);
      return this.l;
   }

   @Override
   public ctq c(int $$0) {
      this.e_(null);
      ctq $$1 = this.l.a($$0);
      if (this.l.e()) {
         this.l = ctq.i;
      }

      return $$1;
   }

   @Override
   public void b(ctq $$0) {
      this.e_(null);
      this.l = $$0;
   }

   @Override
   public doi v() {
      return this;
   }

   public void a(doy.a $$0) {
      if (this.n != null && !this.n.x_()) {
         this.n.a(this.aA_(), this.n().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.n != null && $$0 == 1 && $$1 >= 0 && $$1 < doy.a.values().length) {
         this.g = this.n.Y();
         this.h = doy.a.values()[$$1];
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
