import com.mojang.serialization.Codec;

public class dub implements dug {
   public static final Codec<dub> a = bjh.b(0, 256).fieldOf("count").xmap(dub::new, dub::a).codec();
   private final bjh b;

   public dub(int $$0) {
      this.b = bje.a($$0);
   }

   public dub(bjh $$0) {
      this.b = $$0;
   }

   public bjh a() {
      return this.b;
   }
}
