import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eej implements eef {
   public static final Codec<eej> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eeh.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eej::new)
   );
   public static final Codec<eej> b = eeh.b.listOf().xmap(eej::new, $$0 -> $$0.c);
   private final List<eef> c;
   private final BiFunction<cjh, ecs, cjh> d;

   private eej(List<eef> $$0) {
      this.c = $$0;
      this.d = eeh.a($$0);
   }

   public static eej a(List<eef> $$0) {
      return new eej(List.copyOf($$0));
   }

   public cjh a(cjh $$0, ecs $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(edb $$0) {
      eef.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eeg b() {
      return eeh.C;
   }
}
