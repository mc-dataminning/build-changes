import java.util.function.BiFunction;

public class acl implements zs<ace> {
   public static final zj<ww, acl> a = zj.a(iz.b, acl::b, zh.a(lq.h), acl::e, zh.p, acl::f, acl::new);
   private final iz b;
   private final dpe<?> c;
   private final ur d;

   public static acl a(dpc $$0, BiFunction<dpc, jw, ur> $$1) {
      jw $$2 = $$0.i().H_();
      return new acl($$0.aA_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static acl a(dpc $$0) {
      return a($$0, dpc::a);
   }

   private acl(iz $$0, dpe<?> $$1, ur $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zu<acl> a() {
      return agq.i;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public dpe<?> e() {
      return this.c;
   }

   public ur f() {
      return this.d;
   }
}
