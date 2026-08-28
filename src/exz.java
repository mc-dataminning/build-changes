import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class exz implements exv {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exx.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, exz::new)
   );
   public static final Codec<exz> b = exx.b.listOf().xmap(exz::new, $$0 -> $$0.c);
   private final List<exv> c;
   private final BiFunction<cxk, ewh, cxk> d;

   private exz(List<exv> $$0) {
      this.c = $$0;
      this.d = exx.a($$0);
   }

   public static exz a(List<exv> $$0) {
      return new exz(List.copyOf($$0));
   }

   public cxk a(cxk $$0, ewh $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ewn $$0) {
      exv.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public exw<exz> b() {
      return exx.I;
   }
}
