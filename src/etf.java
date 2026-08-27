import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class etf implements etb {
   public static final Codec<etf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(etd.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, etf::new)
   );
   public static final Codec<etf> b = etd.b.listOf().xmap(etf::new, $$0 -> $$0.c);
   private final List<etb> c;
   private final BiFunction<cuh, erp, cuh> d;

   private etf(List<etb> $$0) {
      this.c = $$0;
      this.d = etd.a($$0);
   }

   public static etf a(List<etb> $$0) {
      return new etf(List.copyOf($$0));
   }

   public cuh a(cuh $$0, erp $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(erv $$0) {
      etb.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public etc b() {
      return etd.F;
   }
}
