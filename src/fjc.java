import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjc {
   private final Consumer<fgx> a;
   private final Consumer<fgx> b;
   @Nullable
   private fjb c;
   @Nullable
   private flf d;

   public fjc(Consumer<fgx> $$0, Consumer<fgx> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(flf $$0) {
      this.d = $$0;
      fjb $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fjb $$0, boolean $$1) {
      if (!Objects.equals(this.c, $$0)) {
         if (this.c != null) {
            this.c.a(this.b);
         }

         this.c = $$0;
         $$0.a(this.a);
         if (this.d != null) {
            $$0.a(this.d);
         }

         if ($$1) {
            ffa.Q().aj().a(gsd.a(avw.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fjb a() {
      return this.c;
   }
}
