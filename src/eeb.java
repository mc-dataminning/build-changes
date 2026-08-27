import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eeb implements edx {
   public static final Codec<eeb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edz.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eeb::new)
   );
   public static final Codec<eeb> b = edz.b.listOf().xmap(eeb::new, $$0 -> $$0.c);
   private final List<edx> c;
   private final BiFunction<cjl, eck, cjl> d;

   private eeb(List<edx> $$0) {
      this.c = $$0;
      this.d = edz.a($$0);
   }

   public static eeb a(List<edx> $$0) {
      return new eeb(List.copyOf($$0));
   }

   public cjl a(cjl $$0, eck $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ect $$0) {
      edx.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public edy b() {
      return edz.C;
   }
}
