import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehn extends ehk {
   public static final Codec<ehn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asq.a(ke.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ehn::new)
   );
   private final asq<cmm> j;
   private final boolean k;

   private ehn(asq<cmm> $$0, boolean $$1, int $$2, int $$3, List<ejo> $$4, List<eic> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ehj a() {
      return ehg.f;
   }

   @Override
   public void a(Consumer<cmr> $$0, egp $$1) {
      kd.h.c(this.j).forEach($$1x -> $$0.accept(new cmr($$1x)));
   }

   private boolean a(egp $$0, Consumer<ehh> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ih<cmm> $$2 : kd.h.c(this.j)) {
            $$1.accept(new ehk.c() {
               @Override
               public void a(Consumer<cmr> $$0, egp $$1) {
                  $$0.accept(new cmr($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(egp $$0, Consumer<ehh> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ehk.a<?> a(asq<cmm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehn($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ehk.a<?> b(asq<cmm> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehn($$0, true, $$1, $$2, $$3, $$4));
   }
}
