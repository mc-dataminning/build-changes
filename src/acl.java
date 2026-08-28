import java.util.function.BiFunction;

public class acl implements zp<ace> {
   public static final zg<wt, acl> a = zg.a(jh.b, acl::b, ze.a(lz.h), acl::e, ze.q, acl::f, acl::new);
   private final jh b;
   private final dso<?> c;
   private final uk d;

   public static acl a(dsm $$0, BiFunction<dsm, ke, uk> $$1) {
      ke $$2 = $$0.i().H_();
      return new acl($$0.aB_(), $$0.q(), $$1.apply($$0, $$2));
   }

   public static acl a(dsm $$0) {
      return a($$0, dsm::a);
   }

   private acl(jh $$0, dso<?> $$1, uk $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zr<acl> a() {
      return agt.i;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public dso<?> e() {
      return this.c;
   }

   public uk f() {
      return this.d;
   }
}
