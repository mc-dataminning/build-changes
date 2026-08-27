import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ekm implements eki {
   public static final Codec<ekm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekk.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ekm::new)
   );
   public static final Codec<ekm> b = ekk.b.listOf().xmap(ekm::new, $$0 -> $$0.c);
   private final List<eki> c;
   private final BiFunction<coz, eiv, coz> d;

   private ekm(List<eki> $$0) {
      this.c = $$0;
      this.d = ekk.a($$0);
   }

   public static ekm a(List<eki> $$0) {
      return new ekm(List.copyOf($$0));
   }

   public coz a(coz $$0, eiv $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eje $$0) {
      eki.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public ekj b() {
      return ekk.C;
   }
}
