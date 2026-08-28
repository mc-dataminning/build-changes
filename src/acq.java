import java.util.List;

public class acq implements zh<abw> {
   public static final yy<wl, acq> a = zh.a(acq::a, acq::new);
   private final int b;
   private final int c;
   private final List<czy> d;
   private final czy e;

   public acq(int $$0, int $$1, jo<czy> $$2, czy $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jo.a($$2.size(), czy.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acq(wl $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = czy.j.decode($$0);
      this.e = czy.h.decode($$0);
   }

   private void a(wl $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      czy.j.encode($$0, this.d);
      czy.h.encode($$0, this.e);
   }

   @Override
   public zj<acq> a() {
      return agp.t;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<czy> e() {
      return this.d;
   }

   public czy f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
