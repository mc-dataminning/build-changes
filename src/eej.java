import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eej extends eew {
   public static final Codec<eej> a = RecordCodecBuilder.create($$0 -> $$0.group(dwh.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eej::new));
   private final dwh c;

   private eej(dwh $$0) {
      this.c = $$0;
   }

   public static eej a(dwh $$0) {
      return new eej($$0);
   }

   @Override
   protected boolean a(eev $$0, axt $$1, id $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eey<?> b() {
      return eey.a;
   }
}
