import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eiw implements eis {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiu.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eiw::new)
   );
   public static final Codec<eiw> b = eiu.b.listOf().xmap(eiw::new, $$0 -> $$0.c);
   private final List<eis> c;
   private final BiFunction<cng, ehf, cng> d;

   private eiw(List<eis> $$0) {
      this.c = $$0;
      this.d = eiu.a($$0);
   }

   public static eiw a(List<eis> $$0) {
      return new eiw(List.copyOf($$0));
   }

   public cng a(cng $$0, ehf $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eho $$0) {
      eis.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eit b() {
      return eiu.C;
   }
}
