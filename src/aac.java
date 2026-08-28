import java.util.Map;

public class aac implements zl<zr> {
   public static final zc<wb, aac> a = zl.a(aac::a, aac::new);
   private final Map<ald<? extends kb<?>>, axn.a> b;

   public aac(Map<ald<? extends kb<?>>, axn.a> $$0) {
      this.b = $$0;
   }

   private aac(wb $$0) {
      this.b = $$0.a(wb::r, axn.a::b);
   }

   private void a(wb $$0) {
      $$0.a(this.b, wb::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zn<aac> a() {
      return aad.k;
   }

   public void a(zr $$0) {
      $$0.a(this);
   }

   public Map<ald<? extends kb<?>>, axn.a> b() {
      return this.b;
   }
}
