import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class euc extends etz {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axj.a(lv.K).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, euc::new)
   );
   private final axj<cvk> j;
   private final boolean k;

   private euc(axj<cvk> $$0, boolean $$1, int $$2, int $$3, List<ews> $$4, List<euv> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ety a() {
      return etv.f;
   }

   @Override
   public void a(Consumer<cvp> $$0, eth $$1) {
      lu.g.b(this.j).forEach($$1x -> $$0.accept(new cvp($$1x)));
   }

   private boolean a(eth $$0, Consumer<etw> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final jn<cvk> $$2 : lu.g.b(this.j)) {
            $$1.accept(new etz.c() {
               @Override
               public void a(Consumer<cvp> $$0, eth $$1) {
                  $$0.accept(new cvp($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eth $$0, Consumer<etw> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static etz.a<?> a(axj<cvk> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euc($$0, false, $$1, $$2, $$3, $$4));
   }

   public static etz.a<?> b(axj<cvk> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new euc($$0, true, $$1, $$2, $$3, $$4));
   }
}
