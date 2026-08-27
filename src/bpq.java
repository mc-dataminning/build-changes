import com.google.common.collect.ImmutableMap;

public class bpq extends bmx<bli> {
   private final float c;

   public bpq(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(ame $$0, bli $$1) {
      return $$1.aZ() && $$1.b(arl.a) > $$1.dg() || $$1.bn();
   }

   protected boolean a(ame $$0, bli $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ame $$0, bli $$1, long $$2) {
      if ($$1.eh().i() < this.c) {
         $$1.M().a();
      }
   }
}
