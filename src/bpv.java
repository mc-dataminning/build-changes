import com.google.common.collect.ImmutableMap;

public class bpv extends bnc<bln> {
   private final float c;

   public bpv(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   protected boolean a(ami $$0, bln $$1) {
      return $$1.aZ() && $$1.b(arp.a) > $$1.dg() || $$1.bn();
   }

   protected boolean a(ami $$0, bln $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ami $$0, bln $$1, long $$2) {
      if ($$1.eh().i() < this.c) {
         $$1.M().a();
      }
   }
}
