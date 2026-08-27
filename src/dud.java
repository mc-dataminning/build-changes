import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dud extends duq {
   public static final Codec<dud> a = RecordCodecBuilder.create($$0 -> $$0.group(dmb.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dud::new));
   private final dmb c;

   private dud(dmb $$0) {
      this.c = $$0;
   }

   public static dud a(dmb $$0) {
      return new dud($$0);
   }

   @Override
   protected boolean a(dup $$0, ase $$1, gw $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dus<?> b() {
      return dus.a;
   }
}
