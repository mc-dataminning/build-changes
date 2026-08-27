import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ehv implements ehr {
   public static final Codec<ehv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eht.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ehv::new)
   );
   public static final Codec<ehv> b = eht.b.listOf().xmap(ehv::new, $$0 -> $$0.c);
   private final List<ehr> c;
   private final BiFunction<cmh, ege, cmh> d;

   private ehv(List<ehr> $$0) {
      this.c = $$0;
      this.d = eht.a($$0);
   }

   public static ehv a(List<ehr> $$0) {
      return new ehv(List.copyOf($$0));
   }

   public cmh a(cmh $$0, ege $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(egn $$0) {
      ehr.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public ehs b() {
      return eht.C;
   }
}
