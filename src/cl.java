import com.mojang.serialization.Codec;

public record cl(dl c) implements cu {
   public static final Codec<cl> a = dl.a.xmap(cl::new, cl::a);

   @Override
   public boolean a(cvx $$0) {
      return this.c.a($$0);
   }

   public static cl a(dl $$0) {
      return new cl($$0);
   }

   public dl a() {
      return this.c;
   }
}
