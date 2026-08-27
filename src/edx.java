import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class edx implements edt {
   public static final Codec<edx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edv.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, edx::new)
   );
   public static final Codec<edx> b = edv.b.listOf().xmap(edx::new, $$0 -> $$0.c);
   private final List<edt> c;
   private final BiFunction<cix, ecg, cix> d;

   private edx(List<edt> $$0) {
      this.c = $$0;
      this.d = edv.a($$0);
   }

   public static edx a(List<edt> $$0) {
      return new edx(List.copyOf($$0));
   }

   public cix a(cix $$0, ecg $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ecp $$0) {
      edt.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public edu b() {
      return edv.C;
   }
}
