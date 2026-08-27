import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class elp implements ell {
   public static final Codec<elp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eln.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, elp::new)
   );
   public static final Codec<elp> b = eln.b.listOf().xmap(elp::new, $$0 -> $$0.c);
   private final List<ell> c;
   private final BiFunction<cpq, ejy, cpq> d;

   private elp(List<ell> $$0) {
      this.c = $$0;
      this.d = eln.a($$0);
   }

   public static elp a(List<ell> $$0) {
      return new elp(List.copyOf($$0));
   }

   public cpq a(cpq $$0, ejy $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ekh $$0) {
      ell.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public elm b() {
      return eln.C;
   }
}
