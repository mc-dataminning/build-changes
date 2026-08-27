import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eeh implements eed {
   public static final Codec<eeh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eef.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eeh::new)
   );
   public static final Codec<eeh> b = eef.b.listOf().xmap(eeh::new, $$0 -> $$0.c);
   private final List<eed> c;
   private final BiFunction<cjf, ecq, cjf> d;

   private eeh(List<eed> $$0) {
      this.c = $$0;
      this.d = eef.a($$0);
   }

   public static eeh a(List<eed> $$0) {
      return new eeh(List.copyOf($$0));
   }

   public cjf a(cjf $$0, ecq $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ecz $$0) {
      eed.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eee b() {
      return eef.C;
   }
}
