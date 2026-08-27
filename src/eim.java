import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eim implements eii {
   public static final Codec<eim> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eik.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eim::new)
   );
   public static final Codec<eim> b = eik.b.listOf().xmap(eim::new, $$0 -> $$0.c);
   private final List<eii> c;
   private final BiFunction<cmx, egv, cmx> d;

   private eim(List<eii> $$0) {
      this.c = $$0;
      this.d = eik.a($$0);
   }

   public static eim a(List<eii> $$0) {
      return new eim(List.copyOf($$0));
   }

   public cmx a(cmx $$0, egv $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ehe $$0) {
      eii.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eij b() {
      return eik.C;
   }
}
