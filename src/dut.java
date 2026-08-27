import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dut extends dvg {
   public static final Codec<dut> a = RecordCodecBuilder.create($$0 -> $$0.group(dmr.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dut::new));
   private final dmr c;

   private dut(dmr $$0) {
      this.c = $$0;
   }

   public static dut a(dmr $$0) {
      return new dut($$0);
   }

   @Override
   protected boolean a(dvf $$0, ate $$1, ht $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dvi<?> b() {
      return dvi.a;
   }
}
