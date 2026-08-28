import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class erv implements erq {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ers.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, erv::new)
   );
   public static final Codec<erv> b = ers.b.listOf().xmap(erv::new, $$0 -> $$0.c);
   private final List<erq> c;
   private final BiFunction<cuk, eqd, cuk> d;

   private erv(List<erq> $$0) {
      this.c = $$0;
      this.d = ers.a($$0);
   }

   public static erv a(List<erq> $$0) {
      return new erv(List.copyOf($$0));
   }

   public cuk a(cuk $$0, eqd $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eqj $$0) {
      erq.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public err<erv> b() {
      return ers.I;
   }
}
