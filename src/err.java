import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class err extends ero {
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awm.a(lr.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, err::new)
   );
   private final awm<cty> j;
   private final boolean k;

   private err(awm<cty> $$0, boolean $$1, int $$2, int $$3, List<euh> $$4, List<esk> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ern a() {
      return erk.f;
   }

   @Override
   public void a(Consumer<cud> $$0, eqw $$1) {
      lq.g.c(this.j).forEach($$1x -> $$0.accept(new cud($$1x)));
   }

   private boolean a(eqw $$0, Consumer<erl> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jj<cty> $$2 : lq.g.c(this.j)) {
            $$1.accept(new ero.c() {
               @Override
               public void a(Consumer<cud> $$0, eqw $$1) {
                  $$0.accept(new cud($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eqw $$0, Consumer<erl> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ero.a<?> a(awm<cty> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new err($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ero.a<?> b(awm<cty> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new err($$0, true, $$1, $$2, $$3, $$4));
   }
}
