import java.util.function.BiFunction;

public class acl implements zo<acf> {
   public static final ze<wp, acl> a = ze.a(iw.b, acl::b, zc.a(mi.e), acl::e, zc.t, acl::f, acl::new);
   private final iw b;
   private final dyq<?> c;
   private final ua d;

   public static acl a(dyo $$0, BiFunction<dyo, ju, ua> $$1) {
      ju $$2 = $$0.i().J_();
      return new acl($$0.aC_(), $$0.p(), $$1.apply($$0, $$2));
   }

   public static acl a(dyo $$0) {
      return a($$0, dyo::a);
   }

   private acl(iw $$0, dyq<?> $$1, ua $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zq<acl> a() {
      return agy.h;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public dyq<?> e() {
      return this.c;
   }

   public ua f() {
      return this.d;
   }
}
