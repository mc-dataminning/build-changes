import javax.annotation.Nullable;

public interface bpy {
   void a();

   static void a_(@Nullable Object $$0) {
      if ($$0 instanceof bpy) {
         ((bpy)$$0).a();
      }
   }
}
