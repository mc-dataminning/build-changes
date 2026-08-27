import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ept implements epp {
   public static final Codec<ept> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epr.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ept::new)
   );
   public static final Codec<ept> b = epr.b.listOf().xmap(ept::new, $$0 -> $$0.c);
   private final List<epp> c;
   private final BiFunction<csd, eoa, csd> d;

   private ept(List<epp> $$0) {
      this.c = $$0;
      this.d = epr.a($$0);
   }

   public static ept a(List<epp> $$0) {
      return new ept(List.copyOf($$0));
   }

   public csd a(csd $$0, eoa $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eoj $$0) {
      epp.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public epq b() {
      return epr.D;
   }
}
