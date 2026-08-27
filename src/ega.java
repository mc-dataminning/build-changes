import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ega extends efx {
   public static final Codec<ega> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arz.a(kd.E).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ega::new)
   );
   private final arz<clj> j;
   private final boolean k;

   private ega(arz<clj> $$0, boolean $$1, int $$2, int $$3, List<eib> $$4, List<egp> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public efw a() {
      return eft.f;
   }

   @Override
   public void a(Consumer<clo> $$0, efc $$1) {
      kc.i.c(this.j).forEach($$1x -> $$0.accept(new clo($$1x)));
   }

   private boolean a(efc $$0, Consumer<efu> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ig<clj> $$2 : kc.i.c(this.j)) {
            $$1.accept(new efx.c() {
               @Override
               public void a(Consumer<clo> $$0, efc $$1) {
                  $$0.accept(new clo($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(efc $$0, Consumer<efu> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static efx.a<?> a(arz<clj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ega($$0, false, $$1, $$2, $$3, $$4));
   }

   public static efx.a<?> b(arz<clj> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ega($$0, true, $$1, $$2, $$3, $$4));
   }
}
