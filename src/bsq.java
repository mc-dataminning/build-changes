import com.google.common.collect.ImmutableMap;

public class bsq extends bpw<boi> {
   private final float c;

   public bsq(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(boi $$0) {
      return $$0.aZ() && $$0.b(aue.a) > $$0.df() || $$0.bn();
   }

   protected boolean a(aov $$0, boi $$1) {
      return a($$1);
   }

   protected boolean a(aov $$0, boi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aov $$0, boi $$1, long $$2) {
      if ($$1.eh().i() < this.c) {
         $$1.M().a();
      }
   }
}
