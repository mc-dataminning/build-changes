public class acn implements ux<aaw> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final gu d;
   private final ddz.a e;
   private final dgk f;
   private final String g;
   private final gu h;
   private final hz i;
   private final cxh j;
   private final cyy k;
   private final String l;
   private final boolean m;
   private final boolean n;
   private final boolean o;
   private final float p;
   private final long q;

   public acn(
      gu $$0, ddz.a $$1, dgk $$2, String $$3, gu $$4, hz $$5, cxh $$6, cyy $$7, String $$8, boolean $$9, boolean $$10, boolean $$11, float $$12, long $$13
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$8;
      this.m = $$9;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
      this.q = $$13;
   }

   public acn(si $$0) {
      this.d = $$0.e();
      this.e = $$0.b(ddz.a.class);
      this.f = $$0.b(dgk.class);
      this.g = $$0.r();
      int $$1 = 48;
      this.h = new gu(arp.a($$0.readByte(), -48, 48), arp.a($$0.readByte(), -48, 48), arp.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.i = new hz(arp.a($$0.readByte(), 0, 48), arp.a($$0.readByte(), 0, 48), arp.a($$0.readByte(), 0, 48));
      this.j = $$0.b(cxh.class);
      this.k = $$0.b(cyy.class);
      this.l = $$0.d(128);
      this.p = arp.a($$0.readFloat(), 0.0F, 1.0F);
      this.q = $$0.n();
      int $$3 = $$0.readByte();
      this.m = ($$3 & 1) != 0;
      this.n = ($$3 & 2) != 0;
      this.o = ($$3 & 4) != 0;
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.k(this.h.u());
      $$0.k(this.h.v());
      $$0.k(this.h.w());
      $$0.k(this.i.u());
      $$0.k(this.i.v());
      $$0.k(this.i.w());
      $$0.a(this.j);
      $$0.a(this.k);
      $$0.a(this.l);
      $$0.a(this.p);
      $$0.a(this.q);
      int $$1 = 0;
      if (this.m) {
         $$1 |= 1;
      }

      if (this.n) {
         $$1 |= 2;
      }

      if (this.o) {
         $$1 |= 4;
      }

      $$0.k($$1);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public gu a() {
      return this.d;
   }

   public ddz.a d() {
      return this.e;
   }

   public dgk e() {
      return this.f;
   }

   public String f() {
      return this.g;
   }

   public gu g() {
      return this.h;
   }

   public hz h() {
      return this.i;
   }

   public cxh i() {
      return this.j;
   }

   public cyy j() {
      return this.k;
   }

   public String k() {
      return this.l;
   }

   public boolean l() {
      return this.m;
   }

   public boolean m() {
      return this.n;
   }

   public boolean n() {
      return this.o;
   }

   public float o() {
      return this.p;
   }

   public long p() {
      return this.q;
   }
}
