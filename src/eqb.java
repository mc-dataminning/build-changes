import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eqb implements epx {
   public static final Codec<eqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epz.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eqb::new)
   );
   public static final Codec<eqb> b = epz.b.listOf().xmap(eqb::new, $$0 -> $$0.c);
   private final List<epx> c;
   private final BiFunction<csz, eol, csz> d;

   private eqb(List<epx> $$0) {
      this.c = $$0;
      this.d = epz.a($$0);
   }

   public static eqb a(List<epx> $$0) {
      return new eqb(List.copyOf($$0));
   }

   public csz a(csz $$0, eol $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eor $$0) {
      epx.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public epy b() {
      return epz.F;
   }
}
