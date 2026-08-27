import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ebs(ebs.a b, bkk<cxc.c> c) {
   public static final Codec<ebs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ebs.a.c.fieldOf("bounding_box").forGetter(ebs::a), bkk.c(cxc.c.a).fieldOf("spawns").forGetter(ebs::b)).apply($$0, ebs::new)
   );

   public ebs.a a() {
      return this.b;
   }

   public bkk<cxc.c> b() {
      return this.c;
   }

   public static enum a implements axc {
      a("piece"),
      b("full");

      public static final Codec<ebs.a> c = axc.a(ebs.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
