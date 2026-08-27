import javax.annotation.Nullable;

public class bnf {
   private final ix<bng> a;
   private final bne b;
   private final bne c;
   private final bne d;
   private final bne e;
   private final bne f;
   private final bne g;
   private final bne h;
   private final bne i;
   private final bne j;
   private final bne k;
   private final bne l;
   private final bne m;
   private final bne n;
   private final bne o;
   private final bne p;
   private final bne q;
   private final bne r;
   private final bne s;
   private final bne t;
   private final bne u;
   private final bne v;
   private final bne w;
   private final bne x;

   public bnf(iy $$0) {
      this.a = $$0.d(ki.r);
      this.b = this.a(bnh.a);
      this.c = this.a(bnh.b);
      this.d = this.a(bnh.c);
      this.e = this.a(bnh.d);
      this.f = this.a(bnh.e);
      this.g = this.a(bnh.f);
      this.h = this.a(bnh.g);
      this.i = this.a(bnh.h);
      this.j = this.a(bnh.i);
      this.k = this.a(bnh.j);
      this.l = this.a(bnh.k);
      this.m = this.a(bnh.l);
      this.n = this.a(bnh.m);
      this.o = this.a(bnh.n);
      this.p = this.a(bnh.o);
      this.q = this.a(bnh.p);
      this.r = this.a(bnh.q);
      this.s = this.a(bnh.r);
      this.t = this.a(bnh.s);
      this.u = this.a(bnh.t);
      this.v = this.a(bnh.u);
      this.w = this.a(bnh.S);
      this.x = this.a(bnh.T);
   }

   private bne a(ajb<bng> $$0) {
      return new bne(this.a.f($$0));
   }

   private bne a(ajb<bng> $$0, @Nullable bof $$1) {
      return new bne(this.a.f($$0), $$1);
   }

   private bne a(ajb<bng> $$0, @Nullable bof $$1, @Nullable bof $$2) {
      return new bne(this.a.f($$0), $$1, $$2);
   }

   public bne a() {
      return this.b;
   }

   public bne b() {
      return this.c;
   }

   public bne c() {
      return this.d;
   }

   public bne d() {
      return this.e;
   }

   public bne e() {
      return this.f;
   }

   public bne f() {
      return this.g;
   }

   public bne g() {
      return this.h;
   }

   public bne h() {
      return this.i;
   }

   public bne i() {
      return this.j;
   }

   public bne j() {
      return this.k;
   }

   public bne k() {
      return this.l;
   }

   public bne l() {
      return this.m;
   }

   public bne m() {
      return this.n;
   }

   public bne n() {
      return this.o;
   }

   public bne o() {
      return this.p;
   }

   public bne p() {
      return this.q;
   }

   public bne q() {
      return this.r;
   }

   public bne r() {
      return this.s;
   }

   public bne s() {
      return this.t;
   }

   public bne t() {
      return this.u;
   }

   public bne u() {
      return this.v;
   }

   public bne a(bof $$0) {
      return this.a(bnh.v, $$0);
   }

   public bne b(bof $$0) {
      return this.a(bnh.w, $$0);
   }

   public bne c(bof $$0) {
      return this.a(bnh.x, $$0);
   }

   public bne a(box $$0) {
      return this.a(bnh.y, $$0);
   }

   public bne b(box $$0) {
      return this.a(bnh.z, $$0);
   }

   public bne c(box $$0) {
      return this.a(bnh.A, $$0);
   }

   public bne a(cia $$0) {
      return this.a(bnh.B, $$0);
   }

   public bne a(cig $$0, @Nullable bof $$1) {
      return this.a(bnh.C, $$0, $$1);
   }

   public bne a(bof $$0, @Nullable bof $$1) {
      return this.a(bnh.D, $$0, $$1);
   }

   public bne a(bof $$0, @Nullable box $$1) {
      return this.a(bnh.E, $$0, $$1);
   }

   public bne b(bof $$0, @Nullable box $$1) {
      return this.a(bnh.F, $$0, $$1);
   }

   public bne c(bof $$0, @Nullable box $$1) {
      return this.a(bnh.G, $$0, $$1);
   }

   public bne a(cin $$0, @Nullable bof $$1) {
      return this.a(bnh.H, $$0, $$1);
   }

   public bne a(cim $$0, @Nullable bof $$1) {
      return $$1 == null ? this.a(bnh.J, $$0) : this.a(bnh.I, $$0, $$1);
   }

   public bne a(cjh $$0, bof $$1) {
      return this.a(bnh.K, $$0, $$1);
   }

   public bne b(bof $$0, @Nullable bof $$1) {
      return this.a(bnh.L, $$0, $$1);
   }

   public bne c(bof $$0, @Nullable bof $$1) {
      return this.a(bnh.M, $$0, $$1);
   }

   public bne d(bof $$0) {
      return this.a(bnh.N, $$0);
   }

   public bne a(@Nullable cvw $$0) {
      return $$0 != null ? this.d($$0.g(), $$0.f()) : this.d(null, null);
   }

   public bne d(@Nullable bof $$0, @Nullable bof $$1) {
      return this.a($$1 != null && $$0 != null ? bnh.P : bnh.O, $$0, $$1);
   }

   public bne e(bof $$0) {
      return this.a(bnh.Q, $$0);
   }

   public bne a(eov $$0) {
      return new bne(this.a.f(bnh.R), $$0);
   }

   public bne v() {
      return this.w;
   }

   public bne w() {
      return this.x;
   }
}
