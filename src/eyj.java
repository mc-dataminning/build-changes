import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eyj {
   private final Consumer<ewf> a;
   private final Consumer<ewf> b;
   @Nullable
   private eyi c;
   @Nullable
   private fak d;

   public eyj(Consumer<ewf> $$0, Consumer<ewf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fak $$0) {
      this.d = $$0;
      eyi $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(eyi $$0, boolean $$1) {
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
            euk.N().ah().a(ggr.a(arc.zu, 1.0F));
         }
      }
   }

   @Nullable
   public eyi a() {
      return this.c;
   }
}
