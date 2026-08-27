import com.google.common.collect.ImmutableMap;

public class bsu extends bqa<bok> {
   private final float c;

   public bsu(float $$0) {
      super(ImmutableMap.of());
      this.c = $$0;
   }

   public static boolean a(bok $$0) {
      return $$0.aZ() && $$0.b(auf.a) > $$0.df() || $$0.bn();
   }

   protected boolean a(aow $$0, bok $$1) {
      return a($$1);
   }

   protected boolean a(aow $$0, bok $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aow $$0, bok $$1, long $$2) {
      if ($$1.eh().i() < this.c) {
         $$1.M().a();
      }
   }
}
