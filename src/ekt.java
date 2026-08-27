import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ekt implements ekp {
   public static final Codec<ekt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekr.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ekt::new)
   );
   public static final Codec<ekt> b = ekr.b.listOf().xmap(ekt::new, $$0 -> $$0.c);
   private final List<ekp> c;
   private final BiFunction<cpd, ejc, cpd> d;

   private ekt(List<ekp> $$0) {
      this.c = $$0;
      this.d = ekr.a($$0);
   }

   public static ekt a(List<ekp> $$0) {
      return new ekt(List.copyOf($$0));
   }

   public cpd a(cpd $$0, ejc $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ejl $$0) {
      ekp.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public ekq b() {
      return ekr.C;
   }
}
