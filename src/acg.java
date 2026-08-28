import java.util.function.BiFunction;

public class acg implements zk<abz> {
   public static final zb<wo, acg> a = zb.a(je.b, acg::b, yz.a(lv.h), acg::e, yz.p, acg::f, acg::new);
   private final je b;
   private final dru<?> c;
   private final uf d;

   public static acg a(drs $$0, BiFunction<drs, kb, uf> $$1) {
      kb $$2 = $$0.i().F_();
      return new acg($$0.aB_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static acg a(drs $$0) {
      return a($$0, drs::a);
   }

   private acg(je $$0, dru<?> $$1, uf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zm<acg> a() {
      return ago.i;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public je b() {
      return this.b;
   }

   public dru<?> e() {
      return this.c;
   }

   public uf f() {
      return this.d;
   }
}
