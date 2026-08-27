import org.joml.Matrix4f;

public interface frj {
   static frj a(axy $$0) {
      return new fri($$0);
   }

   static frj a(cro $$0) {
      if ($$0 instanceof crn $$1) {
         return new frh($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fhy var1);

   default void a(fhy $$0, int $$1, int $$2, Matrix4f $$3, gfg.a $$4) {
   }

   default void a(fhy $$0, int $$1, int $$2, fia $$3) {
   }
}
