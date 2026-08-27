import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class emn implements emj {
   public static final Codec<emn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eml.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, emn::new)
   );
   public static final Codec<emn> b = eml.b.listOf().xmap(emn::new, $$0 -> $$0.c);
   private final List<emj> c;
   private final BiFunction<cqm, ekw, cqm> d;

   private emn(List<emj> $$0) {
      this.c = $$0;
      this.d = eml.a($$0);
   }

   public static emn a(List<emj> $$0) {
      return new emn(List.copyOf($$0));
   }

   public cqm a(cqm $$0, ekw $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(elf $$0) {
      emj.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public emk b() {
      return eml.C;
   }
}
