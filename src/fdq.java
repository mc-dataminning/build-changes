import java.util.function.Function;

public interface fdq {
   float getAdvance();

   default float a(boolean $$0) {
      return this.getAdvance() + ($$0 ? this.a() : 0.0F);
   }

   default float a() {
      return 1.0F;
   }

   default float b() {
      return 1.0F;
   }

   frm bake(Function<fds, frm> var1);

   public interface a extends fdq {
      @Override
      default frm bake(Function<fds, frm> $$0) {
         return frn.b;
      }
   }
}
