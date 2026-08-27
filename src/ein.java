import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ein implements eij {
   public static final Codec<ein> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eil.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ein::new)
   );
   public static final Codec<ein> b = eil.b.listOf().xmap(ein::new, $$0 -> $$0.c);
   private final List<eij> c;
   private final BiFunction<cmy, egw, cmy> d;

   private ein(List<eij> $$0) {
      this.c = $$0;
      this.d = eil.a($$0);
   }

   public static ein a(List<eij> $$0) {
      return new ein(List.copyOf($$0));
   }

   public cmy a(cmy $$0, egw $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ehf $$0) {
      eij.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eik b() {
      return eil.C;
   }
}
