import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhk extends dfa {
   public static final MapCodec<dhk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqa.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhk::new)
   );
   private final bqa b;

   @Override
   public MapCodec<? extends dhk> a() {
      return a;
   }

   public dhk(bqa $$0, dsc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
