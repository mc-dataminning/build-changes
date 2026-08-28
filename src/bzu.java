import com.google.common.collect.ImmutableMap;

public class bzu extends bxa<bvj> {
   private final float c;

   public bzu(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bvj $$0) {
      return $$0.bj() && $$0.b(axi.a) > $$0.dp() || $$0.bx();
   }

   protected boolean a(arp $$0, bvj $$1) {
      return a($$1);
   }

   protected boolean a(arp $$0, bvj $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arp $$0, bvj $$1, long $$2) {
      if ($$1.dY().i() < this.c) {
         $$1.J().a();
      }
   }
}
