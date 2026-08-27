import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eot implements eop {
   public static final Codec<eot> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eor.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eot::new)
   );
   public static final Codec<eot> b = eor.b.listOf().xmap(eot::new, $$0 -> $$0.c);
   private final List<eop> c;
   private final BiFunction<crj, enb, crj> d;

   private eot(List<eop> $$0) {
      this.c = $$0;
      this.d = eor.a($$0);
   }

   public static eot a(List<eop> $$0) {
      return new eot(List.copyOf($$0));
   }

   public crj a(crj $$0, enb $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(enk $$0) {
      eop.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eoq b() {
      return eor.D;
   }
}
