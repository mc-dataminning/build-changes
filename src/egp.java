import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egp implements egt {
   public static final Codec<egp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvo.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dvo.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               brm.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               brm.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egp::new)
   );
   private final dvo b;
   private final dvo c;
   private final brm d;
   private final brm e;

   public egp(dvo $$0, dvo $$1, brm $$2, brm $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dvo a() {
      return this.b;
   }

   public dvo b() {
      return this.c;
   }

   public brm c() {
      return this.d;
   }

   public brm d() {
      return this.e;
   }
}
