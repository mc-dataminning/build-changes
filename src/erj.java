import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class erj extends erg {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awk.a(lr.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, erj::new)
   );
   private final awk<ctv> j;
   private final boolean k;

   private erj(awk<ctv> $$0, boolean $$1, int $$2, int $$3, List<etz> $$4, List<esc> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public erf a() {
      return erc.f;
   }

   @Override
   public void a(Consumer<cua> $$0, eqo $$1) {
      lq.g.c(this.j).forEach($$1x -> $$0.accept(new cua($$1x)));
   }

   private boolean a(eqo $$0, Consumer<erd> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jj<ctv> $$2 : lq.g.c(this.j)) {
            $$1.accept(new erg.c() {
               @Override
               public void a(Consumer<cua> $$0, eqo $$1) {
                  $$0.accept(new cua($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eqo $$0, Consumer<erd> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static erg.a<?> a(awk<ctv> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erj($$0, false, $$1, $$2, $$3, $$4));
   }

   public static erg.a<?> b(awk<ctv> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new erj($$0, true, $$1, $$2, $$3, $$4));
   }
}
