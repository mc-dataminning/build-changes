import com.mojang.serialization.Codec;

public record ci(dg c) implements cq {
   public static final Codec<ci> a = dg.a.xmap(ci::new, ci::a);

   @Override
   public boolean a(cun $$0) {
      return this.c.a($$0);
   }

   public static ci a(dg $$0) {
      return new ci($$0);
   }

   public dg a() {
      return this.c;
   }
}
