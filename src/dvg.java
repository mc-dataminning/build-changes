import java.util.List;
import javax.annotation.Nullable;

public class dvg extends dup implements btk, fde.a {
   public static final String d = "sherds";
   public static final String e = "item";
   public static final int f = 1;
   public long g;
   @Nullable
   public dvg.a h;
   private dvw k;
   private cxk l = cxk.k;
   @Nullable
   protected aly<ewm> i;
   protected long j;

   public dvg(jh $$0, dxn $$1) {
      super(dur.P, $$0, $$1);
      this.k = dvw.a;
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
      this.k = dvw.b($$0);
      if (!this.b_($$0)) {
         if ($$0.b("item", 10)) {
            this.l = cxk.a($$1, (vu)$$0.p("item")).orElse(cxk.k);
         } else {
            this.l = cxk.k;
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
      return this.m().c(dyd.S);
   }

   public dvw t() {
      return this.k;
   }

   public void c(cxk $$0) {
      this.a($$0);
   }

   public cxk u() {
      cxk $$0 = cxo.eN.n();
      $$0.b(this.r());
      return $$0;
   }

   public static cxk a(dvw $$0) {
      cxk $$1 = cxo.eN.n();
      $$1.b(ku.ak, $$0);
      return $$1;
   }

   @Nullable
   @Override
   public aly<ewm> ax_() {
      return this.i;
   }

   @Override
   public void a(@Nullable aly<ewm> $$0) {
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
      $$0.a(ku.al, dac.a(List.of(this.l)));
   }

   @Override
   protected void a(dup.b $$0) {
      super.a($$0);
      this.k = $$0.a(ku.ak, dvw.a);
      this.l = $$0.a(ku.al, dac.a).a();
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      $$0.r("sherds");
      $$0.r("item");
   }

   @Override
   public cxk f() {
      this.d_(null);
      return this.l;
   }

   @Override
   public cxk c(int $$0) {
      this.d_(null);
      cxk $$1 = this.l.a($$0);
      if (this.l.f()) {
         this.l = cxk.k;
      }

      return $$1;
   }

   @Override
   public void b(cxk $$0) {
      this.d_(null);
      this.l = $$0;
   }

   @Override
   public dup v() {
      return this;
   }

   public void a(dvg.a $$0) {
      if (this.o != null && !this.o.B_()) {
         this.o.a(this.aB_(), this.m().b(), 1, $$0.ordinal());
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if (this.o != null && $$0 == 1 && $$1 >= 0 && $$1 < dvg.a.values().length) {
         this.g = this.o.ac();
         this.h = dvg.a.values()[$$1];
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
