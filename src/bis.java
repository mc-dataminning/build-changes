import com.google.common.collect.ImmutableMap;

public class bis extends bhr<bgb> {
   public static final int c = 100;
   private final bdi d;
   private final amg e;

   public bis(bdi $$0, amg $$1) {
      super(ImmutableMap.of(bpb.n, bpc.c, bpb.S, bpc.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aif $$0, bgb $$1, long $$2) {
      return !$$1.ay();
   }

   protected void b(aif $$0, bgb $$1, long $$2) {
      $$1.p(true);
      $$1.b(bgl.g);
   }

   protected void c(aif $$0, bgb $$1, long $$2) {
      if ($$1.ay()) {
         $$1.f($$1.dl().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, ami.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bgl.a);
      $$1.dK().b(bpb.S);
      $$1.dK().a(bpb.R, this.d.a($$0.z));
   }
}
