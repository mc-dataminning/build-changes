import com.mojang.serialization.Codec;

public record ci(dh c) implements cq {
   public static final Codec<ci> a = dh.a.xmap(ci::new, ci::a);

   @Override
   public boolean a(cuc $$0) {
      return this.c.a($$0);
   }

   public static ci a(dh $$0) {
      return new ci($$0);
   }

   public dh a() {
      return this.c;
   }
}
