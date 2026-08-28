import com.mojang.serialization.Codec;

public record cm(dm c) implements cv {
   public static final Codec<cm> a = dm.a.xmap(cm::new, cm::a);

   @Override
   public boolean a(cxg $$0) {
      return this.c.a($$0);
   }

   public static cm a(dm $$0) {
      return new cm($$0);
   }

   public dm a() {
      return this.c;
   }
}
