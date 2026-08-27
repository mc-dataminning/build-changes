import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekt extends ekh {
   public static final Codec<ekt> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emq.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ekt::new)
   );
   private final emp b;
   private final boolean c;

   private ekt(List<elu> $$0, emp $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ekj b() {
      return ekk.c;
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.a();
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.f(awh.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static ekh.a<?> a(emp $$0) {
      return a($$1 -> new ekt($$1, $$0, false));
   }

   public static ekh.a<?> a(emp $$0, boolean $$1) {
      return a($$2 -> new ekt($$2, $$0, $$1));
   }
}
