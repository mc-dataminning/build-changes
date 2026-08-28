import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bpy implements AutoCloseable {
   public static final bpy a = new bpy(null);
   @Nullable
   private final bpt b;

   bpy(@Nullable bpt $$0) {
      this.b = $$0;
   }

   public bpy a(String $$0) {
      if (this.b != null) {
         this.b.e($$0);
      }

      return this;
   }

   public bpy a(Supplier<String> $$0) {
      if (this.b != null) {
         this.b.e($$0.get());
      }

      return this;
   }

   public bpy a(long $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   public bpy a(int $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      return this;
   }

   @Override
   public void close() {
      if (this.b != null) {
         this.b.c();
      }
   }
}
