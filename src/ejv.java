import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejv extends eki {
   public static final MapCodec<ejv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebr.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ejv::new)
   );
   private final ebr c;

   private ejv(ebr $$0) {
      this.c = $$0;
   }

   public static ejv a(ebr $$0) {
      return new ejv($$0);
   }

   @Override
   protected boolean a(ekh $$0, azl $$1, je $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ekk<?> b() {
      return ekk.a;
   }
}
