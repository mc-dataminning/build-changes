import java.util.Map;

public class aab implements zk<zq> {
   public static final zb<wa, aab> a = zk.a(aab::a, aab::new);
   private final Map<alb<? extends ka<?>>, axl.a> b;

   public aab(Map<alb<? extends ka<?>>, axl.a> $$0) {
      this.b = $$0;
   }

   private aab(wa $$0) {
      this.b = $$0.a(wa::r, axl.a::b);
   }

   private void a(wa $$0) {
      $$0.a(this.b, wa::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zm<aab> a() {
      return aac.k;
   }

   public void a(zq $$0) {
      $$0.a(this);
   }

   public Map<alb<? extends ka<?>>, axl.a> b() {
      return this.b;
   }
}
