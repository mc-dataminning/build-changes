import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class egc implements efy {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ega.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, egc::new)
   );
   public static final Codec<egc> b = ega.b.listOf().xmap(egc::new, $$0 -> $$0.c);
   private final List<efy> c;
   private final BiFunction<clb, eel, clb> d;

   private egc(List<efy> $$0) {
      this.c = $$0;
      this.d = ega.a($$0);
   }

   public static egc a(List<efy> $$0) {
      return new egc(List.copyOf($$0));
   }

   public clb a(clb $$0, eel $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eeu $$0) {
      efy.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public efz b() {
      return ega.C;
   }
}
