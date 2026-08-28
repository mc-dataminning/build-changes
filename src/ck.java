import com.mojang.serialization.Codec;

public record ck(dk c) implements ct {
   public static final Codec<ck> a = dk.a.xmap(ck::new, ck::a);

   @Override
   public boolean a(cvs $$0) {
      return this.c.a($$0);
   }

   public static ck a(dk $$0) {
      return new ck($$0);
   }

   public dk a() {
      return this.c;
   }
}
