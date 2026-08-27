import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class egt implements egp {
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egr.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, egt::new)
   );
   public static final Codec<egt> b = egr.b.listOf().xmap(egt::new, $$0 -> $$0.c);
   private final List<egp> c;
   private final BiFunction<clo, efc, clo> d;

   private egt(List<egp> $$0) {
      this.c = $$0;
      this.d = egr.a($$0);
   }

   public static egt a(List<egp> $$0) {
      return new egt(List.copyOf($$0));
   }

   public clo a(clo $$0, efc $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(efl $$0) {
      egp.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public egq b() {
      return egr.C;
   }
}
