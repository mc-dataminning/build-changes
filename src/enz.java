import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class enz extends enw {
   public static final Codec<enz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avr.a(ks.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, enz::new)
   );
   private final avr<cre> j;
   private final boolean k;

   private enz(avr<cre> $$0, boolean $$1, int $$2, int $$3, List<eqc> $$4, List<eop> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public env a() {
      return ens.f;
   }

   @Override
   public void a(Consumer<crj> $$0, enb $$1) {
      kr.h.c(this.j).forEach($$1x -> $$0.accept(new crj($$1x)));
   }

   private boolean a(enb $$0, Consumer<ent> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final il<cre> $$2 : kr.h.c(this.j)) {
            $$1.accept(new enw.c() {
               @Override
               public void a(Consumer<crj> $$0, enb $$1) {
                  $$0.accept(new crj($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(enb $$0, Consumer<ent> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static enw.a<?> a(avr<cre> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new enz($$0, false, $$1, $$2, $$3, $$4));
   }

   public static enw.a<?> b(avr<cre> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new enz($$0, true, $$1, $$2, $$3, $$4));
   }
}
