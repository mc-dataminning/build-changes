public class cob extends cnt {
   static final ajs<String> c = ajw.a(cob.class, aju.e);
   static final ajs<wx> d = ajw.a(cob.class, aju.f);
   private final daa e = new cob.a();
   private static final int i = 4;
   private int j;

   public cob(bsc<? extends cob> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cob(daz $$0, double $$1, double $$2, double $$3) {
      super(bsc.v, $$0, $$1, $$2, $$3);
   }

   @Override
   protected ctl ah_() {
      return ctt.nM;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(c, "");
      $$0.a(d, ww.a);
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.e.b($$0, this.dR());
      this.ap().a(c, this.B().m());
      this.ap().a(d, this.B().l());
   }

   @Override
   protected void b(ud $$0) {
      super.b($$0);
      this.e.a($$0, this.dR());
   }

   @Override
   public cnt.a v() {
      return cnt.a.g;
   }

   @Override
   public drd x() {
      return dec.fN.n();
   }

   public daa B() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.ai - this.j >= 4) {
         this.B().a(this.dP());
         this.j = this.ai;
      }
   }

   @Override
   public bpw a(cly $$0, bpv $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(ajs<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.ap().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.ap().a(c));
      }
   }

   @Override
   public boolean cP() {
      return true;
   }

   public class a extends daa {
      @Override
      public aqn e() {
         return (aqn)cob.this.dP();
      }

      @Override
      public void f() {
         cob.this.ap().a(cob.c, this.m());
         cob.this.ap().a(cob.d, this.l());
      }

      @Override
      public eum g() {
         return cob.this.dn();
      }

      public cob h() {
         return cob.this;
      }

      @Override
      public ee i() {
         return new ee(this, cob.this.dn(), cob.this.bM(), this.e(), 2, this.n().getString(), cob.this.O_(), this.e().o(), cob.this);
      }

      @Override
      public boolean j() {
         return !cob.this.dK();
      }
   }
}
