import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwf extends dws {
   public static final Codec<dwf> a = RecordCodecBuilder.create($$0 -> $$0.group(dod.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dwf::new));
   private final dod c;

   private dwf(dod $$0) {
      this.c = $$0;
   }

   public static dwf a(dod $$0) {
      return new dwf($$0);
   }

   @Override
   protected boolean a(dwr $$0, atw $$1, hx $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dwu<?> b() {
      return dwu.a;
   }
}
