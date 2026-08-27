import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eig implements eic {
   public static final Codec<eig> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eie.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eig::new)
   );
   public static final Codec<eig> b = eie.b.listOf().xmap(eig::new, $$0 -> $$0.c);
   private final List<eic> c;
   private final BiFunction<cmr, egp, cmr> d;

   private eig(List<eic> $$0) {
      this.c = $$0;
      this.d = eie.a($$0);
   }

   public static eig a(List<eic> $$0) {
      return new eig(List.copyOf($$0));
   }

   public cmr a(cmr $$0, egp $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(egy $$0) {
      eic.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eid b() {
      return eie.C;
   }
}
