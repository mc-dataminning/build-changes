import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eec implements edy {
   public static final Codec<eec> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eea.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eec::new)
   );
   public static final Codec<eec> b = eea.b.listOf().xmap(eec::new, $$0 -> $$0.c);
   private final List<edy> c;
   private final BiFunction<cja, ecl, cja> d;

   private eec(List<edy> $$0) {
      this.c = $$0;
      this.d = eea.a($$0);
   }

   public static eec a(List<edy> $$0) {
      return new eec(List.copyOf($$0));
   }

   public cja a(cja $$0, ecl $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ecu $$0) {
      edy.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public edz b() {
      return eea.C;
   }
}
