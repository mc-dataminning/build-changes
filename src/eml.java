import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eml implements emh {
   public static final Codec<eml> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emj.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eml::new)
   );
   public static final Codec<eml> b = emj.b.listOf().xmap(eml::new, $$0 -> $$0.c);
   private final List<emh> c;
   private final BiFunction<cqk, eku, cqk> d;

   private eml(List<emh> $$0) {
      this.c = $$0;
      this.d = emj.a($$0);
   }

   public static eml a(List<emh> $$0) {
      return new eml(List.copyOf($$0));
   }

   public cqk a(cqk $$0, eku $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eld $$0) {
      emh.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public emi b() {
      return emj.C;
   }
}
