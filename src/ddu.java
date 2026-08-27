import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddu extends cut implements ddt {
   public static final MapCodec<ddu> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddt.a.e.fieldOf("weathering_state").forGetter(cvu::c), t()).apply($$0, ddu::new)
   );
   private final ddt.a e;

   @Override
   public MapCodec<ddu> a() {
      return d;
   }

   public ddu(ddt.a $$0, dgv.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dgw $$0) {
      return ddt.c($$0.b()).isPresent();
   }

   public ddt.a g() {
      return this.e;
   }
}
