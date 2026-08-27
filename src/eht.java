import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eht extends ehq {
   public static final Codec<eht> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asv.a(ke.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eht::new)
   );
   private final asv<cms> j;
   private final boolean k;

   private eht(asv<cms> $$0, boolean $$1, int $$2, int $$3, List<eju> $$4, List<eii> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ehp a() {
      return ehm.f;
   }

   @Override
   public void a(Consumer<cmx> $$0, egv $$1) {
      kd.h.c(this.j).forEach($$1x -> $$0.accept(new cmx($$1x)));
   }

   private boolean a(egv $$0, Consumer<ehn> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ih<cms> $$2 : kd.h.c(this.j)) {
            $$1.accept(new ehq.c() {
               @Override
               public void a(Consumer<cmx> $$0, egv $$1) {
                  $$0.accept(new cmx($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(egv $$0, Consumer<ehn> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ehq.a<?> a(asv<cms> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eht($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ehq.a<?> b(asv<cms> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eht($$0, true, $$1, $$2, $$3, $$4));
   }
}
