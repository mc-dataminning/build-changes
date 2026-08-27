import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cn(qw b) {
   public static final Codec<cn> a = rr.i.xmap(cn::new, cn::a);

   public boolean a(cjl $$0) {
      return this.a($$0.v());
   }

   public boolean a(biw $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable rq $$0) {
      return $$0 != null && rj.a(this.b, $$0, true);
   }

   public static qw b(biw $$0) {
      qw $$1 = $$0.f(new qw());
      if ($$0 instanceof cca) {
         cjl $$2 = ((cca)$$0).fS().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new qw()));
         }
      }

      return $$1;
   }

   public qw a() {
      return this.b;
   }
}
