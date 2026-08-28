import java.util.Map;

public class aag implements zp<zv> {
   public static final zg<wf, aag> a = zp.a(aag::a, aag::new);
   private final Map<alh<? extends kd<?>>, axs.a> b;

   public aag(Map<alh<? extends kd<?>>, axs.a> $$0) {
      this.b = $$0;
   }

   private aag(wf $$0) {
      this.b = $$0.a(wf::r, axs.a::b);
   }

   private void a(wf $$0) {
      $$0.a(this.b, wf::b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zr<aag> a() {
      return aah.k;
   }

   public void a(zv $$0) {
      $$0.a(this);
   }

   public Map<alh<? extends kd<?>>, axs.a> b() {
      return this.b;
   }
}
